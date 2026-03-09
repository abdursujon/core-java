import java.util.*;
import java.util.stream.*;

  public class StreamClass {
      public static void main(String args[]) {

          List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

          // 1. filter() - keep only elements matching condition
          List<Integer> evens = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
          System.out.println(evens); // [2, 4, 6, 8, 10]

          // 2. map() - transform each element
          List<Integer> doubled = nums.stream().map(n -> n * 2).collect(Collectors.toList());
          System.out.println(doubled); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

          // 3. flatMap() - flatten nested collections into one stream
          List<List<String>> nested = Arrays.asList(
                  Arrays.asList("a", "b"),
                  Arrays.asList("c", "d"),
                  Arrays.asList("e", "f")
          );
          List<String> flat = nested.stream().flatMap(Collection::stream).collect(Collectors.toList());
          System.out.println(flat); // [a, b, c, d, e, f]

          // 4. sorted()
          List<Integer> unsorted = Arrays.asList(5, 3, 8, 1, 9, 2);
          System.out.println(unsorted.stream().sorted().collect(Collectors.toList())); // [1, 2, 3, 5, 8, 9]
          System.out.println(unsorted.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())); // [9, 8, 5, 3, 2, 1]

          // 5. distinct() - remove duplicates
          List<Integer> withDupes = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
          System.out.println(withDupes.stream().distinct().collect(Collectors.toList())); // [1, 2, 3, 4]

          // 6. limit() - take first N elements
          System.out.println(nums.stream().limit(3).collect(Collectors.toList())); // [1, 2, 3]

          // 7. skip() - skip first N elements
          System.out.println(nums.stream().skip(7).collect(Collectors.toList())); // [8, 9, 10]

          // 8. peek() - perform action without changing stream (useful for debugging)
          List<Integer> peeked = nums.stream()
                  .filter(n -> n > 5)
                  .peek(n -> System.out.println("Processing: " + n))
                  .collect(Collectors.toList());

          // 9. forEach() - terminal operation, consume each element
          nums.stream().forEach(n -> System.out.print(n + " ")); // 1 2 3 4 5 6 7 8 9 10
          System.out.println();

          // 10. count()
          long count = nums.stream().filter(n -> n > 5).count();
          System.out.println(count); // 5

          // 11. reduce() - combine all elements into one result
          int sum = nums.stream().reduce(0, (a, b) -> a + b);
          System.out.println(sum); // 55
          Optional<Integer> max = nums.stream().reduce(Integer::max);
          System.out.println(max.get()); // 10

          // 12. min() and max()
          System.out.println(nums.stream().min(Comparator.naturalOrder()).get()); // 1
          System.out.println(nums.stream().max(Comparator.naturalOrder()).get()); // 10

          // 13. findFirst() - get first matching element
          Optional<Integer> first = nums.stream().filter(n -> n > 5).findFirst();
          System.out.println(first.get()); // 6

          // 14. findAny() - get any matching element (useful in parallel streams)
          Optional<Integer> any = nums.parallelStream().filter(n -> n > 5).findAny();
          System.out.println(any.get()); // could be 6, 7, 8, 9, or 10

          // 15. anyMatch(), allMatch(), noneMatch()
          System.out.println(nums.stream().anyMatch(n -> n > 9));   // true
          System.out.println(nums.stream().allMatch(n -> n > 0));   // true
          System.out.println(nums.stream().noneMatch(n -> n > 10)); // true

          // 16. toArray()
          Integer[] arr = nums.stream().filter(n -> n > 5).toArray(Integer[]::new);
          System.out.println(Arrays.toString(arr)); // [6, 7, 8, 9, 10]

          // 17. mapToInt(), sum(), average() - primitive streams for better performance
          int sumPrimitive = nums.stream().mapToInt(Integer::intValue).sum();
          System.out.println(sumPrimitive); // 55
          double average = nums.stream().mapToInt(Integer::intValue).average().getAsDouble();
          System.out.println(average); // 5.5

          // 18. Stream.of()
          Stream.of("a", "b", "c").forEach(System.out::print); // abc
          System.out.println();

          // 19. Stream.generate() - infinite stream, must use limit()
          Stream.generate(() -> "hello").limit(3).forEach(n -> System.out.print(n + " ")); // hello hello hello
          System.out.println();

          // 20. Stream.iterate()
          Stream.iterate(1, n -> n * 2).limit(5).forEach(n -> System.out.print(n + " ")); // 1 2 4 8 16
          System.out.println();

          // 21. Chaining - real world example: top 3 highest even numbers as strings
          List<String> result = nums.stream()
                  .filter(n -> n % 2 == 0)
                  .sorted(Comparator.reverseOrder())
                  .limit(3)
                  .map(n -> "Number: " + n)
                  .collect(Collectors.toList());
          System.out.println(result); // [Number: 10, Number: 8, Number: 6]
      }
  }
