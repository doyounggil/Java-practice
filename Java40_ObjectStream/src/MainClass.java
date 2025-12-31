import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainClass {
	public static void main(String[] args) {
		//output();
		input();
	}
	
	public static void output() {
		try {
			TestClass t1 = new TestClass();
			t1.a = 100;
			t1.b = 100;
			 
			// 스트림 생성 
			FileOutputStream fos = new FileOutputStream("c.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(t1);
			oos.flush();
			oos.close();
			fos.close();
			
			System.out.println("출력 완료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void input() {
		try {
			
			FileInputStream fis = new FileInputStream("c.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			TestClass t2 = (TestClass)ois.readObject(); 
			
			ois.close();
			fis.close();
			
			System.out.println(t2.a);
			System.out.println(t2.b);
			t2.sayHi();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class TestClass implements Serializable{
	
	int a;
	int b;
	
	public void sayHi() {
		System.out.println("안녕하세요.");
	}
	
}