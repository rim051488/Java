public class Ex0604{
	public static void main(String[] args){
		SecureMyBuddy buddy;

		buddy = new 

		if (!buddy.verify()){
			System.out.println("�p�X���[�h�����͂���Ă��܂���");
			System.out.println("�p�X���[�h��"+buddy.getPassword()+"�ł�");
		}
		System.out.println(

		if (buddy.verify("asojava")){
			System.out.println("�p�X���[�h����v���܂���");
			System.out.println("�p�X���[�h��"+buddy.getPassword()+"�ł�");
		}else{
			System.out.println("�p�X���[�h���K�����Ă��܂���");
			System.out.println("�p�X���[�h��"+buddy.getPassword()+"�ł�");
		}
		System.out.println(

		Profile.Number();
		Profile.Name();
	}
}
