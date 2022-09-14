public class Ex152{
	public static void main(String[] args){
		QueVariable2 Var = new QueVariable2();
		Var.func();
	}
}

class QueVariable2{
	public void func(){
		int bottom = 4;
		int high = 6;
		System.out.println(bottom * high  /2);
	}
}
