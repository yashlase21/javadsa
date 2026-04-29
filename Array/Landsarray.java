public class  Landsarray{
	public static void main(String[] args) {
		int arr [] = {10,12,22,5,55,47,100};

		int largearray = arr[0];
		int smallarray = arr[0];



		for (int i = 1;i<arr.length;i++ ) {
			if (arr[i]>largearray) {
				largearray = arr[i];
			}

			if (arr[i]<smallarray) {
				smallarray = arr[i];
			}
		}
		System.out.println("Largest Array "+ largearray);
		System.out.println("smallest Array "+ smallarray);
	}
}