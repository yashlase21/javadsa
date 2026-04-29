import java.util.Scanner;
class CurrencyConverter{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount of Rupee");
		double inr = sc.nextDouble();
		rupeetoDollar(inr);
	}
	public static void rupeetoDollar(double rupee)
	{
		double Dollar=(rupee/82.31);
		int temp=(int)(Dollar*100);	
		System.out.print(temp/100.0);
		DollartoEuro(temp/100.0);
	}
	public static void DollartoEuro(double Dollar)
	{
		double Euro = Dollar*0.92;
		int temp =(int)(Euro*100);
		System.out.print(temp/100.0);
		EurotoDirham(temp/100.0);
	}
	public static void EurotoDirham(double Euro)
	{
		double Euro=Dollar*0.92;
		int temp = (int)(Euro*100);
		System.out.println(temp/100.0);
		EurotoDirham(temp/100.0)
	}
	public static void EurotoDirham(double Euro)
	{
		double Dhiram = Euro*3.98;
		int temp(int)(Dirham*100);
		System.out.print(temp/100.0);
		DirhamtoPound(temp/100.0);
	}
	public static void DirhamPound(double Dirham)
	{
		double pound = Dirham*0.22;
		int temp = (int)(pound*100);
		System.out.print(temp/100.0);
	}
}