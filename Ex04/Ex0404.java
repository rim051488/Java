public class Ex0404{
    public static void main(String[] args){
    	Generics2 arg = new Generics2();
    	arg.add(3,4);
    	arg.add(0.5,0.25);
    	arg.add("ASO","ポップカルチャー");
		arg.add(3,4,5);
    	arg.add(0.125,0.25,0.375);
    	arg.add("ASO","ポップカルチャー","専門学校");
    	Profile.Number();
    	Profile.Name();
    }
}

class Generics2{
	public <T> void add(T arg1,T arg2){
		System.out.println("No1 = "+arg1.toString() + "、No2 = " + arg2.toString());
	}
	public <T> void add(T arg1,T arg2,T arg3){
		System.out.println("No1 = "+arg1.toString() + "、No2 = " + arg2.toString() + "、No3 = " + arg3.toString());
	}
}

