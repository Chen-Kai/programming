#include <stdarg.h>
#include "changeable_arg.h"

int sum_of_args(int n, ...) {
	int sum = 0;
	int i;
	va_list ap;
	
	va_start(ap, n);
	
	for (i = 0; i < n; i++) {
		sum += va_arg(ap, int);
	}
	
	va_end(ap);
	
	return sum;
}
