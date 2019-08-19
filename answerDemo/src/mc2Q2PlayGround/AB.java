package mc2Q2PlayGround;

public class AB implements A,B{
	public void doAB() {
		System.out.println("this means, "
				+ "as long as we satisfy the interface signiture,"
				+ " regardless of what actual interface,"
				+ " it will compile");
	}
}
