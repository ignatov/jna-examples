build src_c/my.h src_c/my.c:
	gcc -c -fPIC -g  src_c/my.c -omy.o
	gcc -shared -g my.o -o ./libmy.so
    
javac:
	javac -cp out/artifacts/jna_examples/jna_examples.jar:lib/jna.jar Hello.java

java: 
	java -Djna.library.path="." -cp out/artifacts/jna_examples/jna_examples.jar:lib/jna.jar Hello

run-kotlin-namespace:
	java -Djna.library.path="." -cp ".:out/artifacts/jna_examples_jar/jna_examples.jar" namespace
