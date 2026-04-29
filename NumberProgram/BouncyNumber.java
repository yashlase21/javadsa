import java.util.Scanner;

public class BouncyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 100) {
            System.out.println(num + " is NOT a bouncy number.");
        } else if (isBouncy(num)) {
            System.out.println(num + " is a bouncy number.");
        } else {
            System.out.println(num + " is NOT a bouncy number.");
        }
    }

    public static boolean isBouncy(int num) {
        boolean increasing = false, decreasing = false;
        int prevDigit = num % 10;
        num /= 10;

        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit < prevDigit) {
                increasing = true;
            } else if (currentDigit > prevDigit) {
                decreasing = true;
            }
            if (increasing && decreasing) {
                return true;
            }
            prevDigit = currentDigit;
            num /= 10;
        }
        return false;
    }
}
