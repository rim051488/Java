import java.util.Scanner;
public class Ex231{
   public static void main(String[] args){
        QueBranch3 branch = new QueBranch3();
        branch.func();
    }
}

class QueBranch3{
    public void func(){
        System.out.println("数値を入力してください");
    	Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 0)
        {
            System.out.println("0が入力されました");
        }else if (num > 0){
        System.out.println("正の整数が入力されました");
        }else{
            System.out.println("負の整数が入力されました");
        }

    }
}