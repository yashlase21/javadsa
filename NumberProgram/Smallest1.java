class Smallest1
{
	public static void main(String[] args)
	{
	int a = 661;
	int b = 26;
	int c = 83;
	int max = (a>b)?(a>c?a:c):(b>c?b:c);
	System.out.println(max);
	}
}