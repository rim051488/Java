import java.util.Scanner;
public class Ex0805{
	public static void main(String[] args){
		StandardInput4 input = new StandardInput4();
		input.printSub();
		Profile.Number();
		Profile.Name();
	}
}

class StandardInput4{
	public void printSub(){
		String[] sub = {"����","���w","�p��","����","�Љ�",};
		try{
			System.out.println("0�`4�̐��l����͂��Ă�������");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			int index = Integer.parseInt(str);
			if (index < 0 || index > 4){
				throw new Exception ("0�`4�ȊO�̐��l�����͂���܂���");
			}
			System.out.println(sub[index]);
		} catch (NumberFormatException e){
			System.out.println("���l�ȊO�����͂���܂���");
			System.out.println(e.getMessage());
		} catch (Exception e){
			System.out.println(e.getMessage());
		} 
	}
}
