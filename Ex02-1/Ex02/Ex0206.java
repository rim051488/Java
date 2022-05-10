import java.util.Scanner;
public class Ex0206{
    public static void main(String[] args){
    	System.out.print("��Y�N��");
        QueBranch6 myBranch1 = new QueBranch6("��Y�N",180,90);
        myBranch1.func();
    	System.out.print("�Ԏq�����");
        QueBranch6 myBranch2 = new QueBranch6("�Ԏq����",90,40);
        myBranch2.func();
    	System.out.print("�۔��N��");
        QueBranch6 myBranch3 = new QueBranch6("�۔��N",190,160);
        myBranch3.func();
    }
}

class QueBranch6{
	int height,weight;
    String name; 
	QueBranch6(String na,int in1,int in2){
		name = na;
		height = in1;
		weight = in2;
	}
    public void func(){
    	if (height <= 100){
            System.out.println(name + "��" +"�g��������܂���");
        }else{
            if(weight >= 150){
            System.out.println(name + "��" +"�d�ʃI�[�o�[�ł�");
            }else{
            System.out.println(name + "��" +"��ł��܂�");
            }
        }
    }
}