import java.util.Scanner;
class SPYnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        int product = 1;
        int sum = 0;
        int temp = num;
        

        while(temp>0){
            int digit = temp%10;
            sum+=digit;
            product*=digit;
            temp/=10;
        }if (sum==product) {
            System.out.print(num+": This is Spy Number : ");
            
        }else{
            System.out.print(num+": This is Not Spy Number :");
        }
    }
}