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
			return "����" + getName() + "���I���񂽂̖��O�́H";
		case 1:
			return "���V��" + getName() + "����B���O����́H";
		case 2:
			return "�킽������" + getName() + "�ł���B���Ȃ��l�́H";
		case 3:
			return "�l�̖��O��" + getName() + "�ł��B�N�̖��O�́H";
		case 4:
			return "���̖��O��" + getName() + "��B���Ȃ��́H";
		default:
			return "�c" + getName()+"���c";
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