import generalPE.Prime;
/**
 * Problem description:
 * Problem 10:
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

/**
 * Allows the user to find the sum of all prime numbers below <tt>maxNumber</tt>.
 * @see generalPE.Prime
 */
public class SumOfPrimes{
   /**
    * Sum all primes below this number.
    */
   private int maxNumber;
   
   /**
    * The sum of all primes below maxNumber.
    */
   private long sum;
   
   /**
    * Default constructor.
    */
   public SumOfPrimes(){
   }

   /**
    * Argument based constructor.
    */
   public SumOfPrimes( int maxNumber ){
      this.maxNumber = maxNumber;
   }
   
   /**
    * Sums all the prime numbers below maxNumber.
    */
   public void sumPrimes(){
      for( int i = 2; i < maxNumber; i++ )
         if( Prime.isPrime( i ) )
            sum += i;
   }
   
   /**
    * Getter method for the <tt>sum</tt> var.
    * @return the value of <tt>sum</tt>.
    */
   public long getSum(){
      return sum;
   }

}
