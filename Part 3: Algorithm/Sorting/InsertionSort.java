package Sorting;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort{
    public static List<Integer> insertionSort(int[] nums){
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i < nums.length; i++){
            int newElement = nums[i];
            int loc = i - 1;
            while(loc >= 0 && nums[loc] > newElement){
                nums[loc + 1] = nums[loc]; // swap the larger value to the right
                loc = loc - 1;
            }
            nums[loc + 1] = newElement;
        }

        for(int n : nums){
            result.add(n);
        }

        return result;
    }

    public static  void main(String[] args){
        System.out.println(insertionSort(new int[]{12, 55, 98, 12, 55, 343, 34, 77}));
    }
}