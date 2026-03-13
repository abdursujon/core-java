
import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.*;

public class Array {
    public static void main(String args[]) {
        // There are four ways to create an array in java
        // 1. Declare and initilise with the value
        int[] arr = {1, 2, 3, 4, 5, 6};

        // 2. Declare with the size on the same line
        int[] arr2 = new int[20];

        // 3. Declare and initialize on seperate line
        int[] arr4;
        arr4 = new int[20];

        // 4. Declare with size and values
        int[] arr5 = new int[]{1, 2, 3, 4, 4, 5}; // note int[] arr5 = new int[6]{1, 2, 3, 4, 4, 5} is invalid because size is taken by the amount ot items in the array


        int[] arr6 = {89, 45, 23, 78, 12, 54, 77, 67};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr6.length);
        }
       arraysUtilityMethods();
    }

  /**
   *   1. Arrays.toString(arr) — readable print
   *   2. Arrays.sort(arr) — sort ascending
   *   3. Arrays.fill(arr, val) — fill all with one value
   *   4. Arrays.copyOf(arr, len) — copy with new length
   *   5. Arrays.copyOfRange(arr, from, to) — copy a slice
   *   6. Arrays.equals(arr1, arr2) — compare two arrays
   *   7. Arrays.deepEquals(arr1, arr2) — compare multidimensional arrays
   *   8. Arrays.binarySearch(arr, key) — find index (must be sorted)
   *   9. Arrays.asList(arr) — convert to List (only works with object arrays)
   *   10. Arrays.stream(arr) — convert to Stream
   *   11. Arrays.mismatch(arr1, arr2) — first index where they differ
   *   12. Arrays.compare(arr1, arr2) — lexicographic comparison
   *   13. Arrays.deepToString(arr) — readable print for multidimensional arrays
   */
  public static void arraysUtilityMethods () {
    int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
    System.out.println(Arrays.toString(arr));

    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    Arrays.fill(arr, 90);
    System.out.println(Arrays.toString(arr));

    int[] arr2 = Arrays.copyOf(arr, arr.length / 2);
    System.out.println(Arrays.toString(arr2));

    int[] arr3 = Arrays.copyOfRange(arr, 0, 5);
    System.out.println(Arrays.toString(arr3));

    System.out.println(Arrays.equals(arr, arr2)); // false
    int[] arr4 = {1, 2, 3};
    int[] arr5 = {1, 2, 3};
    System.out.println(Arrays.equals(arr4, arr5)); // true

    int[][] arr6 = {{1, 2, 3, 4}, {1, 2, 3, 4}};
    int[][] arr7 = {{1, 2, 3, 4}, {1, 2, 3, 4}};
    int[][] arr8 = {{1, 2, 3, 4}, {98, 3, 3, 4}};
    System.out.println(Arrays.deepEquals(arr6, arr7)); // true
    System.out.println(Arrays.deepEquals(arr7, arr8)); // false

    int[] arr9 = {1, 93, 2, 384, 9};
    Arrays.sort(arr9);
    System.out.println(Arrays.binarySearch(arr9, 384)); // does the key 384 exist in array ? yes at index 4 so return the index
    /**
     *  1. The element was not found (negative means not found)
     *   2. Where it would be if it existed
     *
     *   sorted array: [1, 2, 9, 93, 384]
     *
     *   If 34 existed, it would sit between 9 and 93 — at index 3. That's all "insertion point" means — the index where 34 would
     *   belong in sorted order.
     *   result = -4
     *   insertion index = -(result + 1)
     *                   = -(-4 + 1)
     *                   = -(-3)
     *                   = 3
     *
     *   So the insertion index is 3, which is correct.
     */
    System.out.println(Arrays.binarySearch(arr9, 34));

    int[] arr10 = {9, 8, 7, 6, 5};
    Integer[] arr11 = new Integer[arr10.length];
    for (int i = 0; i < arr10.length; i++) {
      arr11[i] = arr10[i];
    }
    List<Integer> arr12 = new ArrayList<>(Arrays.asList(arr11));
    System.out.println(arr12);

    int[] arr13 = {98, 848, 4848, 43};
    Arrays.stream(arr13).forEach(a -> System.out.println(a));  // lambda
    Arrays.stream(arr13).forEach(System.out::println);          // method reference
  }

}