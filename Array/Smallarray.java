class Smallarray{
	public static void main(String[] args) {
		int [] arr ={10,20,45,1,44,77,0};

		int min = arr[0];


		for (int i = 1;i<arr.length;i++ ) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}

		System.out.print(min);
	}
}