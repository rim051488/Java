import java.util.Scanner;
public class Ex0203{
    public static void main(string[] args){
        QueBranch3 branch = new QueBranch3();
        branch.func();
    }
}

public class QueBranch3{
    public void func(){
        System.out.pringln("”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        string str = new Scanner(System.in).nextLine();
        int num = integer.parseInt(str);
        if (num == 0)
        {
            System.out.pringln("0‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
        }else if (num > 0){
        System.out.pringln("³‚Ì®”‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
        }else{
            System.out.pringln("•‰‚Ì®”‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
        }

    }
}