public class MyArrayList<T> {
	private Object[] arr;
	private int size;
	private int capacity;
	
	public MyArrayList() {
		capacity = 10;
		arr = new Object[capacity];
		size = 0;
	}
	public void add(int index, T item) {
		
		if (index>size || index<0) throw new IndexOutOfBoundsException("Wrong Index");
		
		if (size >= capacity) {
			resize();
		}
		
		if (index == size) {
			append(item);
		}
		else{
			for(int i = size; i>index; i--) {
				arr[i] = arr[i-1];
			}
			arr[index] = item;
			size++;
		}
		
	}
	public void append(T item) {
		if (size >= capacity) {
			resize();
		}
		arr[size] = item;
		size++;
	}
	public void remove(int index) {
		if (index>(size-1) || index<0) throw new IndexOutOfBoundsException("Wrong Index");
		for(int i=index; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[--size]=null;
	}
	public boolean removeItem(T item) {
		for(int i=0; i<size; i++) {
			if(java.util.Objects.equals(arr[i], item)) {
				for(int k=i; k<size-1; k++) {
					arr[k] = arr[k+1];
				}
				arr[--size]=null;
				return true;
			}
		}
		return false;
	}
	public void set(int index, T item) {
		if (index>(size-1) || index<0) throw new IndexOutOfBoundsException("Wrong Index");
		arr[index] = item;
	}
	public void print() {
		System.out.print("[ ");
		for(int i=0; i<size; i++) {
			System.out.printf("%s ", arr[i]);
		}
		System.out.print("]\n");
	}
	private void resize() {
		capacity *= 2;
		Object[] newArr = new Object[capacity];
		for(int i=0; i<size; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
}



