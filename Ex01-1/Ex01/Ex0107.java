public class Ex0107{
	public static void main(String[] args){
		QueTypeCast1 que = new QueTypeCast1();
		que.func();
		que.func1();
	}
}

class QueTypeCast1{
		int num1 = 20;
		int num2 = 10;
		double num3 = 5;
	public void func(){
		System.out.println(num2/num1);
		System.out.println(num2+num3);
		System.out.println(num3/num1);
	}
	public void func1(){
		System.out.println((num2) + (" / ") + (num1) + (" = ") + (num2/num1));
		System.out.println((num2) + (" + ") + (num3) + (" = ")  + (num2+num3));
		System.out.println((num3) + (" / ") + (num1) + (" = ") + (num3/num1));
	}

}