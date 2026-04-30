// Write a program to replace all negative numbers in an array with zero.

import java.util.Scanner;
public class ReplaceNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Lengt of Array");
        int n = sc.nextInt();

        int []arr= new int[n];

        System.out.println("Enter the elements of array ");
        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
            if (arr[i]<0) {
                arr[i]=0;
            }
        }

        System.out.println("The Updated Array is : ");
        for(int  i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
