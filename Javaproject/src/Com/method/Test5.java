package Com.method;

public class Test5 {

	public int addSub(int x, int y ) {
		int sub = x-  y;
		return sub;
	}
	public int addSum(int x, int y ) {
		int sum = x+ y;
		return sum;
	}
	public class TestDemo {

		public static void main(String[] args) {
			Eng eng = new Eng();
			System.out.println("Salary : " + eng.salary + "  Benifit : "+  eng.benifit);
		}
	}
}