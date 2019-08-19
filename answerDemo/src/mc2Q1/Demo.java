package mc2Q1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> ib = new Box<Integer>(1);
		Box<Number> nb = new Box<Number>(1);
		
		//this would not work, the generic type needs to be strict but not in any inheritated form
		//printT(ib);
		printT(nb);
	}

	public static void printT(Box<Number> b) {
		System.out.println(b.getT());
	}
}
