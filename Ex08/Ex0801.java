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
		String[] sub = {"����","���w","�p��","����","�Љ�",};
		try{
			System.out.println("0�`4�̐��l����͂��Ă�������");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			int index = Integer.parseInt(str);
			System.out.println(sub[index]);
		} catch (NumberFormatException e){
			System.out.println("��O���������܂���");
		}
	}
}
