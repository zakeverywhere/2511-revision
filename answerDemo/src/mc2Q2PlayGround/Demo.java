package mc2Q2PlayGround;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB ab = new AB();
		A a = ab;
		B b = ab;
		a.doAB();
		
		System.out.println("printing b:");
		b.doAB();
		//even C have doAB(), AB does not implements C. so fail
		//C c = ab;
		
		BC bc= new BC();
		b = bc;
		System.out.println("printing b:");
		b.doAB();
		
		//from this demo we can see the actual implementation matters,
		//the class implments matters, but the signature does not matter.
		
	}
}
