public class Ex441{
    public static void main(String[] args){
    	QueCreateMsg2 createMsg = new QueCreateMsg2();
    	createMsg.thankMsg("終了");
    }
}

class QueCreateMsg2{
	   static final String PREFIX_MSG = "タスク状況：";
    public void thankMsg(String name){
    	System.out.println( PREFIX_MSG + name );
    }
}