package Sorting;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort{
    public static List<Integer> selectionSort(int[] nums){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int min = i;
            int temp = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            nums[i] = nums[min];
            nums[min] = temp;
            result.add(nums[i]);
        }
        return result;
    }

    public static  void main(String[] args){
        System.out.println(selectionSort(new int[]{12, 55, 98, 12, 55, 343, 34, 77}));
    }
}