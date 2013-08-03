#include <stdio.h>

int main(void) {
	char a[] = {0, 0, 0};
	// fgets is safer than scanf
	fgets(a, sizeof(a), stdin);
	puts(a);
	return 0;
}
