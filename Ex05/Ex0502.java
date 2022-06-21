public class Ex0502{
    public static void main(String[] args){
    	Player2 player[] = new Player2[6];
    	String name[] = {"����","���","����","�c��","�ɓ�","�n��"};
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

class Player2{
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
		this.height = height;
	}
	public int getHeight(){
		return height;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public int getWeight(){
		return weight;
	}
}
