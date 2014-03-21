#ifndef ARR_QUEUE_H
#define ARR_QUEUE_H
void init(int* first, int* last);
void in(int* q, int* last, int item);
int out(int* q, int* first);
int full(int last, int size);
int empty(int first, int last);
void display(int* q, int first, int last);
void testArrQueue();
#endif
