import java.util.Scanner;
public class Ex0203{
   public static void main(String[] args){
        QueBranch3 branch = new QueBranch3();
        branch.func();
    }
}

class QueBranch3{
    public void func(){
        System.out.println("���l����͂��Ă�������");
    	Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 0)
        {
            System.out.println("0�����͂���܂���");
        }else if (num > 0){
        System.out.println("���̐��������͂���܂���");
        }else{
            System.out.println("���̐��������͂���܂���");
        }

    }
}