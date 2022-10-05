import java.util.Scanner;
public class Ex0109{
	public static void main(String[] args){
		TaxCalc tax = new TaxCalc();
		tax.dataScan();
		tax.salesTax();
	}
}

class TaxCalc{
	int cost;
	int price;
	public void dataScan(){
		System.out.print("Œ´‰¿‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:");
		Scanner scanner = new Scanner (System.in);
		String Cost = scanner.nextLine();
		cost = Integer.parseInt(Cost);
		System.out.println("¤•i‚ÌŒ´‰¿F"+cost+"‰~");
	}
	public void salesTax(){
		price = (int)(cost*1.1);
		System.out.println("Å‚İ‚Ì‰¿Ši"+price+"‰~");
		System.out.println("’F¬”‘æˆêˆÊ‚Ì’[”‚ÍØ‚èÌ‚Ä‚Å‚·");
		
	}
}