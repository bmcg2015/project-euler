/**
* Problem description:
* Problem 5:
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

/**
* Directly finds the lowest common multiple of all the integers between 1 and 20.
* @see Multiple2
*/
public class Multiple{

   /**
   * Loops through all integers between 1 and the max int value, checks to see if each number
   * is a multiple of all the integers between 3 and 20.
   */
   public void smallestMultiple(){
      outerLoop: for( int i = 2; i < Integer.MAX_VALUE; i++ ){
         for( int j = 3; j <= 20; j++ )
            if( i % j != 0 )
               continue outerLoop;
         System.out.println( i );
         break;
      }
   }

}
