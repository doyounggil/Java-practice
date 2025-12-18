package week7_1;

public class Cat extends Animal implements Eater, Walker{
	
	public Cat(String name) {
		super(name, 2);
	}
	
	@Override
	public void introduce() {
		System.out.printf("Hi, I am the cat %s. I walked %d meters and I can meow %d more times\n", name, meter, count);
	}
	

	@Override
	public void makeSound() {
		if (count==0) {
			System.out.printf("A cat %s cannot meow any more", name);
		}
		else {
			System.out.printf("[%s meowing] Meow!\n", name);
			count -= 1;
		}
		
		
	}
	
	
	@Override
	public void walk(int seconds) {
		int curMeter = 0;
		if(seconds<0) {
			System.out.println("A cat cannot walk for a negative time");
		}
		else {
			curMeter = seconds*2;
			meter += curMeter;
			System.out.printf("A cat %s walked %d meters\n", name,curMeter);
		}

	}
	
	@Override
	public void eat() {
		System.out.println("Yummy cat food! Now I can meow more");
		count += 3;
	}
}
