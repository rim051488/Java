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