/**
* Problem description:
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*
* Solution using prime factors.
*/

public class Multiple2{
   public ArrayList<Integer> primeFactors = new ArrayList<Integer>();
   public final int[] primes = { 2, 3, 5, 7 };


   public void smallestMultiple(){
      for( int i = 2; i <= 20; i++ )
         findPrimeFactors( i );
      calculateProduct();
   }//end of method smallestMultiple()


   public void findPrimeFactors( int num ){
      ArrayList<Integer> numPrimeFactors = new ArrayList<Integer>();

      //find the prime factors of the num argument:
      for( int prime : primes ){
         while( num % prime == 0 ){
            num /= prime;
            numPrimeFactors.add( num );
         }
      }

      //compare the numPrimeFactors array with the primeFactors array:
      

   }//end of method findPrimeFactors()


   public void calculateProduct(){
      long product = 1;
      for( int factor : primeFactors )
         product *= factor;
      System.out.println( product );
   }//end of method calculateProduct()




}
