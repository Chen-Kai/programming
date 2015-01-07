/*
   K&R
   Exercise 1-9.
   Write a program to copy its input to its output, replacing each string of one or more blanks by a single blank.
 */
#include <stdio.h>

#define IN 1
#define OUT 0

int main(void) {
	int c = -1;
	int bc = 0;
	int tc = 0;
	int nc = 0;
	int state;

	puts("Enter: (q to quit)");

	state = OUT;
	while ((c = getchar()) != 'q') {
		if (c == ' ' || c == '\t' || c == '\n')	{
			if (state == IN) {
				putchar(' ');
				state = OUT;
			}
		} else {
			putchar(c);
			state = IN;
		}
	} 

	return 0;
}
