import java.util.*;
import java.util.stream.*;

  public class CollectorsClass {
      public static void main(String args[]) {

          List<String> employees = Arrays.asList("Sujon", "Ryan", "Alice", "Bob", "Sujon", "Alice");
          List<Integer> salaries = Arrays.asList(50000, 60000, 45000, 70000, 80000, 55000);

          // 1. toList()
          List<String> list = employees.stream().filter(e -> e.length() > 3).collect(Collectors.toList());
          System.out.println(list); // [Sujon, Ryan, Alice, Sujon, Alice]

          // 2. toSet() - removes duplicates
          Set<String> set = employees.stream().collect(Collectors.toSet());
          System.out.println(set); // [Bob, Alice, Sujon, Ryan]

          // 3. toMap()
          List<String> uniqueNames = Arrays.asList("Sujon", "Ryan", "Alice", "Bob");
          Map<String, Integer> nameLength = uniqueNames.stream()
                  .collect(Collectors.toMap(name -> name, name -> name.length()));
          System.out.println(nameLength); // {Bob=3, Alice=5, Sujon=5, Ryan=4}

          // 4. toMap() with merge function (handle duplicate keys)
          Map<Integer, String> lengthToName = employees.stream()
                  .collect(Collectors.toMap(String::length, name -> name, (existing, newVal) -> existing + ", " + newVal));
          System.out.println(lengthToName); // {3=Bob, 4=Ryan, 5=Sujon, Alice, Sujon, Alice}

          // 5. joining()
          String joined = employees.stream().distinct().collect(Collectors.joining(", "));
          System.out.println(joined); // Sujon, Ryan, Alice, Bob

          // 6. joining() with prefix and suffix
          String joinedFancy = employees.stream().distinct()
                  .collect(Collectors.joining(" | ", "[", "]"));
          System.out.println(joinedFancy); // [Sujon | Ryan | Alice | Bob]

          // 7. groupingBy() - group elements by a classifier
          Map<Integer, List<String>> byLength = employees.stream()
                  .collect(Collectors.groupingBy(String::length));
          System.out.println(byLength); // {3=[Bob], 4=[Ryan], 5=[Sujon, Alice, Sujon, Alice]}

          // 8. groupingBy() with counting
          Map<String, Long> nameCounts = employees.stream()
                  .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
          System.out.println(nameCounts); // {Bob=1, Alice=2, Sujon=2, Ryan=1}

          // 9. partitioningBy() - split into two groups true/false
          Map<Boolean, List<String>> partitioned = employees.stream()
                  .collect(Collectors.partitioningBy(e -> e.length() > 3));
          System.out.println(partitioned); // {false=[Bob], true=[Sujon, Ryan, Alice, Sujon, Alice]}

          // 10. summarizingInt() - get count, sum, min, max, average all at once
          IntSummaryStatistics stats = salaries.stream()
                  .collect(Collectors.summarizingInt(Integer::intValue));
          System.out.println("Count: " + stats.getCount());     // 6
          System.out.println("Sum: " + stats.getSum());          // 360000
          System.out.println("Min: " + stats.getMin());          // 45000
          System.out.println("Max: " + stats.getMax());          // 80000
          System.out.println("Average: " + stats.getAverage());  // 60000.0

          // 11. averagingInt()
          double avg = salaries.stream().collect(Collectors.averagingInt(Integer::intValue));
          System.out.println(avg); // 60000.0

          // 12. summingInt()
          int total = salaries.stream().collect(Collectors.summingInt(Integer::intValue));
          System.out.println(total); // 360000

          // 13. toUnmodifiableList() - returns immutable list
          List<String> immutable = employees.stream()
                  .filter(e -> e.startsWith("S"))
                  .collect(Collectors.toUnmodifiableList());
          System.out.println(immutable); // [Sujon, Sujon]
          // immutable.add("test"); // throws UnsupportedOperationException

          // 14. collectingAndThen() - collect then apply a final transformation
          int uniqueCount = employees.stream()
                  .collect(Collectors.collectingAndThen(Collectors.toSet(), Set::size));
          System.out.println(uniqueCount); // 4

          // 15. mapping() - apply mapping inside a collector (useful with groupingBy)
          Map<Integer, List<String>> upperByLength = employees.stream()
                  .collect(Collectors.groupingBy(String::length,
                          Collectors.mapping(String::toUpperCase, Collectors.toList())));
          System.out.println(upperByLength); // {3=[BOB], 4=[RYAN], 5=[SUJON, ALICE, SUJON, ALICE]}
      }
  }
