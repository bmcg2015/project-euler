/**
* Problem description:
* Problem 7:
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
* What is the 10 001st prime number?
*/

/**
* @author Brendan McGrath
*/
public class Prime{
   int numPrimes = 1;

   /**
   * Loops through the odd integers starting from 3. Checks each to see if it is a prime number.
   * Stops when it has reached the 10,001st prime number.
   */
   public void findPrime(){
      int numToCheck = 1;
      while( numPrimes < 10001 ){
         numToCheck += 2;
         if( isPrime( numToCheck ) )
            numPrimes++;
      }
      System.out.println( numToCheck );
   }

   /**
   * Checks whether the argument is a prime number.
   * @param check The number to check if it is prime. Must be >= 3.
   */
   public boolean isPrime( int check ){
      for( int i = 3; i*i <= check; i+=2 )
         if( check % i == 0 )
            return false;
      return true;
   }

}
