import java.util.Scanner;
public class Ex0209{
    public static void main(String[] args){
        QueBranch9 Branch = new QueBranch9();
        Branch.selectColor();
    	Branch.displayColor();
    }
}

class QueBranch9{
	int colorNo;
    public void selectColor(){
        System.out.print("Red�͎g�p���܂����H(Y/N)");
        Scanner r = new Scanner (System.in);
        String red = r.nextLine();
        System.out.print("Green�͎g�p���܂����H(Y/N)");
        Scanner g = new Scanner (System.in);
        String Green = g.nextLine();
        System.out.print("Blue�͎g�p���܂����H(Y/N)");
        Scanner b = new Scanner (System.in);
        String Blue = b.nextLine();
        switch(red)
        {
            case ("y"):
            case ("Y"):
            colorNo += 4;
            break;
            case ("n"):
            case ("N"):
            colorNo += 0;
            break;
            default:
            colorNo +=0;
        }
        switch(Green)
        {
            case ("y"):
            case ("Y"):
            colorNo += 2;
            break;
            case ("n"):
            case ("N"):
            colorNo += 0;
            break;
            default:
            colorNo +=0;
        }switch(Blue)
        {
            case ("y"):
            case ("Y"):
            colorNo += 1;
            break;
            case ("n"):
            case ("N"):
            colorNo += 0;
            break;
            default:
            colorNo +=0;
        }
    }
    public void displayColor(){
    	String red    = "\u001b[00;31m";
        String green  = "\u001b[00;32m";
        String yellow = "\u001b[00;33m";
        String purple = "\u001b[00;34m";
        String pink   = "\u001b[00;35m";
        String cyan   = "\u001b[00;36m";   
        String end    = "\u001b[00m";

        String[] names = new String[]{red,green,yellow,purple,pink,cyan};
        String color = "";
    	int i = 0;
        switch(colorNo){
            case 0:
            color = "�u���b�N";
        	i = 1;
            break;
            case 1:
            color = "�u���[";
        	i = 1;
             break;
            case 2:
            color = "�O���[��";
        	i = 1;
            break;
            case 3:
            color = "�V�A��";
        	i = 1;
             break;
            case 4:
            color = "���b�h";
        	i = 1;
             break;
            case 5:
            color = "�}�[���^";
         	i = 1;
            break;
            case 6:
            color = "�C�G���[";
        	i = 1;
             break;
            case 7:
            color = "�z���C�g";
        	i = 1;
             break;
        }
        System.out.println(names[i]+"���Ȃ��̑I�������F��"+color+"�ł�"+end);
    }
}