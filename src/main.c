#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

extern void run_test();
extern void get_malloc_addr();
extern void printEOF();
extern int getMax();

int main(void) {
//	run_test();
//	cpu_info();
//	get_malloc_addr();
//	printEOF();
	assert(1 == getMax(0, 1));
	return 0;
}
