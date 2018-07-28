
public class BoxDemo2 {

	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		// Przypisanie wartoœci do zmiennych obiektu mybox1
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;

		// Przypisanie wartoœci do zmiennych obiektu mybox1
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;

		// Wyœwietlenie objêtoœci pierwszego pude³ka
		mybox1.volume();

		// Wyœwietlenie objêtoœci drugiego pude³ka
		mybox2.volume();
	}

}
