package Com.method;

public class Test4 {

	public int addSub(int x, int y ) {
		int sub = x-  y;
		return sub;
	}
	public int addSum(int x, int y ) {
		int sum = x+ y;
		return sum;
	}
	
	public static void main(String[] args) {
		Test4 test2 = new Test4();
		int result = test2.addSub(7, 5);
		int result1 = test2.addSum(7, 6);
		System.out.println(result);
		System.out.println(result1);
		
	}
	
}
