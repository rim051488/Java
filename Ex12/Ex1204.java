import java.util.Scanner;
public class Ex1204{
	public static void main (String[] args){
		SampleThread3 input = new SampleThread3("���͗p�X���b�h");
		SampleThread2 thread1 = new SampleThread2("�X���b�h1",5000);
		SampleThread2 thread2 = new SampleThread2("�X���b�h2",1000);
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
		System.out.println("���͂��Ă�������");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("���͂��󂯕t���܂����F"+str);
	}
}
