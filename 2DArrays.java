import java.util.*;
import java.util.Random;

/**
 * Class TArrays
 */
 
/**
* @author  Andrew Kuekam
* @version 1.0
* @since   2020-10-17
*/
public class TArrays {
  public static void main(String[] args) 
  {
    //this create the Array
    int [][] number = new int [10][10];
    
    //
    for ( int c = 0; c = < number.length; c++) {
      for( int r = 0; row < number [c].length; r++) {
        number[c][r] = ( r + 1) + (c * 10);
      }
    }
    //
    for (int c = 0; c < number.length; c++) {
      for ( int r = 0; r < number[c].length; r++) {
        System.out.print(numbers[c][r] + " ");
        
      }
      System.out.println("");
    }
  }
}
