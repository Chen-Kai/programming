#include <stdio.h>

struct point {
	float x;
	float y;
};

void structInit() {
	struct point p = { 1.0, };
	printf("p(%0.2f, %0.2f)\n", p.x, p.y); // p(1.00, 0.00)
}

void structAssign() {
	struct point p1, p2;
	p1.x = 1.0;
	p1.y = 0.0;

	printf("p1(%0.2f, %0.2f)\n", p1.x, p1.y);

	p2 = p1;
	printf("p2(%0.2f, %0.2f)\n", p2.x, p2.y);

}
