public class Ex0209{
    public static void main(string[] args){
        QueBranch9 branch = new QueBranch9();
        branch.func();
    }
}

public class QueBranch9{
    public void func(){
    	String name = "England";
    	switch(name){
            case "japan":
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