public class Ex431{
    public static void main(String[] args){
    	QueCreateMsg2 createMsg = new QueCreateMsg2();
    	System.out.println(createMsg.thankMsg("三浦"));
    }
}

class QueCreateMsg2{
	    	String msg = "さま、ご利用ありがとうございました";
    public String thankMsg(String name){
    	return name + this.msg;
    }
}