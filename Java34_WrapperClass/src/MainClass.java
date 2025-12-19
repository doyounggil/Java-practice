
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 해당 자료형이 지원하는 최대 최소값 
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		// 메모리 사용량
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		
		// Wrapper Class 종류 
		// Integer, Long, Double, Float, Byte, Short, Character, Boolean
		
		// 값을 Wrapper 클래스의 객체로 만든다.
		// Boxing
		
		// Integer intClass = new Integer(100);  // 되긴 하는데 옛날 방
		// Double doubleClass = new Double(11.11);
		
		Integer intClass = Integer.valueOf(100); // static 메서드를 사용
		Double doubleClass = Double.valueOf(11.11);
		
		// Wrapper 클래스의 객체가 관리하는 값을 가지고 나온다.
		// UnBoxing
		int intValue = intClass.intValue();
		double doubleValue = doubleClass.doubleValue();
		
		System.out.printf("%d\n", intValue);
		System.out.printf("%f\n", doubleValue);
		
		// AutoBoxing
		Integer intClass2 = 100;
		Double doubleClass2 = 11.11;
		
		// AutoUnBoxing
		int intValue2 = intClass2;
		double doubleValue2 = doubleClass2; 
		
		System.out.printf("%d\n", intClass2); // AutoUnBoxing 발생해서 int 값 출력
		System.out.printf("%f\n", doubleClass2);
		
		// Parsing
		int a1 = Integer.parseInt("12345");
		double a2 = Double.parseDouble("11.11");
		
		System.out.printf("%d\n", a1);
		System.out.printf("%f\n", a2);
		
		// Integer.parseInt("aaaa") // 오류, 숫자 형식 안맞음 
	}

}
