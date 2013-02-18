#include <assert.h>
#include <stdio.h>
char cpu_info(void) {
	unsigned short int i = (unsigned short int) 0XFF01;
	assert(sizeof(short int) >= 2);
	// the byte number of the int
	if (*((char *) &i) == 1) {
		printf(
				"Little-Endian: lower byte of the data stored in the lower address");
		return 'l';
	} else {
		printf(
				"Big-Endian: lower byte of the data stored in the higher address");
		return 'b';
	}
}
