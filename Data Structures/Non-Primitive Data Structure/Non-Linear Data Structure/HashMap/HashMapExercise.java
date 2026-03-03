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
public class HashMapExercise {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String itemName = in.nextLine();
            int quantatity = in.nextInt();
            in.nextLine();
            map.put(itemName, quantatity);
        }
        while (in.hasNext()) {
            String item = in.nextLine();
            int count = in.nextInt();
            if (map.containsKey(item) && map.get(item) >= count) {
                System.out.println("Order successful: " + map.get(item));
            } else if (map.containsKey(item) && map.get(item) < count && map.get(item) > 0) {
                System.out.println("Insufficient quantity");
            } else {
                System.out.println("Out of stock");
            }
        }
        in.close();
    }

}
