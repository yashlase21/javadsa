import java.util.*;

class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong(); // Fixed input type
        int octal = binaryToOctal(binary); // Fixed method call
        System.out.println("The octal number of " + binary + " is " + octal);
        sc.close();
    }

    public static int binaryToOctal(long binaryNumber) { // Fixed method name
        int decimalNumber = 0, octalNumber = 0, i = 0;

        // Convert Binary to Decimal
        while (binaryNumber != 0) {
            int remainder = (int) (binaryNumber % 10);
            decimalNumber += remainder * Math.pow(2, i);
            i++;
            binaryNumber /= 10; // Fixed incorrect division
        }

        i = 1;
        // Convert Decimal to Octal
        while (decimalNumber != 0) { // Fixed loop condition
            int remainder = decimalNumber % 8;
            octalNumber += remainder * i;
            i *= 10;
            decimalNumber /= 8; // Fixed incorrect division
        }

        return octalNumber;
    }
}
