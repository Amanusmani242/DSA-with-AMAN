package Sorting.CyclicSort;
//442. Find All Duplicates in an Array(LeetCode)
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
         findallDuplicates(nums);
        
            System.out.println(nums);
        
    }
    static List<Integer> findallDuplicates(int[] nums){
        int i  = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                ans.add(nums[index]);
            }
        }
        return ans;

    }
    static void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
}
