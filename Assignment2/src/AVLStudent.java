//Akhona Msubo
//10/04/2021
//Assignment2

import java.util.Scanner;
import java.util.*; 
import java.io.*; 

/**
 *Student represents each student in the oklist
 *Student is immutable, they can not be changed 
 *Student implements comparable 
 *@author akhona
 *
 */
 
 public class AVLStudent implements Comparable<AVLStudent>{
	protected String studentID;
    protected String name; 
    protected String surname;
    protected Scanner x; 
    AVLTree<AVLStudent> avl = new AVLTree<AVLStudent> ();

    /**
     * No argument constructor 
     */

	public AVLStudent (){} 
	
	/**
     *Constructs and initializes a Student 
     *@param id initializes studentid
     *@param n initializes name
     *@param sn initializes surname
     */

	public AVLStudent( String id , String n, String sn){
		studentID = id ;
		name = n;
		surname = sn;
	} 
	
	/**
    * @return returns student ID
    */
	
	public String getStudentID(){
    	return studentID;
    } 
    
    /**
     * @return returns students name 
     */
    
    public String getName(){
    	return name; 
    } 
    
    /**
     * @return returns students surname
     */ 
    
    public String getSurname(){
    	return surname;
    } 
    
    /**
     * Opens text file that stores the students ids, name and surname 
     * @throws "could not find file" if the does not open
     */
    
    public void openFile() {
    	try {
    		 x = new Scanner (new File("/home/akhona/Assignment2/data/oklist.txt"));
    	    }
    	catch ( Exception e) 
    	    {
    		System.out.println("could not find file");
    	    } 
    } 
    
    /**
    * Overrides the compareTo method 
    * in order to comapre data of type Student
    * @param otherstudent user input of student they are trying to find 
    * @return int value of -1 or 0 or 1
    */	
    
    @Override 
    public  int compareTo (AVLStudent otherstudent){
    	AVLStudent other = (AVLStudent)otherstudent;
  		if (studentID.compareTo(other.studentID) < 0) return -1;
  		if (studentID.compareTo(other.studentID) > 0) return 1;
  		return 0;
   } 
   
   /**
     * Inserts Data from oklist into AVL Tree
     */
   
   public void insertDataItems(){
    while (x.hasNext()){
   			String studentID = x.next() ;
    		String name = x.next();
    		String surname = x.next();
    		AVLStudent ss = new AVLStudent( studentID , name , surname);
    		avl.insert(ss); 	
    	}

    }  
    
    /**
     * prints out all student names and surnames in a sorted and balanced 
     * AVLTree
     */
   
   public void printAllStudents(){
   		avl.treeOrder();
   
   } 
   
   /**
    *Prints out the student name for the first matching student ID 
    *@throws "Access denied!" if there is no match.
    *Prints out the number of find and insert comparisms made 
    *@param id ID Key to find Student name and surname 
    */
   
   public void printStudent(String id){
   AVLStudent ss = new AVLStudent(id,null,null);
     try {
          System.out.println(avl.find(ss).getData());
          
         }
     catch (Exception e){
     	  System.out.println("Access denied!");
     	 } 
   System.out.println("Number of find comparisons is: "+avl.getFindCount());
   System.out.println("Number of insert comparisons is : " + avl.getInsertCount());
   } 
   
   /**
    *Overrides the toString method 
    *@return student name and surname 
    */
   
   @Override
   public String toString() {
   return name + " " + surname; 
   } 
   
   /**
    * Closes the oklist text file 
    *
    */
   
   public void closeFile() {
    	x.close();
    }

}
