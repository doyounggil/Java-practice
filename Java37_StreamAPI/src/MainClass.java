import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Kim");
		names.add("Lee");
		names.add("Park");
		names.add("Choi");
		names.add("Kim");
		
		System.out.println(names);
		
		System.out.println("--------------------------------");
		
		
		names.stream()
			// "Kim" 제거
			.filter(n -> !n.equals("Kim")) 
			// 전부 대문자 변경
			.map(String::toUpperCase)
			// 정렬
			.sorted()
			// 출력하고 다음 데이터로 넘어간다. (출력하고 결과를 버림)
			.forEach(System.out::println); // 최종 연산한 것들을 모으지 않을 거다.
		
		System.out.println(names); // 데이터 원본 변경 없음
		
		System.out.println("--------------------------------");
		
		List<String> result = names.stream()
			// 중복제거 
			.distinct()
			// 결과를 리스트로 모아서 반환한다. 
			.collect(Collectors.toList());
		
		System.out.println(result);
		
	}

}






