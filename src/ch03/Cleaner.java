package ch03;

// 110v 구현한 청소기를 만들어 주세요
// 집에 연결해보세요
public class Cleaner implements IElectronic110v {
	
	@Override
	public void connect() {

		System.out.println("청소기 연결 110v ON");
	}
}
