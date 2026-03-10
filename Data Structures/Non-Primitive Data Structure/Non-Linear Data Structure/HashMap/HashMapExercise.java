import java.util.*;
import java.io.*;

/**
 *The Scenario:
 * You are building a simple inventory system for a store. You are given a list of products and their current stock quantities. After the inventory is loaded, you will receive queries. For each query, you are given an item name and the quantity a customer wants to buy.
 * Rules:
 * If the item doesn't exist in the store, print "Out of stock".
 * If the item exists but the store has less than the requested quantity, print "Insufficient quantity".
 * If the item exists and there is enough stock, print "Order successful: [Item Name]".
 * Input Format
 * An integer
 *  (number of items in inventory).
 *
 *  pairs of lines: An Item Name (String) and its Quantity (Integer).
 * Queries until EOF: Each query consists of two lines: an Item Name and the Quantity Wanted.
 * Sample Input
 * text
 * 3
 * Apples
 * 50
 * Bananas
 * 20
 * Oranges
 * 10
 * Apples
 * 10
 * Bananas
 * 30
 * Grapes
 * 5
 * Use code with caution.
 *
 * Sample Output
 * text
 * Order successful: Apples
 * Insufficient quantity
 * Out of stock
 */
import java.util.*;

public class HashMapExercise {
    public static Map<Integer, Integer> findTarget(int [] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int needs = 0;
        for(int i=0;i<nums.length;i++){
            // if the array has two element that sum  = target return those two element
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] ==  target){
                    map.put(nums[i], nums[j]);
                }
            }
        }
        return map;
    }

    public static char mostFrequent(String s){
        Map<Character, Integer> map = new HashMap<>();
        char mostFrequent = ' ';
        int count = 0;
        String input_str = s.toLowerCase();
        // use for loop to check occurrence of each character and save it to the map as <K, V>
        for(int i=0;i<input_str.length();i++){
            for(int j=i+1;j<input_str.length();j++){
                if(input_str.charAt(i) == input_str.charAt(j)){
                    count++;
                    map.put(input_str.charAt(i), count);
                }
            }
        }
        int highest = 0;
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()> highest){
                highest = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        // return the char
        return mostFrequent;
    }

    public static char mostFrequent1(String s){
        Map<Character, Integer> map = new HashMap<>();
        char mostFrequent = ' ';
        String input_str = s.toLowerCase();

        for(int i=0;i<input_str.length();i++){
            char c = input_str.charAt(i);
            if(map.containsKey(c)){
                if(c == ' '){
                    continue;
                } else{
                    map.put(c, map.get(c) + 1);
                }
            } else {
                map.put(c, 1);
            }
        }

        int highest = 0;
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()> highest){
                highest = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }


    public static void main(String[] argh) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        in.nextLine();
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String itemName = in.nextLine();
//            int quantatity = in.nextInt();
//            in.nextLine();
//            map.put(itemName, quantatity);
//        }
//        while (in.hasNext()) {
//            String item = in.nextLine();
//            int count = in.nextInt();
//            if (map.containsKey(item) && map.get(item) >= count) {
//                System.out.println("Order successful: " + map.get(item));
//            } else if (map.containsKey(item) && map.get(item) < count && map.get(item) > 0) {
//                System.out.println("Insufficient quantity");
//            } else {
//                System.out.println("Out of stock");
//            }
//        }
//        in.close();
        System.out.println(findTarget(new int[] {1, 3, 4, 8}, 4));
        System.out.println(mostFrequent("sucDDDcCcccCcces"));
        System.out.println(mostFrequent1("programmmming programmmming"));
    }

}
