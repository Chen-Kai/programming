#include "macro.h"
#include <stdio.h>
void testMaxMacro() {
	int a = 9;
	int b = 6;
	int max = max(a, b);

	printf("a = %d, b = %d, max(a, b) = %d\n", a, b, max);

	a = 6;
	b = 9;
	max = max(a, b);

	printf("a = %d, b = %d, max(a, b) = %d\n", a, b, max);
}
