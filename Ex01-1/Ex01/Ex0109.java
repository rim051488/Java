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
		System.out.print("��������͂��Ă�������:");
		Scanner scanner = new Scanner (System.in);
		String Cost = scanner.nextLine();
		cost = Integer.parseInt(Cost);
		System.out.println("���i�̌����F"+cost+"�~");
	}
	public void salesTax(){
		price = (int)(cost*1.1);
		System.out.println("�ō��݂̉��i"+price+"�~");
		System.out.println("���F�������ʂ̒[���͐؂�̂Ăł�");
		
	}
}