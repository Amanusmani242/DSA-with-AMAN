package MathProblems;

public class IthBit {
    public static void main(String[] args) {
        int n = 10110110;
        System.out.println(FindIthBit(n,5));
    }
    static int FindIthBit(int n,int i){
        int ans =  (n & (1 << (i - 1)));
         return ans;
    }
   
}
