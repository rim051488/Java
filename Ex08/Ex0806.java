import java.util.Scanner;
public class Ex0806{
	public static void main(String[] args){
		StandardInput5 input = new StandardInput5();
		try {
			input.printSub();
		} catch (NumberFormatException e){
			System.out.println("���l�ł͂���܂���");
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
		String[] sub = {"����","���w","�p��","����","�Љ�",};
		System.out.println("0�`4�̐��l����͂��Ă�������");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int index = Integer.parseInt(str);
		if (index < 0 || index > 4){
			throw new Exception("0�`4�ȊO�̐��l�����͂���܂���");
		}
		System.out.println(sub[index]);
	}
}
