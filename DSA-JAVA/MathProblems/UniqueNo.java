package MathProblems;

public class UniqueNo {
    public static void main(String[] args) {
        int[] nums ={2,3,3,4,2,6,4};
        System.out.println(unique(nums));
    }
    static int unique(int[] nums){
        int ans = 0;
        for(int num : nums){
            ans ^= num;
        }
        return ans;
    }
}
