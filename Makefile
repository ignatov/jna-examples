build src_c/my.h src_c/my.c:
	gcc -c -fPIC -g  src_c/my.c -omy.o
	gcc -shared -g my.o -o ./libmy.so
