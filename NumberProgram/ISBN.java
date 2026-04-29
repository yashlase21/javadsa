class ISBN{
	public static void main(String[] args) {
		long num = 1259060977l;
		int sum = 0;
		for (long i = num, j=1; i>0; i/=10, j++ ) 
		{

			long rem = i%10;
			sum +=(rem*j);
		}
		if (sum%11==0) {
			System.out.print(num+"Is Valid ISBN Number ");
			
		}
		else{
			System.out.print(num+"is not valid ISBN Number :");
		}
	}
}
class pr{
    public static void main(String[] args) {
        int num = 2025,len = 0, div = 1;
        for (int i = num;i>0 ;i/=10 ) 
            len++;
        if (len%2==0) {
            for (int i = 1;i<=(len/2) ;i++ ) {
                div*=10;
                int sum = (num/div)+(num%div);
                int sqr = sum*sum;
                System.out.println(sqr==num?num+"is a TECH number":num+"Is not a Tech number");
                
            }
        }else{
            System.out.println(num+"IS not a Tech number");
        }
    }
}