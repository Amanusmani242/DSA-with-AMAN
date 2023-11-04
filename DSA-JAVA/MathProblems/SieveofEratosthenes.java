package MathProblems;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primeNo = new boolean[n+1];
        Sieve(n, primeNo);
        
    }

    static void Sieve(int n, boolean[] primeNo){
        for(int i = 2; i * i <= n; i++){
            if(primeNo[i] == false){
                for(int j = 2*i; j <= n; j=j+i){
                    primeNo[j] = true;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if(primeNo[i] == false){
                System.out.println(i + " ");
            }
        }

    }
    
}
