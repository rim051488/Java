import java.util.*;
//import java.util.Date;
//import java.util.Calendar;
//import java.util.Scanner;
public class Ex0907{
	public static void main (String[] args){
		Date nowDate = new Date();
		Calendar nowCal = Calendar.getInstance();
		nowCal.setTime(nowDate);
		int nowYear = nowCal.get(Calendar.YEAR);
		int nowMonth = nowCal.get(Calendar.MONTH) + 1;
		int nowDay = nowCal.get(Calendar.DAY_OF_MONTH);
		System.out.println("あなたの誕生日を入力してください：(例)2001/05/14");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int Year = Integer.parseInt(str.substring(0,4));
		int Month = Integer.parseInt(str.substring(5,7));
		int Day = Integer.parseInt(str.substring(8));
		int t = nowYear - Year;
		if (nowMonth > Month)
		{
			t = nowYear - Year;
		}else if (nowMonth == Month && nowDay >= Day)
		{
			t = nowYear - Year;
		}else
		{
			t = nowYear - Year -1;
		}
		System.out.println("あなたの年齢は"+t+"歳です");
		Profile.Number();
		Profile.Name();

	}
}
