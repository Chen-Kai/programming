##### Pointer
> A pointer is a variable contains the address (in memory) of a variable; An array is a block of memory.

##### Principles:
* Whenever you declare a variable, initialize it!
* Whenever you do an indirection, check NULL!
* malloc, free!

##### 打印变量地址使用%p
	#include <stdio.h>

	int global = 99;

	int main(void)
	{
		printf("global = %x\nn", global);
		printf("&global = %p\n", &global);
		printf("main() at %p\n", main);
		return 0;
	}

