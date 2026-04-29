import java.util.Scanner;
public class Arrayinput {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter the Element of Array");
        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements of Array");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}