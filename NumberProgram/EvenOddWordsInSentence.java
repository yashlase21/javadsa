class EvenOddWordsInSentence{
	public static void main(String[] args) {
		String str ="Yash Raj Divya Durga Rahul Shubham Swayam Veer ";
		String str2 [] = str.split(" ");

		System.out.println("Even Words : ");
		for(String x:str2){
			if (x.length()%2==0) {
				System.out.println(x);
			}
		}

		System.out.println("Odd Words : ");
		for(String y:str2){
			if (y.length()%2!=0) {
				System.out.println(y);
				
			}

		}
	
	}
	
}