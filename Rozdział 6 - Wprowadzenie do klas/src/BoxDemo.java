
public class BoxDemo {

	public static void main(String[] args) {
		Box mybox = new Box(); // Tworzenie obiektu Box
		double vol;

		// Przypisanie wartosci zmiennym obiektu mybox

		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;

		// obliczanie wartoœci zmiennym obiektu mybox
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("Objêtoœæ: " + vol);

	}

}
