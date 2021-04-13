// Assignment 1 part 1- AccessArrayApp  
// Akhona Msubo 
// 25/03/2021  
import java.util.Scanner;
import java.utill.*; 

public class AccessArrayApp
{
    private String studentID;
    
    public AccessArrayApp( String ID) {
    studentID = ID;
    }
    

    String[] arrayList = new String[5001] 
    FileReader fileReader = new FileReader("oklist.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line = null;
    
    while ((line = bufferedReader.readLine()) != null) 
        {
            int i; 
            for (i = 0; i< arrayList.length ; i++) 
            arrayList[i] = line ;
            System.out.println(arrayList[i]);
        }
        
    bufferedReader.close(); 
   // System.out.println(arrayList);
    // pass the path to the file as a parameter
    //File file = new File("oklist.txt");
    //Scanner sc = new Scanner(file);
    
   // while (sc.hasNextLine())
    //  System.out.println(sc.nextLine());
    
    
   // public AccessArrayApp( String ID) {
   // studentID = ID; 
   // }
// }   
}       