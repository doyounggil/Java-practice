package week7_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "  Computer_Programming ";
		String str2 = "Computer_Programming ";
		String str3 = "  Computer_P rogramming ";
		
		StrTransform.TRIM.apply(str1);
		StrTransform.UPPER.apply(str2);
		StrTransform.KEBAB.apply(str3);
	}

}
