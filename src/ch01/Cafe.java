package ch01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cafe {
	public static void main(String[] args) {
		System.out.println("- 세상에서 가장 작은 카페 오픈 -");
		
		// 커피 메이커 인스턴스가 필요
		CoffeeMaker maker1 = CoffeeMaker.getInstance();
		maker1.makeCoffee();
		
		CoffeeMaker maker2 = CoffeeMaker.getInstance();
		
		LogWriter logWriter = LogWriter.getInstance();
		logWriter.writeLog("커피 결제 완료 : ");
	}
	
	// 시간 포맷 기능
	public static String dateFormatter(Date date) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		return dateFormat.format(date);
	}
}
