public class Ex0404{
    public static void main(String[] args){
        Profile.Number();
    	Profile.Name();
    }
}

class Player1{
	private static double bmiHeavy = 25.1;
	private static double bmiLight = 18.9;
	private String name;
	private int height = 171;
	private int weight = 62;
	private static double bmi;
	Player1(String name, int height,int weight){
		this.name = name;
		if (0<height<272){
			this.height = height;
		}
		if (0<weight<550){
			this.weight = weight;
		}
		secretBoots();
		secretBalloon();
	}
	public void calcBmi(){
		
	}
	public void print(){
	}
	private void secretBoots(){
		if (name.equals("鈴木")){
			height += 5;
		}
	}
	private void secretBalloon(){
		if (name.equals("田中")){
			weight -= 5;
		}
	}
}
