public class Ex0306{
    public static void main(String[] args){
    	int[] array1 = new int[]{1,0,0,1,0,0};
    	int[] array2;
    	array2 = new int[]{1,1,1,1,1,1,1,0};
    	CountUp6 countUp1 = new CountUp6(array1);
    	CountUp6 countUp2 = new CountUp6(array2);
    	CountUp6 countUp3 = new CountUp6(new int[] {1,0,0,0,1,1,0});
    	countUp1.func();
    	countUp2.func();
    	countUp3.func();
    }
}

class CountUp6{
	int[] bin;
	CountUp6(int[] b){
		bin = b;
	}
    public void func(){
    	int n = 0;
    	int a = 0;
    	System.out.print("2êiêî=");
    	for (int i : bin){
    		System.out.print(i);
    		a = a * 2 + i;
    	}
    	System.out.println("	10êiêî=" + a);
    }
}