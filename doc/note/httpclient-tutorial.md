##Chapter 1. Fundamentals
###1.1. Request execution
The most essential function of HttpClient is to execute HTTP methods. Execution of an HTTP method involves one or several HTTP request / HTTP response exchanges, usually handled internally by HttpClient. The user is expected to provide a request object to execute and HttpClient is expected to transmit the request to the target server return a corresponding response object, or throw an exception if execution was unsuccessful.

HttpClient的主要工作就是执行各种HTTP方法。执行一个HTTP方法常常需要引入一次或几次HTTP request，HTTP response交互，这些交互过程通常在HttpClient内部处理完成。我们得构建一个request对象交给HttpClient执行，HttpClient就会把这个request对象通过网络传递给目标服务器，并返回给我们一个相应的response对象或者异常。

Quite naturally, the main entry point of the HttpClient API is the HttpClient interface that defines the contract described above.

很自然地，HttpClient API的切入点就是定义了上述过程的HttpClient接口。

Here is an example of request execution process in its simplest form:

下面是一个最简单的请求执行过程的实例：
HttpClient httpclient = new DefaultHttpClient();
HttpGet httpget = new HttpGet("http://localhost/");
HttpResponse response = httpclient.execute(httpget);
HttpEntity entity = response.getEntity();
if (entity != null) {
	InputStream instream = entity.getContent();
	try {
		// do something useful
	} finally {
		instream.close();
	}
}
1.1.1.HTTP request
All HTTP requests have a request line consisting a method name, a request URI and an HTTP protocol version.

所有的HTTP请求都有一个request行，其中包含一个方法名、一个request URI和一个HTTP协议版本号。

HttpClient supports out of the box all HTTP methods defined in the HTTP/1.1 specification: GET, HEAD, POST, PUT, DELETE, TRACE and OPTIONS. There is a specific class for each method type.: HttpGet, HttpHead, HttpPost, HttpPut, HttpDelete, HttpTrace, and HttpOptions.

HttpClient支持HTTP/1.1规范中定义的所有HTTP方法：GET, HEAD, PUT, DELETE, TRACE and OPTIONS. 并且针对每一个方法都一个特定的类：HttpGet, HttpHead, HttpPost, HttpPut, HttpDelete, HttpTrace, and HttpOptions.

The Request-URI is a Uniform Resource Identifier that identifies the resource upon which to apply the request. HTTP request URIs consist of a protocol scheme, host name, optional port, resource path, optional query, and optional fragment.

Request-URI是一个统一资源定位标识符，它由协议方案、主机名、端口号（可选）、资源路径、查询信息（可选）和片段（可选）组成。


