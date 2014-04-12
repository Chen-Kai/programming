#include <stdio.h>
#include <stdlib.h>

#define MAX 100

void testIO() {
	char buf[MAX];

	FILE* in;
	FILE* out;

	char* in_file = "./file/io.c";
	char* out_file = "./io.bak";
	in = fopen(in_file, "r");
	out = fopen(out_file, "w+");

	if (in == NULL) {
		printf("Count not open file %s\n", in_file);
	}
	if (out == NULL) {
		printf("Count not open file %s\n", out_file);
	}

	while (fgets(buf, MAX, in) != NULL) {
		fputs(buf, out);
	}

	fclose(in);
	fclose(out);
}
