import javax.sound.midi.SysexMessage;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class JavaHashMap {
    public static void main(String[] args) {
        Map <Integer,String> map = new HashMap<>();

        // 1. put(key, value)
        map.put(1,"Football");
        map.put(2, "Cricket");
        map.put(3, "Hiking");
        map.put(4, "Films");
        map.put(5, "Programming");
        map.put(6, "Music");
        map.forEach((key, value) -> System.out.println(key + " : " + value));
        map.put(7, "Hockey");
        map.put(7, "Reading"); // replace an existing value
        System.out.println(map.get(7));
        map.forEach((key, value)  -> System.out.println(key + " : " + value));

        // 2. get(key)
        System.out.println(map.get(5));
        System.out.println(map.get(8)); // null does not exist

        // 3. getOrDefault(key, anItem)
        System.out.println(map.getOrDefault(8, "Not found"));

        // 4. putIfAbsent()  - only add the map if the key does not already exist
        map.putIfAbsent(6, "Reading"); // no changes to return value music
        map.putIfAbsent(8, "Dancing");
        map.forEach((key, value)-> System.out.println(key + " : " + value));

        // 5. remove(key)
        map.remove(7);
        map.remove(8);
        System.out.println(map.get(7)); // removed from the map
        System.out.println(map.get(8)); // null

        // 6. remove(key, value)
        map.remove(1, "Football");
        System.out.println(map.remove(10, "Dancing")); // false key 10 does not exist
        System.out.println(map.get(1));

        // 7. Object.size()
        System.out.println(map.size());

        // 8. containsKey(key)
        System.out.println(map.containsValue(10)); // false
        System.out.println(map.containsKey(2)); // true the value is cricket

        // 9. containsValue(value)
        System.out.println(map.containsValue("Dancing")); // false
        System.out.println(map.containsValue("Cricket")); // true

        // 10. isEmpty()
        HashMap<Integer,String> map2 = new HashMap<>();
        System.out.println(map.isEmpty()); // false
        System.out.println(map2.isEmpty()); // true
        hashMapExerciseOne();

        // 11. keySet() - returns all the key of the map
        System.out.println(map.keySet());

        // 12. values() - returns all value
        System.out.println(map.values());

        // 13. entrySet()
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 14. replace(key, newValue)
        map.replace(2, "Rugby");
        System.out.println(map.get(2));

        // 15. replace(key, oldValue, newValue)
        map.replace(2, "Rugby", "Football"); // only does it when oldvalue is matched
        System.out.println(map.get(2));

        // 16. putAll - copy all entries from another map
        HashMap<Integer, String> map3 = new HashMap<>();
        map3.putAll(map);
        map3.forEach((key, value) -> System.out.println(key + " : " + value));

        // 17. clear
        map.clear();
        map.forEach((key, value) -> System.out.println(key + " : " + value)); // prints nothing
        String input_str = "I LOVE java";
        String [] array = input_str.split(" ");
        System.out.println(Arrays.toString(array));

        System.out.println(wordFrequency("I love cricket I love football"));

    }

    public static void hashMapExerciseOne(){
        Map<Integer,String> map = new HashMap<>();
        if(map.isEmpty()){
            map.put(1, "Gaming");
        }
        if(!map.isEmpty()){
            System.out.println("Sorry, the map is full");
        }
        System.out.println(map.get(1));
    }

    public static HashMap<String, Integer> wordFrequency(String input_str){
        HashMap<String, Integer> map = new HashMap<>();
        String [] words = input_str.split(" ");
        for(String word: words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}
