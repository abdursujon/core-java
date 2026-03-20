import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;

public class ArrayListExercise {
    public static ArrayList<Integer> pass(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int n : nums) {
            if (n >= 60) result.add(n);
        }
        result.sort(Comparator.reverseOrder());
        return result;
    }

    public static ArrayList<Integer> filterEven(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for(int n: nums){
            if(n % 2 == 0){
                list.add(n);
            }
        }
        list.sort(Comparator.naturalOrder());
        return list;
    }

    public static ArrayList<Integer> checkDuplicates(int [] nums){
        ArrayList<Integer> noDuplicate = new ArrayList<>();
        for(int n: nums){
            if(noDuplicate.contains(n)){
                continue;
            } else {
                noDuplicate.add(n);
            }
        }
        return noDuplicate;
    }

    public static ArrayList<Integer> commonInteger(int[] numsOne, int[] numsTwo) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i< numsOne.length; i++) {
           for(int j = 0; j< numsTwo.length; j++){
               if(numsOne[i] == numsTwo[j]){
                   if(result.contains(numsTwo[j])){
                       continue;
                   }
                   else {
                       result.add(numsTwo[j]);
                   }
               }
           }
        }
        result.sort(Comparator.naturalOrder());
        return result;
    }

    public static void main(String args[]) {
        ArrayListExercise ex = new ArrayListExercise();
        System.out.println(ex.pass(new int[]{60, 44, 56, 77, 88}));

        System.out.println(ex.filterEven(new int[] {1, 2, 3, 4, 5, 6}));

        System.out.println(ex.checkDuplicates(new int[] {1, 2, 3, 4, 4, 5, 11, 12, 11, 5, 6}));

        // Chech common integer method
        System.out.println(ex.commonInteger( new int[] {1, 2, 3, 4, 4, 5, 11, 12, 11, 5, 6} , new int[] {1, 2, 3, 4, 4, 5, 11, 12, 11, 5, 6}));

        ArrayList<String>list = new ArrayList<>();
        list.addAll(Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve"));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.remove("Bob");
        System.out.println(list.contains("David"));
        list.forEach(name -> System.out.println(name));
    }
}
