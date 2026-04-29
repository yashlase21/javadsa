class SumfactorialOFDigit{
	public static void main(String[] args) {
		int num = 145;
		int rem = 0;


		for (int i = num;i>0 ;i/=10 )  {
			  i++;

			if (num>0) {
				int rem = num%10;
				int temp = rem*rem*rem;
			}
			System.out.print(rem+temp);
		}
	}
}