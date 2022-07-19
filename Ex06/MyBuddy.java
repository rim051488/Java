public class MyBuddy extends AbstractBuddy{
	MyBuddy(){
		int number = (int)(Math.random()*DefBuddyCnt);
		setBuddyNumber(number);
	}
	public String getTraining(String name){
		int number = getBuddyNumber();
		switch(number){
		case 0:
			return name + "、あんたの訓練をはじめよう\n俺を倒したら訓練終了だ。";
		case 1:
			return name + "、お前さんの訓練をはじめよう\nワシを倒したら訓練終了じゃ。";
		case 2:
			return name + "様、あなた様の訓練をはじめましょう\nわたくしを倒したら訓練終了ですわ。";
		case 3:
			return name + "君、君の訓練を始めよう\n僕を倒したら訓練終了だよ。";
		case 4:
			return name + "、あなたの訓練をはじめましょう\n私を倒したら訓練終了です。";
		default:
			return name + "訓練をはじめる\n…";
		}
	}
		public String getSuccess(){
		int number = getBuddyNumber();
		switch(number){
		case 0:
			return "これだけ動けるのなら心配はないな\n頑張って魔王を倒してこい！";
		case 1:
			return "お前さんの勝ちじゃ\nお前さんなら魔王に勝てるかもしれん。頑張ってくるのじゃ！";
		case 2:
			return "あなた様なら魔王を倒せると思うのですわ\n陰ながら応援していますわ";
		case 3:
			return "この僕を倒したから魔王を倒せると思うよ\n頑張ってきてね";
		case 4:
			return "これだけできるのなら心配ないですね\nその力で魔王を倒してください";
		default:
			return"…魔王を倒してこい";
		}
	}
	public String getFailure(){
		int number = getBuddyNumber();
		switch(number){
		case 0:
			return "これでは魔王には勝てん\n修行しなおしだ";
		case 1:
			return "この老いぼれを倒せないなら魔王は倒せないのじゃ\n修行してこいなのじゃ";
		case 2:
			return "力不足ですわ\nもっと力をつけてくるのですわ";
		case 3:
			return "これじゃあ魔王は倒せないよ\n修行しなおしですね";
		case 4:
			return "私を倒せないなら魔王は倒せないよ\nもっと力をつけてきてね";
		default:
			return "力不足だ";
		}
	}
	public int PlayerAttack(){
		int damage = (int)(Math.random() *10+10);
		System.out.println("いきます！");
		return damage;
	}
		public int PlayerFinish(){
		int damage = (int)(Math.random() * 50+50);
		System.out.println("真・溜め斬り！");
		return damage;
	}
	@Override
	public String getGreeting(){
		int number = getBuddyNumber();
		switch(number){
		case 0:
			return "教官は、この俺" + getName() + "だ！あんたの名前は？";
		case 1:
			return "教官は、このワシ" + getName() + "じゃ。お前さんは？";
		case 2:
			return "教官は、わたくし" + getName() + "ですわ。あなた様は？";
		case 3:
			return "教官は、僕" + getName() + "です。君の名前は？";
		case 4:
			return "教官は、私" + getName() + "よ。あなたは？";
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