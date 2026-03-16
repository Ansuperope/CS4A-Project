JAVAC = javac
JAVA  = java

MAIN = Main

SOURCES = $(wildcard *.java)
CLASSES = $(SOURCES:.java=.class)

all: $(CLASSES)

%.class: %.java
	$(JAVAC) $<

run: all
	$(JAVA) $(MAIN)

clean:
	rm -f *.class