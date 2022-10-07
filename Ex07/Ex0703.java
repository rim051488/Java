public class Ex0703{
	public static void main(String[] args){
		IFSpeak robotA = new Robot1();
		robotA.speak();
		Robot1 robotB = (Robot1)robotA;
		robotB.speak();
	}
}

class Robot1 implements IFSpeak,IFWalk{
	private String name = "ÉåÉbÉh";
	
	@Override
	public void speak(){
		System.out.println("ÇÌÇΩÇµÇÕ"+this.name+"Ç≈Ç∑ÅI");
	}
	@Override
	public void walk(){
		System.out.println("ï‡Ç´Ç‹Ç∑");
	}
}

interface IFWalk{
	void walk();
}

interface IFSpeak{
	void speak();
}

