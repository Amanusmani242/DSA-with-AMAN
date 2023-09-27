package Sorting.CyclicSort;

import java.util.Arrays;
//268. Missing Number(LeetCode)
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4 };// the array which is not storted it should have range 0 to N - 1;
        
        int ans = cyclicsort(arr);
        System.out.println(ans);
        
    }
    static int cyclicsort(int[] nums) {
        int i = 0;
        while (i < nums.length ) {
            int correctIndex = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }

        }

        for(int index1 = 0; index1 < nums.length; index1++){
            if(nums[index1] != index1){
                return index1;
            }
        }
        return nums.length;
        

    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }



}
