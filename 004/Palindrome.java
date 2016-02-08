/**
* Palindrome finds the largest palindrome from the product of two 3-digit numbers.
* Problem description:
* A palindromic number reads the same both ways.
* The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
* Find the largest palindrome made from the product of two 3-digit numbers.
*
* @author Brendan McGrath
*/

public class Palindrome{

   public int findLargestPalindrome(){
      int largest = 999 * 999;

      for( int i = largest; i > 0; i-- ){
         if( i % 10 != i / 100000 ){
            continue;
         }
         if( ( i % 100 ) / 10 != ( i % 100000 ) / 10000 ){
            continue;
         }
         if( ( i % 10000 ) / 1000 != ( i % 1000 ) / 100 ){
            continue;
         }
         if( isProduct( i ) )
            return i;
      }
      return 0;

   }

   public boolean isProduct( int num ){
      //
   }

}

