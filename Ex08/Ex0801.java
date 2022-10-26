import java.util.Scanner;
public class Ex0801{
	public static void main(String[] args){
		StandardInput1 input = new StandardInput1();
		input.printSub();
		Profile.Number();
		Profile.Name();
	}
}

class StandardInput1{
	public void printSub(){
		String[] sub = {"国語","数学","英語","理科","社会",};
		try{
			System.out.println("0〜4の数値を入力してください");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			int index = Integer.parseInt(str);
			System.out.println(sub[index]);
		} catch (NumberFormatException e){
			System.out.println("例外が発生しました");
		}
	}
}
