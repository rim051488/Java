public class Ex151{
	public static void main(String[] args){
		CalculateVar1 calcVar = new CalculateVar1();
		calcVar.func();
	}
}

class CalculateVar1{
	public void func(){
		double num = 1.11;
		System.out.println(num);
		num = num*2;
		System.out.println(num);
	}
}
