public class Ex0308{
    public static void main(String[] args){
    	CountUp8 countUp = new CountUp8();
    	countUp.makeArray();
    	countUp.setArray();
    	countUp.getArray();
    }
}

class CountUp8{
	int[][] rArray;
	public void makeArray()
	{
		int i;
		i = (int)(Math.random() * 7.0)+1;
		rArray = new int[i][];
		for (int a = 0;a <rArray.length; a++)
		{
			int j = (int)(Math.random() * 6.0)+1;
			rArray[a] = new int[j];
		}
	}
	public void setArray()
	{
		for(int i = 0; i<rArray.length;i++)
		{
			for (int j = 0;j<rArray[i].length ; j++)
			{
				rArray[i][j] = (int)(Math.random() * 99.0);
			}
		}
	}
	public void getArray()
	{
		for(int i = 0; i<rArray.length;i++)
		{
			System.out.print("”z—ñ["+i+"] ={");
			for (int j = 0;j<rArray[i].length ; j++)
			{
				System.out.print(rArray[i][j] +",");
			}
			System.out.println("}");
		}
	}
}