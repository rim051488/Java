public class Ex141{
	public static void main(String[] args){
		QuePrintAns1 print = new QuePrintAns1();
		print.func();
	}
}

class QuePrintAns1{
	public void func(){
		System.out.println(8+(5%2));
		System.out.println(4*(9-5));
		System.out.println(9/3*(2*4));
		System.out.println(7*(5-(9-1)/2));
	}
}
