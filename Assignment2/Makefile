#Makefile for Assignment 2
#Akhona Msubo
#13/04/2021

JAVAC=/usr/bin/javac
.SUFFIXES: .java .class 
SRCDIR=src
BINDIR=bin 

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
	
CLASSES=BinaryTreeNode.class BTQueueNode.class \
	BTQueue.class BinaryTree.class \
	AVLTree.class AVLStudent.class \
	AccessAVLApp.class
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class 
	
run: $(CLASS_FILES)
	java -cp bin AccessAVLApp		