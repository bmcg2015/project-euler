public class Fibonacci{
   public int term1 = 1;
   public int term2 = 2;
   public int temp;
   public int sum = 1;

   public void go(){
      
      while( term2 <= 4000000 ){

         if( term2 % 2 == 0 )
            sum += term2;

         temp = term2;
         term2 += term1;
         term1 = temp;

      }

      System.out.println( sum );



   }




}
