import java.util.Scanner;
public class Ex0603{
	public static void main(String[] args){
		MyBuddy buddy = new MyBuddy();
		int enemyHP = 150;
		int playerHP = 100;
		int finishtrun = 0;
		System.out.println(buddy.getGreeting());
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		Scanner scanner = new Scanner (System.in);
		String name = scanner.nextLine();
		System.out.println(name+"�ł��B��낵��");
		System.out.println(buddy.getTraining(name));
		System.out.println();
		while (enemyHP > 0 && playerHP > 0){
			System.out.println(name + "�̍U��"+(++finishtrun)+"���");
			if ((int)(Math.random() * 5) ==0) {
				enemyHP -= buddy.PlayerFinish();
			}else{
				enemyHP -= buddy.PlayerAttack();
			}
			System.out.println(buddy.getName() + "�̗̑́F�c��"+enemyHP+"HP");
			System.out.println();
			if (enemyHP > 0){
				System.out.println(buddy.getName()+"�̍U��"+(finishtrun)+"���");
				if ((int)(Math.random() * 10) ==0) {
					playerHP -= buddy.finish();
				}else{
					playerHP -= buddy.attack();
				}
				System.out.println(name + "�̗̑́F�c��"+playerHP+"HP");
				System.out.println();
			}
			if (playerHP <= 0){
				System.out.println(buddy.getFailure());
				System.out.println("�킩��܂���\n�܂��͂����Ē��킵�܂�");
				System.out.println();
				if (buddy.question() == "1"){
					enemyHP = 120;
					playerHP = 100;
					finishtrun = 0;
				}
			}else if(enemyHP <= 0){
				System.out.println(buddy.getSuccess());
				System.out.println("�͂��A������|���Ă��܂�");
			}
		}
    	Profile.Number();
    	Profile.Name();		
	}
}