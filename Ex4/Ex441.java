public class Ex441{
    public static void main(String[] args){
    	QueCreateMsg2 createMsg = new QueCreateMsg2();
    	createMsg.thankMsg("�I��");
    }
}

class QueCreateMsg2{
	   static final String PREFIX_MSG = "�^�X�N�󋵁F";
    public void thankMsg(String name){
    	System.out.println( PREFIX_MSG + name );
    }
}