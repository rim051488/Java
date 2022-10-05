public class Ex0702{
	public static void main(String[] args){
		ExRobot1 robot = new ExRobot1();
		robot.speak();
		robot.walk();
		robot.jump();
		robot.punch();
		robot.kick();
	}
}

class ExRobot1 implements IFSpeak,IFWalk,IFJump,IFPunch,IFKick{
	private String name = "N";
	
	@Override
	public void speak(){
		System.out.println("わたしは"+this.name+"です！");
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
	void speak();
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

