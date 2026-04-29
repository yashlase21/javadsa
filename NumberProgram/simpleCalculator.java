import java.util.*;
class simpleCalculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******Welcome to our Calculator*****");
		for (int i = 1;i<=5 ;i++ ) {
			System.out.println("calculation "+i);

			System.out.println("Enter the first Number: ");
			double num1 = sc.nextInt();

			System.out.println("Enter the second Number: ");
			double num2 = sc.nextInt();

			System.out.println("Choos Your Options");

			System.out.println("1:Addition(+)");
			System.out.println("2:Substraction(-)");
			System.out.println("3:Multiplicarion(*)");
			System.out.println("4:Division(/)");
			System.out.println("5:modulas(%)");

			System.out.println("Enter your choice :");
			int choice = sc.nextInt();
			double result = 0;

			switch(choice){
			case 1 :
				result = num1 + num2;
				System.out.println("Result  " + result);
				break;
			case 2 :
				result = num1 - num2;
				System.out.println("Resul  t" + result);
				break;
			case 3 :
				result = num1 * num2;
				System.out.println("Result " + result);
				break;
			case 4 :
				 if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                    break;
                default:
			}
			
		}
	}
}