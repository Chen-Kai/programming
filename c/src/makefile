a: main.c main.h basic.o eof.o float.o cpu_info.o debug.o enum.o env.o macro.o mem.o pointer.o struct.o 
	gcc -o a $^
	@rm *.o

arr.o: ./array/arr.c ./array/arr.h
	gcc -c ./array/arr.c

basic.o: ./basic/basic.c ./basic/basic.h
	gcc -c ./basic/basic.c

eof.o: ./basic/eof.c
	gcc -c ./basic/eof.c 

float.o: ./basic/float.c
	gcc -c ./basic/float.c

macro.o: ./basic/macro.c
	gcc -c ./basic/macro.c

cpu_info.o: ./cpu/cpu_info.c ./cpu/cpu_info.h
	gcc -c ./cpu/cpu_info.c

debug.o: ./debug/debug.c ./debug/debug.h
	gcc -c ./debug/debug.c

enum.o: ./enum/enum.c ./enum/enum.h
	gcc -c ./enum/enum.c

env.o: ./env/env.c ./env/env.h
	gcc -c ./env/env.c

mem.o: ./mem/mem.c ./mem/mem.h
	gcc -c ./mem/mem.c

pointer.o: ./pointer/pointer.c ./pointer/pointer.h
	gcc -c ./pointer/pointer.c

struct.o: ./struct/struct.c ./struct/struct.h
	gcc -c ./struct/struct.c
