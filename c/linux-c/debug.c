#include <stdio.h> 

#define DEBUG_FORMAT "%s: %d in %s\n"
#define DEBUG_ARGS __FILE__, __LINE__, __FUNCTION__

int main(void)
{
	printf(DEBUG_FORMAT, DEBUG_ARGS);
	return 0;
}
