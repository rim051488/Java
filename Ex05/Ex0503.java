public class Ex0503{
    public static void main(String[] args){
    	Player3 player[] = new Player3[6];
    	String name[] = {"����","���","����","�c��","�ɓ�","�n��"};
    	int height[] = {1400,150,182,177,165,159};
    	int weight[] = {39,45,96,78,69,560};
    	for (int i = 0; i < player.length;i++){
    		player[i] = new Player2(name[i],height[i],weight[i]);
    		if (player[i].getName().equals("�ɓ�")){
    			player[i].setHeight(player[i].getHeight()+6);
    		}
    		if (player[i].getName().equals("����")){
    			player[i].setWeight(player[i].getWeight()-10);
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
	private String name;
	private int height = 171;
	private int weight = 62;
	private static double bmi = 0;
	Player3(){
		String defName = "����";
		int defHeight = 1400;
		int defWeight = 39;
		this(defName,defHeight,defWeight);
	}
	Player3(String name){
		int defHeight = 150;
		int defWeight = 45;
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
		System.out.println(name+"����̐g����"+height+"cm,�̏d��"+weight+"Kg\n\tBMI��"+bmi+"�ł�\t"+name+"����͑��肷���ł��B");
		}
		else if (bmiLight > bmi){
		System.out.println(name+"����̐g����"+height+"cm,�̏d��"+weight+"Kg\n\tBMI��"+bmi+"�ł�\t"+name+"����͂₹�����ł��B");
		}
		else{
		System.out.println(name+"����̐g����"+height+"cm,�̏d��"+weight+"Kg\n\tBMI��"+bmi+"�ł�\t"+name+"����͕��ʂł��B");
		}
	}
	private void secretBoots(){
		if (name.equals("���")){
			height += 5;
		}
	}
	private void secretBalloon(){
		if (name.equals("�c��")){
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
