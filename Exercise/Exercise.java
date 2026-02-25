import java.util.*;

public class Exercise{
    public static void main(String args[]){
        //Problem: Reverse a String using a for loop
        String str = "Java is awesome";
        // 1. Convert the string to array
        char [] array = str.toCharArray();
        // 2. for loop to swap the value around
        for(int i = array.length -1; i>= 0; i-- ){
           System.out.print(array[i] + "");
        }
        System.out.println();
        /**
         *   Problem 1: Count backwards from 20 to 1, but only print even numbers
         *   Expected output: 20 18 16 14 12 10 8 6 4 2
         */
         int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
         for(int i = arr2.length - 1; i>= 0; i--){
             if(arr2[i] % 2 == 0){
                 System.out.print(arr2[i] + " ");
             }
         }
         System.out.println();

         String strTwo = "Programming";
         char[] arr3 = strTwo.toCharArray();
         for(int i = arr3.length - 1; i>= 0; i--){
           if("aeiou".indexOf(arr3[i]) != -1){
              System.out.println(arr3[i] + " " + i);
              break;
            }
         }
    }
}