package Sorting.CyclicSort;
//287. Find the Duplicate Number(LeetCode)
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
        
    }

    static int findDuplicate(int[] nums){
        int i = 0;
        while(i < nums.length){
            

            if(nums[i] != i + 1){
                int correctIndex = nums[i] - 1;

                if(nums[correctIndex] != nums[i]){
                    swap(nums, i, correctIndex);
                }
                else{
                    return nums[i];
                }           
            }
            else{
                i++;
            }
        }
        return -1;
        
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
}
