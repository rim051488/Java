import java.util.Scanner;
public class Ex161{
	public static void main(String[] args){
		QueStandardInput1 que = new QueStandardInput1();
		que.func();
	}
}

class QueStandardInput1{
	public void func(){
		System.out.println("���O����͂��Ă�������");
		Scanner scanner = new Scanner (System.in);
		String name = scanner.nextLine();
		System.out.println(name);
	}
}