import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list1 = new ArrayList<>();
		// 객체를 제일 뒤에 추가한다.
		list1.add("문자열1");
		list1.add("문자열2");
		System.out.println(list1);
		System.out.printf("list1 : %s\n", list1);
		
		// 삽입
		list1.add(1, "문자열3");
		System.out.printf("list1 : %s\n", list1); 
		 
		// 다수의 객체를 동시에 추가한다.
		ArrayList<String> tempList1 = new ArrayList<>();
		tempList1.add("문자열4");
		tempList1.add("문자열5");
		
		list1.addAll(tempList1);
		System.out.printf("list1 : %s\n", list1);
		
		// 다수의 객체를 동시에 삽입한다.
		ArrayList<String> tempList2 = new ArrayList<>();
		tempList2.add("문자열6");
		tempList2.add("문자열7");
		list1.addAll(1, tempList2);
		System.out.printf("list1 : %s\n", list1);
		
		// 원하는 번째의 개체를 가져온다.
		System.out.printf("0 : %s\n", list1.get(0));
		System.out.printf("2 : %s\n", list1.get(2));
		
		// 반복문
		for (String v1 : list1) {
			System.out.printf("%s,", v1);
		}
		System.out.println();
		
		// 객체 찾기 
		int idx = list1.indexOf("문자열3");
		System.out.println(idx);
		
		int idx2 = list1.indexOf("문자열100"); // 존재하지 않는 객체 넣으면 -1 
		System.out.println(idx2); // 존재하지 않는 객체 넣으면 -1 
		
		// 제거 
		list1.remove(3); // index 넣기 
		System.out.printf("(제거)list1 : %s\n", list1);
		
		// 다수의 객체 동시에 제거
		ArrayList<String> tempList3 = new ArrayList<>();
		tempList3.add("문자열6");
		tempList3.add("문자열4");
		list1.removeAll(tempList3);
		System.out.printf("list1 : %s\n", list1);
		
		// 모두 제거
		list1.clear();
		System.out.printf("list1 : %s\n", list1);
		
		System.out.println("-------------------------------");
		
		// <이름, 객체>
		HashMap<String, Integer> map1 = new HashMap<>();
		
		// 객체 추가 
		map1.put("data1", 100);
		map1.put("data2", 200);
		System.out.println(map1);
		System.out.println("map1 : " + map1);
		System.out.printf("map1 : %s\n", map1);
		
		// 값 가져오기 
		int data1 = map1.get("data1");
		int data2 = map1.get("data2");
		System.out.println(data1);
		System.out.println(data2);

	}
}










