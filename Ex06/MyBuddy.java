public class MyBuddy extends AbstractBuddy{
	MyBuddy(){
		int number = (int)(Math.random()*DefBuddyCnt);
		setBuddyNumber(number);
	}
	public String getTraining(String name){
		int number = getBuddyNumber();
		switch(number){
		case 0:
			return name + "�A���񂽂̌P�����͂��߂悤\n����|������P���I�����B";
		case 1:
			return name + "�A���O����̌P�����͂��߂悤\n���V��|������P���I������B";
		case 2:
			return name + "�l�A���Ȃ��l�̌P�����͂��߂܂��傤\n�킽������|������P���I���ł���B";
		case 3:
			return name + "�N�A�N�̌P�����n�߂悤\n�l��|������P���I������B";
		case 4:
			return name + "�A���Ȃ��̌P�����͂��߂܂��傤\n����|������P���I���ł��B";
		default:
			return name + "�P�����͂��߂�\n�c";
		}
	}
		public String getSuccess(){
		int number = getBuddyNumber();
		switch(number){
		case 0:
			return "���ꂾ��������̂Ȃ�S�z�͂Ȃ���\n�撣���Ė�����|���Ă����I";
		case 1:
			return "���O����̏�������\n���O����Ȃ疂���ɏ��Ă邩�������B�撣���Ă���̂���I";
		case 2:
			return "���Ȃ��l�Ȃ疂����|����Ǝv���̂ł���\n�A�Ȃ��牞�����Ă��܂���";
		case 3:
			return "���̖l��|�������疂����|����Ǝv����\n�撣���Ă��Ă�";
		case 4:
			return "���ꂾ���ł���̂Ȃ�S�z�Ȃ��ł���\n���̗͂Ŗ�����|���Ă�������";
		default:
			return"�c������|���Ă���";
		}
	}
	public String getFailure(){
		int number = getBuddyNumber();
		switch(number){
		case 0:
			return "����ł͖����ɂ͏��Ă�\n�C�s���Ȃ�����";
		case 1:
			return "���̘V���ڂ��|���Ȃ��Ȃ疂���͓|���Ȃ��̂���\n�C�s���Ă����Ȃ̂���";
		case 2:
			return "�͕s���ł���\n�����Ɨ͂����Ă���̂ł���";
		case 3:
			return "���ꂶ�Ⴀ�����͓|���Ȃ���\n�C�s���Ȃ����ł���";
		case 4:
			return "����|���Ȃ��Ȃ疂���͓|���Ȃ���\n�����Ɨ͂����Ă��Ă�";
		default:
			return "�͕s����";
		}
	}
	public int PlayerAttack(){
		int damage = (int)(Math.random() *10+10);
		System.out.println("�����܂��I");
		return damage;
	}
		public int PlayerFinish(){
		int damage = (int)(Math.random() * 50+50);
		System.out.println("�^�E���ߎa��I");
		return damage;
	}
	@Override
	public String getGreeting(){
		int number = getBuddyNumber();
		switch(number){
		case 0:
			return "�����́A���̉�" + getName() + "���I���񂽂̖��O�́H";
		case 1:
			return "�����́A���̃��V" + getName() + "����B���O����́H";
		case 2:
			return "�����́A�킽����" + getName() + "�ł���B���Ȃ��l�́H";
		case 3:
			return "�����́A�l" + getName() + "�ł��B�N�̖��O�́H";
		case 4:
			return "�����́A��" + getName() + "��B���Ȃ��́H";
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