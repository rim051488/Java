public class Ex0706{
	public static void main(String[] args){
		SmartPhone phone = new SmartPhone();
		phone.send();
		phone.receive();
		phone.play();
		phone.stop();
		Profile.Number();
		Profile.Name();
	}
}

class SmartPhone implements QueIFSmartPhone{
	@Override
	public void send(){
		System.out.println("�����[");
	}
	@Override
	public void receive(){
		System.out.println("�󂯎������[");
	}
	@Override
	public void play(){
		System.out.println("�Ȃ𒮂��Ă��[");
	}
	@Override
	public void stop(){
		System.out.println("�Ȃ��~�߂���[");
	}
}

interface QueIFSmartPhone extends QueIFEmail,QueIFMusic{
}

interface QueIFEmail{
	void send();
	void receive();
}

interface QueIFMusic{
	void play();
	void stop();
}
