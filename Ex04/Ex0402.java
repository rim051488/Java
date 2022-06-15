public class Ex0402{
    public static void main(String[] args){
    	Overload1 over = new Overload1();
    	over.add(3,4);
    	over.add(0.5,0.25);
    	over.add("ASO","ポップカルチャー");
		over.add(3,4,5);
    	over.add(0.125,0.25,0.375);
    	over.add("ASO","ポップカルチャー","専門学校");
    	Profile.Number();
    	Profile.Name();
    }
}

class Overload1{
	public void add(int arg1,int arg2){
		System.out.println(arg1 + "、" + arg2);
	}
	public void add(double arg1,double arg2){
		System.out.println(arg1 + "、" + arg2);
	}
	public void add(String arg1,String arg2){
		System.out.println(arg1 + "、" + arg2);
	}
	public void add(int arg1,int arg2,int arg3){
		System.out.println(arg1 + "、" + arg2+ "、" + arg3);
	}
	public void add(double arg1,double arg2,double arg3){
		System.out.println(arg1 + "、" + arg2+ "、" + arg3);
	}
	public void add(String arg1,String arg2,String arg3){
		System.out.println(arg1 + "、" + arg2+ "、" + arg3);
	}
}

