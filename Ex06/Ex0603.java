import java.util.Scanner;
public class Ex0603{
	public static void main(String[] args){
		MyBuddy buddy = new MyBuddy();
		int enemyHP = 100;
		int finishtrun = 0;
		System.out.println(buddy.getGreeting());
		System.out.println("あなたの名前を入力してください");
		Scanner scanner = new Scanner (System.in);
		String name = scanner.nextLine();
		System.out.println(name+"です。よろしく");
		while (enemyHP > 0){
			System.out.println("攻撃"+(++finishtrun)+"回目");
			if ((int)(Math.random() * 5) ==0) {
				enemyHP -= buddy.finish();
			}else{
				enemyHP -= buddy.attack();
			}
			System.out.println("敵の体力：残り"+enemyHP+"HP");
		}
    	Profile.Number();
    	Profile.Name();		
	}
}