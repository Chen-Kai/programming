#include <stdio.h>

void swap(int* ptr1, int* ptr2)
{
	int tmp = *ptr1;
	*ptr1 = *ptr2;
	*ptr2 = tmp;
}

int main()
{
	int a = 0;
	int b = 1;

	printf("a = %d, b = %d\n", a, b);

	swap(&a, &b);

	printf("a = %d, b = %d\n", a, b);

	return 0;
}
