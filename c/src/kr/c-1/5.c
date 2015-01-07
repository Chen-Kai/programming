/*
   K&R
   Exercise 1-5.
   Modify the temperature conversion program to print the table in reverse order, that is, from 300 degrees to 0.
 */
#include <stdio.h>

int main(void) {
	float lower = 0;
	float upper = 300;
	float step = 20;

	float fahr, celsius;

	printf("%10s\t%7s\n", "Fahrenheit", "Celsius");

	for (fahr = upper; fahr >= lower; fahr -= step) {
		celsius = (5.0 / 9.0) * (fahr - 32.0);
		printf("%10.0f\t%7.1f\n", fahr, celsius);
	}

	return 0;
}
