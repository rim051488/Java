public class Ex0210{
    public static void main(string[] args){
        Branch9 branch = new Branch9();
        branch.func();
    }
}

public class Branch9{
    public void func(){
    	int num = 2;
    	switch(num){
            case 3:
            case 4:
            case 5:
                System.out.println("�t");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("��");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�H");
                break;
            case 12:
            case 1:
            case 2:
            System.out.println("�~");
        }
    }
}