class Ey{
	public static void main(String[] args) {
		String str = "010011111110";
		System.out.print(str);
		boolean check0=str.continue("00000000");
		boolean check0=str.continue("11111111");
		System.out.print(check0||check1?"YES":"NO");
	}
}

import java.util.Scanner;

   class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum = num, sum = 0, digits = 0;

        // Count number of digits
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

       
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
import java.util.Scanner;

    class KrishnamurthyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum = num, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Krishnamurthy number.");
        } else {
            System.out.println(originalNum + " is not a Krishnamurthy number.");
        }
    }

    
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
