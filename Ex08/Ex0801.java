import java.util.Scanner;
public class Ex0801{
	public static void main(String[] args){
		StandardInput1 input = new StandardInput1();
		input.printSub();
		Profile.Number();
		Profile.Name();
	}
}

class StandardInput1{
	public void printSub(){
		String[] sub = {"‘Œê","”Šw","‰pŒê","—‰È","Ğ‰ï",};
		try{
			System.out.println("0`4‚Ì”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			int index = Integer.parseInt(str);
			System.out.println(sub[index]);
		} catch (NumberFormatException e){
			System.out.println("—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");
		}
	}
}
