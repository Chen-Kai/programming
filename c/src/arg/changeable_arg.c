#include <stdarg.h>
#include "changeable_arg.h"

int sum_of_args(int n, ...) {
	int sum = 0;
	int i;
	va_list list;
	
	va_start(list, n);
	
	for (i = 0; i < n; i++) {
		sum += va_arg(list, int);
	}
	
	va_end(list);
	
	return sum;
}
