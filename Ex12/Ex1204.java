import java.util.Scanner;
public class Ex1204{
	public static void main (String[] args){
		SampleThread3 input = new SampleThread3("入力用スレッド");
		SampleThread2 thread1 = new SampleThread2("スレッド1",5000);
		SampleThread2 thread2 = new SampleThread2("スレッド2",1000);
		input.start();
		thread1.start();
		try{
			input.join();
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		thread2.start();
	}
}

class SampleThread3 extends Thread{
	public SampleThread3(String name){
		super(name);
	}
	@Override
	public void run(){
		System.out.println("入力してください");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("入力を受け付けました："+str);
	}
}
