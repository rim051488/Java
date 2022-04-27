public class Ex0103{
	public static void main(String[] args){
		PrintAns2 print = new PrintAns2();
		print.func();
		print.func2();
	}
}

class PrintAns2{
	public void func(){
		System.out.println(5+4);
		System.out.println(9-7);
		System.out.println(6*4);
		System.out.println(18/3);
		System.out.println(19%4);
	}
	public void func2(){
		System.out.println("5 + 4 = " + (5+4));
		System.out.println("9 + 7 = " + (9-7));
		System.out.println("6 * 4 = " + (6*4));
		System.out.println("18 / 3 = " + (18/3));
		System.out.println("19 % 4 = " + (19%4));
	}
}
