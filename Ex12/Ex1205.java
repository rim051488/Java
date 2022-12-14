public class Ex1205{
	public static void main (String[] args){
		Robot1 robot = new Robot1();
		SampleThread4 thread1 = new SampleThread4("スレッド1",robot);
		SampleThread4 thread2 = new SampleThread4("スレッド2",robot);
		thread1.start();
		thread2.start();
	}
}

class SampleThread4 extends Thread{
	private Robot1 robot = null;
	
	public SampleThread4(String name,Robot1 robot){
		super(name);
		this.robot = robot;
	}
	@Override
	public void run(){
		this.robot.rest();
	}
}

class Robot1{
	private static int MAX_POWER = 200;
	private static int CHARGE_POWER = 10;
	private int power = 100;
	
	public synchronized void rest (){
		if(this.power >= MAX_POWER){
			System.out.println("powerは満タンです");
			return;
		}
		int checkPower = this.power + CHARGE_POWER;
		if (checkPower > MAX_POWER){
			checkPower = MAX_POWER;
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		this.power = checkPower;
		System.out.println("powerを回復しました：" + checkPower);
	}
}
