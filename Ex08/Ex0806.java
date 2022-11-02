import java.util.Scanner;
public class Ex0806{
	public static void main(String[] args){
		StandardInput5 input = new StandardInput5();
		try {
			input.printSub();
		} catch (NumberFormatException e){
			System.out.println("数値ではありません");
			System.out.println(e.getMessage());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		Profile.Number();
		Profile.Name();
	}
}

class StandardInput5{
	public void printSub() throws Exception{
		String[] sub = {"国語","数学","英語","理科","社会",};
		System.out.println("0～4の数値を入力してください");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int index = Integer.parseInt(str);
		if (index < 0 || index > 4){
			throw new Exception("0～4以外の数値が入力されました");
		}
		System.out.println(sub[index]);
	}
}
