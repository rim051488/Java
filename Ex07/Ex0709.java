public class Ex0709{
	public static void main(String[] args){
		OuterRobot1 oRobot = new OuterRobot1();
		oRobot.func();
		OuterRobot1.InnerRobot1 iRobot1 = oRobot.new InnerRobot1();
		iRobot1.speak();
		OuterRobot1.InnerRobot1 iRobot2 = oRobot.new InnerRobot1s();
		iRobot2.speak();		
		Profile.Number();
		Profile.Name();
	}
}

class OuterRobot1{
	private String name="���b�h";
	
	public class InnerRobot1 {
		public int number = 1;
		public void speak(){
			System.out.println("���^�V��"+name+"�ł��I");
		}
	}
	
	public class InnerRobot1s extends InnerRobot1{
		public void speak(){
			System.out.println("���^�V�̔ԍ���"+number+"�Ԃł��I");
		}
	}
	
	public void func(  ){
		InnerRobot1 robot1 = new InnerRobot1();
		robot1.speak();
		InnerRobot1s robot2 = new InnerRobot1s();
		robot2.speak();
	}
}

