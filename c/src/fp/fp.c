#include <stdio.h>
#include "fp.h"

int max(int a, int b) {
	return a > b ? a : b;	
}

int min(int a, int b) {
	return a < b ? a : b;	
}

int sum(int (*fp)(int, int), int a[], int len_a, int b[], int len_b) {
	int sum = 0;
	int i;

	for (i = 0; i < len_a && i < len_b; i++) {
		sum += (*fp) (a[i], b[i]);
	}

	return sum;
}

void testFp(void) {
	int a[] = {1, 2, 3};
	int b[] = {3, 2, 1};

	int len_a = sizeof(a) / sizeof(a[0]);
	int len_b = sizeof(b) / sizeof(b[0]);

	int ret;

	int (*fp) (int, int);

	fp = &max;

	ret = sum(fp, a, len_a, b, len_b);

	printf("ret: %d\n", ret);
}
