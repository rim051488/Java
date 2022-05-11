public class Ex0207{
    public static void main(String[] args){
        QueBranch8 myBranch1 = new QueBranch8(20,110);
        QueBranch8 myBranch2 = new QueBranch8(30,100);
        QueBranch8 myBranch3 = new QueBranch8(40,90);
        myBranch1.func();
    	myBranch2.func();
    	myBranch3.func();
    }
}

class QueBranch8{
	int num1,num2;
	QueBranch8(int in1,in2){
		num1 = in1;
		num2 = in2;
	}
    public void func(){
        if (num1>=30&&num2>=100){
            System.out.println("œ›œ›œ›");
        }else{
            System.out.println("¡ ¡ ¡ ");
        }
    }
}