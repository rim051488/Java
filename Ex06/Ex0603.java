import java.util.Scanner;
public class Ex0603{
	public static void main(String[] args){
		MyBuddy buddy = new MyBuddy();
		int enemyHP = 150;
		int playerHP = 100;
		int finishtrun = 0;
		System.out.println(buddy.getGreeting());
		System.out.println("あなたの名前を入力してください");
		Scanner scanner = new Scanner (System.in);
		String name = scanner.nextLine();
		System.out.println(name+"です。よろしく");
		System.out.println(buddy.getTraining(name));
		System.out.println();
		while (enemyHP > 0 && playerHP > 0){
			System.out.println(name + "の攻撃"+(++finishtrun)+"回目");
			if ((int)(Math.random() * 5) ==0) {
				enemyHP -= buddy.PlayerFinish();
			}else{
				enemyHP -= buddy.PlayerAttack();
			}
			System.out.println(buddy.getName() + "の体力：残り"+enemyHP+"HP");
			System.out.println();
			if (enemyHP > 0){
				System.out.println(buddy.getName()+"の攻撃"+(finishtrun)+"回目");
				if ((int)(Math.random() * 10) ==0) {
					playerHP -= buddy.finish();
				}else{
					playerHP -= buddy.attack();
				}
				System.out.println(name + "の体力：残り"+playerHP+"HP");
				System.out.println();
			}
			if (playerHP <= 0){
				System.out.println(buddy.getFailure());
				System.out.println("わかりました\nまた力をつけて挑戦します");
				System.out.println();
				if (buddy.question() == "1"){
					enemyHP = 120;
					playerHP = 100;
					finishtrun = 0;
				}
			}else if(enemyHP <= 0){
				System.out.println(buddy.getSuccess());
				System.out.println("はい、魔王を倒してきます");
			}
		}
    	Profile.Number();
    	Profile.Name();		
	}
}