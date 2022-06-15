public class Ex0401{
    public static void main(String[] args){
    	ExInstance1 inst1[] = new ExInstance1[6];
    	ExInstance2 inst2[] = new ExInstance2[6];
    	for(int i = 0;i<inst1.length;i++)
    	{
    		inst1[i] = new ExInstance1();
    	}
    	for(int i = 0;i<inst2.length;i++)
    	{
    		inst2[i] = new ExInstance2();
    	}
    	System.out.println();
    	for(int i = 0;i<inst1.length;i++)
    	{
    		System.out.println("inst["+i+"]は"+inst1[i].myNum+"番目のインスタンス");
    	}
    	System.out.println();
    	for(int i = 0;i<inst2.length;i++)
    	{
    		System.out.println("inst["+i+"]は"+inst2[i].myNum+"番目のインスタンス");
    	}
    	Profile.Number();
    	Profile.Name();
    }
}

class ExInstance1{
	int num=0;
	int myNum;
	ExInstance1(){
		myNum = ++num;
		System.out.println("私は"+myNum+"番目です");
	}
}

class ExInstance2{
	static int num=0;
	int myNum;
	ExInstance2(){
		myNum = ++num;
		System.out.println("拙者"+myNum+"番目でござる");
	}
}

