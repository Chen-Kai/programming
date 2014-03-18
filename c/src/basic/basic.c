#include "basic.h"

void displayTheIntValue(const int i) {
	printf("%d\n", i);
//	i = 0; // assignment of read-only parameter ‘i’ error
}

void displayTypes() {
	char c = 'A';
	char str[] = "hello";

	short sInt = 100;
	int i = 100 * 100;
	long lInt = 100 * 100 * 100 * 100L;

	float f = 1.2F;
	double d = 0.123456;

	printf("Char: %c\n", c);
	printf("String: %s\n", str);
	printf("short: %i\n", sInt);
	printf("int: %d\n", i);
	printf("long: %ld\n", lInt);
	printf("float: %f\n", f);
	printf("double: %lf\n", d);

}

