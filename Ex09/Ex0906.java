import java.util.*;
//import java.util.Date;
//import java.util.Calendar;
//import java.util.Scanner;
public class Ex0906{
	public static void main (String[] args){
		Date nowDate = new Date();
		Calendar nowCal = Calendar.getInstance();
		nowCal.setTime(nowDate);
		int nowYear = nowCal.get(Calendar.YEAR);
		int nowMonth = nowCal.get(Calendar.MONTH) + 1;
		int nowDay = nowCal.get(Calendar.DAY_OF_MONTH);
		System.out.println("本日は"+nowYear+"年"+nowMonth+"月"+nowDay+"日です。");
		Profile.Number();
		Profile.Name();

	}
}
