class reverseStringUsingLoop{
	public static void main(String[] args) {
		String str = "Yash Lase";
		String rev = "";

		for (int i =str.length()-1;i>0;i-- ) {
			rev+=str.charAt(i);
	
		}
		System.out.println("The Revesed String Is : "+rev);
	}
}