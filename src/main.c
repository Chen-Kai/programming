#include <stdio.h>
#include <stdlib.h>

extern void run_test();
extern void get_malloc_addr();

int main(void) {
	run_test();
	cpu_info();
	get_malloc_addr();
	return 0;
}
