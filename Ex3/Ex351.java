public class Ex351{
    public static void main(String[] args){
        QueLoop3 loop = new QueLoop3();
    	loop.func();
    }
}

class QueLoop3{
    public void func(){
		int num1 = 7;
    	int num2 = 1;
    	while (num2 <= 5){
    	System.out.println(num1 * num2);
    		num2++;
    	}
    }
}