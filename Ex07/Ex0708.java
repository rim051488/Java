public class Ex0708{
	public static void main(String[] args){
		QueSmartPhone phone = new QueSmartPhone();
		phone.send();
		phone.receive();
		phone.call();
		Profile.Number();
		Profile.Name();
	}
}

class QueSmartPhone extends QuePhoneCore implements QueIFEmail{
	@Override
	public void send(){
		System.out.println("���[���𑗂��[");
	}
	@Override
	public void receive(){
		System.out.println("���[�����󂯎������[");
	}
}

class QuePhoneCore implements QueIFCall{
	private String num = "08012345678";
	
	public String getNum(){
		return num;
	}
	public void setNum(String num){
		this.num = num;
	}
	@Override
	public void call(){
		System.out.println("�d�b��������");
	}
}

