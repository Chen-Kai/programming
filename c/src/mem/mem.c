#include <string.h>
#include <assert.h>
#include <stdio.h>
#include <stdlib.h>

#define STRING_TO_BE_COPIED "source"

void memcpy_test() {
	char *src_p = STRING_TO_BE_COPIED;
	char *dest_p = malloc(11);
	assert(strlen(src_p) < 11);
	memcpy(dest_p, src_p, strlen(src_p));
	puts(dest_p);
	free(dest_p);
}

void memmove_test() {
	char *src_p = STRING_TO_BE_COPIED;
	char *dest_p = malloc(11);
	assert(strlen(src_p) < 11);
	memmove(dest_p, src_p, strlen(src_p));
	puts(dest_p);
	free(dest_p);
}

void get_malloc_addr() {
	char* ptr = malloc(100 * sizeof(int));
	printf("\nmalloc(100 * sizeof(int) returns start address: %p\n",
			(char*) ptr);
	free(ptr);
}

