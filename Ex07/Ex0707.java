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
		System.out.println("���^�V��"+super.getName()+"�ł��I");
	}
	@Override
	public void walk(){
		System.out.println("�킽���͕����Ă���܂��B");
	}
	@Override
	public void swim(){
		System.out.println("�j���܂��B");
	}
}

class RobotCore1{
	private String name = "���b�h";
	
	public String getName(){
		return this.name;
	}
}