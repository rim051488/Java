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
		String[] sub = {"����","���w","�p��","����","�Љ�",};
		try{
			System.out.println("0�`4�̐��l����͂��Ă�������");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			int index = Integer.parseInt(str);
			System.out.println(sub[index]);
		} catch (NumberFormatException e){
			System.out.println("���l�ȊO�����͂���܂���");
		} catch (IndexOutOfBoundsException e){
			System.out.println("0�`4�ȊO�̐��l�����͂���܂���");
		} catch (Exception e){
			System.out.println("��O���������܂���");
		}
	}
}
