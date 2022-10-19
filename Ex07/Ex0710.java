public class Ex0710{
	public static void main(String[] args){
		OuterRobot2 oRobot = new OuterRobot2();
		OuterRobot2.InnerRobot1 iRobot1 = oRobot.new InnerRobot1();
		OuterRobot2.InnerRobot2 iRobot2 = new OuterRobot2.InnerRobot2();
		iRobot1.speak();
		iRobot2.speak();
		Profile.Number();
		Profile.Name();
	}
}

class OuterRobot1{
	private String name="レッド";
	
	public class InnerRobot1 {
		public int number = 1;
		public void speak(){
			System.out.println("ワタシは"+name+"です！");
		}
	}
	
	public class InnerRobot1s extends InnerRobot1{
		public void speak(){
			System.out.println("ワタシの番号は"+number+"番です！");
		}
	}
	
	public void func(  ){
		InnerRobot1 robot1 = new InnerRobot1();
		robot1.speak();
		InnerRobot1s robot2 = new InnerRobot1s();
		robot2.speak();
	}
}

class OuterRobot2 extends OuterRobot1{
	public String name="レッド";
	static int power = 100;
	
	public static class InnerRobot2{
		public void speak(){
			System.out.println("静的なメンバクラスです");
			System.out.println(OuterRobot2.power);
		}
	}
}
