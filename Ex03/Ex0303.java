public class Ex0303{
    public static void main(String[] args){
    	int[] array1 = new int[]{1,0,0,1,0,0};
    	int[] array2;
    	array2 = new int[]{1,1,1,1,1,1,1,0};
    	CountUp3 countUp1 = new CountUp3(array1);
    	CountUp3 countUp2 = new CountUp3(array2);
    	CountUp3 countUp3 = new CountUp3(new int[] {1,0,0,0,1,1,0});
    	countUp1.func();
    	countUp2.func();
    	countUp3.func();
    }
}

class CountUp3{
	int[] bin;
	CountUp3(int[] b){
		bin = b;
	}
    public void func(){
    	int n = 0;
    	int a = 0;
    	System.out.print("2êiêî=");
    	for (int i = 0;i< bin.length;i++){
    		System.out.print(bin[i]);
    		a = a * 2 + bin[i];
    	}
    	System.out.println("	10êiêî=" + a);
    }
}