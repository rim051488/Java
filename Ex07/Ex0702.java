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
		System.out.println("�킽����"+this.name+"�ł��I");
	}
	@Override
	public void walk(){
		System.out.println("�킽���͕����Ă���܂��B");
	}
	@Override
	public void jump(){
		System.out.println("�킽���̓W�����v���Ă��܂��B");
	}
	@Override
	public void punch(){
		System.out.println("�킽���̓p���`���Ă��܂��B");
	}
	@Override
	public void kick(){
		System.out.println("�킽���̓L�b�N���Ă��܂��B");
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
