class CountDigit{
	public static void main(String[] args) {
		long num = 124522555777775L;
		System.out.print(num);
		for (int i=0;i<=9 ;i++ ) {
			int cnt = 0;
			for (long j =num;j>=0 ;j/=10 ) {
				long rem = j%10;
				if(i==rem){
					cnt++;
				}
			}
			if(cnt!=0){
				System.out.print(i+" "+cnt);
			}
			
		}
	}
}