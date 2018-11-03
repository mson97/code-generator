SHELL  = /bin/sh

# pretty minimal makefile
My_Main:
	javac *.java

# invoke via "make clean".
# WARNING: make sure you know what this is going to do before you invoke it!!!
# (N.B., in this part it removes .c files too!)
clean:
	/bin/rm -f *.class *~ core* *.output My_Main.*

# just do `make remake' instead of `make clean; make'
remake: clean My_Main
