interface PrizeChecker{
	boolean winlose(LotteryTicket t);
}

abstract class AbstractPrize implements PrizeChecker{
	protected int winNumber;
	protected String winWord;
	
	AbstractPrize(int number,String winWord){
		this.winWord = winWord;
		this.winNumber = number;
	}
	
	public boolean winlose (LotteryTicket t){
		boolean r;
		if (r = checkWinLose(t)){
			t.setResult(winWord);
		}
		return r;
	}
	
	abstract boolean checkWinLose(LotteryTicket t);
}

class Prize1 extends AbstractPrize {
	Prize1(int num){
		super(num,"Prize1 WIN");
	}
	public boolean checkWinLose(LotteryTicket t){
		return (t.getNumber() == winNumber);
	}
}

class Prize2 extends AbstractPrize{
		Prize2(int num){
		super(num,"Prize2 WIN");
	}
	public boolean checkWinLose(LotteryTicket t){
		return (t.getNumber() % 10000 == winNumber);
	}
}

class Prize3 extends AbstractPrize{
		Prize3(int num){
		super(num,"Prize3 WIN");
	}
	public boolean checkWinLose(LotteryTicket t){
		return (t.getNumber() % 100 == winNumber);
	}
}

class LotteryTicket{
	private String number;
	private String result;
	
	public LotteryTicket(String number){
		this.number = number;
		result = "LOSE";
	}
	public int getNumber(){
		return Integer.parseInt(number);
	}
	public void setResult(String result){
		this.result = result;
	}
	public String toString(){
		return number + "\t" + result;
	}
}

public class Q7{
    public static void main(String[] args){
    	LotteryTicket[] lotteries = {
    		new LotteryTicket("957503"),
    		new LotteryTicket("857503"),
    		new LotteryTicket("295635"),
    		new LotteryTicket("563529"),
    		new LotteryTicket("100070"),
    		new LotteryTicket("105290") };
    	PrizeChecker[] checkers = {
    		new Prize1(957503),
    		new Prize2(5635),
    		new Prize3(29),
    		new Prize3(70)};
    	for (LotteryTicket lot :lotteries){
    		for (PrizeChecker check :checkers){
    			if (check.winlose(lot)){
    				break;
    			}
    		}
    		System.out.println(lot);
    	}
    }
}
