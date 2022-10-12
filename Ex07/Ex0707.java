public class Ex0707{
	public static void main(String[] args){
		SwimRobot2 robot = new SwimRobot2();
		robot.speak();
		robot.walk();
		robot.swim();
		Profile.Number();
		Profile.Name();
	}
}

class SwimRobot2 extends RobotCore1 implements IFSwim{
	@Override
	public void speak(){
		System.out.println("ワタシは"+super.getName()+"です！");
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

class RobotCore1{
	private String name = "レッド";
	
	public String getName(){
		return this.name;
	}
}