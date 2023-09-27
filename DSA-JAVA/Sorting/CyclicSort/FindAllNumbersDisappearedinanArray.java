package Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//448. Find All Numbers Disappeared in an Array(LeetCode)

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int nums[] = {4, 3, 2, 7, 8, 2, 3, 1};
        findDisappearedNumbers(nums);
        
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != correctIndex){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
            for(int index = 0 ; index < nums.length; i++){
                if(nums[index] != index + 1){
                    ans.add(index + 1);
                }
        }
        return ans;
          
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
    
}
