#include <stdio.h>
#include <stdlib.h>
#include <string.h>

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

struct Book {
	char id[4];
	char name[64];
	float price;
};

void testBookStruct() {
	struct Book clan = { "101", "c language", 23.2 };
	struct Book books[2];
	struct Book *pBook;

	strcpy(books[0].id, "121");
	strcpy(books[0].name, "new concept");
	books[0].price = 23.3;

	pBook = books + 1;
	strcpy(pBook->id, "123");
	strcpy(pBook->name, "nnn");
	pBook->price = 22.2;

	printf("%s, %s, %f\n", clan.id, clan.name, clan.price);
	printf("%s, %s, %f\n", books[0].id, books[0].name, books[0].price);
	printf("%s, %s, %f\n", pBook->id, pBook->name, pBook->price);
}

void allocateMem() {
	struct point *p;
	p = (struct point *) malloc(sizeof(struct point));
	p->x = 3.0F;
	p->y = 4.0F;

	printf("point: (%.1f, %.1f)\n", p->x, p->y);
	free(p);
}
