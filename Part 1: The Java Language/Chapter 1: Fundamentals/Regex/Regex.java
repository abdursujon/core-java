package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    /**
     * Basic Matching
     * 1. Pattern.compile(regex) — compile a regex into a reusable Pattern
     * 2. pattern.matcher(input) — create a Matcher for the input string
     * 3. matcher.matches() — does the ENTIRE string match the pattern?
     * 4. matcher.find() — does ANY part of the string match?
     * 5. matcher.group() — return the matched text
     * 6. Pattern.matches(regex, input) — quick one-liner check (matches entire string)
     * 7. String.matches(regex) — same as Pattern.matches but called on String
     */
    public static void basicMatching(){
        Pattern pattern = Pattern.compile("hello");
        Matcher matcher = pattern.matcher("say hello world");
        System.out.println(matcher.matches()); // false cause Hello is not the entire sentence
        System.out.println(matcher.find()); // true -> hello exist in the pattern
        System.out.println(Pattern.matches("\\d+", "139803")); // true
        System.out.println("12390".matches("\\d+")); // true
    }

    public static void main(String[] args){
        basicMatching();
    }

}
