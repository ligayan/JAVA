class Factorial {
	// metoda rekurencyjna
	int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}
}

public class Recursion {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println("3! wynosi :" + f.fact(5));

	}

}
