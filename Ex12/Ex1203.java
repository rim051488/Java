public class Ex1203{
	public static void main (String[] args){
		SampleRunnable1 runnable1 = new SampleRunnable1(3000);
		SampleRunnable1 runnable2 = new SampleRunnable1(1000);		
		Thread thread1 = new Thread(runnable1,"スレッド1");
		Thread thread2 = new Thread(runnable2,"スレッド2");		
		System.out.println("マルチスレッド開始");
		thread1.start();
		thread2.start();
	}
}

class SampleRunnable1 implements Runnable{
	private int time = 0;
	
	public SampleRunnable1(int time){
		this.time = time;
	}
	@Override
	public void run(){
		Thread thread = Thread.currentThread();
		try{
			System.out.println(thread.getName() + ":開始");
			Thread.sleep(this.time);
		}catch (InterruptedException e){
			System.out.println(thread.getName() + e.getMessage());
		} finally{
			System.out.println(thread.getName() + ":終了");
		}
	}
}
