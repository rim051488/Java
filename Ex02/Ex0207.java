public class Ex0207{
   	public static void main(String[] args){
        QueBranch7 branch = new QueBranch7();
        branch.func();
    }
}

class QueBranch7{
    public void func(){
    	int num1 = 40;
    	int num2 = 110;
        if (num1>=30&&num2>=100){
            System.out.println("œ›œ›œ›");
        }else{
            System.out.println("¡ ¡ ¡ ");
        }
    }
}