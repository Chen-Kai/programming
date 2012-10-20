#include <stdio.h>
#include <stdlib.h>

extern void run_test();

int main(void) {
	run_test();
	cpu_info();
	return 0;
}
