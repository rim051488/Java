import java.util.Scanner;
public class Ex0204{
    public static void main(string[] args){
        Branch4 branch = new Branch4();
        branch.func();
    }
}

public class Branch4{
    public void func(){
        System.out.pringln("あなたの年齢を入力してください");
        string str = new Scanner(System.in).nextLine();
        int num = integer.parseInt(str);
        if (num >= 65)
        {
            System.out.pringln("高齢者です");
        }else if (num >= 18){
        System.out.pringln("成人です");
        }else{
            System.out.pringln("未成年です");
        }

    }
}