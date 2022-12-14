public class Ex1203{
	public static void main (String[] args){
		SampleRunnable1 runnable1 = new SampleRunnable1(3000);
		SampleRunnable1 runnable2 = new SampleRunnable1(1000);		
		Thread thread1 = new Thread(runnable1,"�X���b�h1");
		Thread thread2 = new Thread(runnable2,"�X���b�h2");		
		System.out.println("�}���`�X���b�h�J�n");
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
			System.out.println(thread.getName() + ":�J�n");
			Thread.sleep(this.time);
		}catch (InterruptedException e){
			System.out.println(thread.getName() + e.getMessage());
		} finally{
			System.out.println(thread.getName() + ":�I��");
		}
	}
}
