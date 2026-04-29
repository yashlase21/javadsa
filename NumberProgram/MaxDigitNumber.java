class MaxDigitNumber{
	public static void main(String[] args) {
		int num = 45855668;
		int max =0;
		for (int i = num; i>0; i/=10 ) {
			int dgt = i%10;
			if(max<dgt)
				max = dgt;
			
		}
		System.out.print("largest dgt from"+num+"is  :"+max);
	}

}

