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
		System.out.print("原価を入力してください:");
		Scanner scanner = new Scanner (System.in);
		String Cost = scanner.nextLine();
		cost = Integer.parseInt(Cost);
		System.out.println("商品の原価："+cost+"円");
	}
	public void salesTax(){
		price = (int)(cost*1.1);
		System.out.println("税込みの価格"+price+"円");
		System.out.println("注：小数第一位の端数は切り捨てです");
		
	}
}