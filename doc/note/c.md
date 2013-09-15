##### Pointer
> A pointer is a variable contains the address (in memory) of a variable; An array is a block of memory.

##### Principles:
* Whenever you declare a variable, initialize it!
* Whenever you do an indirection, check NULL!
* malloc, free!

##### 打印变量地址或指针值使用%p

	#include <stdio.h>

	int global = 99;

	int main(void)
	{
		printf("global = %x\nn", global);
		printf("&global = %p\n", &global);
		printf("main() at %p\n", main);
		return 0;
	}

##### 指针的好处：
1. 让不同部分的代码可以轻松地共享信息
例如，你无需把整个网页的信息复制给别人，只需给ta链接地址即可
2. 使得链表、树等数据结构成为可能

##### `&` and `*`

	int i = 1;
	int *ptr = &i;

`&`操作符取出变量i在内存中的地址
	
	printf("%d\n", *ptr);

*操作符被用来提取ptr所指向的值

C语言程序可能使用三种内存区域：
1. 静态/全局变量区
程序一开时执行，全局变量就被放置这个区域，直到程序终止。
2. 自动区
方法体内的临时变量被放置在这个区域
3. 动态区

---

可`建议`编译器把频繁使用的临时变量（例如计数器）放于`寄存器`中

	registers int counter = 0;

不过，就不能用&操作符取该变量的地址了。

---
`static`的local变量只被初始化一次
`static`的local变量不会在每次函数被呼叫时都被重新赋值（也就是说会保留原来的值）
`static`的global变量和函数是文件私有的，只在文件内可见

---

The `&` operator takes a piece of data and tells you where it is stored.
The `*` operator takes an address and tells you what is stored there.

---

`sizeof`是一个操作符，其值在编译时期就已经计算完成了。

---

指针的好处：
* 让不同部分的代码可以轻松地共享信息
例如：你无需把整个网页的信息复制给别人，只需要给TA页面的URL即可
* 使得链表、树等数据结构成为可能

---

指针和数组
指针`pa`是一个变量，语句`pa = a`是合法的；但数组名`a`不是变量，语句`a = pa`是非法的。
