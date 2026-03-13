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


    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(replaceElements(new int[]{2,4,5,3,1,2})));
        System.out.println(arrayToArrayList(new Integer[]{2, 34, 5, 6}));
    }

}
