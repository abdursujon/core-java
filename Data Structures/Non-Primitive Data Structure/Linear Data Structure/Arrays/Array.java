
import java.util.Arrays;
import java.util.List;

public class Array{
  public static void main(String args[]) {
    int [] arr = {89,45,23,78,12,54,77,67};
    for(int i = 0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
    //1. toString
    System.out.println(Arrays.toString(arr));
    
    //2. sort
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    
    // 3. fill(arr, item) - fill full array with one item
    Arrays.fill(arr, 8);
    System.out.println(Arrays.toString(arr));
    
    // 4. copyOf - copy a length of array and use it for new array
    int [] arr2 = Arrays.copyOf(arr,arr.length/2);
    System.out.println(Arrays.toString(arr2));
    
    // 5. copyOfRange - copy a slice of range we wish from inclusive to exclusive means last index mention is not returned but index one ahead of of is
    int [] arr3 = {56, 5,  1, 8, 10};
    int [] arr4 = Arrays.copyOfRange(arr3, 1, 4);
    System.out.println(Arrays.toString(arr4));
    
    // 6. equals - compare two arrays 
    System.out.println(Arrays.equals(arr3, arr4));
    
    // 7. binarySearch - find index of value ( array must be sorted)
    int [] arr5 = {54,32,78,14,2,16,9};
    Arrays.sort(arr5);
    System.out.println(Arrays.binarySearch(arr5, 2));
    
    //8. asList
    Integer []arr6 = {4,7,89,33};
    List<Integer>list = Arrays.asList(arr6);
    System.out.println(list);
  } 
  
}