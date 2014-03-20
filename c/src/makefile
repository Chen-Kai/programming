a: a.c a.h arg.o basic.o eof.o float.o cpu_info.o debug.o enum.o env.o macro.o mem.o pointer.o struct.o  io.o changeable_arg.o
	@cc -o a $^
	@rm *.o
	@echo "> a"

arr.o: ./array/arr.c ./array/arr.h
	cc -c ./array/arr.c

basic.o: ./basic/basic.c ./basic/basic.h
	cc -c ./basic/basic.c

eof.o: ./basic/eof.c
	cc -c ./basic/eof.c 

float.o: ./basic/float.c
	cc -c ./basic/float.c

macro.o: ./basic/macro.c
	cc -c ./basic/macro.c

cpu_info.o: ./cpu/cpu_info.c ./cpu/cpu_info.h
	cc -c ./cpu/cpu_info.c

debug.o: ./debug/debug.c ./debug/debug.h
	cc -c ./debug/debug.c

enum.o: ./enum/enum.c ./enum/enum.h
	cc -c ./enum/enum.c

env.o: ./env/env.c ./env/env.h
	cc -c ./env/env.c

mem.o: ./mem/mem.c ./mem/mem.h
	cc -c ./mem/mem.c

pointer.o: ./pointer/pointer.c ./pointer/pointer.h
	cc -c ./pointer/pointer.c

struct.o: ./struct/struct.c ./struct/struct.h
	cc -c ./struct/struct.c

io.o: ./file/io.c ./file/io.h
	cc -c ./file/io.c

arg.o: ./arg/main_arg.c ./arg/main_arg.h
	cc -c ./arg/main_arg.c -o arg.o

changeable_arg.o: ./arg/changeable_arg.c ./arg/changeable_arg.h
	cc -c ./arg/changeable_arg.c
