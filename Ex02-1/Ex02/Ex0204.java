import java.util.Scanner;
public class Ex0204{
   public static void main(String[] args){
        QueBranch4 branch = new QueBranch4();
        branch.func();
    }
}

class QueBranch4{
    public void func(){
        System.out.println("���l����͂��Ă�������");
    	Scanner scanner = new Scanner(System.in);
    	if (scanner.hasNextInt())
    	{
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 0)
        {
            System.out.println("0�����͂���܂���");
        }else if (num > 0){
        System.out.println("���̐��������͂���܂���");
        }else{
            System.out.println("���̐��������͂���܂���");
        }
    	}else{
    		String name = scanner.nextLine();
    		System.out.println(name + "�͐��l�ł͂���܂���");
    	}
    }
}