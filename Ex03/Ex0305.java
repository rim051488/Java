public class Ex0305{
    public static void main(String[] args){
        CountUp5 countUp = new CountUp5();
    	countUp.func();
    }
}

class CountUp5{
	int[] bin;
	CountUp5(){
		bin = new int[]{1,0,0,0,1};
	}
    public void func(){
    	for (int i : bin){
    	System.out.print(i);
    	}
    }
}