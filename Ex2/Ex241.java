import java.util.Scanner;
public class Ex241{
    public static void main(String[] args){
        QueBranch5 Branch = new QueBranch5();
        Branch.func();
    }
}

class QueBranch5{
	public void func(){
		int height = 120;
		int weight = 20;
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