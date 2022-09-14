public class Ex262{
    public static void main(String[] args){
        Branch9 Branch = new Branch9();
        Branch.func();
    }
}

class Branch9{
	int colorNo;
    public void func(){
    	int num = 2;
        switch(num)
        {
            case 3:
            case 4:
            case 5:
        	System.out.println("èt");
            break;
            case 6:
            case 7:
            case 8:
        	System.out.println("âƒ");
            break;
            case 9:
            case 10:
            case 11:
        	System.out.println("èH");
            break;
            case 1:
            case 2:
            case 12:
        	System.out.println("ì~");
            break;
       default:
        	System.out.println("another");
        }
    }
}