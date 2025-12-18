import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestClass t1 = new TestClass();
		int result = 0;
		
		result = t1.method(10, 0); 
		System.out.printf("result : %d\n", result);
		
		try {
			TestClass2 t2 = new TestClass2();
			int result2 = t2.method(10,0);
			System.out.printf("result2 : %d\n", result2);
		}catch(Exception e) {
			//e.printStackTrace(); 
		}
		
		try {
			AgeClass ageClass = new AgeClass();
			ageClass.method(100);
			ageClass.method(-100);
		}catch(MyException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace(); 
		}
		
		
		
	}

}

class TestClass{
	public int method(int a, int b) {
		
		int result = 0;
		
		try {
			result = a/b;
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException오류가 발생했습니다");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException오류가 발생했습니다");
		}
		return result;
	} 
}

class TestClass2{
	// ArithmeticException, NumberFormatException는 RuntimeException을 상속받았기 때문에 따로 예외처리 하지 않아도 된다.
	public int method(int a, int b) throws ArithmeticException, NumberFormatException, IOException{
		
		int result = 0;
		
		result = a/b;
		
		return result;
	}
}

class AgeClass{
	public void method(int age) throws MyException{
		
		if(age<0) {
			// 예외를 발생시킨다.
			throw new MyException(); 
		}
		System.out.printf("나이는 %d살입니다.\n", age);
		
	}
}


class MyException extends Exception{
	
	@Override
	public String getMessage() {
		// 오류가 발생했을 때 보여줄 문자열을 반환한다.
		return "나이는 음수가 되면 안됩니다.";
	}
}


