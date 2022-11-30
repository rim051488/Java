class NumverHolder {
	int number;
	void setNumber(int number){
		this.number = number;
	}
	int getNumber(){
		return number;
	}
}

public class Q17{
	public static void main (String[] args){
		NumverHolder n = new NumverHolder();
		n.setNumber(123);
		System.out.println(n.getNumber());
		Profile.Number();
		Profile.Name();
	}
}
