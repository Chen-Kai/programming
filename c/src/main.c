#include "main.h"
#include "limits.h"

int main(int argc, char **argv) {
	int a[10];
	printf("%d\n", sizeof(a)); // 40
	printf("%d\n", sizeof(&a)); // 8
	return EXIT_SUCCESS;
}
