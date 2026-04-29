import java.util.Scanner;

public class Evenoddinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        System.out.println("Enter the Number of array : ");
        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int evencount = 0;
        int oddcount = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i]%2==0) {
                evencount++;
            } else{
                oddcount++;
            }
        }

        System.out.println("Total EvenCount is : "+ evencount);
        System.out.println("Total OddCount is : "+ oddcount);



    }
}
