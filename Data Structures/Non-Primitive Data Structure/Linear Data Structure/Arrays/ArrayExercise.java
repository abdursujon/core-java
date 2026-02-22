import java.util.Arrays;
import java.util.stream.*;
public class ArrayExercise{
    // 1. Find the third largest number in a given array
    public static int thirdLargest(int[] nums){
        int[] uniqueNums = Arrays.stream(nums).distinct().toArray();
        Arrays.sort(uniqueNums);
        for(int i = uniqueNums.length -1; i >= 0; i--){
            if(uniqueNums[i] != uniqueNums[uniqueNums.length -1] && uniqueNums[i] != uniqueNums[uniqueNums.length -2]){
                return uniqueNums[i];
            }
        }
        return -1;
    }

    // 2. find fourth largest in an array
    public static int fourthLargest(int[] nums) {
        int[] uniqueNums = Arrays.stream(nums).distinct().toArray();
        if(uniqueNums.length <= 3){
            return -1;
        }
        int output;
        Arrays.sort(uniqueNums);
        output = uniqueNums[uniqueNums.length - 4];
        return output;
    }

    // 3. Find the second smallest number in a given array
    public static int secondSmallest(int[] nums){
        int[] uniqueNums = Arrays.stream(nums).distinct().toArray();
        int result = uniqueNums[0];
        Arrays.sort(uniqueNums);
        if(uniqueNums.length <= 1){
            return -1;
        }
        result = uniqueNums[1];
        return result;
    }

    // 4. Reverse an array in place without creating a new array
    public static int[] reverseArray(int[] nums){
        int temp;
        for(int i = 0; i< nums.length / 2; i++ ){ // devide the array in two half, left and right. if odd number or elements, middle element stays where it is
            temp = nums[i]; // temp = nums[0];
            // for int nums = {1, 2, 3, 4};
            // when i is 0;
            // nums[i] = nums[nums.length - 1 -i]
            // nums[0] = nums[4 - 1 - 0];
            //         = nums[3]
            nums[i] = nums[nums.length -1 - i];
            nums[nums.length -1 - i] = temp; // there we swap nums[3]  with nums[0], and every time it changes to nums[i -1] and nums[i+1]
        }
        return nums;
    }

    public static void main(String args[]){
        ArrayExercise ex = new ArrayExercise();
        //1 Find the thirdLargest number in an array
        System.out.println(ex.thirdLargest(new int[]{2, 4, 6, 8, 8, 9, 9}));

        // 2. Find fourth largest in an array
        System.out.println(fourthLargest(new int[] {1, 2, 3, 4, 5, 5, 6, 6, 7, 7}));
        System.out.println(fourthLargest(new int[]{1, 3, 5, 5, 5 , 5, 5}));

        // 3. Find the second smallest number in an array
        System.out.println(secondSmallest(new int[]{1}));
        System.out.println(secondSmallest(new int[]{1, 66}));
        System.out.println(secondSmallest(new int[]{1, 190, 122, 333, 88, 2, 222, 2, 2, 2, 89}));

        // 4. Reverse an array in place without creating a new array
        System.out.println(Arrays.toString(reverseArray(new int[] {1, 2, 2, 2, 3, 3, 4, 5})));
    }
}