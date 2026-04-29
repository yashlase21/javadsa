interface Camera{
	void Click();
}
interface Music{
	void PlayMusic();
}
interface Call{
	void CallSomeOne();
}

 class SamsungMobile implements Camera,Music,Call {

	public void Click(){
		System.out.println("Click a Photo");
	}

	public void PlayMusic(){
		System.out.println("Play a Music ");
	}

	public void CallSomeOne(){
		System.out.println("Call a SomeOne ");
	}
}
  class Iphone implements Music{
  	public void PlayMusic(){
		System.out.println("Play a Music ");
	}
  }


public class Mobile{
	public static void main(String[] args) {
		SamsungMobile m = new SamsungMobile();
		m.PlayMusic();
		m.Click();
		m.CallSomeOne();

		Iphone i = new Iphone();
		m.PlayMusic();
	}
}