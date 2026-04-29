import java.util.Scanner;

 class MakePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is already a prime number.");
        } else {
            int nextPrime = num + 1;
            while (!isPrime(nextPrime)) {
                nextPrime++;
            }
            System.out.println(num + " is not a prime number. The next prime number is: " + nextPrime);
        }

        scanner.close();
    }

    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
import java.util.Random;
import java.util.Scanner;

public class PinGeneration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PIN length: ");
        int length = scanner.nextInt();
        scanner.close();

        System.out.println("Generated PIN: " + generatePin(length));
    }

    public static String generatePin(int length) {
        Random random = new Random();
        StringBuilder pin = new StringBuilder();

        for (int i = 0; i < length; i++) {
            pin.append(random.nextInt(10)); 
        }

        return pin.toString();
    }
}

import java.util.Scanner;

public class EmirpNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to reverse a number
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int reversedNum = reverseNumber(num);

        
        if (isPrime(num) && isPrime(reversedNum) && num != reversedNum) {
            System.out.println(num + " is an Emirp number.");
        } else {
            System.out.println(num + " is NOT an Emirp number.");
        }
    }
}
import java.util.Scanner;

public class NearestPrime {
    
   
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int prevPrime = n - 1, nextPrime = n + 1;

       
        while (prevPrime > 1 && !isPrime(prevPrime)) {
            prevPrime--;
        }

        while (!isPrime(nextPrime)) {
            nextPrime++;
        }

        
        int prevDist = n - prevPrime;
        int nextDist = nextPrime - n;

        if (prevDist == nextDist) {
            System.out.println(prevPrime + " " + nextPrime);
        } else if (prevDist < nextDist) {
            System.out.println(prevPrime);
        } else {
            System.out.println(nextPrime);
        }
    }
}
