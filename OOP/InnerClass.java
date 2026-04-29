class A{
	public void confit(){
		System.out.println("Yash");
		}

		class B{
			public void dog(){
			System.out.println("Gun");

		} 
	}
}

public class InnerClass{
	public static void main(String[] args) {
		A obj = new A();
		obj.confit();

		A.B obj1 = obj.new B();
		obj1.dog();
	}
}