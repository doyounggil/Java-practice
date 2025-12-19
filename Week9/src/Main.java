import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
public class Main {

	public static void main(String[] args) {
		dupRemoveItem();
        boundaryIndexExceptions();
        removeOnEmpty();
        addAtSizeEqualsAppend();
        nullDuplicateRemove();
        System.out.println("\n=== Mini tests done ===");
    }
	 // 1) String 타입 테스트
	 static void dupRemoveItem() {
	        System.out.println("=== dupRemoveItem ===");
	        MyArrayList<String> l = new MyArrayList<>();
	        l.append("a"); l.append("a"); l.append("a"); l.append("b");
	        System.out.print("start       → "); l.print();          // [ a a a b ]
	        System.out.println("rm a (1) = " + l.removeItem("a"));  // true
	        System.out.print("after (1)  → "); l.print();           // [ a a b ]
	        System.out.println("rm a (2) = " + l.removeItem("a"));  // true
	        System.out.print("after (2)  → "); l.print();           // [ a b ]
	        System.out.println("rm a (3) = " + l.removeItem("a"));  // true
	        System.out.print("after (3)  → "); l.print();           // [ b ]
	        System.out.println("rm a (4) = " + l.removeItem("a"));  // false
	        System.out.print("after (4)  → "); l.print();           // [ b ]
	    }

	    // 2) 인덱스 경계 예외: add/remove/set 에서 Wrong Index 확인
	    static void boundaryIndexExceptions() {
	        System.out.println("\n=== boundaryIndexExceptions ===");
	        MyArrayList<Integer> l = new MyArrayList<>();
	        l.append(10); l.append(20); l.append(30);               // size=3
	        System.out.print("start       → "); l.print();

	        try { l.add(-1, 99); } 
	        catch (IndexOutOfBoundsException e) { System.out.println("add(-1,99) → " + e.getMessage()); }

	        try { l.add(4, 99); }  // size=3 → 4는 초과
	        catch (IndexOutOfBoundsException e) { System.out.println("add(4,99)  → " + e.getMessage()); }

	        try { l.set(3, 77); }  // set는 index>=size 예외
	        catch (IndexOutOfBoundsException e) { System.out.println("set(3,77)  → " + e.getMessage()); }

	        try { l.remove(3); }   // remove도 index>=size 예외
	        catch (IndexOutOfBoundsException e) { System.out.println("remove(3)  → " + e.getMessage()); }

	        // 정상 동작 확인
	        l.add(3, 40);  // 끝 삽입
	        System.out.print("add(3,40)  → "); l.print();
	        l.set(0, 11);
	        System.out.print("set(0,11)  → "); l.print();
	        l.remove(1);
	        System.out.print("remove(1)  → "); l.print();
	    }

	    // 3) 빈 리스트에서 remove 호출 시 예외
	    static void removeOnEmpty() {
	        System.out.println("\n=== removeOnEmpty ===");
	        MyArrayList<Integer> l = new MyArrayList<>();
	        System.out.print("start       → "); l.print();          // [ ]
	        try { l.remove(0); } 
	        catch (IndexOutOfBoundsException e) { System.out.println("remove(0)  → " + e.getMessage()); }
	    }

	    // 4) add(index==size)가 append와 동일 효과인지 확인
	    static void addAtSizeEqualsAppend() {
	        System.out.println("\n=== addAtSizeEqualsAppend ===");
	        MyArrayList<Integer> l = new MyArrayList<>();
	        l.append(1); l.append(2);
	        System.out.print("start       → "); l.print();          // [ 1 2 ]
	        l.add(2, 99);                                           // index==size
	        System.out.print("add(2,99)   → "); l.print();          // [ 1 2 99 ]
	        l.append(100);
	        System.out.print("append(100) → "); l.print();          // [ 1 2 99 100 ]
	    }

	    // 5) null 중복 제거: removeItem(null) 두 번은 true, 세 번째는 false
	    static void nullDuplicateRemove() {
	        System.out.println("\n=== nullDuplicateRemove ===");
	        MyArrayList<String> l = new MyArrayList<>();
	        l.append(null); l.append("x"); l.append(null);
	        System.out.print("start       → "); l.print();          // [ null x null ]
	        System.out.println("rm null (1) = " + l.removeItem(null));
	        System.out.print("after (1)  → "); l.print();           // [ x null ]
	        System.out.println("rm null (2) = " + l.removeItem(null));
	        System.out.print("after (2)  → "); l.print();           // [ x ]
	        System.out.println("rm null (3) = " + l.removeItem(null));
	        System.out.print("after (3)  → "); l.print();           // [ x ]
	    }
}
