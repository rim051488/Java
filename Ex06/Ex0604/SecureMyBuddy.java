public class SecureMyBuddy extends MyBuddy{
	String passwords[] = {"asojava","aso","asojava","Asojava","asojava"};
	String myPassword;
	boolean check=false;

	public SecureMyBuddy(){
//		super(2);
		setPassword();
	}
	public void setPassword(){
		set
	}
	public void setPassword(String password){
		myPassword = password;
	}
	public String getPassword(){
		if (check) {
			return myPassword;
		}
		return "�s��";
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
