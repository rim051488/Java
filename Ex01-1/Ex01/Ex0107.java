public class Ex0107{
	public static void main(String[] args){
		QueTypeCast2 que = new QueTypeCast2();
		que.func();
	}
}

class QueTypeCast2{
	public void func(){
		String str ="2000";
		int num =20;
		System.out.println(Integer.parseInt(str) + 21);
		System.out.println(String.value0f(num) + 22);
	}
}