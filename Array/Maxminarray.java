class Maxminarray{
	public static void main(String[] args) {
		int [] arr ={10,54,14,44,44,77,44,0,77,1};

		int max = arr[0];
		int min = arr[0];


		for (int i = 1;i<arr.length;i++ ) {
			if (arr[i]>max) {
				max =arr[i];
			}
		}

		for (int i = 1;i<arr.length;i++ ) {
			if (arr[i]<min) {
				min =  arr[i];
			}
		}

		System.out.println("Maxminarray is " + min);
		System.out.println("Maxminarray is " + max);
	}
}