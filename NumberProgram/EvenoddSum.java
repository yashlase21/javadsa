import java.util.Scanner;

class EvenoddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int evenSum = 0, oddSum = 0;

        while (number > 0) {
            int digit = number % 10; 
            if (digit % 2 == 0) {
                evenSum += digit; 
            } else {
                oddSum += digit; 
            }
            number /= 10;
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}
