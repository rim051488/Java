public class StringOp3{
	private StringBuilder str;
	public StringOp3(StringBuilder str){
		this.str = str;
	}
	public void func(){
		str.append("りんご");
		str.append(" ");
		str.append("バナナ");
		str.append(" ");
		str.append("いちご");
		System.out.println(str.toString());
	}
}
