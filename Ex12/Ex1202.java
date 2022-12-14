public class Ex1202{
	public static void main (String[] args){
		SampleThread2 thread1 = new SampleThread2("�X���b�h1",3000);
		SampleThread2 thread2 = new SampleThread2("�X���b�h2",1000);		
		System.out.println("�}���`�X���b�h�J�n");
		thread1.start();
		thread2.start();
	}
}

class SampleThread2 extends Thread{
	private int time = 0;
	
	public SampleThread2(String name,int time){
		super(name);
		this.time = time;
	}
	@Override
	public void run(){
		try{
			System.out.println(this.getName() + ":�J�n");
			Thread.sleep(this.time);
		}catch (InterruptedException e){
			System.out.println(this.getName() + e.getMessage());
		} finally{
			System.out.println(this.getName() + ":�I��");
		}
	}
}
