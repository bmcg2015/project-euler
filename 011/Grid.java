/**
 * Problem description:
 * Problem 11:
 * In the 20×20 grid below, four numbers along a diagonal line have been marked in red.
 *       08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08
 *       49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
 *       81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
 *       52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
 *       22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
 *       24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
 *       32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70
 *       67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21
 *       24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72
 *       21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95
 *       78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92
 *       16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
 *       86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
 *       19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
 *       04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
 *       88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69
 *       04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36
 *       20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16
 *       20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54
 *       01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48
 *
 * The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
 * What is the greatest product of four adjacent numbers in the same direction (up,
 * down, left, right, or diagonally) in the 20×20 grid?
 */

/**
 * Allows the user to find the largest product of adjacent numbers (in the same direction)
 * in a 2D array. Adjacent can be along a row, column, or diagonal.
 * @author Brendan McGrath
 */
public class Grid{

   /**
    * The number of adjacent numbers to multiply.
    */
   private int numDigits;
   
   /**
    * The 2D array.
    */
   private int[][] grid;
   
   /**
    * Holds the largest product of integers in the grid.
    */
   private int largestProduct;
   
   /**
    * Default constructor.
    */
   public Grid(){
      //
   }

   /**
    * Argument based constructor.
    */
   public Grid( int[][] grid, int numDigits ){
      this.numDigits = numDigits;
      this.setGrid( grid );
   }
   
   /**
    * Getter method for the grid var.
    * @return the grid
    */
   public int[][] getGrid() {
      return grid;
   }

   /**
    * Setter method for the grid var.
    * @param grid the grid to set
    */
   public void setGrid( int[][] grid ) {
      if( isJaggedArray( grid ) ){
         System.out.println( "The array should not be a jagged array; all rows must" +
            " contain the same number of columns." );
         System.exit( 1 );
      }
      else
         this.grid = grid;
   }// end of method setGrid()
   
   /**
    * Setter method for the numDigits var.
    * @param numDigits The numDigits value to set.
    */
   public void setNumDigits( int numDigits ){
      if( numDigits > 0 )
         this.numDigits = numDigits;
      else{
         System.out.println( "The number of adjacent digits to multiply must be greater" +
            " than 0. Setting this value to the default value (4)." );
         this.numDigits = 4;
      }
   }
   
   /**
    * Getter method for the largestProduct var.
    * @return the largestProduct
    */
   public int getLargestProduct() {
      return largestProduct;
   }

   /**
    * Tests whether the array passed as argument is a jagged array (i.e. some rows have a
    * different number of columns).
    * @param arrayToTest The 2d int array to test.
    * @returns Returns true if <tt>arrayToTest</tt> is a jagged array. Returns false
    * otherwise.
    */
   private boolean isJaggedArray( int[][] arrayToTest ){
      int length = arrayToTest[0].length;

      for( int[] array : arrayToTest )
         if( array.length != length )
            return true;

      return false;
   }// end of method isJaggedArray()
   
   /**
    * Writes the 2d int array <tt>grid</tt> to screen.
    */
   public void writeGrid(){
      for( int[] array : grid ){
         for( int number : array ){
            System.out.printf( "%2d ", number );
         }
         System.out.println();
      }
   }// end of method writeGrid()
   
   /**
    * Finds the largest product of <tt>numDigits</tt> adjacent digits in the
    * <tt>grid</tt>.
    * @return the largest product of from the <tt>grid</tt>.
    */
   public void findProduct(){
      int numRows = grid.length;
      int numCols = grid[0].length;

      if( grid.length < numDigits  &&  grid[0].length < numDigits ){
         System.out.println( "Cannot find product with " + numDigits + " digits; the "
            + "array is too small." );
         System.exit( 1 );
      }

      for( int row = 0; row <= ( grid.length - numDigits ); row++ ){
         for( int column = 0; column <= grid[row].length - numDigits; column++ ){
            if( column + numDigits <= numCols )
               calculateRowProduct( row, column );
            if( row + numDigits <= numRows )
               calculateColProduct( row, column );
            if( column + numDigits <= numCols  &&  row + numDigits <= numRows )
               calculateRightDiagonalProduct( row, column );
            if( column - 1 >= numDigits  &&  row + numDigits <= numRows )
               calculateLeftDiagonalProduct( row, column );
         }
      }
   }// end of method findProduct()
   
   /**
    * For a given row and column in the <tt>grid</tt> array, calculate its product along
    * the row. Compare this product with the <tt>largestProduct</tt> var. Set
    * <tt>largestProduct</tt> to the row product if row product is larger.
    * @param r The row to start calculating the product from.
    * @param c The column to start calculating the product from.
    */
   private void calculateRowProduct( int r, int c ){
      int product = grid[r][c];

      for( int i = 1; i < numDigits; i++ )
         product *= grid[r][c+i];

      if( product > largestProduct )
          largestProduct = product;

   }// end of method calculateRowProduct()
   
   /**
    * For a given row and column in the <tt>grid</tt> array, calculate its product along
    * the column. Compare this product with the <tt>largestProduct</tt> var. Set
    * <tt>largestProduct</tt> to the column product if column product is larger.
    * @param r The row to start calculating the product from.
    * @param c The column to start calculating the product from.
    */
   private void calculateColProduct( int r, int c ){
      int product = grid[r][c];

      for( int i = 1; i < numDigits; i++ )
         product *= grid[r+i][c];

      if( product > largestProduct )
          largestProduct = product;

   }// end of method calculateColProduct()
   
   /**
    * For a given row and column in the <tt>grid</tt> array, calculate its product along
    * the diagonal downwards and to the right (i.e. grid[0][0] * grid[1][1] *
    * grid[2][2] * ...). Compare this product with the <tt>largestProduct</tt> var. Set
    * <tt>largestProduct</tt> to the diagonal product if diagonal product is larger.
    * @param r The row to start calculating the product from.
    * @param c The column to start calculating the product from.
    */
   private void calculateRightDiagonalProduct( int r, int c ){
      int product = grid[r][c];

      for( int i = 1; i < numDigits; i++ )
         product *= grid[r+i][c+i];

      if( product > largestProduct )
          largestProduct = product;

   }// end of method calculateRightDiagonalProduct()
   
   /**
    * For a given row and column in the <tt>grid</tt> array, calculate its product along
    * the diagonal downwards and to the left (i.e. grid[4][4] * grid[5][3] *
    * grid[6][2] * ...). Compare this product with the <tt>largestProduct</tt> var. Set
    * <tt>largestProduct</tt> to the diagonal product if diagonal product is larger.
    * @param r The row to start calculating the product from.
    * @param c The column to start calculating the product from.
    */
   private void calculateLeftDiagonalProduct( int r, int c ){
      int product = grid[r][c];

      for( int i = 1; i < numDigits; i++ )
         product *= grid[r+i][c-i];

      if( product > largestProduct )
          largestProduct = product;

   }// end of method calculateLeftDiagonalProduct()
   
}

