public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12,3456,2,6,7896};
        System.out.println(EvenNoOfDigits(nums));
        
    }


    static int Digits(int num){
        int count = 0;

        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }


        while(num > 0)
        {
            count++;

            num = num / 10;

        }
        return count;


    }
    static boolean Even(int num){
        int NumOfDigits = Digits(num);

        if(NumOfDigits % 2 == 0){
            return true;
        }
        return false;
    }


    static int EvenNoOfDigits(int[] nums){
        int count = 0;

        for(int num : nums){
            if(Even(num))
            count++;
        }
        return count;
    }
    
    
}
