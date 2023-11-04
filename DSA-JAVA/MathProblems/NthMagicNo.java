package MathProblems;

public class NthMagicNo {
    public static void main(String[] args) {
        int n = 6;
        
         int base = 5;
         int result = 0;
        
        
        while ( n > 0){
            
            int last = n & 1;
            n = n >> 1;
            result +=  base * last;
            base = base * 5;
         }
                     System.out.println(result);

    
}
}
