import java.util.Random;
import java.util.Scanner;

/**
 
* Class TArrays.

* @author  Andrew Kuekam
* @version 1.0
* @since   2020-10-23
*/
public class TwoD {
  /**
  *.
  */
  public static void main(String[] args) {
    
    Random rand = new Random();
    
    // declare var
    int counter = 0;
    int average = 0;
    int sum = 0;
    int row = 0;
    int column = 0;
    
    //this create the 2D Array
    int array [][] = new int [4][6];
    
    //This fill the array whit random number
    for (column = 0; column < array.length; column++) {
      for (row = 0; row < 6; row++) {
        array[column][row] = rand.nextInt(100);
        
        System.out.print(array[column][row] + " ");
      }
      System.out.println();
    }
    
    //this calculate the average
    average = sum + array[column][row];
    counter++;
    
    System.out.println("The average is:" + sum / average);
  }
}