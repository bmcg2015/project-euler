/**
* Problem description:
* Problem 2:
* Each new term in the Fibonacci sequence is generated by adding the previous two terms.
* By starting with 1 and 2, the first 10 terms will be:
* 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
* By considering the terms in the Fibonacci sequence whose values do not exceed four
* million, find the sum of the even-valued terms.
*/

/**
* Finds the sum of the even valued terms in the Fibonacci sequence with a value
* less than or equal to 4 million. Only holds the current term in the sequence
* and the previous term.
* @author Brendan McGrath
*/
public class Fibonacci{
   /**
   * Holds the value of the previous term.
   */
   public int term1 = 1;

   /**
   * Holds the value of the current term.
   */
   public int term2 = 2;

   /**
   * Temporarily holds the value of the current term in order to 
   * work out the next term in the sequence.
   */
   public int temp;

   /**
   * The sum of all the even terms in the sequence.
   */
   public int sum = 0;

   public void calculateSum(){
      
      while( term2 <= 4000000 ){

         if( term2 % 2 == 0 )
            sum += term2;

         temp = term2;
         term2 += term1;
         term1 = temp;

      }

      System.out.println( sum );

   }//end of method calculateSum()

}
