#include <stdio.h>

int main () {
	int a = 0;
	int* ptr = &a;
	printf("Memory Address %p contains %d\n", ptr, *ptr);

	*ptr = 1;
	printf("Memory Address %p contains %d\n", ptr, *ptr);
}

