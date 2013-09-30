##### 原则
* 永远不用让debug开关影响代码的逻辑，例如:
	if (DEBUG) {
		return; // 糟糕的逻辑！
	}

* 如果提供了配置选项，一定要提供“一键重置默认配置”功能

* 除非必须，否则不要添加配置项目以保持简介

##### DON'Ts in synchronization
* Don't read while writing;
* Don't write while reading;
* Don't write synchronously;

---

##### Multiple threads share same resource
Thread X tries to access the resource.
* If it is not locked:
  1. Lock it  
  2. Do the things  
  3. Unlock it  
* Or, wait

##### Stack & Heap & Constant storage (data area)
> The stack lives in the general random-access memory (RAM) area, but has direct support from the processor via its stack pointer. The stack pointer is moved down to create new memory and moved up to release that memory. (Object references are stored on the stack)
> The heap is a general-purpose pool of memory (also in the RAM area) where all Java objects live. Whenever you need an object, you simply write the code to create it by using **new**, and the strorage is allocated on the heap when that code is executed.
> Constant values are often placed directly in the program code, which is safe since they can never change.

##### Primitive types in Java
> The primitive variable holds the value directly, and it is placed on the stack.(Java detemines the size of each primitive type.) 

##### URL
> A URL is a pointer to a resource on the World Wide Web.

##### 最小化变量作用域
> 要让变量的作用域小到不能再小。也就是说，要隐藏临时变量，让尽量少的环节知道它，防止被误用。-- Keep methods small and focused.

##### 

---

###### 为啥数组索引从0而不是1开始？
要从机器语言编程说起... 程序员小强需要知道每个数组元素的地址。他想：既然已知数组首地址，我只需要给每个元素加一个索引，计算出偏移再加上首地址就可以啦。
可是，索引应该从1开始吗？如果是，有两个问题：
* 问题1：那第一个元素的地址就是首地址+1再-1，第二个元素的地址是 首地址+2再-1，每个都得减，麻烦啊。
* 问题2：还有一招，把第一个元素存储于首地址偏一个元素的地址，就不再语言+1了，可是却浪费了一个元素的空间。

天才的idea出来了，从0开始索引。问题1、2都得到了解决。
