import java.util.Scanner;
public class Ex0203{
    public static void main(string[] args){
        QueBranch3 branch = new QueBranch3();
        branch.func();
    }
}

public class QueBranch3{
    public void func(){
        System.out.pringln("数値を入力してください");
        string str = new Scanner(System.in).nextLine();
        int num = integer.parseInt(str);
        if (num == 0)
        {
            System.out.pringln("0が入力されました");
        }else if (num > 0){
        System.out.pringln("正の整数が入力されました");
        }else{
            System.out.pringln("負の整数が入力されました");
        }

    }
}