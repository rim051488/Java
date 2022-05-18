public class Ex0302{
    public static void main(String[] args){
        CountUp2 countUp2 = new CountUp2();
    	countUp2.func();
    }
}

class CountUp2{
	int[] oct;
	CountUp2(){
		oct = new int[]{7,1,3};
	}
    public void func(){
    	int index = 0;
    	while (index<oct.length){
    		System.out.print(oct[index]);
    		index++;
    	}
    }
}