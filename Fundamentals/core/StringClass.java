import java.util.*;
import java.time.LocalDate;
public class StringClass {
    public static void main(String args[]) {
       // 1. length()
       System.out.println("My name is Sujon".length());

       // 2. isEmpty()
       String s = "";
       System.out.println(s.isEmpty());
       System.out.println("I am not empty".isEmpty());

       // 3. isBlank -- for string where we have nothing but lots of space character
       System.out.println("           ".isBlank());

       // 4. charAt(index) we can access a character in a string by using this method such as charAt(0) etc.
       System.out.println("There is nothing more satisfying seeing my code works!".charAt(10));
       // 5. toCharArray() , this method helps use making a full line or work of string to an Array
       char [] arr = "Hello dear, are you having a good day? I am having a great day. Hop you too!".toCharArray();
       System.out.println(Arrays.toString(arr));
       char charAtIndexSeven = '\0';
       for(int i = 0; i< arr.length; i++){
           if(i == 7){
               charAtIndexSeven = arr[i];
               break;
           }
       }
       System.out.println(charAtIndexSeven);

       // 6. indexOf()
       System.out.println("I like cricket".indexOf('I'));
       System.out.println("Hello world".indexOf("world")); // search indexOf a word altogether
       System.out.println("Hello world".indexOf('o', 5)); // we can specify when we want to start searching, for exammple here we skip the first o in Hello by saying we want to only look after index 5

       // 7. lasIndexOf("item-name")
       System.out.println("Hello world".lastIndexOf('r')); // 8

        // 8. contains("");
        System.out.println("Hello mum".contains("mum")); // true

        // 9. startsWith("item");
        System.out.println("Hello Ryan".startsWith("Hello")); // true
        System.out.println("Hello world".startsWith("world", 6)); // true world starts at index 6

        // 10. endsWith("item");
        System.out.println("Hello world".endsWith("world")); // true

        // 11. substring()
        System.out.println("Hello world".substring(6)); // world
        System.out.println("HELLO WORLD".substring(5, 10)); // (WITH SPACE) WORL

        // 12. equals()
        System.out.println("Sujon".equals("sujon")); // false
        System.out.println("Ryan".equals("Ryan"));

        // 13. equalsIgnoreCase()
        System.out.println("SuJON".equalsIgnoreCase("Sujon")); // true

        // 14. comparTo()
        System.out.println("hello".compareTo("world")); // -15  == if any letter is not matched return the ASCHII difference between two String. h(aschii) - w(aschii)
        System.out.println("world".compareTo("hello")); // 15
        System.out.println("hello".compareTo("hello")); // 0
        System.out.println("hellooooo".compareTo("hello")); // 4 (first hello has 4 extra o

        // 15. compareToIgnoreCase()
        System.out.println("Sujon".compareToIgnoreCase("sujon")); // 0

        // 16. toUpperCase()
        System.out.println("Football".toUpperCase());

        // 17. toLowerCase()
        System.out.println("Apple".toLowerCase());

        // 18. trim() get rid of space and blank space
        System.out.println("  hello   ".trim());

        //19. strip()
        char unicodeSpace = '\u2005';
        String str4 = unicodeSpace + "hello" + unicodeSpace;
        System.out.println(str4.strip());
        System.out.println(str4.trim()); // trim() doesn't remove unicodeSpace but strip does

        // 20. stripLeading
        System.out.println("  hello   ".stripLeading()); // only remove space before the hello

        // 21. stripTrailing
        System.out.println("  hello  ".stripTrailing()); // remove space after the word

        // 22. replace(item1, item2)
        System.out.println("Sujon".replace("Sujon","Ryan"));

        // 23. replaceAll(regex or any letters and patterns );
        String messyString = "49302SUjon88%%@@#12";
        System.out.printf("%s%n", messyString.replaceAll("[0-9]", "")); // remove all numbers
        System.out.printf("%s%n", messyString.replaceAll("[^0-9]", "")); // remove everyting but the nubmers
        System.out.printf("%s%n", messyString.replaceAll("[^a-zA-Z]", "")); // remove everything else other than letters

        // 24. replaceFirst()
        System.out.println("ab1c2d3".replaceFirst("[0-9]", "")); //abc2d3

        // 25. split()
        System.out.println(Arrays.toString("a, b, c".split(",")));
        System.out.println(Arrays.toString("a,,c".split(",")));
        System.out.println(Arrays.toString("a,b,c,d".split(",", 2))); // limit split

        // 26 String.join()
        System.out.println(String.join("-", "I", "love", "cricket")); // I-love-cricket
        System.out.println(String.join(" ", "I", "love", "cricket")); // I love cricket
        System.out.println("London is capital of the ".concat("UK"));

        // 27 matches()
        "hello123".matches("[a-z]+[0-9]+");  // true
        "hello".matches("[0-9]+");           // false

        // 28. format()
        System.out.println(String.format("Name: %s, Age: %d", "Ribab", 29));
        System.out.println(String.format("Price: %.2f", 44.5)); // .2 means up to 2 digit after .
        System.out.println("Name: %s, Age: %d".formatted("Sujon", 333));
        System.out.printf("Name: %s, Age: %d, DOB: %s%n", "Sujon", 299, LocalDate.now());

        // 29. Conversion
        String.valueOf(123);                 // "123"
        String.valueOf(true);                // "true"
        String.valueOf(new char[]{'a','b'}); // "ab"
        System.out.println("hello".getBytes()); // byte array [B@7c729a55
        System.out.println("hello".chars()); // IntStream java.util.stream.IntPipeline$Head@3bb9a3ff

        // 30 repeat();
        System.out.println("ha".repeat(10));
    }
}
