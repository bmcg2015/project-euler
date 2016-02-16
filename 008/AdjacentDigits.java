/**
* Problem description:
* Problem 8:
* The four adjacent digits in the 1000-digit number that have the greatest product are
* 9 × 9 × 8 × 9 = 5832.
*      73167176531330624919225119674426574742355349194934
*      96983520312774506326239578318016984801869478851843
*      85861560789112949495459501737958331952853208805511
*      12540698747158523863050715693290963295227443043557
*      66896648950445244523161731856403098711121722383113
*      62229893423380308135336276614282806444486645238749
*      30358907296290491560440772390713810515859307960866
*      70172427121883998797908792274921901699720888093776
*      65727333001053367881220235421809751254540594752243
*      52584907711670556013604839586446706324415722155397
*      53697817977846174064955149290862569321978468622482
*      83972241375657056057490261407972968652414535100474
*      82166370484403199890008895243450658541227588666881
*      16427171479924442928230863465674813919123162824586
*      17866458359124566529476545682848912883142607690042
*      24219022671055626321111109370544217506941658960408
*      07198403850962455444362981230987879927244284909188
*      84580156166097919133875499200524063689912560717606
*      05886116467109405077541002256983155200055935729725
*      71636269561882670428252483600823257530420752963450
* Find the thirteen adjacent digits in the 1000-digit number that have the greatest
* product. What is the value of this product?
*/

/**
* Holds the 1000 digit var as a String and contains methods to calculate the largest
* product of adjacent digits.
* The number of adjacent digits is stored as the private var 'numDigits' and passed
* to the class through the constructor or through the setNumDigits() method.
* @author Brendan McGrath
*/
public class AdjacentDigits{
   /**
   * The number of adjacent digits for which to find the largest product.
   * The valid range is 1 - 19 inclusive.
   */
   private int numDigits;

   /**
   * The 1000 digit number stored as a String var.
   */
   private String number;

   /**
   * Stores the largest product of adjacent digits.
   */
   private long largestProduct = 0;

   /**
   * Default constructor.
   */
   public AdjacentDigits(){
      //
   }

   /**
   * Argument based constructor.
   * @param n The number to set.
   * @param nD The numDigits to set. Valid range : 1 - 19 inclusive.
   */
   public AdjacentDigits( String n, int nD ){
      this.number = n;
      setNumDigits( nD );
   }

   /**
   * Setter method for the number var.
   * @param n The number to set.
   */
   public void setNumber( String n ){
      this.number = n;
   }

   /**
   * Getter method for the number var.
   * @return The number var.
   */
   public String getNumber(){
      return number;
   }

   /**
   * Setter method for the numDigits var.
   * @param nD The numDigits value to set. (valid range 1 - 19)
   */
   public void setNumDigits( int nD ){
      if( nD < 20  &&  nD > 0)
         this.numDigits = nD;
      else{
         this.numDigits = 19;
         System.out.println( "The number of digits is outside the valid range (1 - 19 inclusive). " );
         System.out.println( "It has been set to the default (maximum) value: 19" );
      }
   }//end of method setNumDigits()

   /**
   * Getter method for the number var.
   * @return The numDigits var.
   */
   public int getNumDigits(){
      return numDigits;
   }

   /**
   * Getter method for the largestProduct var.
   * @return The largestProduct var.
   */
   public long getLargestProduct(){
      return largestProduct;
   }

   /**
   * Finds the product of adjacent digits in the 1000 digit number. The number of adjacent
   * digits to multiply is controlled by the int var numDigits.
   */
   public void calculateProduct(){
      long tempProduct = 1;
      for( int i = 0; i < number.length() - numDigits; i++ ){
         tempProduct = 1;
         for( int j = 0; j < numDigits; j++ ){
            tempProduct *= Character.getNumericValue( number.charAt( i + j ) );
         }
         if( tempProduct > largestProduct   )
            largestProduct = tempProduct;
      }
      System.out.println( largestProduct );
   }//end of method calculateProduct()

}
