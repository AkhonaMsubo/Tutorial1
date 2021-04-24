#Akhona Msubo
#Makefile for Assignment2
#9 April 2021 

JAVAC=/usr/bin/javac
.SUFFIXES: .java .class 
SRCDIR=src 
BINDIR=bin 

$(BINDIR)/%.class:$(SRCDIR)/%.java 
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
	
CLASSES=BinaryTreeNode.class BTQueueNode.class \
	BTQueue.class BinaryTree.class \
	AVLStudent.class AccessAVLApp.class \ 
	AVLTree.class \
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)
clean:
	rm $(BINDIR)/*.class
	
run: $(CLASS_FILES)
	java -cp $(BINDIR) AccessAVLApp			