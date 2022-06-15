public class Ex0403{
    public static void main(String[] args){
    	Generics1<Integer> arg1 = new Generics1<> (3,4);
    	arg1.add();
    	Generics1<Double> arg2 = new Generics1<> (0.5,0.25);
    	arg2.add();
    	Generics1<String> arg3 = new Generics1<> ("ASO","ポップカルチャー");
    	arg3.add();
    	Generics1<Integer> arg4 = new Generics1<> (3,4,5);
    	arg4.add();
    	Generics1<Double> arg5 = new Generics1<> (0.125,0.25,0.375);
    	arg5.add();
    	Generics1<String> arg6 = new Generics1<> ("ASO","ポップカルチャー","専門学校");
    	arg6.add();
    	Profile.Number();
    	Profile.Name();
    }
}

class Generics1<T>{
	T arg1,arg2,arg3;
	int argCnt;
	Generics1(T arg1,T arg2){
		this.arg1 = arg1;
		this.arg2 = arg2;
		argCnt = 2;
	}
	Generics1(T arg1,T arg2,T arg3){
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.arg3 = arg3;
		argCnt = 3;
	}
	public void add(){
		if (argCnt==2){
			System.out.println(arg1.toString() + "、" + arg2.toString());
		}
		if (argCnt==3){
			System.out.println(arg1.toString() + "、" + arg2.toString()+ "、" + arg3.toString());
		}
	}
}
