import java.util.Scanner;
public class Ex211{
    public static void main(String[] args){
        Branch2 branch = new Branch2();
        branch.func();
    }
}

class Branch2{
    public void func(){
        System.out.println("Helloを入力してください");
        Scanner scanner = new Scanner(System.in);
    	String str = scanner.nextLine();
        if (str.equals("Hello"))
        {
            System.out.println("一致しました");
        }
    }
}