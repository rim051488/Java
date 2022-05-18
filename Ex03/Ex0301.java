public class Ex0301{
    public static void main(String[] args){
        CountUp1 countUp1 = new CountUp1();
    	countUp1.func();
    }
}

class CountUp1{
	int[] bin;
	CountUp1(){
		bin = new int[]{1,0,0,0,1};
	}
    public void func(){
    	int n = 0;
    	for (int i = 0;i< bin.length;i++){
    	System.out.print(bin[i]);
    	}
    }
}