class ArmstrongNumber{
	public static void main(String[] args) {
		int num = 1537,lent = 0,sum=0;
		int dup = num;
		for (int i = num;i>0 ;i/=10 ) 
			i++;
		while(num>0)
		{
			int rem = num%10;
			int pow = 1;
			for(int i=1;i<=lent;i++)
				pow*=rem;
			sum+=pow;
			num/=10;
		}
		System.out.println(dup==sum?dup+"Is Armstrong Number" : dup+"  Is not Armstrong number");
	}
}