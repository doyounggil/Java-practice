package week7_1;

public abstract class Animal {
	protected String name;
	protected int meter;
	protected int count;
	
	public Animal (String name, int soundCount) {
		this.name = name;
		count = soundCount;
	}
	
	public abstract void introduce();
	public abstract void makeSound();
}
