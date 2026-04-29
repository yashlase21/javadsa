import java.util.Scanner;
class BuzzNumber{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int num = sc.nextInt();

    if (num%7==0||num%10==7) {
        System.out.print(num+" : IS A BUZZ NUMBER");
        
    }else{
        System.out.print(num+" : IS NOT BUZZ NUMBER");
    }
    }

}