class Brand{
	String laptop = "HP";

	class Processor {

        void Call() {
            System.out.println("Brand is " + laptop);
        }
    }
}

public class InnerClass1 {
	public static void main(String[] args) {
		Brand L = new Brand();
		Brand.Processor P = L.new Processor();
		P.Call();

	}
}

  
