#include <stdio.h>

struct point {
	float x;
	float y;
};

void structInit() {

	struct point p = { 1.0, };

	printf("p(%0.2f, %0.2f)\n", p.x, p.y); // p(1.00, 0.00)
}
