class CountEvenWorldsInString{
    public static void main(String[] args) {
        String str = "Rahul Durga Divya Shubham Yash Swayam Raj Veer";

        String str2 [] = str.split(" ");
        System.out.println("The Even length Number Is Following ");
        for(String x : str2){
            if (x.length()%2==0) {
                System.out.println(x);
                
            }
        } 
    }
}