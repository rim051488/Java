public class Ex0202{
    public static void main(String[] args){
        QueBranch2 myBranch1 = new QueBranch2(8,7);
        myBranch1.func();
    	QueBranch2 myBranch2 = new QueBranch2(7,8);
        myBranch2.func();
    }
}

class QueBranch2{
	int a,b;
	QueBranch2(int in1,int in2){
		a = in1;
		b = in2;
	}
    public void func(){
        if (b<=a)
        {
            System.out.println("���茋�ʂ�true�ł�");
        }else{
        	System.out.println("���茋�ʂ�false�ł�");
        }
    }
}