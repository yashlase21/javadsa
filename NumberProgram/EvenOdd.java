import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	
	if(num%5 == 0)
	{

         System.out.println("HI5");

	}
	if(num%2 == 0)
	{	
	System.out.println("HI2");


	}
	if(num%2 == 0 && num%5 == 0){

	System.out.println("both");

	}


	}
}