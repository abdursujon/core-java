/**
 *Concatenation of Array
 * You are given an integer array nums of length n. Create an array ans of
 * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 *
 * Specifically, ans is the concatenation of two nums arrays.
 *
 * Return the array ans.
 *
 * Example 1:
 *
 * Input: nums = [1,4,1,2]
 *
 * Output: [1,4,1,2,1,4,1,2]
 * Example 2:
 *
 * Input: nums = [22,21,20,1]
 *
 * Output: [22,21,20,1,22,21,20,1]
 *
 * Constraints:
 * 1 <= nums.length <= 1000.
 * 1 <= nums[i] <= 1000
 */

import java.lang.reflect.Array;
import java.util.*;

public class Ex1 {

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int[] seconNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            seconNums[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i + nums.length] = seconNums[i];
        }
        return result;
    }

    /**
     * Replace Elements With Greatest Element On Right Side
     * You are given an array arr, replace every element in that array with the greatest
     * element among the elements to its right, and replace the last element with -1.
     *
     * After doing so, return the array.
     * Example 1:
     * Input: arr = [2,4,5,3,1,2]
     *
     * Output: [5,5,3,2,2,-1]
     * Example 2:
     *
     * Input: arr = [3,3]
     * Output: [3,-1]
     *
     * Constraints:
     * 1 <= arr.length <= 10,000
     * 1 <= arr[i] <= 100,000
     * @param arr
     * @return
     */
    public static int[] replaceElements(int[] arr) {
        int [] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
                int max = 0;
                result[arr.length - 1 ] = -1;
                for(int j = i + 1; j < arr.length; j++){
                    max = Math.max(max, arr[j]);
                    result[i] = max;
                }
        }
        return result;
    }

    /**
     * Turn an Array to ArrayList without for loop
     */
    public static List<Integer> arrayToArrayList(Integer[] arr){
        List<Integer> result = new ArrayList<>(Arrays.asList(arr));
        for(int i = 0; i< result.size(); i++){
            System.out.println(result.get(i));
        }
        return result;
    }

    public static void arraysUtilityMethods(){
        int [] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, 90);
        System.out.println(Arrays.toString(arr));

        int [] arr2 = Arrays.copyOf(arr, arr.length / 2);
        System.out.println(Arrays.toString(arr2));

        int [] arr3 = Arrays.copyOfRange(arr, 0, 5);
        System.out.println(Arrays.toString(arr3));

        System.out.println(Arrays.equals(arr, arr2)); // false
        int [] arr4 = {1, 2, 3};
        int [] arr5 = {1, 2, 3};
        System.out.println(Arrays.equals(arr4, arr5)); // true

        int [][] arr6 = {{1, 2, 3, 4}, {1, 2, 3, 4}};
        int [][] arr7 = {{1, 2, 3, 4}, {1, 2, 3, 4}};
        int [][] arr8 = {{1, 2, 3, 4}, {98, 3, 3, 4}};
        System.out.println(Arrays.deepEquals(arr6, arr7)); // true
        System.out.println(Arrays.deepEquals(arr7, arr8)); // false

        int [] arr9 = {1, 93, 2, 384, 9};
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

        int [] arr10 = {9, 8, 7, 6, 5};
        Integer[] arr11 = new Integer[arr10.length];
        for(int i = 0; i < arr10.length; i++){
            arr11[i] = arr10[i];
        }
        List<Integer> arr12 = new ArrayList<>(Arrays.asList(arr11));
        System.out.println(arr12);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(replaceElements(new int[]{2,4,5,3,1,2})));
        System.out.println(arrayToArrayList(new Integer[]{2, 34, 5, 6}));
        arraysUtilityMethods();
    }

}
