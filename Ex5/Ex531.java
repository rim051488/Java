public class Ex531{
    public static void main(String[] args){
    	QueStudent1 studentA = new QueStudent1("‚–ì",2);
    	   QueStudent1 studentB = new QueStudent1("O‰Y");
    	studentA.studentInfo();
    	studentB.studentInfo();
    }
}

class QueStudent1{
	private String name;
	private int grade;
		public QueStudent1(String name){
			this(name,1);
		}

	public QueStudent1(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	public void studentInfo(){
		System.out.println(this.name + ":"+this.grade + "”N¶");
	}
}
