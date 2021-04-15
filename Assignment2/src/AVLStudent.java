//Akhona Msubo
//10/04/2021
//Assignment2

import java.util.Scanner;
import java.util.*; 
import java.io.*; 

 
 public class AVLStudent implements Comparable<AVLStudent>{
	protected String studentID;
    protected String name; 
    protected String surname;
    protected Scanner x; 
    AVLTree<AVLStudent> avl = new AVLTree<AVLStudent> ();

	public AVLStudent (){} 

	public AVLStudent( String id , String n, String sn){
		studentID = id ;
		name = n;
		surname = sn;
	} 
	
	public String getStudentID(){
    	return studentID;
    } 
    
    public String getName(){
    	return name; 
    } 
    
    public String getSurname(){
    	return surname;
    } 
    
    public void openFile() {
    	try {
    		 x = new Scanner (new File("/home/akhona/Assignment2/data/oklist.txt"));
    	    }
    	catch ( Exception e) 
    	    {
    		System.out.println("could not find file");
    	    } 
    }	
    
    @Override 
    public  int compareTo (AVLStudent otherstudent){
    	AVLStudent other = (AVLStudent)otherstudent;
  		if (studentID.compareTo(other.studentID) < 0) return -1;
  		if (studentID.compareTo(other.studentID) > 0) return 1;
  		return 0;
   } 
   
   public void insertDataItems(){
    while (x.hasNext()){
   			String studentID = x.next() ;
    		String name = x.next();
    		String surname = x.next();
    		AVLStudent ss = new AVLStudent( studentID , name , surname);
    		avl.insert(ss); 	
    	}
System.out.println("Number of insert comparisons made made: " + avl.getInsertCount());
    }  
   
   public void printAllStudents(){
   		avl.treeOrder();
   
   } 
   
   public void printStudent(String id){
   AVLStudent ss = new AVLStudent(id,null,null);
     try {
          System.out.println(avl.find(ss).getData());
          
         }
     catch (Exception e){
     	  System.out.println("Access denied!");
     	 } 
   System.out.println("Number of comparisons is: "+avl.getCount());
   }
   
   @Override
   public String toString() {
   return name + " " + surname; 
   } 
   
   public void closeFile() {
    	x.close();
    }

}
