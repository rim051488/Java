public class Ex0604{
	public static void main(String[] args){
		SecureMyBuddy buddy;

		buddy = new SecureMyBuddy();

		if (!buddy.verify()){
			System.out.println("パスワードが入力されていません");
			System.out.println("パスワードは"+buddy.getPassword()+"です");
		}
		System.out.println(buddy.getName());

		if (buddy.verify("asojava")){
			System.out.println("パスワードが一致しました");
			System.out.println("パスワードは"+buddy.getPassword()+"です");
		}else{
			System.out.println("パスワードが適合していません");
			System.out.println("パスワードは"+buddy.getPassword()+"です");
		}
		System.out.println(buddy.getName());

		Profile.Number();
		Profile.Name();
	}
}
