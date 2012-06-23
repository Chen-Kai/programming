#include <stdio.h>
#include <string.h>
#include <assert.h>

#define STRING_TO_BE_COPIED "source"

void memcpy_test() {
	char *src_p = STRING_TO_BE_COPIED;
	char *dest_p = malloc(11);
	assert(strlen(src_p) < 11);
	memcpy(dest_p, src_p, strlen(src_p));
	puts(dest_p);
}

int main(void) {
	memcpy_test();
	return 0;
}

