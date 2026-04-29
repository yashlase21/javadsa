import java.util.Random;
import java.util.Scanner;
 class SquideGameInReal {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 to 10: ");
        int number = 1 + random.nextInt(10);
        
        int number1 = 10+ random.nextInt(20);
        System.out.println("Guess the number between 10 to 20: ");

        
        int guess = scanner.nextInt();

        if (guess == number && guess == number1) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost! Deleting system files...");
            
        }
        System.out.println (number+ "& :" +number1+ ": Is The Random number"); 

        scanner.close();
    }
}
