public class Ex261{
    public static void main(String[] args){
        QueBranch9 Branch = new QueBranch9();
        Branch.func();
    }
}

class QueBranch9{
	int colorNo;
    public void func(){
    	String name = "England";
        switch(name)
        {
            case "Japan":
        	System.out.println("���{");
            break;
            case "America":
        	System.out.println("�A�����J");
            break;
            case "China":
        	System.out.println("����");
            break;
        default:
        	System.out.println("�Y���Ȃ�");
        }
    }
}