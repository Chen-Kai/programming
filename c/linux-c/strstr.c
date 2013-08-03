#include <stdio.h>
#include <string.h>

int main(void) {
	char *pSrc = "addressing";
	char *pKey = "ing";

	char *pLoc = NULL;
	pLoc = strstr(pSrc, pKey);
	if (pLoc != NULL) {
		printf("find %s in %s at %p\n", pKey, pSrc, pLoc);
	}
	return 0;
}
