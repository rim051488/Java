import java.util.Scanner;
public class Ex0202{
    public static void main(string[] args){
        Branch1 branch = new Branch1();
        branch.func();
    }
}

public class Branch1{
    public void func(){
        System.out.pringln("���l����͂��Ă�������");
        string str = new Scanner(System.in).nextLine();
        int num = integer.parseInt(str);
        if (num <= 0)
        {
            System.out.pringln("0�ȉ��̐��l�����͂���܂���");
        }
        System.out.pringln("����I��");
    }
}