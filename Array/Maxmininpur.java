import java.util.Scanner;
public class Maxmininpur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        System.out.println("Enter the Number of array");
        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        } 
        
        int maxnumber = arr[0];
        int minnumber = arr[0];

        for(int i = 0; i<arr.length;i++){
            if (arr[i]>maxnumber) {
               maxnumber = arr[i];
            }
            if (arr[i]<minnumber) {
                minnumber = arr[i];
            }
        }
      System.out.println("Enter the maximum Number : "+ maxnumber);
      System.out.println("Enter the minnumber : " + minnumber);
    }
}
