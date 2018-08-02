class Test3 {
	int a, b;

	Test3(int i, int j) {
		a = i;
		b = j;
	}

	// Przekaywanie obiektu
	void meth(Test3 o) {
		o.a *= 2;
		o.b /= 2;
	}
}

public class CallByrRef {

	public static void main(String[] args) {
		Test3 ob = new Test3(15, 20);

		System.out.println("ob.a i ob.b przed wywo³aniem " + ob.a + " " + ob.b);

		ob.meth(ob);

		System.out.println("ob.a i ob.b po wywo³aniu " + ob.a + " " + ob.b);
	}

}
