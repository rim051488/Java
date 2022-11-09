public class StringOp4{
	private String str1;
	private char[] char3;
	public StringOp4(String str1,char[] char3){
		this.str1 = str1;
		this.char3 = char3;
	}
	public void func(){
		char[] char1 = str1.toCharArray();
		for (char c : char1){
			System.out.println(c);
		}
		char char2 = str1.charAt(1);
		System.out.println("char2:"+char2);
		String str2 = String.valueOf(char2);
		System.out.println("str2:"+str2);
		String str3 = String.valueOf(char3);
		System.out.println("str3:"+str3);
	}
}
