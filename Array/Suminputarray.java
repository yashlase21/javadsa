import java.util.Scanner;
public class Suminputarray {
    public static void main(String[] args) {
        
        System.out.println("Enter the Array");
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for(int i =0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int sum = 0;

        System.out.println("Sum of array is : ");
        for(int i = 0; i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum of array is : " + sum);

    }
}
