import java.util.Scanner;
public class Ex0807{
	public static void main(String[] args){
		StandardInput6 input = new StandardInput6();
		try {
			input.printSub();
		}catch (MyException e){
			System.out.println(e.getMessage());
		}
		Profile.Number();
		Profile.Name();
	}
}

class StandardInput6{
	public void printSub() throws MyException{
		String[] sub = {"����","���w","�p��","����","�Љ�",};
		System.out.println("0�`4�̐��l����͂��Ă�������");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int index = Integer.parseInt(str);
		if (index < 0 || index > 4){
			throw new MyException("0�`4�ȊO�̐��l�����͂���܂���");
		}
		System.out.println(sub[index]);
	}
}

class MyException extends Exception{
	public MyException(String str){
		super(str);
	}
}
