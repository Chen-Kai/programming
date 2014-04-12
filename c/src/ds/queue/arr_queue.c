#include <stdio.h>
#include "arr_queue.h"

void init(int* first, int* last) {
	*first = *last = 0;
}

void in(int* q, int* last, int item) {
	q[(*last)++] = item;
}

int out(int* q, int* first) {
	return q[(*first)++];
}

int full(int last, int SIZE) {
	return last == SIZE;
}

int empty(int first, int last) {
	return first == last;
}

void display(int* q, int first, int last) {
	int i = last - 1;
	while (i >= first) {
		printf("%d ", q[i--]);
	}
	putchar('\n');
}

// for testing 
#define SIZE 3

void testArrQueue() {
	int q[SIZE];
	int first;
	int last;
	int item;

	init(&first, &last);

	while (!full(last, SIZE)) {
		puts("Enter: ");
		scanf("%d", &item);
		in(q, &last, item);
		display(q, first, last);
	}

	while (!empty(first, last)) {
		out(q, &first);
		display(q, first, last);
	}

}
