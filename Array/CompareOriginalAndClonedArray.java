// Write a Java program to compare original and cloned arrays.
import java.util.Scanner;
public class CompareOriginalAndClonedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();

        int []originalarr = new int[size];

        System.out.println("Enter orignal Array");
        for(int i = 0;i<originalarr.length;i++){
            originalarr[i]=sc.nextInt();
        }

        int []copyarr = originalarr.clone();

        System.out.println("\n displaying Clone array");
        for(int i = 0; i<copyarr.length;i++){
            System.out.println(copyarr[i]);
        }

        if (originalarr==copyarr) {
            System.out.println("Both array have Same Referance");   
        }else{
            System.out.println("Both array have not Same Refereance");
        }

        boolean isEqual = true;
        for(int i =0; i<originalarr.length;i++){
            if (originalarr[i]!=copyarr[i]) {
                isEqual=false;
                break;
            }
        }

        if (isEqual) {
            System.out.println("Both array have a Same element");
        }else{
            System.out.println("Both array have not same element");
        }

        sc.close();

    }
}
