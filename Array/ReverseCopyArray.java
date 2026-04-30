// Write a Java program to copy array elements in reverse order into another array.
import java.util.Scanner;
public class ReverseCopyArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter The size of Array");
            int n = sc.nextInt();

            int []orignalArray = new int[n];
            int []reverseArray = new int[n];

            System.out.println("Enter the Element of Orignal Array : ");
            for(int i =0; i<n; i++){
                orignalArray[i]=sc.nextInt();
            }

            for(int i =0; i<n;i++){
                reverseArray[i]=orignalArray[n-1-i];
            }

            System.out.println("\nDisplay Oringal array");
            for(int i =0; i<n;i++){
                System.out.print(orignalArray[i]+" ");
            }

            System.out.println("\nDisplay Reverse Array");
            for(int i =0;i<n;i++){
                System.out.print(reverseArray[i]+" ");
            }



        }
    }

