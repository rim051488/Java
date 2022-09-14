public class Ex371{
    public static void main(String[] args){
        QueLoop7 loop = new QueLoop7();
    	loop.func();
    }
}

class QueLoop7{
    public void func(){
    	String[] number = {"ç≤ì°","çÇñÏ","å√êÏ","éOâY"};
    	for (String name : number){
    		if (name.equals("å√êÏ"))
    		{
    			continue;
    		}
    	System.out.println(name);
    	}
    }
}