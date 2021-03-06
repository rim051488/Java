public class Ex0501{
    public static void main(String[] args){
    	Player1 player[] = new Player1[6];
    	String name[] = {"佐藤","鈴木","高橋","田中","伊藤","渡辺"};
    	int height[] = {1400,150,182,177,165,159};
    	int weight[] = {39,45,96,78,69,560};
    	for (int i = 0; i < player.length;i++){
    		player[i] = new Player1(name[i],height[i],weight[i]);
    		player[i].calcBmi();
    		player[i].print();
    	}
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
	private static double bmi = 0;
	Player1(String name, int height,int weight){
		this.name = name;
		if (0<height){
			if (height<272)
			{
				this.height = height;
			}
		}
		if (0<weight){
			if (weight<550)
			{
			this.weight = weight;
			}
		}
		secretBoots();
		secretBalloon();
	}
	public void calcBmi(){
		double m = height;
		m = m/100;
		bmi = (double)weight / (m * m);
	}
	public void print(){
		if (bmiHeavy < bmi){
		System.out.println(name+"さんの身長は"+height+"cm,体重は"+weight+"Kg\n\tBMIは"+bmi+"です\t"+name+"さんは太りすぎです。");
		}
		else if (bmiLight > bmi){
		System.out.println(name+"さんの身長は"+height+"cm,体重は"+weight+"Kg\n\tBMIは"+bmi+"です\t"+name+"さんはやせすぎです。");
		}
		else{
		System.out.println(name+"さんの身長は"+height+"cm,体重は"+weight+"Kg\n\tBMIは"+bmi+"です\t"+name+"さんは普通です。");
		}
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
