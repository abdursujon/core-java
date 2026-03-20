import java.util.HashMap;
import java.util.Map;

public class HashMaps {
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

    public static void main(String[] args){
        System.out.println(customer());
    }

}
