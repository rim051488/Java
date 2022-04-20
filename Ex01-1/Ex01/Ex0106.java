public class Ex0106{
	public static void main(String[] args){
		TypeCast3 cast = new TypeCast3();
		cast.func();
	}
}

class TypeCast3{
	public void func(){
		double num1 = 10.5;
		System.out.println(num1);
		int num2 = (int)num1;
		System.out.println(num2);
		int num3 = 10;
		String str = "20";
		System.out.println(Integer.parseInt(str)+30);
		System.out.println(String.valueOf(num3)+30);
	}
}