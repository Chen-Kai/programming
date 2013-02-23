#include <stdio.h>

struct point {
	float x;
	float y;
};

static void printPoint(struct point p) {
	printf("(%0.2f, %0.2f)\n", p.x, p.y);
}

void structInit() {
	struct point p = { 1.0, };
	printPoint(p); // p(1.00, 0.00)
}

void structAssign() {
	struct point p1, p2;
	p1.x = 1.0;
	p1.y = 0.0;

	printPoint(p1);

	p2 = p1;
	printPoint(p2);

}
