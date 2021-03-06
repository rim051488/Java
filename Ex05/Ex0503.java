public class Ex0503{
    public static void main(String[] args){
    	Player3 player[] = new Player3[6];
    	String name[] = {"佐藤","鈴木","高橋","田中","伊藤","渡辺"};
    	int height[] = {1400,150,182,177,165,159};
    	int weight[] = {39,45,96,78,69,560};
    	for (int i = 0; i < player.length;i++){
    		switch(name[i]){
    		case "佐藤":
    			player[i] = new Player3();
    			break;
    		case "渡辺":
    			player[i] = new Player3(name[i]);
    			break;
    		case "高橋":
    			player[i] = new Player3(name[i],height[i],weight[i]-15);
    			break;
    		case "伊藤":
    			player[i] = new Player3(name[i],height[i]+6,weight[i]);
    			break;
    		default:
    			player[i] = new Player3(name[i],height[i],weight[i]);
    			break;
    		}
    		player[i].calcBmi();
    		player[i].print();
    	}
        Profile.Number();
    	Profile.Name();
    }
}

class Player3{
	private static double bmiHeavy = 25.1;
	private static double bmiLight = 18.9;
	private static final String defName = "佐藤";
	private static final int defHeight = 171;
	private static final int defWeight = 62;
	private String name = defName;
	private int height = defHeight;
	private int weight = defWeight;
	private static double bmi = 0;
	Player3(){
		this(defName,defHeight,defWeight);
	}
	Player3(String name){
		this(name,defHeight,defWeight);
	}
	Player3(String name, int height,int weight){
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