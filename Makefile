NAME = Sem


all: clean compile test

compile:
	java -jar /usr/local/lib/antlr-4.5.1-complete.jar $(NAME).g4
	javac $(NAME)*.java

test:
	java org.antlr.v4.gui.TestRig $(NAME) r -gui

clean:
	rm -f $(NAME)*.java
	rm -f $(NAME)*.tokens
	rm -f *.class
