package src;

public class Textcons {
	int x;
	
	public Textcons(int y) {
		this.x = y;
	}
	
	public Textcons() {
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		Textcons testCons = new Textcons(7);
        System.out.println(testCons.x);
	}
}
