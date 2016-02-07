import java.util.ArrayList;
import java.util.Arrays;

/**
* Tests the efficiency of the isPrime method in the NumberPrime class.
* @author Brendan McGrath
*/
public class TestIsPrime{

   public static void main( String[] args ){
      NumberPrime np = new NumberPrime();
      ArrayList<Long> primeArrayList = new ArrayList<Long>();

      //array with all the primes between 1 and 100 inclusive.
      long[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };

      for( long i = 0; i <= 100; i++ ){
         if( np.isPrime( i ) )
            primeArrayList.add( i );
      }
      System.out.println( Arrays.toString( primeNumbers ) );
      System.out.println( primeArrayList.toString() );




   }

}
