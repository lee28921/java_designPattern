package ch02;

public class RobotClient {
	
	public static void main(String[] args) {
		
		// 몸통 추가 torso
		Robot robot = new Robot.Builder()
				.head("메탈 헤드")
				.arms("티타늄 팔")
				.legs("아다만티움 다리")
				.build();
		
		System.out.println(robot);
	}
}
