public class Ex0104{
	public static void main(String[] args){
		Profile profile = new Profile();
		profile.myCourse();
		profile.myGrade();
		profile.myName();
		profile.myPersonal();
	}
}

class Profile{
	String course = "�Q�[���ECG�E�A�j����U";
	String grade = "3";
	String name = "�i�y �S";
	String personal = "�O���u���ƌ��_�AFPS�S�ʂ��D���Ȑl�ł�";
	public void myCourse(){
		System.out.println("����"+course+"�Ȃɏ������Ă��܂��B");
	}
	public void myGrade(){
		System.out.println("����"+grade+"�N���ł��B");
	}
	public void myName(){
		System.out.println("���̖��O��"+name+"�ł��B");
	}
	public void myPersonal(){
		System.out.println("����"+personal);
	}
}