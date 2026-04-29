//Constructor Overloading

class Form1{
	String name;
	int yop;
	String mail;
	long mob;
	String branch;
	String degree;

	String linkedin;
	int tel;
	String blood;
	String religion;

	Form1(String name, int yop, String mail, long mob,String branch, String degree){
			this.name = name;
			this.yop = yop;
			this.mail = mail;
			this.mob = mob;
			this.branch = branch;
			this.degree =  degree;
	}

	Form1(String name, int yop, String mail, long mob,String branch, String degree,String linkedin,int tel){
			this.name = name;
			this.yop = yop;
			this.mail = mail;
			this.mob = mob;
			this.branch = branch;
			this.degree =  degree;
			this.linkedin = linkedin;
			this.tel = tel;
	}
	Form1(String name, int yop, String mail, long mob,String branch, String degree,String linkedin,int tel,String blood,String religion){
			this.name = name;
			this.yop = yop;
			this.mail = mail;
			this.mob = mob;
			this.branch = branch;
			this.degree =  degree;
			this.linkedin = linkedin;
			this.tel = tel;
			this.blood = blood;
			this.religion = religion;
	}
	Form1(String name, int yop, String mail, long mob,String branch, String degree,String linkedin){
			this.name = name;
			this.yop = yop;
			this.mail = mail;
			this.mob = mob;
			this.branch = branch;
			this.degree =  degree;
			this.linkedin = linkedin;
	}
	 public void displayForm1(){
	 	System.out.println("Name : "+name);
	 	System.out.println("YOP : "+yop);
	 	System.out.println("Mail : "+mail);
	 	System.out.println("Mobile : "+mob);
	 	System.out.println("Branch : "+branch);
	 	System.out.println("Degree : "+degree);
	 	System.out.println("Linkedin : "+linkedin);
	 	System.out.println("Telephone : "+tel);
	 	System.out.println("Blood : "+blood);
	 	System.out.println("Religion : "+religion);
	 }	
}

	
