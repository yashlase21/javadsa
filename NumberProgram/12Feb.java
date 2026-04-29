import java.util.Scanner;

 class GoodPrimeCounter {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(), count = 0;

        for (int i = 2; i <= n; i++)
            if (isPrime(i) && isPrime(digitSum(i))) count++;

        System.out.println("Good Primes Count: " + count);
        scanner.close();
    }
}

 class SeriesGenerator {
    public static void main(String[] args) {
        int term = 10, diff = 20, increment = 6;

        System.out.print(term);
        for (int i = 1; i < 5; i++) { 
            term += diff;
            System.out.print(", " + term);
            diff += increment;
        }
    }
}
 class SeriesGenerator {
    public static void main(String[] args) {
        int term = 79; // First term
        int[] primes = {29, 31, 37, 41, 43}; 

        System.out.print(term);
        for (int i = 0; i < primes.length; i++) {
            term += primes[i];
            System.out.print(", " + term);
        }
    }
}
 class SeriesGenerator {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int term = 1;
        System.out.print(term);
        
        for (int i = 2; i <= 6; i++) { 
            term += factorial(i);
            System.out.print(", " + term);
        }
    }
}

import java.util.Scanner;

 class PrimeNumbersInRange {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the start of range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
 class FibonacciSeries {
    public static void main(String[] args) {
        int n = 8; 
        int a = 0, b = 1, temp;

        System.out.print(a + ", " + b);

        for (int i = 2; i < n; i++) {
            temp = a + b;
            System.out.print(", " + temp);
            a = b;
            b = temp;
        }
    }
}
 class NumberSeries {
    public static void main(String[] args) {
        int terms = 5; 
        for (int i = 0; i < terms; i++) {
            int num = 10 + i + 2; 
            int value = (i % 2 == 0) ? (num * num) : (num * num * num);
            System.out.print(value + (i < terms - 1 ? ", " : ""));
        }
    }
}

