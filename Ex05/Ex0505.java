import player.Player5;
public class Ex0505{
    public static void main(String[] args){
    	Player5 player[] = new Player5[6];
    	String name[] = {"����","���","����","�c��","�ɓ�","�n��"};
    	int height[] = {1400,150,182,177,165,159};
    	int weight[] = {39,45,96,78,69,560};
    	for (int i = 0; i < player.length;i++){
    		switch(name[i]){
    		case "����":
    			player[i] = new Player5();
    			break;
    		case "�n��":
    			player[i] = new Player5(name[i]);
    			break;
    		case "����":
    			player[i] = new Player5(name[i],height[i],weight[i]-15);
    			break;
    		case "�ɓ�":
    			player[i] = new Player5(name[i],height[i]+6,weight[i]);
    			break;
    		default:
    			player[i] = new Player5(name[i],height[i],weight[i]);
    			break;
    		}
    		player[i].calcBmi();
    		player[i].print();
    	}
        Profile.Number();
    	Profile.Name();
    }
}
