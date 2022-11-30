class Item{
	String code;
	
	public Item(String code){
		this.code = code;
	}
	
	public String getCode(){
		return code;
	}
}

public class Q15{
	public static void main (String[] args){
		Item items[] = {new Item("A100"),
				new Item("B202")};
		for (Item item : items){
			System.out.println(item.getCode());
	}
		Profile.Number();
		Profile.Name();
	}
}
