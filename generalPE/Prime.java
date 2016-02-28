package generalPE;
/**
 * This package contains general methods for solving mathematical problems in the
 * projecteuler.net problem set.
 */

/**
 * Functionality for prime numbers.
 * @author Brendan McGrath
 */
public class Prime{
   
   /**
    * Checks whether the argument is a prime number. 
    * @param numToCheck Must be a positive integer (int variable).
    * @return Returns false if the argument is <= 1, or if the argument is not a prime
    * number. Returns true otherwise.
    */
   public static boolean isPrime( int numToCheck ){
      if( numToCheck < 2 )
         return false;
      else if( numToCheck == 2 )
         return true;
      else if( numToCheck % 2 == 0 )
         return false;
      else
         for( int i = 3; i*i <= numToCheck; i+=2 )
            if( numToCheck % i == 0 )
               return false;
      return true;
   }// end of method isPrime( int )

   /**
    * Checks whether the argument is a prime number. 
    * @param numToCheck Must be a positive integer (long variable).
    * @return Returns false if the argument is <= 1, or if the argument
    * is not a prime number. Returns true otherwise.
    */
   public static boolean isPrime( long numToCheck ){
      if( numToCheck < 2 )
         return false;
      else if( numToCheck == 2 )
         return true;
      else if( numToCheck % 2 == 0 )
         return false;
      else
         for( long i = 3; i*i <= numToCheck; i+=2 )
            if( numToCheck % i == 0 )
               return false;
      return true;
   }// end of method isPrime( long )

}
