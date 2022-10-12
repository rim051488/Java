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
		System.out.println("送るよー");
	}
	@Override
	public void receive(){
		System.out.println("受け取ったよー");
	}
	@Override
	public void play(){
		System.out.println("曲を聴いてるよー");
	}
	@Override
	public void stop(){
		System.out.println("曲を止めたよー");
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
