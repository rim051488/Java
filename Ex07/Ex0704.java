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
		System.out.println("���d�b���肪�Ƃ��������܂��B");
	}	
}

interface QueIFCall{
	 void call();
}
