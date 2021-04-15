import java.util.Scanner;
import java.util.*; 
import java.io.*; 

public class ExperimentAVLApp extends AVLStudent{

public static void main(String[] args){
AVLTree<AVLStudent> bst2 = new AVLTree<AVLStudent> (); 
	int i;
	AVLStudent s = new AVLStudent();
 	try {
    	Scanner sc = new Scanner(new File("/home/akhona/Assignment1/data/oklist.txt"));
	for(i= 0 ; i<5000 ; i++){
   		String studentID = sc.next() ;
   		String name = sc.next();
   		String surname = sc.next();
   		AVLStudent ss = new AVLStudent( studentID , name , surname);
        bst2.insert(ss);
        
    }
