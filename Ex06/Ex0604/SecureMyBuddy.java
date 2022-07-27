public class SecureMyBuddy
	String passwords[] = {"asojava","aso","asojava","Asojava","asojava"};
	String myPassword;
	boolean check=false;

	public SecureMyBuddy(){

	}
	public void setPassword(){

	}
	public void setPassword(String password){
		myPassword = password;
	}
	public String getPassword(){
		if (check) {
			return myPassword;
		}
		return "•s–¾";
	}
	public boolean verify(String password){


	}
	public boolean verify(){
		return check;
	}
	@Override
	public String getName(){





	}
}
