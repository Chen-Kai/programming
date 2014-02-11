#include <stdio.h>
#include <stdlib.h>
#include <float.h>

void printFloat() {
	float f1 = 0.11F;
	float f2 = 0.11F;

	printf("FLT_MAX: %e\n", FLT_MAX);
	printf("FLT_MIN: %e\n", FLT_MIN);
	printf("FLT_EPSILON: %e\n", FLT_EPSILON);

	if (abs(f1 - f2) < FLT_EPSILON) {
		puts("f1 == f2");
	} else {
		puts("f1 != f2");
	}
}
