/*
   K&R
   Exercise 1-9.
   Write a program to count blanks, tabs, and newlines.
 */
#include <stdio.h>

#define IN 1
#define OUT 0

int main(void) {
	int c = -1;
	int bc = 0;
	int tc = 0;
	int nc = 0;
	puts("Enter: (q to quit)");

	while ((c = getchar()) != 'q') {
		if (c == ' ') {
			bc++;
		} else if (c == '\t') {
			tc++;
		} else if (c == '\n') {
			nc++;
		}	
	} 

	printf("blanks: %d, tabs: %d, newlines: %d\n", bc, tc, nc);

	return 0;
}
