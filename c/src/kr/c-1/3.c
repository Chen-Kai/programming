/*
K&R
Exercise 1-3.
Modify the temperature conversion program to print a heading above the table.
 */
#include <stdio.h>

int main(void) {
	float lower = 0;
	float upper = 300;
	float step = 20;

	float fahr, celsius;

	printf("%10s\t%7s\n", "Fahrenheit", "Celsius");

	for (fahr = lower; fahr <= upper; fahr += step) {
		celsius = (5.0 / 9.0) * (fahr - 32.0);
		printf("%10.0f\t%7.1f\n", fahr, celsius);
	}

	return 0;
}
