import java.util.Scanner;
public class Ex0206{
    public static void main(String[] args){
        QueBranch6 myBranch1 = new QueBranch6("一郎君",180,90);
        myBranch1.func();
        QueBranch6 myBranch2 = new QueBranch6("花子さん",90,40);
        myBranch2.func();
        QueBranch6 myBranch3 = new QueBranch6("丸尾君",190,160);
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
            System.out.println(name + "は" +"身長が足りません");
        }else{
            if(weight >= 150){
            System.out.println(name + "は" +"重量オーバーです");
            }else{
            System.out.println(name + "は" +"搭乗できます");
            }
        }
    }
}