public class Ex331{
    public static void main(String[] args){
        QueLoop2 loop = new QueLoop2();
    	loop.func();
    }
}

class QueLoop2{
    public void func(){
    	String[] rank = {"èº","í|","î~"};
    	for (int i = 0;i< rank.length;i++){
    	System.out.println(rank[i]);
    	}
    }
}