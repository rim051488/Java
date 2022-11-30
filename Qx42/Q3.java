interface EnergySupply{
	String unit ="kWh";
	void disp();
}

abstract class AbstractPowerPlant implements EnergySupply{
	double capacity;
	
	public AbstractPowerPlant(){
	}
	
	public AbstractPowerPlant(double capacity){
		this.capacity = capacity;
	}
	public void disp(){
		System.out.println(temp() + unit);
	}
	public void GetCapacity(double capacity){
		this.capacity = capacity;
	}	
	public abstract double temp();
}

class SolarPower extends AbstractPowerPlant {
	public SolarPower(double capacity){
		//super(capacity);
		super.capacity = capacity;
	}
	public double temp(){
		return  (capacity * 0.15);
	}
}

public class Q3{
	public static void main (String[] args){
		SolarPower power = new SolarPower(50.5);
		power.disp();
		Profile.Number();
		Profile.Name();
	}
}
