class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	// zwraca true jesli obiekt jest rowny aktualnemu obiektowi
	boolean equalsTo(Test o) {
		if (o.a == a && o.b == b)
			
			return true;
		else
			return false;
	}
}

public class Obiektyjakoparametry {

	public static void main(String[] args) {
		Test ob1 = new Test(100, 22);
		Test ob2 = new Test(100, 22);
		Test ob3 = new Test(-1, -1);

		System.out.println("ob1 == ob2: " + ob1.equalsTo(ob2)); //if (o.a == a && o.b == b) // a-ob1 o.a=ob2.a
		System.out.println("ob1 == ob3: " + ob1.equalsTo(ob3));
		
		

	}

}
