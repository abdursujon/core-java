import java.util.*;
public class LambdaInJava {
    /**
     *   Given an ArrayList<String> of names: ["Alice", "Bob", "Alexander", "Charlie", "Anna"]
     *   Remove all names that start with "A".
     */
    public static ArrayList<String> removeNameWithA(ArrayList<String> names){
        names.removeIf(x -> x.startsWith("A"));
        return names;
    }

    public static ArrayList<Integer> sorList(ArrayList<Integer> nums){
        nums.sort((a, b) -> b - a);
        return nums;
    }

    public static ArrayList<String> removeNameWithATwo(ArrayList<String> names){
        ArrayList<String> result = new ArrayList<>();
        for(String n: names){
            if(!n.startsWith("A")){
                result.add(n);
            }
        }
        return result;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(19, 23, 33, 59, 67));
        list.removeIf(x -> x > 50);
        list.forEach(x -> System.out.println(x));

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Alexander", "Charlie", "Anna"));
        System.out.println(removeNameWithA(names));
        System.out.println(removeNameWithATwo(names));

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12, 7, 25, 3, 18, 42, 9));
        System.out.println(sorList(nums));
    }
}
