import java.util.Scanner;

/**
 * Class 2D Arrays
 */
 
/**
* @author  Andrew Kuekam
* @version 1.0
* @since   2020-10-17
*/
public class 2DArrays {
  public static void main(String[] args) 
  {
    //This read the input from the console
    Scanner userInput = new Scanner(System.in);
    
    //This diclare the int
    int Assignment;
    
    // declare and construct a 2D array
    int[][] gradeTable = 
    { 
      {99, 42, 74, 83, 50, 77}, 
      {90, 91, 72, 88, 95, 83},
      {88, 61, 74, 89, 96, 50},
      {61, 89, 82, 98, 93, 78},
    };
    
      //
      System.out.println("grade 0,0: " + gradeTable[0][0]);
      System.out.println("grade 2,4: " + gradeTable[2][4]);
      
      //
      gradeTable[3][4] = 89 ;
      
      //This display the assignment
      Assignment = gradeTable[0][0] + gradeTable[0][2] ;
      System.out.println( "sum: " + Assignment );
  }
}