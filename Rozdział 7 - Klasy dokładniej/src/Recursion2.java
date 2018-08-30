class Rectest {
	int values[];

	Rectest(int i) {
		values = new int[i];
	}

	void PrintArray(int i) {
		if (i == 0)
			return;
		else
			PrintArray(i - 1);
		System.out.println("[" + (i - 1) + "] " + values[i - 1]);
	}

}

public class Recursion2 {

	public static void main(String[] args) {
		Rectest ob = new Rectest(10);
		int i;
		for (i = 0; i < 10; i++)
			ob.values[i] = i;

		ob.PrintArray(10);

	}

}
