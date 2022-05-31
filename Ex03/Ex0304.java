public class Ex0304{
    public static void main(String[] args){
    	int[] array1 = new int[]{1,0,7};
    	int[] array2;
    	array2 = new int[]{1,1,1,1,1,1,1,0};
    	CountUp4 countUp1 = new CountUp4(array1,8);
    	CountUp4 countUp2 = new CountUp4(array2,2);
    	CountUp4 countUp3 = new CountUp4(new int[] {3,1,3,0},4);
    	countUp1.func();
    	countUp2.func();
    	countUp3.func();
    }
}

class CountUp4{
	int[] number;
	int radix;
	CountUp4(int[] b,int r){
		number = b;
		radix = r;
	}
    public void func(){
    	int n = 0;
    	int a = 0;
    	System.out.print( radix+"êiêî=");
    	for (int i = 0;i< number.length;i++){
    		System.out.print(number[i]);
    		a = a * radix + number[i];
    	}
    	System.out.println("	10êiêî=" + a);
    }
}