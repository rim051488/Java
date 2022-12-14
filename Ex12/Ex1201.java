public class Ex1201{
	public static void main (String[] args){
		SampleThread1 thread1 = new SampleThread1();
		SampleThread1 thread2 = new SampleThread1();		
		System.out.println("マルチスレッド開始");
		thread1.start();
		thread2.start();
	}
}

class SampleThread1 extends Thread{
	@Override
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(this.getName() +"--No."+(i+1));
		}
	}
}
