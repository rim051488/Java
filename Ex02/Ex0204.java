import java.util.Scanner;
public class Ex0204{
    public static void main(string[] args){
        Branch4 branch = new Branch4();
        branch.func();
    }
}

public class Branch4{
    public void func(){
        System.out.pringln("���Ȃ��̔N�����͂��Ă�������");
        string str = new Scanner(System.in).nextLine();
        int num = integer.parseInt(str);
        if (num >= 65)
        {
            System.out.pringln("����҂ł�");
        }else if (num >= 18){
        System.out.pringln("���l�ł�");
        }else{
            System.out.pringln("�����N�ł�");
        }

    }
}