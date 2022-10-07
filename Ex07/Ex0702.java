public class Ex0702{
	public static void main(String[] args){
		ExRobot1 robot = new ExRobot1();
		robot.speak();
		System.out.println(robot.NAME);
		robot.walk();
		robot.jump();
		robot.punch();
		robot.kick();
		Profile.Number();
		Profile.Name();
	}
}

class ExRobot1 implements IFSpeak,IFWalk,IFJump,IFPunch,IFKick{
	@Override
	public void speak(){
		System.out.println("わたしは"+this.NAME+"です！");
	}	
	@Override
	public void walk(){
		System.out.println("わたしは歩いております。");
	}
	@Override
	public void jump(){
		System.out.println("わたしはジャンプしています。");
	}
	@Override
	public void punch(){
		System.out.println("わたしはパンチしています。");
	}
	@Override
	public void kick(){
		System.out.println("わたしはキックしています。");
	}
}

interface IFWalk{
	 void walk();
}

interface IFSpeak{
	public String NAME = "レッド";
	default public void speak(){
		System.out.println("わっしは"+this.NAME+"です！");
	}
}

interface IFJump{
	void jump();
}

interface IFPunch{
	void punch();
}

interface IFKick{
	void kick();
}

