public class Ex531{
    public static void main(String[] args){
    	QueStudent1 studentA = new QueStudent1("高野",2);
    	   QueStudent1 studentB = new QueStudent1("三浦");
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
		System.out.println(this.name + ":"+this.grade + "年生");
	}
}
