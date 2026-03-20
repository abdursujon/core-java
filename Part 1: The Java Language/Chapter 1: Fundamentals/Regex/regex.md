import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
public static void main(String[] args) {                                                                                                                                                                                      
    basicMatching();
    characterClasses();                                                                                                                                                                                                       
    quantifiers();
    anchors();                                                                                                                                                                                                                
    groups();
    lookaheadLookbehind();
    commonPatterns();                                                                                                                                                                                                         
}

      /**         
       * Basic Matching
       *                                                                                                                                                                                                                            
       * 1. Pattern.compile(regex) — compile a regex into a reusable Pattern
       * 2. pattern.matcher(input) — create a Matcher for the input string                                                                                                                                                          
       * 3. matcher.matches() — does the ENTIRE string match the pattern?                                                                                                                                                           
       * 4. matcher.find() — does ANY part of the string match?                                                                                                                                                                     
       * 5. matcher.group() — return the matched text                                                                                                                                                                               
       * 6. Pattern.matches(regex, input) — quick one-liner check (matches entire string)                                                                                                                                           
       * 7. String.matches(regex) — same as Pattern.matches but called on String                                                                                                                                                    
       */                                                                                                                                                                                                                           
      public static void basicMatching() {                                                                                                                                                                                          
          Pattern pattern = Pattern.compile("hello");
          Matcher matcher = pattern.matcher("say hello world");                                                                                                                                                                     
                                                                                                                                                                                                                                    
          System.out.println(matcher.matches());  // false — "say hello world" is not exactly "hello"                                                                                                                               
          System.out.println(matcher.find());      // true — "hello" exists somewhere in the string                                                                                                                                 
                                                                                                                                                                                                                                    
          System.out.println(Pattern.matches("\\d+", "12345")); // true                                                                                                                                                             
          System.out.println("12345".matches("\\d+"));           // true                                                                                                                                                            
      }                                                                                                                                                                                                                             
                  
      /**                                                                                                                                                                                                                           
       * Character Classes
       *
       * 1.  .     — any character (except newline)
       * 2.  \d    — digit [0-9]                                                                                                                                                                                                    
       * 3.  \D    — non-digit [^0-9]                                                                                                                                                                                               
       * 4.  \w    — word character [a-zA-Z0-9_]                                                                                                                                                                                    
       * 5.  \W    — non-word character                                                                                                                                                                                             
       * 6.  \s    — whitespace [ \t\n\r\f]                                                                                                                                                                                         
       * 7.  \S    — non-whitespace                                                                                                                                                                                                 
       * 8.  [abc] — a, b, or c                                                                                                                                                                                                     
       * 9.  [^abc] — NOT a, b, or c                                                                                                                                                                                                
       * 10. [a-z] — range a to z
       *                                                                                                                                                                                                                            
       * NOTE: in Java strings, backslash must be doubled — \d becomes "\\d"
       */                                                                                                                                                                                                                           
      public static void characterClasses() {
          Matcher m1 = Pattern.compile("\\d+").matcher("order 456");                                                                                                                                                                
          while (m1.find()) System.out.println(m1.group());  // 456                                                                                                                                                                 
                                                                                                                                                                                                                                    
          Matcher m2 = Pattern.compile("\\w+").matcher("hello world");                                                                                                                                                              
          while (m2.find()) System.out.println(m2.group());  // hello, world                                                                                                                                                        
                                                                                                                                                                                                                                    
          Matcher m3 = Pattern.compile("[aeiou]").matcher("banana");
          while (m3.find()) System.out.println(m3.group());  // a, a, a                                                                                                                                                             
                                                                                                                                                                                                                                    
          Matcher m4 = Pattern.compile("[^aeiou\\s]").matcher("banana");
          while (m4.find()) System.out.println(m4.group());  // b, n, n                                                                                                                                                             
      }                                                                                                                                                                                                                             
   
      /**                                                                                                                                                                                                                           
       * Quantifiers
       *
       * 1. *     — 0 or more (greedy)
       * 2. +     — 1 or more (greedy)                                                                                                                                                                                              
       * 3. ?     — 0 or 1 (greedy)                                                                                                                                                                                                 
       * 4. {n}   — exactly n                                                                                                                                                                                                       
       * 5. {n,}  — n or more                                                                                                                                                                                                       
       * 6. {n,m} — between n and m                                                                                                                                                                                                 
       *                                                                                                                                                                                                                            
       * Greedy vs Lazy vs Possessive:                                                                                                                                                                                              
       * 7. .*    — greedy, eats as much as possible                                                                                                                                                                                
       * 8. .*?   — lazy, eats as little as possible                                                                                                                                                                                
       * 9. .*+   — possessive, greedy but no backtracking                                                                                                                                                                          
       */                                                                                                                                                                                                                           
      public static void quantifiers() {
          System.out.println("aaa".matches("a{3}"));     // true — exactly 3                                                                                                                                                        
          System.out.println("aaa".matches("a{2,5}"));   // true — between 2 and 5                                                                                                                                                  
          System.out.println("color".matches("colou?r")); // true — u is optional                                                                                                                                                   
                                                                                                                                                                                                                                    
          System.out.println("<a>b<c>".replaceAll("<.*>", "X"));   // X          (greedy)                                                                                                                                           
          System.out.println("<a>b<c>".replaceAll("<.*?>", "X"));  // XbX        (lazy)                                                                                                                                             
      }                                                                                                                                                                                                                             
                  
      /**                                                                                                                                                                                                                           
       * Anchors  
       *
       * 1. ^  — start of string (or line in MULTILINE mode)
       * 2. $  — end of string (or line in MULTILINE mode)                                                                                                                                                                          
       * 3. \b — word boundary
       * 4. \B — non-word boundary                                                                                                                                                                                                  
       */                                                                                                                                                                                                                           
      public static void anchors() {
          System.out.println(Pattern.compile("^Hello").matcher("Hello World").find());  // true                                                                                                                                     
          System.out.println(Pattern.compile("World$").matcher("Hello World").find());  // true
          System.out.println(Pattern.compile("\\bcat\\b").matcher("concatenate").find()); // false — "cat" is not a standalone word                                                                                                 
          System.out.println(Pattern.compile("\\bcat\\b").matcher("the cat sat").find()); // true                                                                                                                                   
      }                                                                                                                                                                                                                             
                                                                                                                                                                                                                                    
      /**                                                                                                                                                                                                                           
       * Groups & Capturing
       *
       * 1. (X)          — capturing group, numbered left to right starting at 1
       * 2. group(0)     — the entire match                                                                                                                                                                                         
       * 3. group(1)     — first captured group                                                                                                                                                                                     
       * 4. (?<name>X)   — named capturing group                                                                                                                                                                                    
       * 5. group("name") — access named group                                                                                                                                                                                      
       * 6. (?:X)        — non-capturing group (groups without saving)                                                                                                                                                              
       * 7. \1 or \k<name> — backreference to a captured group
       * 8. X|Y          — alternation (OR)                                                                                                                                                                                         
       */                                                                                                                                                                                                                           
      public static void groups() {                                                                                                                                                                                                 
          Pattern datePattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");                                                                                                                                                      
          Matcher m1 = datePattern.matcher("2026-03-20");                                                                                                                                                                           
          if (m1.matches()) {                                                                                                                                                                                                       
              System.out.println(m1.group(0)); // 2026-03-20                                                                                                                                                                        
              System.out.println(m1.group(1)); // 2026                                                                                                                                                                              
              System.out.println(m1.group(2)); // 03
              System.out.println(m1.group(3)); // 20                                                                                                                                                                                
          }                                                                                                                                                                                                                         
   
          Pattern namedPattern = Pattern.compile("(?<year>\\d{4})-(?<month>\\d{2})-(?<day>\\d{2})");                                                                                                                                
          Matcher m2 = namedPattern.matcher("2026-03-20");
          if (m2.matches()) {                                                                                                                                                                                                       
              System.out.println(m2.group("year"));  // 2026
              System.out.println(m2.group("month")); // 03                                                                                                                                                                          
          }                                                                                                                                                                                                                         
   
          Pattern duplicateWords = Pattern.compile("(\\w+)\\s+\\1");                                                                                                                                                                
          System.out.println(duplicateWords.matcher("the the").find()); // true — backreference catches repeated words
                                                                                                                                                                                                                                    
          Pattern title = Pattern.compile("(Mr|Mrs|Ms)\\.\\s\\w+");                                                                                                                                                                 
          System.out.println(title.matcher("Mr. Smith").find()); // true                                                                                                                                                            
      }                                                                                                                                                                                                                             
                  
      /**
       * Lookahead & Lookbehind (zero-width assertions — they match a position, not characters)
       *                                                                                                                                                                                                                            
       * 1. (?=X)  — positive lookahead: match only if followed by X
       * 2. (?!X)  — negative lookahead: match only if NOT followed by X                                                                                                                                                            
       * 3. (?<=X) — positive lookbehind: match only if preceded by X
       * 4. (?<!X) — negative lookbehind: match only if NOT preceded by X                                                                                                                                                           
       */                                                                                                                                                                                                                           
      public static void lookaheadLookbehind() {
          Matcher m1 = Pattern.compile("\\d+(?= dollars)").matcher("100 dollars");                                                                                                                                                  
          if (m1.find()) System.out.println(m1.group()); // 100                                                                                                                                                                     
                                                                                                                                                                                                                                    
          Matcher m2 = Pattern.compile("(?<=\\$)\\d+").matcher("$50");                                                                                                                                                              
          if (m2.find()) System.out.println(m2.group()); // 50                                                                                                                                                                      
                                                                                                                                                                                                                                    
          Matcher m3 = Pattern.compile("\\d+(?! dollars)").matcher("100 euros");
          if (m3.find()) System.out.println(m3.group()); // 100                                                                                                                                                                     
                                                                                                                                                                                                                                    
          Matcher m4 = Pattern.compile("(?<!\\$)\\d+").matcher("€50");
          if (m4.find()) System.out.println(m4.group()); // 50                                                                                                                                                                      
      }                                                                                                                                                                                                                             
   
      /**                                                                                                                                                                                                                           
       * Common Patterns
       *
       * 1. Email       — [\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}
       * 2. IP Address  — \\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b                                                                                                                                                           
       * 3. Phone (US)  — \\(?\\d{3}\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}                                                                                                                                                                
       * 4. URL         — https?://[\\w.-]+(?:/[\\w./?%&=-]*)?                                                                                                                                                                      
       * 5. HTML tags   — <[^>]+>                                                                                                                                                                                                   
       *                                                                                                                                                                                                                            
       * Flags:                                                                                                                                                                                                                     
       * 6.  Pattern.CASE_INSENSITIVE or (?i) — a matches A
       * 7.  Pattern.MULTILINE or (?m)        — ^ and $ match line boundaries                                                                                                                                                       
       * 8.  Pattern.DOTALL or (?s)           — . matches \n too                                                                                                                                                                    
       * 9.  Pattern.COMMENTS or (?x)         — ignore whitespace, allow # comments                                                                                                                                                 
       */                                                                                                                                                                                                                           
      public static void commonPatterns() {
          Pattern email = Pattern.compile("[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}");                                                                                                                                                      
          System.out.println(email.matcher("user@example.com").matches()); // true                                                                                                                                                  
          System.out.println(email.matcher("not-an-email").matches());     // false                                                                                                                                                 
                                                                                                                                                                                                                                    
          Pattern phone = Pattern.compile("\\(?\\d{3}\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}");                                                                                                                                            
          System.out.println(phone.matcher("(123) 456-7890").matches()); // true
          System.out.println(phone.matcher("123-456-7890").matches());   // true                                                                                                                                                    
                                                                                                                                                                                                                                    
          Pattern caseInsensitive = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);                                                                                                                                             
          System.out.println(caseInsensitive.matcher("HELLO").matches()); // true                                                                                                                                                   
                                                                                                                                                                                                                                    
          String html = "<b>bold</b> and <i>italic</i>";                                                                                                                                                                            
          System.out.println(html.replaceAll("<[^>]+>", "")); // bold and italic
      }                                                                                                                                                                                                                             
} 