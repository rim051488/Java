public class Ex0307{
    public static void main(String[] args){
    	int[][] array = {{1,0,0,1,0,0},{1,1,1,1,1,1,1,0},{1,0,0,0,1,1,0}};
    	CountUp6[] inst = new CountUp6[3];
    	for (int i = 0;i<array.length ;i++)
    	{
    		inst[i] = new CountUp6(array[i]);
    	}
    	for (int i = 0;i<inst.length;i++)
    	{
    		inst[i].func();
    	}
    }
}

