public class Ex0705{
	public static void main(String[] args){
		SwimRobot1 robot = new SwimRobot1();
		robot.speak();
		robot.walk();
		robot.swim();
		Profile.Number();
		Profile.Name();
	}
}

class SwimRobot1 implements IFSwim{
	private String name = "レッド";
	
	@Override
	public void speak(){
		System.out.println("ワタシは"+this.name+"です！");
	}
	@Override
	public void walk(){
		System.out.println("わたしは歩いております。");
	}
	@Override
	public void swim(){
		System.out.println("泳ぎます。");
	}
}

interface IFSwim extends IFSpeak,IFWalk{
	void swim();
}
