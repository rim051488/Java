public class Ex431{
    public static void main(String[] args){
    	QueCreateMsg2 createMsg = new QueCreateMsg2();
    	System.out.println(createMsg.thankMsg("�O�Y"));
    }
}

class QueCreateMsg2{
	    	String msg = "���܁A�����p���肪�Ƃ��������܂���";
    public String thankMsg(String name){
    	return name + this.msg;
    }
}