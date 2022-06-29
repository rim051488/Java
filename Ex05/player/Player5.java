package player;
public class Player5{
	private static double bmiHeavy = 25.1;
	private static double bmiLight = 18.9;
	private static final String defName = "����";
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