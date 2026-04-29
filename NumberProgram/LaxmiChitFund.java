import java.util.*;
class LaxmiChitFund
{
	static String username;
	static String phone;
	static String pin;
	static long adhar;
	static String pan;
	static double bal;
	static final String ifsc ="ABC123456";
	static final long accountNO = 12345678911l;
	static Arraylist<String> tran = new ArrayArraylist<String>();
	static Scanner sc = new Scanner(System.in);

	static int attempt = 3;
	public static void main(String[] args)
	{
	
	for(; ;)
	{
	System.out.println();
	System.out.println("               WELCOME     ");
	System.out.println("             ** LAXMI CHIT FUND **");
	System.out.println();
	System.out.println("1.Existing User");
	System.out.println("2.Create Account");
	System.out.println("Enter an Option");
	int opt = sc.nextInt();
	System.out.println();
	switch(opt)
	{
		case 1:{
			login();
			break;
		}
		case 2:{
			createAccount();
			break;
		 default: {
                    System.out.println("INVALID OPTION");
                }
		}

		}

	}

	
	}
	public static void login()
	{
	if(username!=null)
	{
	System.out.println("      *** LOGIN ***    ");
	System.out.println();
	sc.nextLine();
	System.out.println("Username/Phone: ");
	String cred1 = sc.nextLine();
	System.out.println("Password :");
	String cred2 = sc.next();
	if ((cred1.equals(username) || cred1.equals(phone)) && cred2.equals(pin)) {
                homePage();
	}
		homePage();
	}
	else{
	     attempt--;
	     System.out.println();
	     System.out.println("WRONG CRED ENTERED");
	     System.out.println("Attempt  left"+attempt);
	     System.out.print();
	     
	}
	if(attempt == 0)
	{
		System.exit(0);
	}
	login();
	
	}
	
	else{
	     System.out.println("CREATE YOUR ACCOUNT FIRST");
	}

}
	public static void createAccount()
	{
	System.out.println( "          *** ACCOUNT CREATION ***         ");
	System.out.println();
	System.out.print("Username: ");
	sc.nextLine();
	username = sc.nextLine();
	System.out.print("Phone number :");
	phone =  sc.next();
	System.out.print("pin");
	pin = sc.next();
	System.out.print("Adhar Number");
	adhar = sc.nextLong();
	System.out.print("Pan Number :");
	pan = sc.next();
	System.out.print("Account to be deposited :");
	bal = sc.nextDouble();
	tran.add("Deposit :"+bal+"rs");
	


	System.out.println();
	System.out.println("ACCOUNT CREATED SUCESSFULLY");
	System.out.println();
	login();


	}

	public static void homePage()
	{
	for(; ;)
		{
		  	System.out.println();
		   	System.out.println("** HOME PAGE **");
			 System.out.println();
 			System.out.println("1 Deposit Amount");
		        System.out.println("2.Withdraw Amount");
			 System.out.println("3.Check Balance");
			 System.out.println("4.Statement");
			 System.out.println("5.Edit User");
			 System.out.println("6.loan");
 			System.out.println("7.Logout");
 			System.out.println();
			 System.out.println("Enter an option: ");
			int opt = sc.nextInt();
			System.out.println();
			switch(opt)
			{	 
				case1:{
					depositAmount();
					break;

					}
				 
				case2:{
					withdrawAmount();
					break;

					}
					 
				case3:{
					checkBalance();
					break;

					}
					 
				case4:{
					statement();
					break;

					}
					 
				case5:{
					editUser();
					break;

					}
					 
				case6:{
					lone();
					break;

					}
					 
				case7:{
					System.out.println("Thank You VISIT AGIN")
					System.exit(0);

					}
				 
				default:{
					System.out.print("WRONG OPTION");
					break;

					}
        	}

	}


}
	public static void depositAmout()
	{
	System.out.println(" *** DEPOSIT AMOUNT *** ");
	System.out.println();
	System.out.print("Enter the amoutn: ");
	double.depositAmt = sc.nextDouble();
	tran.add("Deposit :"+depositAmt+"rs");
	bal += depositAmt
	System.outprintln("AMOUNT DEPOSITED SUCESSFULLY");

	}
	public static void withdrawAmount()
	{
	System.out.println(" *** WITHDRAW AMOUNT ***");
	System.out.println();
	System.out.println("Amount : ");
	double withAmt = sc.nextDouble();
	System.out.print("Pin :");
	String userPin = sc.next();
	if(userPin.equals(pin))
	{
		if(withAmt<=bal)
		{
			bal -=withAmt;
			tran.add("Withdraw : "+ withAmt+"rs");
			System.out.println("Amount Debited Sucessfully");

		}
		else
		{
			System.out.println("INSUFFIENT FUNDS");
		}

	}
	else{
		System.out.println("INCORRECT PIN");

	}
}
	public static void checkBalance()
	{
	System.out.println(" *** CHECK BALANCE ***");
	System.out.println();
	System.out.println("Pin :");
	String userPin = sc.next();
		if(userPin.equals(pin))
		{
			System.out.println
			(username+ "your account balance is : "+bal+"rs");

		}
		else{
			System.out.println("Incorrect Pin");

		}

	}
	public static void statements()
		{
		System.out.println(" *** STATEMENTS ***");
		System.out.println();
		for(String i:tran){
			System.out.println(i);
		}


	}
	public static void edituser()
	{
	System.out.println("   *** UPDATE USER ***   ");
	System.out.println("imp soon");


	}
	
	public static void loan()
	{
	System.out.println(" *** LOAN ***");
	System.out.println("imp soon");

	}
public static void editUser() {
    System.out.println("1. Edit Username\n2. Edit Phone\n3. Edit PIN");
    switch (sc.nextInt()) {
        case 1 -> { System.out.print("New Username: "); username = sc.next(); }
        case 2 -> { System.out.print("New Phone: "); phone = sc.next(); }
        case 3 -> { System.out.print("Current PIN: "); if (sc.next().equals(pin)) { System.out.print("New PIN: "); pin = sc.next(); } else System.out.println("Incorrect PIN."); }
        default -> System.out.println("Invalid option.");
    }
}





























