import java.util.*;
public class Lambda{
      public static void main(String args[]) {

          // 1. Lambda with Comparator - ascending
          List<String> names = new ArrayList<>(Arrays.asList("Sujon", "Ryan", "Alice", "Bob"));
          names.sort((a, b) -> a.compareTo(b));
          System.out.println(names); // [Alice, Bob, Ryan, Sujon]

          // 2. Lambda with Comparator - descending
          names.sort((a, b) -> b.compareTo(a));
          System.out.println(names); // [Sujon, Ryan, Bob, Alice]

          // 3. Lambda with forEach
          names.forEach(name -> System.out.println("Hello " + name));

          // 4. Lambda with Runnable (thread)
          Runnable task = () -> System.out.println("Running in a thread");
          new Thread(task).start();

          // 5. Lambda with removeIf
          List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
          numbers.removeIf(n -> n % 2 == 0);
          System.out.println(numbers); // [1, 3, 5, 7, 9]

          // 6. Lambda with replaceAll
          List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
          fruits.replaceAll(f -> f.toUpperCase());
          System.out.println(fruits); // [APPLE, BANANA, CHERRY]

          // 7. Method reference (shorthand for lambda)
          List<String> items = Arrays.asList("cat", "dog", "bird");
          items.forEach(System.out::println); // same as item -> System.out.println(item)

          // 8. Lambda with Map.forEach
          Map<String, Integer> scores = new HashMap<>();
          scores.put("Sujon", 90);
          scores.put("Ryan", 85);
          scores.forEach((key, value) -> System.out.println(key + " scored " + value));

          // 9. Lambda with Map.computeIfAbsent
          Map<String, List<String>> groups = new HashMap<>();
          groups.computeIfAbsent("fruits", k -> new ArrayList<>()).add("apple");
          groups.computeIfAbsent("fruits", k -> new ArrayList<>()).add("banana");
          System.out.println(groups); // {fruits=[apple, banana]}

          // 10. Lambda with Map.replaceAll
          Map<String, Integer> prices = new HashMap<>();
          prices.put("apple", 10);
          prices.put("banana", 5);
          prices.replaceAll((item, price) -> price * 2);
          System.out.println(prices); // {banana=10, apple=20}
      }
  }
