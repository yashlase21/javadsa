import java.util.Scanner;
class AutomorphucNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        
        int square = num*num;
        int temp = num;
        int count = 0;
        
        while(temp>0){
            count++;
            temp/=10;

        }
        int last = (int)(square%Math.pow(10,count));

    if (num == last) {
        System.out.println(num +" : This Is Automorphic Number : ");
    }else{
        System.out.println(num+" : This Not  Automorphic Number :");
    }
    }
}