public class Chara2 extends Chara0{
	@Override
	public String getName(){
		String str = "私の名前は"+super.getName() +"です。" ;
		return str;
	}
	public String getAge(){
		String str = "私の年齢は"+super.getAge() +"歳です" ;
		return str;
	}
	public String getRace(){
		String str ="私の種族は"+super.getRace() +"です。" ;
		return str;
	}
	public String getJob(){
		String str = "私の職業は"+super.getJob() +"です。" ;
		return str;
	}
}