import java.util.HashMap;
import java.util.Map;

/**
 *   --- Core ---
 *   1. map.put(key, val) — add/update key-value pair
 *   2. map.get(key) — get value by key (null if not found)
 *   3. map.getOrDefault(key, default) — get value or return default if not found
 *   4. map.remove(key) — remove by key
 *   5. map.remove(key, val) — remove only if key maps to specific value
 *   6. map.containsKey(key) — check if key exists
 *   7. map.containsValue(val) — check if value exists
 *   8. map.size() — number of entries
 *   9. map.isEmpty() — check if empty
 *   10. map.clear() — remove all entries
 *
 *   --- Bulk/Update ---
 *   11. map.putAll(otherMap) — copy all entries from another map
 *   12. map.putIfAbsent(key, val) — add only if key not already present
 *   13. map.replace(key, val) — replace value if key exists
 *   14. map.replace(key, oldVal, newVal) — replace only if current value matches oldVal
 *   15. map.replaceAll((key, val) -> newVal) — transform all values
 *   16. map.merge(key, val, (oldVal, newVal) -> result) — merge value with existing
 *   17. map.compute(key, (key, val) -> result) — compute new value from key and current value
 *   18. map.computeIfAbsent(key, key -> val) — compute value only if key missing
 *   19. map.computeIfPresent(key, (key, val) -> result) — compute only if key exists
 *
 *   --- Views ---
 *   20. map.keySet() — set of all keys
 *   21. map.values() — collection of all values
 *   22. map.entrySet() — set of key-value pairs
 *
 *   --- Iteration ---
 *   23. map.forEach((key, val) -> ...) — loop through entries
 *
 *   --- Stream ---
 *   24. map.entrySet().stream() — convert to Stream
 */
public class HashMaps {
  public static void main(String[] args){	
    // 1. map.put(key, val) — add/update key-value pair
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Ryan");
    map.put(2, "Loves");
    map.put(3, "Gaming");
    System.out.println(map);

    // 2. map.get(key) — get value by key (null if not found)
    boolean found = false;
    for(Integer k: map.keySet()){
       if(map.get(k) ==  "Loves"){
	       found = true;
       } 
    }
    System.out.println(found);    
    // 1. map.getOrDefault(key, default) — get value or return default if not found
    // 4. map.remove(key) — remove by key
    // 5. map.remove(key, val) — remove only if key maps to specific value
    // 6. map.containsKey(key) — check if key exists
    // 7. map.containsValue(val) — check if value exists
    // 8. map.size() — number of entries
    // 9. map.isEmpty() — check if empty
    // 10. map.clear() — remove all entries
    // 11. map.putAll(otherMap) — copy all entries from another map
    // 12. map.putIfAbsent(key, val) — add only if key not already present
    // 13. map.replace(key, val) — replace value if key exists
    // 14. map.replace(key, oldVal, newVal) — replace only if current value matches oldVal
    // 15. map.replaceAll((key, val) -> newVal) — transform all values
    // 16. map.merge(key, val, (oldVal, newVal) -> result) — merge value with existing
    // 17. map.compute(key, (key, val) -> result) — compute new value from key and current value
    // 18. map.computeIfAbsent(key, key -> val) — compute value only if key missing
    // 19. map.computeIfPresent(key, (key, val) -> result) — compute only if key exists
    // 20. map.keySet() — set of all keys
    // 21. map.values() — collection of all values
    // 22. map.entrySet() — set of key-value pairs
    // 23. map.forEach((key, val) -> ...) — loop through entries
    // 24. map.entrySet().stream() — convert to Stream
  }
    // Map inside map
    public static Map<Integer, Map<Integer, String>> customer(){
        Map<Integer, Map<Integer, String>> result = new HashMap<>();
        Map<Integer, String> orderIdAndItem = new HashMap<>();

        orderIdAndItem.put(1, "Pencil");
        orderIdAndItem.put(2, "Nike T Shirt");
        orderIdAndItem.put(3, "Aftershave");

        result.put(1, orderIdAndItem);
        System.out.println(result.get(1).get(1));

        return  result;
    }
}
