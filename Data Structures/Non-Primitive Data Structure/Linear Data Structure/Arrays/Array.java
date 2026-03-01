
import java.util.Arrays;
import java.util.List;

public class Array{
  public static void main(String args[]) {
    // There are four ways to create an array in java
    // 1. Declare and initilise with the value
    int [] arr = {1, 2, 3, 4, 5, 6};

    // 2. Declare with the size on the same line
    int [] arr2 = new int[20];

    // 3. Declare and initialize on seperate line
    int [] arr4;
    arr4 = new int[20];

    // 4. Declare with size and values
    int [] arr5 = new int[] {1, 2, 3, 4, 4, 5}; // note int[] arr5 = new int[6]{1, 2, 3, 4, 4, 5} is invalid because size is taken by the amount ot items in the array


    int [] arr6 = {89,45,23,78,12,54,77,67};
    for(int i = 0; i<arr.length; i++){
        System.out.println(arr6[i]);
    }

    /**
     * Java built in methods for Arrays class
     */
    //1. toString
    System.out.println(Arrays.toString(arr6));
    
    //2. sort
    Arrays.sort(arr6);
    System.out.println(Arrays.toString(arr6));
    
    // 3. fill(arr, item) - fill full array with one item
    Arrays.fill(arr6, 8);
    System.out.println(Arrays.toString(arr6));
    
    // 4. copyOf - copy a length of array and use it for new array
    int [] arr7 = Arrays.copyOf(arr,arr.length/2);
    System.out.println(Arrays.toString(arr7));
    
    // 5. copyOfRange - copy a slice of range we wish from inclusive to exclusive means last index mention is not returned but index one ahead of of is
    int [] arr8 = {56, 5,  1, 8, 10};
    int [] arr9 = Arrays.copyOfRange(arr8, 1, 4);
    System.out.println(Arrays.toString(arr9));
    
    // 6. equals - compare two arrays 
    System.out.println(Arrays.equals(arr8, arr9));
    
    // 7. binarySearch - find index of value ( array must be sorted)
    int [] arr10 = {54,32,78,14,2,16,9};
    Arrays.sort(arr10);
    System.out.println(Arrays.binarySearch(arr10, 2)); // binarySearch() as an algorithm which repeatedly divides the sorted array in half to locate the target
    
    //8. asList
    Integer []arr11 = {4,7,89,33};
    List<Integer>list = Arrays.asList(arr11);
    System.out.println(list);

    // 9. length
    int[] arr12 = {1, 3, 4, 5, 6, 66, 9};
    System.out.println(arr12.length);
  } 
  
}