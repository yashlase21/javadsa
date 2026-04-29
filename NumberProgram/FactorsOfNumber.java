import java.util.Scanner;

 class FactorsOfNumber {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Factors Of Number is :");
        for (int i = 1;i<=number ;i++ ) {
            if (number%i==0) {
            System.out.println( i+" ");
                
            }
            
            
        }
        
    }


}
