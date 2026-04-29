class PraticYashLase{
	import java.util.*;
class pr{
    public static void main(String[] args) {
        int num = 547797341;
        int min = 9;
        int max = 0;
        int temp = num;
        while(temp>0){
           int digit = temp%10;
           if (digit>max) {
                max=digit;
               
           }if (digit<min) {
                min=digit;
               
           }
           temp/=10;
        }
        System.out.print("Max : "+max);
        System.out.print("Max : "+min);
    }
}
	
}

class pr{
    public static void main(String[] args) {
        int num = 12225454;
        int count = 0;
        int temp = num;

        while(num>0){
            num/=10;
            count++;
        }
        System.out.println("Count of Number "+temp+ " IS "+count);
    }
}