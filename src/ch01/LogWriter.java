package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// 싱글톤 패턴 만들어주세요
public class LogWriter {
	
	// 2. 자신에 참조 값을 담을 정적 변수 선언
	private static LogWriter instance;
	
	// 파일 생성 --> 시간 출력
	private static BufferedWriter writer;
	
	// 1. BufferedWriter new 설정
	private LogWriter() {
		try {
			writer = new BufferedWriter(new FileWriter("log.txt",true));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 3. 외부에서 접근 가능한 정적 메서드 만들어 주기
	public static LogWriter getInstance() {
		if(instance == null) {
			instance = new LogWriter();
		}
		return instance;
	}
	
	// 기능
	public void writeLog(String log) {
		// 파일에 내용을 작성할 수 있는 기능
		try {
			writer.write(log);
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
