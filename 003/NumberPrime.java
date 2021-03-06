/**
* Problem description:
* Problem 3:
* The prime factors of 13195 are 5, 7, 13 and 29.
* What is the largest prime factor of the number 600851475143 ?
*/

/**
* NumberPrime calculates the prime factors of a long var.
* @author Brendan McGrath
*/
public class NumberPrime{

   /**
   * Find the highest prime factor of this number.
   */
   private long number;

   /**
   * Default constructor.
   */
   public NumberPrime(){}

   /**
   * Argument based constructor.
   * 
   * @param n - the number value to set.
   */
   public NumberPrime( long n ){
      this.number = n;
   }//end of method NumberPrime()

   /**
   * Setter method for the number var.
   * @param number long var for the number to factorise.
   */
   public void setNumber( long number ){
      this.number = number;
   }//end of method setNumber()

   /**
   * Getter method for the number var.
   * @return a long specifying the number value.
   */
   public long getNumber(){
      return number;
   }//end of method getNumber()

   /**
   * Returns a boolean var indicating whether the num passed as
   * argument is a prime number.
   * Returns true if num is prime, false otherwise. Will return
   * false for negative integers, zero, and one.
   * @param    num The number to test.
   * @return       boolean representing whether num is prime. 
   */
   public boolean isPrime( long num ){
      if( num < 2 )
         return false;
      else if( num == 2 )
         return true;
      else if( num % 2 == 0 )
         return false;
      else
         for( long i = 3; i*i <= num; i+=2 )
            if( num % i == 0 )
               return false;
      return true;
   }//end of method isPrime()

   /**
   * Finds the highest prime factor of the number var.
   */
   public void factorise(){
      long factor = number;
      long i = 0;

      //continue until the product of factors is equal to the original number. (ie the number divided by all products is equal to 1)
      while( factor != 1 ){
         if( isPrime( i ) ){
            //while loop because each factor may occur more than once (multiplicity).
            while( factor % i == 0 ){
               factor /= i;
            }
         }
      i++;
      }

   System.out.println( --i );
   }//end of method factorise()


}
