#include "pointer.h"

void point_basic() {
	char c = 'A';
	char *cptr;
	cptr = &c;
	printf("The address of c is %p", &c);
	printf("\nThe value of c is %c", c);
	printf("\nThe address of cptr is %p", &cptr);
	printf("\nThe value of cptr is %p", cptr);
	printf("\nAccess variable which cptr point to is %c\n", *cptr);
}
