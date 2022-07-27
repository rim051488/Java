public class SecureMyBuddy extends MyBuddy{
	String passwords[] = {"asojava","aso","asojava","Asojava","asojava"};
	String myPassword;
	boolean check=false;

	public SecureMyBuddy(){
//		super(2);
		setPassword();
	}
	public void setPassword(){
		myPassword = passwords[getBuddyNumber()];
	}
	public void setPassword(String password){
		myPassword = password;
	}
	public String getPassword(){
		if (check) {
			return myPassword;
		}
		return "不明";
	}
	public boolean verify(String password){
		check = myPassword.equals(password);
		return verify();
	}
	public boolean verify(){
		return check;
	}
	@Override
	public String getName(){
		if (check){
			return "俺の名前は" + super.getName() + "だっ！！";
		}else{
			return "俺の名前は教えられん！！";
		}
	}
}
