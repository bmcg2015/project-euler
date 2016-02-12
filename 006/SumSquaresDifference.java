/**
* Problem description:
* Problem 6:
* The sum of the squares of the first ten natural numbers is,
* 12 + 22 + ... + 102 = 385
* The square of the sum of the first ten natural numbers is,
* (1 + 2 + ... + 10)2 = 552 = 3025
* Hence the difference between the sum of the squares of the first ten natural numbers
* and the square of the sum is 3025 − 385 = 2640.
* Find the difference between the sum of the squares of the first one hundred natural
* numbers and the square of the sum.
*/

/**
*
* @author 
*/
public class SumSquaresDifference{

   public void calculateDifference(){
      int sum = sumSquares();
      int square = squareSums();
      int difference = square - sum;
      System.out.println( "sum : " + sum +"\nsquare : " + square );
      System.out.println( "\ndifference : " + difference + "\n" );
   }

   public int sumSquares(){
      int sumOfSquares = 0;
      for( int i = 1; i <= 100; i++ )
         sumOfSquares += i*i;
      return sumOfSquares;
   }

   public int squareSums(){
      int s = 0;
      for( int i = 1; i <= 100; i++ )
         s += i;
      return ( s * s );
   }

}
