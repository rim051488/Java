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
	private String name = "���b�h";
	
	@Override
	public void speak(){
		System.out.println("���^�V��"+this.name+"�ł��I");
	}
	@Override
	public void walk(){
		System.out.println("�����܂�");
	}
}

interface IFWalk{
	void walk();
}

interface IFSpeak{
	void speak();
}

