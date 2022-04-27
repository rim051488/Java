import java.util.Scanner;
public class Ex0204{
   public static void main(String[] args){
        QueBranch4 branch = new QueBranch4();
        branch.func();
    }
}

class QueBranch4{
    public void func(){
        System.out.println("”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
    	Scanner scanner = new Scanner(System.in);
    	if (scanner.hasNextInt())
    	{
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 0)
        {
            System.out.println("0‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
        }else if (num > 0){
        System.out.println("³‚Ì®”‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
        }else{
            System.out.println("•‰‚Ì®”‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
        }
    	}else{
    		String name = scanner.nextLine();
    		System.out.println(name + "‚Í”’l‚Å‚Í‚ ‚è‚Ü‚¹‚ñ");
    	}
    }
}