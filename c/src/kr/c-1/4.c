/*
   K&R
   Exercise 1-4.
   Write a program to print the corresponding Celsius to Fahrenheit table.
 */
#include <stdio.h>

int main(void) {
	float lower = 0;
	float upper = 300;
	float step = 20;

	float fahr, celsius;

	printf("%7s\t%10s\n", "Celsius", "Fahrenheit");

	for (celsius = lower; celsius <= upper; celsius += step) {
		fahr = celsius / (5.0 / 9.0) + 32;
		printf("%7.0f\t%10.1f\n", celsius, fahr);
	}

	return 0;
}
