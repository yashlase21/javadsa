import java.util.Scanner;

	 class decimalToBinary {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.next(); 
        scanner.close();

        int decimal = Integer.parseInt(binary, 2);
        
        System.out.println("Decimal equivalent: " + decimal);
    }
}
