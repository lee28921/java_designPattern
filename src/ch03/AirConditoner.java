package ch03;

public class AirConditoner implements IElectronic220v{
	
	@Override
	public void connect() {
		System.out.println("에어컨 연결 220v ON");
	}
}
