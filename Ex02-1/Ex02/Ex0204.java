import java.util.Scanner;
public class Ex0204{
   public static void main(String[] args){
        QueBranch4 branch = new QueBranch4();
        branch.func();
    }
}

class QueBranch4{
    public void func(){
        System.out.println("数値を入力してください");
    	Scanner scanner = new Scanner(System.in);
    	if (scanner.hasNextInt())
    	{
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 0)
        {
            System.out.println("0が入力されました");
        }else if (num > 0){
        System.out.println("正の整数が入力されました");
        }else{
            System.out.println("負の整数が入力されました");
        }
    	}else{
    		String name = scanner.nextLine();
    		System.out.println(name + "は数値ではありません");
    	}
    }
}