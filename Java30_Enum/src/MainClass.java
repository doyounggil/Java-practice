
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		AnimalType animalType = AnimalType.CAT;
		// enum 타입의 값은 name()이라는 메서드를 제공한다.
		// 이 메서드를 호출하면 enum 타입값과 동일한 이름의 문자열을 반환한다.
		System.out.println(animalType.name());
		// 출력을 하게 되면 name()을 호출했을 때 얻을 수 있는 문자열 값을 출력한다.
		System.out.printf("animalType : %s\n", animalType);
		
		// switch
		// case을 작성할 때 enum 타입 이름을 생략하고 값만 작성해주면 된다.
		// enum에 정의되어 있는 모든 값을 case로 지정하지 않으면 경고를 띄워준다.
		// enum에 정의되어 있지 않는 값을 case로 지정하면 오류가 발생한다.
		switch(animalType) {
		case DOG:
			System.out.println("강아지 입니다."); 
			break;
		case CAT:
			System.out.println("고양이 입니다.");
			break;
		case GIRAFF:
			System.out.println("고양이 입니다.");
			break;
		}
		
		AnimalType2 animalType2 = AnimalType2.DOG;
		System.out.printf("number1 : %d\n", animalType2.getNumber1());
		System.out.printf("name1 : %s\n", animalType2.getName1());
		
		int r1 = Operation.PLUS.apply(100,3);
		int r2 = Operation.MINUS.apply(100,3);
		int r3 = Operation.TIMES.apply(100,3);
		int r4 = Operation.DIV.apply(100,3);
		System.out.printf("r1 : %d\n", r1);
		System.out.printf("r2 : %d\n", r2);
		System.out.printf("r3 : %d\n", r3);
		System.out.printf("r4 : %d\n", r4);
		
	} 

}

enum AnimalType{ 
	DOG,
	CAT,
	GIRAFF;
}

enum AnimalType2{ 
	DOG(1, "강아지"),
	CAT(2, "고양이"),
	GIRAFF(3, "기린");
	
	private final int number1;
	private final String name1;
	
	AnimalType2(int number1, String name1) {
		this.number1 = number1;
		this.name1 = name1;
	}
	
	public int getNumber1() {
		return number1;
	}
	public String getName1() {
		return name1;
	}
}

enum Operation{
	PLUS{
		public int apply(int x, int y) {
			return x+y;
		} 
	},
	MINUS{
		public int apply(int x, int y) {
			return x-y;
		} 
	},
	TIMES{
		public int apply(int x, int y) {
			return x*y;
		} 
	},
	DIV{
		public int apply(int x, int y) {
			return x/y;
		} 
	};
	
	public abstract int apply(int x, int y);
}






