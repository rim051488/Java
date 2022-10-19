public class Ex0711{
	public static void main(String[] args){
		QueOuter1 outer = new QueOuter1();
		QueOuter1.QueInner inner = outer.new QueInner();
		inner.func();
		Profile.Number();
		Profile.Name();
	}
}

class QueOuter1{
	public class QueInner {
		public void func(){
			System.out.println("内部クラスのメソッドです");
		}
	}
}

