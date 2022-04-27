import java.util.Scanner;
public class Ex0207{
    public static void main(string[] args){
        QueBranch7 branch = new QueBranch7();
        branch.func();
    }
}

public class QueBranch7{
    public void func(){
    	System.out.pringln("数値を入力してください");
    	Scanner scanner = new Scanner(System.in);
    	if (scanner.hasNextInt()){
            String str = scanner.nextLine();
            int num = Integer.parseInt(str);
            if (num > 0){
                System.out.pringln("0より大きい数値が入力されました");
            }else{
                System.out.pringln("0以下の数値が入力されました");
            }
        }else{
            System.out.pringln("数値以外が入力されました");
        }
    }
}