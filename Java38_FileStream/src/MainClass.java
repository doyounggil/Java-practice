import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//output();
		input();
	}
	public static void output() {
		try {
			// 파일 이름
			String fileName = "a.txt";
			// 파일에 쓸 데이터
			byte[] data1 = "안녕하세요".getBytes();
			
			// 스트림 생성
			FileOutputStream fos = new FileOutputStream(fileName);
			// 파일에 데이터를 쓴다. 
			fos.write(data1);
			fos.flush();
			fos.close();
			
			System.out.println("파일 쓰기 성공");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void input() {
		try {
			String fileName = "a.txt";
			FileInputStream fis = new FileInputStream(fileName); 
			byte[] buf = new byte[fis.available()]; // file 용량 만큼 byte 배열 만들기
			fis.read(buf);
			fis.close();
			
			String str1 = new String(buf);
			System.out.println(str1);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
