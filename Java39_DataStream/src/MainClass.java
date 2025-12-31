import java.io.DataInputStream;
import java.io.DataOutputStream;
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
			String fileName = "b.txt";
			
			// 스트림을 생성한다.
			FileOutputStream fos = new FileOutputStream(fileName);
			// 데이터 스트림을 연결한다. 
			DataOutputStream dos = new DataOutputStream(fos);
			// 데이터를 쓴다.
			dos.writeInt(100);
			dos.writeDouble(11.11);
			dos.writeUTF("문자열");
			
			dos.flush();
			dos.close();
			fos.close();
			
			System.out.println("출력 완료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	 
	public static void input() {
		try {
			String fileName = "b.txt";
			// 스트림을 생성한다. 
			FileInputStream fis = new FileInputStream(fileName);
			// 데이터 스트림 
			DataInputStream dis = new DataInputStream(fis);
			
			// 읽어온다.
			// 데이터를 쓴 순서대로 읽어와야 한다. 
			int data1 = dis.readInt();
			double data2 = dis.readDouble();
			String data3 = dis.readUTF();
			
			dis.close();
			fis.close();
			
			System.out.printf("data1 : %d\n", data1);
			System.out.printf("data2 : %f\n", data2);
			System.out.printf("data3 : %s\n", data3);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
