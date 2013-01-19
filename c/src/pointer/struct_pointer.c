/*
 * struct_pointer.c
 *
 *  Created on: Nov 17, 2012
 *      Author: DailyEfforts
 */

#include "pointer.h"

struct point {
	float x;
	float y;
};

void struct_pointer() {
	struct point p;
	struct point* ptr;

	// Let ptr points to the struct p
	ptr = &p;

	printf("Enter x: ");
	scanf("%f", &ptr->x);

	printf("\nEnter y: ");
	scanf("%f", &ptr->y);

	printf("p.x = %.2f, p.y = %.2f\n", p.x, p.y);
	printf("ptr->x = %.2f, ptr->y = %.2f\n", ptr->x, ptr->y);
}

