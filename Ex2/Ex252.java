public class Ex252{
    public static void main(String[] args){
        QueBranch8 branch = new QueBranch8();
        branch.func();
    }
}

class QueBranch8{
    public void func(){
    	boolean student = true;
    	int age = 19;
        if (age >= 65){
            System.out.println("�V�j�A�����ł�");
        }else if(!student && age>=16 && age<=64){
            System.out.println("��ʗ����ł�");
        }else if(student || age>=7 && age<=15){
            System.out.println("�w�������ł�");
        }else{
           System.out.println("�����ł�");
        }
    }
}