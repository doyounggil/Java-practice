package week7_3;

public class ScoreParser {
	public static int parse(String s) throws InvalidScoreBaseException{
		
		if (s==null||s.isEmpty()) {
			throw new EmptyScoreException();
		}
		
		int score;
		
		try {
			score = Integer.parseInt(s);
		}
		catch (NumberFormatException e) {
			throw new InvalidScoreFormatException();
		}
		
		if (score>100||score<0) {
			throw new InvalidRangeException();
		}
		
		return score;
		
	}
}
