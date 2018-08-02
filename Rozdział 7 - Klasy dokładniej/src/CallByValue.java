class Test2 {
	void meth(int i, int j) {
		i *= 2;
		j /= 2;
	}
}

public class CallByValue {

	public static void main(String[] args) {
		Test2 ob = new Test2();
		int a = 15, b = 20;
		System.out.println("a i b przed wyw³aniem: " + a + " " + b);
		ob.meth(a, b);
		System.out.println("a i b po wyw³aniu: " + a + " " + b);
		

	}

}
