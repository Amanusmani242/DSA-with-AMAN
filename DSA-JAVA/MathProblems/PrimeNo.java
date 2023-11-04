package MathProblems;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 21;
        System.out.println(primeNo(n));
        
        
    }
    static boolean primeNo(int n){
        if(n <= 1){
            return false;
        }
        int  c = 2;
        while(c <= Math.sqrt(n)){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
    
}
