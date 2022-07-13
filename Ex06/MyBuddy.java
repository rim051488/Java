public class MyBuddy extends AbstractBuddy{
	MyBuddy(){
		int number = (int)(Math.random()*DefBuddyCnt);
		setBuddyNumber(number);
	}
	@Override
	public String getGreeting(){
		int number = getBuddyNumber();
		switch(number){
		case 0:
			return "俺は" + getName() + "だ！あんたの名前は？";
		case 1:
			return "ワシは" + getName() + "じゃ。お前さんは？";
		case 2:
			return "わたくしは" + getName() + "ですわ。あなた様は？";
		case 3:
			return "僕の名前は" + getName() + "です。君の名前は？";
		case 4:
			return "私の名前は" + getName() + "よ。あなたは？";
		default:
			return "…" + getName()+"だ…";
		}
	}
	@Override
	public int attack(){
		int damage = (int)(Math.random() *10+10);
		System.out.println(getVoice1());
		return damage;
	}
	@Override
	public int finish(){
		int damage = (int)(Math.random() * 50+50);
		System.out.println(getVoice2());
		return damage;
	}
}