/**
 * Problem description:
 * Problem 9:
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *             a^2 + b^2 = c^2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

/**
 * Finds the Pythagorean triplet with the sum equal to 1000. Stores the triplet in three
 * instance vars.
 */
public class Triplet{
   /**
    * The sum of the triplet (if it exists).
    */
   private int sum;

   /**
    * The first triplet value.
    */
   private int a;

   /**
    * The second triplet value.
    */
   private int b;

   /**
    * The third triplet value.
    */
   private int c;
   
   /**
    * Default constructor.
    */
   public Triplet(){
      //
   }

   /**
    * Argument based constructor.
    * @param sum The value to set the <tt>sum</tt> instance var to.
    */
   public Triplet( int sum ){
      this.sum = sum;
   }

   /**
    * Getter method for <tt>sum</tt>.
    * @return the <tt>sum</tt>
    */
   public int getSum() {
      return sum;
   }

   /**
    * Setter method for <tt>sum</tt>.
    * @param sum The <tt>sum</tt> value to set.
    */
   public void setSum( int sum ) {
      this.sum = sum;
   }

   /**
    * Sets the triplet instance vars to the correct values.
    */
   public void findTriplet(){
      int a = 0;
      for( int c = 1; c < sum; c++ )
         for( int b = 1; b < sum - c; b++ ){
            a = sum - b - c;
            if( a * a + b * b == c * c ){
               this.a = a;
               this.b = b;
               this.c = c;
               return;
            }
         }
   }
   
   /**
    * Writes the triplet instance vars to screen.
    */
   public void writeTriplet(){
      System.out.println( "a = " + a + "\nb = " + b + "\nc = " + c );
   }
   
   /**
    * Writes the product of the tripletinstance vars to screen.
    */
   public void writeProduct(){
      System.out.println( a * b * c );
   }

}
