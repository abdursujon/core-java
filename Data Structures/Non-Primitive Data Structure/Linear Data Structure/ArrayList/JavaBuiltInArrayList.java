import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;

public class JavaBuiltInArrayList{
 public static void main(String [] args){
  ArrayList<String>list = new ArrayList<>();
 // 1. Add - add an itemm at the end of the list
  list.add("Shakib");
  list.add("Mahmud");
  list.add("Mushfiq");
  list.forEach(player -> System.out.println(player));
  System.out.println();

  // 2. add(index, "item") - insert and item where we want 
  list.add(3, "Burtlar");
  list.add(0, "Brook");
  list.forEach(player -> System.out.println(player));
  System.out.println();
  
  // 3. get - returns item on specific index 
  System.out.println(list.get(0));
  //System.out.println(list.get(34)); // index out of bound exception 
  System.out.println();

  // 4. set - replace an item on specific index 
  list.set(0, "Jonny Bairstrow");
  System.out.println(list.get(0) + "\n"); 
  

  // 5. Remove - remove item by calling  index 
  list.remove(1); // Mahmud is gone  
  //6. Remove - remove item by calling item names 
  list.remove("Mushfiq");
  list.forEach(players -> System.out.println(players + "\n"));

  //7. size - return the size of the ArrayList<>();
  System.out.println(list.size() + "\n");

  //8. contains - check if the list contains a specific item 
  System.out.println(list.contains("Mushfiq")); // expected false 
  System.out.println(list.contains("Jonny Bairstrow") + "\n"); // expected true
  
  //9. indexOf - returns the index of the first occurrence (bcs we can have same value more than once so it returns the first one)  , or -1 if not found
  list.add("Burtlar"); 
  System.out.println(list.indexOf("Burtlar") + "\n");
  list.forEach(players -> System.out.println(players)); System.out.println();
  
  // 10. isEmpty - check if the list is empty 
  System.out.println(list.isEmpty() + "\n");

  // 11. sort - sorts the list in a given order 
  list.sort(Comparator.naturalOrder());
  list.forEach(players -> System.out.println(players));System.out.println();
  
  // 12. addAll - add all items from another collection to the list (so we have an array of list which we can add it to our ArrayList list)
  list.addAll(Arrays.asList("Sujon", "Samim", "Gayle"));
  list.forEach(players -> System.out.println(players));

  // 13. subList - return a portion of the list between two indices 
  var sub = list.subList(0, 3);
  System.out.println(sub + "\n");

  // 14. toArray - covert the list to Arrays (not ArrayList)
  Object[] arr = list.toArray();
  System.out.println(Arrays.toString(arr));
  
  // 15. forEach done many times above 
  

  // 16. clear - remove all items from the list 
  list.clear(); 
  System.out.println(list);

  
}
}
