// Write a program to find duplicate elements in an input array.
import java.util.Scanner;
public class FindDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of array ");
        int n = sc.nextInt();
        int []arr = new int[n];

        System.out.println("Enter the Elements in Array");
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        boolean found = false;

        for(int i =0; i<n;i++){
            for(int j = i+1; j<n;j++){
                if (arr[i]==arr[j]) {
                    System.out.println("Duplicate element is found : "+arr[i]);
                    found=true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Duplicate element is not found FUUUUUUUKOFFFFFFF! ");
        }
    }
}
