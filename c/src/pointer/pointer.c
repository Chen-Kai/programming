#include "pointer.h"
#include "stddef.h"
#include "stdio.h"

void print_mem_addr(void) {
	int a = 0;
	int* ptr = &a;

	printf("Memory Address %p contains %d\n", ptr, *ptr);

	*ptr = 1;
	printf("Memory Address %p contains %d\n", ptr, *ptr);
}

void print_null() {
	printf("NULL is %p\n", NULL);
}

void struct_pointer() {
	struct point p;
	struct point* ptr;

	// Let ptr points to the struct p
	ptr = &p;

	printf("Enter x: ");
	scanf("%f", &ptr->x);

	printf("\nEnter y: ");
	scanf("%f", &ptr->y);

	printf("p.x = %.2f, p.y = %.2f\n", p.x, p.y);
	printf("ptr->x = %.2f, ptr->y = %.2f\n", ptr->x, ptr->y);
}

static void swap(int* ptr1, int* ptr2) {
	int tmp = *ptr1;
	*ptr1 = *ptr2;
	*ptr2 = tmp;
}

void test_swap() {
	int a = 0;
	int b = 1;

	printf("a = %d, b = %d\n", a, b);

	swap(&a, &b);

	printf("a = %d, b = %d\n", a, b);
}

