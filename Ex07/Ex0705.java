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
	private String name = "���b�h";
	
	@Override
	public void speak(){
		System.out.println("���^�V��"+this.name+"�ł��I");
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

interface IFSwim extends IFSpeak,IFWalk{
	void swim();
}
