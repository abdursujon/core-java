import java.util.*;
public class StringAndArray{
    /**
     *   Given this string:
     *   String input = "  72, 15, 99, 3, 48, 26  ";
     *   Parse it into an int[] array, sort it, then use binarySearch() to find the index of 48. Print the sorted array and the index.
     */
    public static void formatedStringOne(){
        String input = "  72, 15, 99, 3, 48, 26  ";
        String [] formatedString = input.trim().split(", ");
        int[] nums = new int[formatedString.length];
        for(int i = 0; i<nums.length; i++){
            nums[i] = Integer.parseInt(formatedString[i]);
        }
        Arrays.sort(nums);
        System.out.println(Arrays.binarySearch(nums, 48));
        System.out.println(Arrays.toString(nums));
    }

    /**
     *   Given this string:
     *   String sentence = "Java is fun and JAVA is powerful and java is everywhere";
     *   Count how many times the word "java" appears (case-insensitive). Then replace all occurrences with "Python" (preserving the rest) and print the result.
     */
    public static void formatedStringTwo(){
        String sentence = "Java is fun and JAVA is powerful and java is everywhere";
        String sentenceTwo = sentence.toLowerCase();
        int count = 0;
        String [] formatedString = sentenceTwo.trim().split(" ");
        for(int i = 0; i<formatedString.length; i++){
            if(formatedString[i].equals("java")){
                count++;
            }
        }
        System.out.println(count);
        System.out.printf("%s%n", sentenceTwo.replaceAll("java", "Python"));
    }

    public static void main(String args[]){
       formatedStringOne();
       formatedStringTwo();
    }
}
