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
	String course = "ゲーム・CG・アニメ専攻";
	String grade = "3";
	String name = "永冨 心";
	String personal = "グラブルと原神、FPS全般が好きな人です";
	public void myCourse(){
		System.out.println("私は"+course+"科に所属しています。");
	}
	public void myGrade(){
		System.out.println("私は"+grade+"年生です。");
	}
	public void myName(){
		System.out.println("私の名前は"+name+"です。");
	}
	public void myPersonal(){
		System.out.println("私は"+personal);
	}
}