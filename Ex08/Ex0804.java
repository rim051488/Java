import java.util.Scanner;
public class Ex0804{
	public static void main(String[] args){
		StandardInput3 input = new StandardInput3();
		input.printSub();
		Profile.Number();
		Profile.Name();
	}
}

class StandardInput3{
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
		} finally {
			System.out.println("�������I�����܂�");
		}
	}
}
