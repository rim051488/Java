class Code{
	int code;
	
	Code(){
		this.code = 1;
	}
}

class ExcessCode extends Code{
	public int getCode(){
		return code + 64;
	}
}

public class Q19{
	public static void main (String[] args){
		ExcessCode code = new ExcessCode();
		System.out.println(code.getCode());
		Profile.Number();
		Profile.Name();
	}
}
