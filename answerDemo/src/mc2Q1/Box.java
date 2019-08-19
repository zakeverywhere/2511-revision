package mc2Q1;

public class Box<T> {
	private T[] myArr;
	private T myT;
	//this is being we don't know the size of T,
	//therefore we can not allocate specific number of memory space.
	
	//private T[] myArr = new T[100];

	
	public Box(T t) {
		this.myT = t;
	}
	public T getT() {
		return myT;
	}
}
