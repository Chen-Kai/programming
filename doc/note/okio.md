Sink - 输出，就和厨房里的水槽一样。
	write() - 放水，写数据到目的地
	flush() - 把水槽中所有数据写到目的地
	close() - flush后关闭，释放资源（内存）

Source - 输入
	read() - 读数据到水槽
	indexof() - 
	close() - 

Timeout - 倒计时表
	start() - 开始
	reached() - 时间到

ByteString - 不可变的字节序列
	encodeUtf8(String s) - 返回一个新的 byte string（s的UTF-8字节）

Segment - 数据段

SegmentPool - 数据段池
	

OkBuffer - 内存中的byte数组

你 ：程序
纸　：目的地
张三 ：程序
老板名片 ：源

张三：你听着啊，０　１　０

你写：０　１　０

Okio
====

Okio is a new library that complements `java.io` and `java.nio` to make it much
easier to access, store, and process your data.

Okio 是一个对`java.io`和`java.nio`就行补充的库，它帮助你访问、存储和处理数据。

ByteStrings and Buffers
-----------------------

Okio is built around two types that pack a lot of capability into a
straightforward API:

 * [**ByteString**][3] is an immutable sequence of bytes. For character data, `String`
   is fundamental. `ByteString` is String's long-lost brother, making it easy to
   treat binary data as a value. This class is ergonomic: it knows how to encode
   and decode itself as hex, base64, and UTF-8.

 * [**Buffer**][4] is a mutable sequence of bytes. Like `ArrayList`, you don't need
   to size your buffer in advance. You read and write buffers as a queue: write
   data to the end and read it from the front. There's no obligation to manage
   positions, limits, or capacities.

Okio围绕两类API构建而成：
- [**ByteString**][3] 是一个不可变更的字节序列。对于字符数据，`String`是基础。`ByteString`（String的兄弟）可以将二进制数据作为一个值来看待和处理。这个类是智能的——它知道如何将自己进行HEX、BASE64和UTF-8编码。
- [**Buffer**][4] 是一个可变字节序列。类似`ArrayList`，你不需要提前知道缓冲区的大小。你讲缓冲区开作一个队列来进行读和写——向队尾写数据，从队首都数据。由始至终你都不需要操心Buffer的位置、限制或容量等问题。

Internally, `ByteString` and `Buffer` do some clever things to save CPU and
memory. If you encode a UTF-8 string as a `ByteString`, it caches a reference to
that string so that if you decode it later, there's no work to do.

`ByteString`和`Buffer`内部做了一些改进以节省CPU和内存资源。如果你将一个UTF-8字符串编码成`ByteString`，它会缓存那个字符串的引用。这样一来，再次对相同字符串进行编码的时候就可以直接复用缓存的引用。

`Buffer` is implemented as a linked list of segments. When you move data from
one buffer to another, it _reassigns ownership_ of the segments rather than
copying the data across. This approach is particularly helpful for multithreaded
programs: a thread that talks to the network can exchange data with a worker
thread without any copying or ceremony.

`Buffer` 是通过一个由数据段作为结点的链表实现的。当你从一个buffer向另一个buffer移动数据时，它的作法是重新分配数据段的所属关系，而不是把数据复制过去。这个行为对多线程程序是尤其有用的——负责和网络对接的线程可以直接和工作线程交换数据，而无法做任何拷贝和交接工作。

Sources and Sinks
-----------------

An elegant part of the `java.io` design is how streams can be layered for
transformations like encryption and compression. Okio includes its own stream
types called [`Source`][5] and [`Sink`][6] that work like `InputStream` and
`OutputStream`, but with some key differences:

 * **Timeouts.** The streams provide access to the timeouts of the underlying
   I/O mechanism. Unlike the `java.io` socket streams, both `read()` and
   `write()` calls honor timeouts.

 * **Easy to implement.** `Source` declares three methods: `read()`, `close()`,
   and `timeout()`. There are no hazards like `available()` or single-byte reads
   that cause correctness and performance surprises.

 * **Easy to use.** Although _implementations_ of `Source` and `Sink` have only
   three methods to write, _callers_ are given a rich API with the
   [`BufferedSource`][7] and [`BufferedSink`][8] interfaces. These interfaces give you
   everything you need in one place.

 * **No artificial distinction between byte streams and char streams.** It's all
   data. Read and write it as bytes, UTF-8 strings, big-endian 32-bit integers,
   little-endian shorts; whatever you want. No more `InputStreamReader`!

 * **Easy to test.** The `Buffer` class implements both `BufferedSource` and
   `BufferedSink` so your test code is simple and clear.

Sources and sinks interoperate with `InputStream` and `OutputStream`. You can
view any `Source` as an `InputStream`, and you can view any `InputStream` as a
`Source`. Similarly for `Sink` and `OutputStream`.

Dependable
----------

Okio started as a component of [OkHttp][1], the capable HTTP+SPDY client
included in Android. It's well-exercised and ready to solve new problems.

靠谱
----------

Okio是[OkHttp][1]的一个组成部分，而Okhttp是被纳入Andorid的一个杰出的HTTP+SPDY客户端。所以，Okio是已经被充分测试了的，而且有信心解决未来可能面对新的挑战。


Example: a PNG decoder
----------------------

Decoding the chunks of a PNG file demonstrates Okio in practice.

```java
private static final ByteString PNG_HEADER = ByteString.decodeHex("89504e470d0a1a0a");

public void decodePng(InputStream in) throws IOException {
  BufferedSource pngSource = Okio.buffer(Okio.source(in));

  ByteString header = pngSource.readByteString(PNG_HEADER.size());
  if (!header.equals(PNG_HEADER)) {
    throw new IOException("Not a PNG.");
  }

  while (true) {
    Buffer chunk = new Buffer();

    // Each chunk is a length, type, data, and CRC offset.
    int length = pngSource.readInt();
    String type = pngSource.readUtf8(4);
    pngSource.readFully(chunk, length);
    int crc = pngSource.readInt();

    decodeChunk(type, chunk);
    if (type.equals("IEND")) break;
  }

  pngSource.close();
}

private void decodeChunk(String type, Buffer chunk) {
  if (type.equals("IHDR")) {
    int width = chunk.readInt();
    int height = chunk.readInt();
    System.out.printf("%08x: %s %d x %d%n", chunk.size(), type, width, height);
  } else {
    System.out.printf("%08x: %s%n", chunk.size(), type);
  }
}
```

Download
--------

Download [the latest JAR][2] or grab via Maven:
```xml
<dependency>
    <groupId>com.squareup.okio</groupId>
    <artifactId>okio</artifactId>
    <version>1.6.0</version>
</dependency>
```
or Gradle:
```groovy
compile 'com.squareup.okio:okio:1.6.0'
```

Snapshots of the development version are available in [Sonatype's `snapshots` repository][snap].


 [1]: https://github.com/square/okhttp
 [2]: https://search.maven.org/remote_content?g=com.squareup.okio&a=okio&v=LATEST
 [3]: http://square.github.io/okio/1.x/okio/okio/ByteString.html
 [4]: http://square.github.io/okio/1.x/okio/okio/Buffer.html
 [5]: http://square.github.io/okio/1.x/okio/okio/Source.html
 [6]: http://square.github.io/okio/1.x/okio/okio/Sink.html
 [7]: http://square.github.io/okio/1.x/okio/okio/BufferedSource.html
 [8]: http://square.github.io/okio/1.x/okio/okio/BufferedSink.html
 [snap]: https://oss.sonatype.org/content/repositories/snapshots/



