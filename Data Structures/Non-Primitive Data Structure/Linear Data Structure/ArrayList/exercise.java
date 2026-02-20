import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;

public class exercise{
  public static ArrayList<Integer>pass(int[] nums){
   ArrayList<Integer> result = new ArrayList<>();
   for(int n: nums) {
     if(n >= 60) result.add(n);
   }
   result.sort(Comparator.reverseOrder());
   return result;
}
  public static void main(String args[]){
    exercise ex = new exercise();
    System.out.println(ex.pass(new int[] {60, 44, 56, 77, 88}));
  }
}
