import java.util.Scanner;
public class Ex162{
	public static void main(String[] args){
		StandardInput2 que = new StandardInput2();
		que.func();
	}
}

class StandardInput2{
	public void func(){
		System.out.println("”N—î‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		Scanner scanner = new Scanner (System.in);
		String age = scanner.nextLine();
		System.out.println(age+"Î‚Å‚·");
	}
}