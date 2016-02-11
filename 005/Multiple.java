/**
* Problem description:
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*
* Most direct solution:
*
* @see Multiple2
*/
public class Multiple{

   public void smallestMultiple(){
      for( int i = 2; i < Integer.MAX_VALUE; i++ ){
         if( i % 3 != 0 )
            continue;
         if( i % 4 != 0 )
            continue;
         if( i % 5 != 0 )
            continue;
         if( i % 6 != 0 )
            continue;
         if( i % 7 != 0 )
            continue;
         if( i % 8 != 0 )
            continue;
         if( i % 9 != 0 )
            continue;
         if( i % 10 != 0 )
            continue;
         if( i % 11 != 0 )
            continue;
         if( i % 12 != 0 )
            continue;
         if( i % 13 != 0 )
            continue;
         if( i % 14 != 0 )
            continue;
         if( i % 15 != 0 )
            continue;
         if( i % 16 != 0 )
            continue;
         if( i % 17 != 0 )
            continue;
         if( i % 18 != 0 )
            continue;
         if( i % 19 != 0 )
            continue;
         if( i % 20 != 0 )
            continue;
         System.out.println( i );
         break;
      }
   }

}
