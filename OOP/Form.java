class Form{
	String name;
	long mob;
	String mail;
	int yop;
	String branch;
	String degree;
	String linkedin;
	String certification;
	long tel;
	String blood;
	String relogion;

	Form(String name,
	long mob,
	String mail,
	int yop,
	String branch,
	String degree,
	String linkedin,
	String certification,
	long tel,
	String blood,
	String relogion)
{
	this.name = name;
	this.mob = mob;
	this.mail = mail;
	this.yop = yop;
	this.branch = branch;
	this.degree = degree;
	this.linkedin = linkedin;
	this.certification = certification;
	this.tel = tel;
	this.blood = blood;
	this.relogion = relogion;
}

	public void DisplayForm(){
		System.out.println("Name : "+name);
		System.out.println("Mobile No : "+mob);
		System.out.println("Mail : "+mail);
		System.out.println("YOP : "+yop);
		System.out.println("Branch : "+branch);
		System.out.println("Degree : "+degree);
		System.out.println("Linkedin : "+linkedin);
		System.out.println("Certification : "+certification);
		System.out.println("Telephone : "+tel);
		System.out.println("Blood : "+blood);
		System.out.println("Relogion : "+relogion);
	}
}