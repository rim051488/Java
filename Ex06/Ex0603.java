import java.util.Scanner;
public class Ex0603{
	public static void main(String[] args){
		MyBuddy buddy = new MyBuddy();
		int enemyHP = 100;
		int finishtrun = 0;
		System.out.println(buddy.getGreeting());
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		Scanner scanner = new Scanner (System.in);
		String name = scanner.nextLine();
		System.out.println(name+"�ł��B��낵��");
		while (enemyHP > 0){
			System.out.println("�U��"+(++finishtrun)+"���");
			if ((int)(Math.random() * 5) ==0) {
				enemyHP -= buddy.finish();
			}else{
				enemyHP -= buddy.attack();
			}
			System.out.println("�G�̗̑́F�c��"+enemyHP+"HP");
		}
    	Profile.Number();
    	Profile.Name();		
	}
}