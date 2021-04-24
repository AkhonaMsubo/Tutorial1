//Akhona Msubo
//10/04/2021
//Assignment2

import java.util.Scanner;
import java.util.*; 
import java.io.*; 

/** 
 *ExperimentAVLApp extends AVLStudent
 *Tests AccessAVLApp.java for different data sizes 
 *@author akhona
 *
 */

public class ExperimentAVLApp extends AVLStudent{

public static void main(String[] args){
	AVLTree<AVLStudent> avl2 = new AVLTree<AVLStudent> (); 
	int i;
	
 	try {
    	Scanner sc = new Scanner(new File("/home/akhona/Assignment2/data/oklist.txt"));
	
	for(i= 0 ; i<5000 ; i++){
   		String studentID = sc.next() ;
   		String name = sc.next();
   		String surname = sc.next();
   		AVLStudent ss = new AVLStudent( studentID , name , surname);
        avl2.insert(ss);
    }

    Scanner sc2 = new Scanner(System.in);
    String studentid = sc2.nextLine(); 
    
    AVLStudent ss2 = new AVLStudent(studentid,null,null);
    System.out.println("\""+ studentid+"\""); 
     try {
          System.out.println(avl2.find(ss2).getData());
          
         }
     catch (Exception e){
     	  System.out.println("Access denied!");
     	 } 
     	 
     System.out.println("Number of find comparisons is: "+avl2.getFindCount()); 
     System.out.println("Number of insert comparisons is: "+avl2.getInsertCount());
     
     System.out.println("n = "+i);
 	System.out.println(" ");
    }
    
    catch ( Exception e) 
    {
       System.out.println("could not find file");
    } 


	
}
}   
