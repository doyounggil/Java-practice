package week7_3;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreParser sp = new ScoreParser();
		try {
			int result = sp.parse("9s");
		}catch(InvalidScoreBaseException e) {
			System.out.println(e.getMessage());
		}
		

	}
}


