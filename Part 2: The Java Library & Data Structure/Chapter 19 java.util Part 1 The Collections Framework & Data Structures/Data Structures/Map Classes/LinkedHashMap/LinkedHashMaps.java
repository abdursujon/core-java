import java.util.LinkedHashMap;
import java.util.Map;

/**
 *   --- Core (same as HashMap) ---
 *   1. map.put(key, val) — add/update key-value pair (maintains insertion order)
 *   2. map.get(key) — get value by key (null if not found)
 *   3. map.getOrDefault(key, default) — get value or return default if not found
 *   4. map.remove(key) — remove by key
 *   5. map.remove(key, val) — remove only if key maps to specific value
 *   6. map.containsKey(key) — check if key exists
 *   7. map.containsValue(val) — check if value exists
 *   8. map.size() — number of entries
 *   9. map.isEmpty() — check if empty
 *   10. map.clear() — remove all entries
 *   11. map.putAll(otherMap) — copy all entries from another map
 *   12. map.putIfAbsent(key, val) — add only if key not already present
 *   13. map.replace(key, val) — replace value if key exists
 *   14. map.replace(key, oldVal, newVal) — replace only if current value matches oldVal
 *   15. map.replaceAll((key, val) -> newVal) — transform all values
 *   16. map.merge(key, val, (oldVal, newVal) -> result) — merge value with existing
 *   17. map.compute(key, (key, val) -> result) — compute new value from key and current value
 *   18. map.computeIfAbsent(key, key -> val) — compute value only if key missing
 *   19. map.computeIfPresent(key, (key, val) -> result) — compute only if key exists
 *   20. map.keySet() — set of all keys (insertion order)
 *   21. map.values() — collection of all values (insertion order)
 *   22. map.entrySet() — set of key-value pairs (insertion order)
 *   23. map.forEach((key, val) -> ...) — loop in insertion order
 *   24. map.entrySet().stream() — convert to Stream
 *
 *   --- LinkedHashMap specific ---
 *   25. new LinkedHashMap<>(capacity, loadFactor, true) — access-order mode (LRU)
 *   26. removeEldestEntry(eldest) — override to auto-remove oldest entry (for LRU cache)
 */
public class LinkedHashMaps {
    public static void main(String[] args){
        Map<Integer, String> result = new LinkedHashMap<>();
        result.put(1, "Cucumber");
        result.put(2, "Onion");
        result.put(3, "Carrot");
        System.out.println(result); // maintains the insertion order

        // 25. new LinkedHashMap<>(capacity, loadFactor, true) — access-order mode (LRU)
        // 26. removeEldestEntry(eldest) — override to auto-remove oldest entry (for LRU cache)
    }
}