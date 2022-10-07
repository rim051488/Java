public class Ex0703{
	public static void main(String[] args){
		IFSpeak robotA = new Robot1();
		robotA.speak();
		Robot1 robotB = (Robot1)robotA;
		robotB.speak();
	}
}

class Robot1 implements IFSpeak,IFWalk{
	private String name = "���b�h";
	
	@Override
	public void speak(){
		System.out.println("�킽����"+this.name+"�ł��I");
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

