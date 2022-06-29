package player;
public class Player5{
	private static double bmiHeavy = 25.1;
	private static double bmiLight = 18.9;
	private static final String defName = "佐藤";
	private static final int defHeight = 171;
	private static final int defWeight = 62;
	private String name = defName;
	private int height = defHeight;
	private int weight = defWeight;
	private static double bmi = 0;
	public Player5(){
		this(defName,defHeight,defWeight);
	}
	public Player5(String name){
		this(name,defHeight,defWeight);
	}
	public Player5(String name, int height,int weight){
		setName(name);
		setHeight(height);
		setWeight(weight);
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
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setHeight(int height){
		if (0<height && height<272){
			this.height = height;
		}
	}
	public int getHeight(){
		return height;
	}
	public void setWeight(int weight){
		if (0<weight && weight < 550){
			this.weight = weight;
		}
	}
	public int getWeight(){
		return weight;
	}
}