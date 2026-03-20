/**
 *   --- Core (same as HashMap) ---
 *   1. map.put(key, val) — add/update key-value pair (keys sorted)
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
 *   20. map.keySet() — set of all keys (sorted)
 *   21. map.values() — collection of all values (sorted by key)
 *   22. map.entrySet() — set of key-value pairs (sorted by key)
 *   23. map.forEach((key, val) -> ...) — loop in sorted key order
 *   24. map.entrySet().stream() — convert to Stream
 *
 *   --- Sorted/Navigable operations ---
 *   25. map.firstKey() — smallest key
 *   26. map.lastKey() — largest key
 *   27. map.lowerKey(key) — greatest key strictly less than given key
 *   28. map.higherKey(key) — smallest key strictly greater than given key
 *   29. map.floorKey(key) — greatest key less than or equal to given key
 *   30. map.ceilingKey(key) — smallest key greater than or equal to given key
 *   31. map.subMap(fromKey, toKey) — entries between fromKey (inclusive) and toKey (exclusive)
 *   32. map.headMap(key) — entries with keys less than given key
 *   33. map.tailMap(key) — entries with keys greater than or equal to given key
 *   34. map.descendingMap() — reverse order view
 *   35. map.pollFirstEntry() — remove and return smallest key entry
 *   36. map.pollLastEntry() — remove and return largest key entry
 *   37. new TreeMap<>(Comparator) — custom sort order
 */
public class TreeMaps {
    public static void main(String[] args){
        // 25. map.firstKey() — smallest key
        // 26. map.lastKey() — largest key
        // 27. map.lowerKey(key) — greatest key strictly less than given key
        // 28. map.higherKey(key) — smallest key strictly greater than given key
        // 29. map.floorKey(key) — greatest key less than or equal to given key
        // 30. map.ceilingKey(key) — smallest key greater than or equal to given key
        // 31. map.subMap(fromKey, toKey) — entries between fromKey (inclusive) and toKey (exclusive)
        // 32. map.headMap(key) — entries with keys less than given key
        // 33. map.tailMap(key) — entries with keys greater than or equal to given key
        // 34. map.descendingMap() — reverse order view
        // 35. map.pollFirstEntry() — remove and return smallest key entry
        // 36. map.pollLastEntry() — remove and return largest key entry
        // 37. new TreeMap<>(Comparator) — custom sort order
    }
}