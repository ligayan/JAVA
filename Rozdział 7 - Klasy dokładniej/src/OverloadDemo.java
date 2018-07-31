class Overload {
	void test() {
		System.out.println("Brak parametrów");
	}

	// 1 parametr
	void test(int a) {
		System.out.println("a: " + a);
	}

	// 2 parametry
	void test(int a, int b) {
		System.out.println("a i b: " + a + " " + b);
	}
	//Przeci¹¿ona metoda test z jednym parametram typu double
	double test(double a) {
		System.out.println("double a:" + a);
		return a*a;
	}
}

public class OverloadDemo {

	public static void main(String[] args) {
		
	}

}
