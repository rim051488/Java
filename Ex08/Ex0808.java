import java.util.Scanner;
public class Ex0808{
	public static void main(String[] args){
		QueStandardInput1 input = new QueStandardInput1();
		try {
			input.func();
		}catch (QueException e){
			System.out.println(e.getMessage());
		}catch (NumberFormatException e){
			System.out.println("数値入力ミス");
			System.out.println(e.getMessage());
		}
		Profile.Number();
		Profile.Name();
	}
}

class QueStandardInput1{
	public void func() throws QueException{
		int[] arr = new int[3];
		System.out.println("1～10の数値を3つ入力してください");
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i < 3;i++){
			String str = scanner.nextLine();
			int num = Integer.parseInt(str);
			if (num < 1 || num > 10){
				throw new QueException("1～10以外の数値が入力されました");
			}
			arr[i] = num;
		}
		System.out.println("入力を受け付けました");
	}
}

class QueException extends Exception{
	public QueException(String str){
		super(str);
	}
}
