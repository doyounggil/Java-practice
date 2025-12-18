
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 쓰레드를 가동시킨다.
		// ThreadClass1은 Thread를 상속받았기 때문에 start 메서드를 호출하여 가동시킨다. 
		ThreadClass1 threadClass1 = new ThreadClass1();
		threadClass1.start();
		
		// Runnable 인터페이스를 구현한 클래스를 사용할 경우
		// Thread 클래스의 객체를 생성하여 이를 통해 쓰레드를 가동한다.
		ThreadClass2 threadClass2 = new ThreadClass2();
		Thread thread = new Thread(threadClass2);
		thread.start(); 
		
		Thread thread2 = new Thread(()->{
			try {
				for(int i=0; i<10; i++) {
					//1초동안 쉰다.
					Thread.sleep(1000);
					System.out.print("+");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		});
		thread2.start();
		
		
		try {
			for(int i=0; i<10; i++) {
				//1초동안 쉰다.
				Thread.sleep(1000);
				System.out.print("*");
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

// Thread를 상속받은 클래스
class ThreadClass1 extends Thread{
	// 쓰레드가 가동되면 별도의 쓰레드가 발생하여 run 메서드 내부의 코드를 수행해준다.
	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				//1초동안 쉰다.
				Thread.sleep(1000);
				System.out.print("_");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

// Runnalbe 인터페이스를 구현한 클래스
class ThreadClass2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0; i<10; i++) {
				//1초동안 쉰다.
				Thread.sleep(1000);
				System.out.print("-");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}


