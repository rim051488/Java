import java.util.Scanner;
public class Ex0203{
   public static void main(String[] args){
        QueBranch3 branch = new QueBranch3();
        branch.func();
    }
}

class QueBranch3{
    public void func(){
        System.out.println("”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
    	Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 0)
        {
            System.out.println("0‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
        }else if (num > 0){
        System.out.println("³‚Ì®”‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
        }else{
            System.out.println("•‰‚Ì®”‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
        }

    }
}