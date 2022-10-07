public class Ex0703{
	public static void main(String[] args){
		IFSpeak robotA = new Robot1();
		robotA.speak();
		Robot1 robotB = (Robot1)robotA;
		robotB.speak();
		Profile.Number();
		Profile.Name();
	}
}

class Robot1 implements IFSpeak,IFWalk{
	private String name = "レッド";
	
	@Override
	public void speak(){
		System.out.println("ワタシは"+this.name+"です！");
	}
	@Override
	public void walk(){
		System.out.println("わたしは歩いております。");
	}
}

interface IFWalk{
	void walk();
}

interface IFSpeak{
	void speak();
}

