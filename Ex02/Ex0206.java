import java.util.Scanner;
public class Ex0206{
    public static void main(string[] args){
        Branch5 branch = new Branch5();
        branch.func();
    }
}

public class Branch5{
    public void func(){
    	System.out.pringln("���l����͂��Ă�������");
    	Scanner scanner = new Scanner(System.in);
    	if (scanner.hasNextInt()){
            String str = scanner.nextLine();
            int num = Integer.parseInt(str);
            if (num > 0){
                System.out.pringln("0���傫�����l�����͂���܂���");
            }else{
                System.out.pringln("0�ȉ��̐��l�����͂���܂���");
            }
        }else{
            System.out.pringln("���l�ȊO�����͂���܂���");
        }
    }
}