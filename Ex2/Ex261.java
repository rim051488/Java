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
        	System.out.println("日本");
            break;
            case "America":
        	System.out.println("アメリカ");
            break;
            case "China":
        	System.out.println("中国");
            break;
        default:
        	System.out.println("該当なし");
        }
    }
}