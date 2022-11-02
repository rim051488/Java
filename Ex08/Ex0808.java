import java.util.Scanner;
public class Ex0808{
	public static void main(String[] args){
		QueStandardInput1 input = new QueStandardInput1();
		try {
			input.func();
		}catch (QueException e){
			System.out.println(e.getMessage());
		}catch (NumberFormatException e){
			System.out.println("���l���̓~�X");
			System.out.println(e.getMessage());
		}
		Profile.Number();
		Profile.Name();
	}
}

class QueStandardInput1{
	public void func() throws QueException{
		int[] arr = new int[3];
		System.out.println("1�`10�̐��l��3���͂��Ă�������");
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i < 3;i++){
			String str = scanner.nextLine();
			int num = Integer.parseInt(str);
			if (num < 1 || num > 10){
				throw new QueException("1�`10�ȊO�̐��l�����͂���܂���");
			}
			arr[i] = num;
		}
		System.out.println("���͂��󂯕t���܂���");
	}
}

class QueException extends Exception{
	public QueException(String str){
		super(str);
	}
}
