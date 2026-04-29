import java.util.Scanner;
class Neonnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int num = sc.nextInt();

        int square = num*num;
        int sum = 0;
        int temp = num;
      
        while(square>0){
            int digit = square%10;
            sum = sum+digit;
            square/=10;


        }if (temp == sum) {
            System.out.print("This is an Neon Number : ");
            
        }else{
            System.out.print("This is not Neon Number");
        }
    }
}