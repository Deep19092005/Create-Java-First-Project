package Com.method;

public class TestSB {

	public int addsum(int S, int B) {
		int sum = S + B;
		return sum;
	}
	public static void main (String[] args) {
		TestSB testSB = new TestSB();
		int result = testSB.addsum(15000, 1000);
		System.out.println(result);
	}

}