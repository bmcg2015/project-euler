/**
* Problem description:
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*
* Solution using prime factors.
*/
public class Multiple2{

   /**
   * A constant array containing all the prime integers less than
   * or equal to 10.
   */
   public final int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19 };

   /**
   * Stores the multiplicity of each of the prime numbers;
   */
   public int[] multiplicity = { 0, 0, 0, 0, 0, 0, 0, 0 };

   /**
   * Finds the lowest common multiple of all integers between
   * 1 and 20 inclusive.
   */
   public void smallestMultiple(){
      for( int i = 2; i <= 20; i++ )
         findPrimeFactors( i );
      calculateProduct();
   }//end of method smallestMultiple()


   /**
   * Find the prime factors of the argument.
   * If the multiplicity of each factor is greater than for the 
   * previous arguments, then use the larger number.
   */
   public void findPrimeFactors( int num ){
      int mult;

      //find the prime factors of the num argument:
      for( int i = 0; i < primes.length; i++ ){
         mult = 0;
         while( num % primes[i] == 0 ){
            num /= primes[i];
            mult++;
         }
         if( mult > multiplicity[i] )
            multiplicity[i] = mult;
      }

   }//end of method findPrimeFactors()


   /**
   * Returns the product of the prime factors, including the
   * multiplicity of each.
   */
   public void calculateProduct(){
      long product = 1;
      for( int i = 0; i < primes.length; i++ )
         for( int j = multiplicity[i]; j > 0; j-- )
            product *= primes[i];
      System.out.println( product );
   }//end of method calculateProduct()

}
