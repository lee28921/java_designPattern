package ch03;

public class MyHouse {
	
	// 전기 연결
	public static void homeConnect(IElectronic220v ielectronic220v) {
		ielectronic220v.connect();
	}
	
	public static void main(String[] args) {
		
		HairDryer hairDryer = new HairDryer();
		AirConditoner airConditoner = new AirConditoner();
		Cleaner cleaner = new Cleaner();
		
		// 전기 연결 동작
		homeConnect(airConditoner);
		// homeConnect(hairDryer); --> 연결 불가 스펙이 다름 --> 어댑터 클래스가 필요
		
		// 철물점 가서 어댑터 클래스를 구해 오자
		ElectornicAdapter adapter1 = new ElectornicAdapter(hairDryer);
		homeConnect(adapter1);
		
		ElectornicAdapter adapter2 = new ElectornicAdapter(cleaner);
		homeConnect(adapter2);
	}
}
