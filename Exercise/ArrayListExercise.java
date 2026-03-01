import java.util.*;
public class ArrayListExercise{
    /**
     * Given a string " i love cricket i love football I love MEssi MESSI scored total 890 goals so far"
     * 1. if the word is I, it stays I but if the word is i, it should become I, but for the word MEssi, it should become Messi. Print the formatted string.
     * 3. count how many times I is present, and print the number.
     * 4. save each word as an array in an ArrayList and print the list of word as an array.
     * 5. print how many goals messi scored using the array.
     */
    public static void exerciseOne(){
       ArrayList<String>listOne = new ArrayList<>();
       String sentence = " i love cricket i love football I love MEssi MESSI scored total 890 goals so far";
       String sentenceTwo = sentence.toLowerCase();
       String [] formatedString = sentenceTwo.trim().split(" ");
       String totalGoal = null;
       int countI = 0;
       for(int i = 0; i<formatedString.length; i++){
           if(formatedString[i].equals("i")){
               formatedString[i] = "I";
           }
           if(formatedString[i].equals("messi")){
               formatedString[i] = "Messi";
           }
           if(formatedString[i].equals("890")){
               totalGoal = formatedString[i];
           }
           if(formatedString[i].equals("I")){
               countI++;
           }
           listOne.add(formatedString[i]);
       }
       System.out.println(String.join(" ", formatedString));
       System.out.println(totalGoal);
       System.out.println(countI);
       System.out.println(listOne);
    }

    public static void main(String args[]){
      exerciseOne();
    }
}