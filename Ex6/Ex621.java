public class Ex621{
	public static void main(String[] args){
		QueCalcCore1 cal = new QueCalcCore1();
		QueCalculate1 ate = new QueCalculate1();
		System.out.println(cal.add(10,20));
		System.out.println(ate.sub(10,20));
	}
}

class QueCalcCore1{
	public int add(int num1,int num2){
		return num1 + num2;
	}
}
class QueCalculate1 extends QueCalcCore1{
	public int sub(int num1,int num2){
		return num1 - num2;
	}
}
