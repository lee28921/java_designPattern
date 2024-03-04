package ch03;

// 어댑터 클래스 만들기
// 1. 먼저 기존에 사용하는 스펙을 구현해 준다
public class ElectornicAdapter implements IElectronic220v {
	
	// 2. 변환 하고자 하는 스펙을 포함 관계로 만든다
	private IElectronic110v iElectronic110v;
	
	// 3. 생성자 주입을 통해서 의존 주입 받을 수 있도록 설계 한다
	public ElectornicAdapter(IElectronic110v electronic110v) {
		this.iElectronic110v = electronic110v;
	}
	
	@Override
	public void connect() {
		// 4. 호환 처리
		// 외부에서는 connect()
		
		iElectronic110v.connect();
	}
}
