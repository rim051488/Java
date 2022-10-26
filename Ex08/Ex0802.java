import java.util.Scanner;
public class Ex0802{
	public static void main(String[] args){
		StandardInput2 input = new StandardInput2();
		input.printSub();
		Profile.Number();
		Profile.Name();
	}
}

class StandardInput2{
	public void printSub(){
		String[] sub = {"国語","数学","英語","理科","社会",};
		try{
			System.out.println("0～4の数値を入力してください");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			int index = Integer.parseInt(str);
			System.out.println(sub[index]);
		} catch (NumberFormatException e){
			System.out.println("数値以外が入力されました");
		} catch (IndexOutOfBoundsException e){
			System.out.println("0～4以外の数値が入力されました");
		} catch (Exception e){
			System.out.println("例外が発生しました");
		}
	}
}
