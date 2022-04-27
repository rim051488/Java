import java.util.Scanner;
public class Ex0205{
    public static void main(String[] args){
    	System.out.print("一郎君は");
        QueBranch5 myBranch1 = new QueBranch5(180,90);
        myBranch1.func();
    	System.out.print("花子さんは");
        QueBranch5 myBranch2 = new QueBranch5(90,40);
        myBranch2.func();
    	System.out.print("丸尾君は");
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
            System.out.println("身長が足りません");
        }else{
            if(weight >= 150){
            System.out.println("重量オーバーです");
            }else{
            System.out.println("搭乗できます");
            }
        }
    }
	    public void func2(){
		System.out.println("あなたの身長は?");
		Scanner hei = new Scanner(System.in);
		if (hei.hasNextInt()){
        	height = Integer.parseInt(hei.nextLine());
			System.out.println(height+"cm");
		}
		System.out.println("あなたの体重は?");
		Scanner wei = new Scanner(System.in);
		if (wei.hasNextInt()){
        	weight = Integer.parseInt(wei.nextLine());
			System.out.println(weight+"kg");
		}
	    System.out.print("あなたは");
	    	    	if (height <= 100){
            System.out.println("身長が足りません");
        }else{
            if(weight >= 150){
            System.out.println("重量オーバーです");
            }else{
            System.out.println("搭乗できます");
            }
        }
    }

}