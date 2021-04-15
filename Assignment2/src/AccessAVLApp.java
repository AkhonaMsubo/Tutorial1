import java.util.Scanner;
import java.util.*; 
import java.io.*; 


public class AccessAVLApp extends AVLStudent {
	public static void main(String[] args) {
		AVLStudent s = new AVLStudent() ; 
		s.openFile();
		s.insertDataItems();
    	//s.printAllStudents();
    	Scanner sc = new Scanner(System.in);
    	String studentid = sc.nextLine();
    	System.out.println("\""+ studentid+"\""); 
    	s.printStudent(studentid);
    	System.out.println(" ");
    	s.closeFile();
	}
}
