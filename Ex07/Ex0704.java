public class Ex0704{
	public static void main(String[] args){
		QuePhone phone = new QuePhone();
		phone.call();
		Profile.Number();
		Profile.Name();
	}
}

class QuePhone implements QueIFCall{
	@Override
	public void call(){
		System.out.println("お電話ありがとうございます。");
	}	
}

interface QueIFCall{
	 void call();
}
