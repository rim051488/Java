import java.util.Scanner;
public class Ex0205{
    public static void main(String[] args){
    	System.out.print("��Y�N��");
        QueBranch5 myBranch1 = new QueBranch5(180,90);
        myBranch1.func();
    	System.out.print("�Ԏq�����");
        QueBranch5 myBranch2 = new QueBranch5(90,40);
        myBranch2.func();
    	System.out.print("�۔��N��");
        QueBranch5 myBranch3 = new QueBranch5(190,160);
        myBranch3.func();
    	QueBranch5 myBranch4 = new QueBranch5();
    	myBranch4.func2();
    }
}

class QueBranch5{
	int height,weight;
	QueBranch5(){
	}
	QueBranch5(int in1,int in2){
		height = in1;
		weight = in2;
	}
    public void func(){
    	if (height <= 100){
            System.out.println("�g��������܂���");
        }else{
            if(weight >= 150){
            System.out.println("�d�ʃI�[�o�[�ł�");
            }else{
            System.out.println("����ł��܂�");
            }
        }
    }
	    public void func2(){
		System.out.println("���Ȃ��̐g����?");
		Scanner hei = new Scanner(System.in);
		if (hei.hasNextInt()){
        	height = Integer.parseInt(hei.nextLine());
			System.out.println(height+"cm");
		}
		System.out.println("���Ȃ��̑̏d��?");
		Scanner wei = new Scanner(System.in);
		if (wei.hasNextInt()){
        	weight = Integer.parseInt(wei.nextLine());
			System.out.println(weight+"kg");
		}
	    System.out.print("���Ȃ���");
	    	    	if (height <= 100){
            System.out.println("�g��������܂���");
        }else{
            if(weight >= 150){
            System.out.println("�d�ʃI�[�o�[�ł�");
            }else{
            System.out.println("����ł��܂�");
            }
        }
    }

}