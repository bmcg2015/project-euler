public class Launcher{

   public static void main( String[] args ) {
      SumOfPrimes sumOfPrimes = new SumOfPrimes( 2000000 );
      sumOfPrimes.sumPrimes();
      System.out.println( sumOfPrimes.getSum() );
   }

}
