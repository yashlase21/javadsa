import java.util.Scanner;
class PinGen{
	public static void main(String[] args)throws InstantiationException {

		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		int storPin= 145;
		int seconds = 5000;

		outerLoop:
		for (; ; ) {
			int attemts=3;
			do{
				System.out.print("Enter Your Pin");
				int pin=sc.nextInt();
				if (storePin=pin) {
					System.out.print("PHONE UNLOCKED");
					break outerLoop;
					
				}else{
					System.out.print("WRONG PIN");
						System.out.print("ATTEMPT LEFT" +(attempt-1));
				}
				attemts--;
			}while(attempts>=1);
			System.out.print();
			System.out.print("PHONE IS DISABLED FOR "+(seconds/1000)+"seconds");
			Thread.sleep(seconds);
			seconds *=2;
			
			
		}
		
	}

}