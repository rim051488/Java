import java.util.Scanner;
public class Ex0803{
	public static void main(String[] args){
		QueCalculate1 input = new QueCalculate1();
		input.printDiv(10,5);
		input.printDiv(5,0);
		Profile.Number();
		Profile.Name();
	}
}

class QueCalculate1{
	public void printDiv(int a,int b){
		try{
			System.out.println(a+"/"+b+"を計算すると？");
			int ans = a/ b;
			System.out.println(ans);
		} catch (ArithmeticException e){
			System.out.println("例外が発生しました");
		}
	}
}
