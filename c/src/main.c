#include "main.h"
#include "limits.h"
#include "struct/struct.h"

struct Book {
	char id[4];
	char name[64];
	float price;
};

int main(int argc, char **argv) {
	struct Book clan = {"101", "c language", 23.2};
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
	return EXIT_SUCCESS;
}
