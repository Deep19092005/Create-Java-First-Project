package Com.method;

class Emp {
	int salary = 15000;
}

class Eng extends Emp {
	int benifit = 1000;
	
}

public class TestDemo {

	public static void main(String[] args) {
		Eng eng = new Eng();
		System.out.println("Salary : " + eng.salary + "  Benifit : "+  eng.benifit);
	}

}
