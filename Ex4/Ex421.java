public class Ex421{
    public static void main(String[] args){
    	QueCreateMsg1 createMsg = new QueCreateMsg1();
    	createMsg.thankMsg("三浦");
    }
}

class QueCreateMsg1{
    public void thankMsg(String name){
    	System.out.println(name +"さま、ご利用ありがとうございました");
    }
}