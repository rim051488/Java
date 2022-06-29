import player.Player5;
public class Ex0505{
    public static void main(String[] args){
    	Player5 player[] = new Player5[6];
    	String name[] = {"ç≤ì°","óÈñÿ","çÇã¥","ìcíÜ","à…ì°","ìnï”"};
    	int height[] = {1400,150,182,177,165,159};
    	int weight[] = {39,45,96,78,69,560};
    	for (int i = 0; i < player.length;i++){
    		switch(name[i]){
    		case "ç≤ì°":
    			player[i] = new Player5();
    			break;
    		case "ìnï”":
    			player[i] = new Player5(name[i]);
    			break;
    		case "çÇã¥":
    			player[i] = new Player5(name[i],height[i],weight[i]-15);
    			break;
    		case "à…ì°":
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
