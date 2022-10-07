public class Ex0701{
	public static void main(String[] args){
		Robot1 robot = new Robot1();
		robot.speak();
		robot.walk();
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
		System.out.println("歩きます");
	}
}

interface IFWalk{
	void walk();
}

interface IFSpeak{
	void speak();
}

