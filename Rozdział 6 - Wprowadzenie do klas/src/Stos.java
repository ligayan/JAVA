
public class Stos {

	int stck[] = new int[10];
	int tos;

	// inicjalizacja stosu (KONSTRUKTOR)
	Stos() {
		tos = -1;
	}

	// Metoda umieszczenia elementu na szczycie stosu
	void push(int item) {
		if (tos == 9)
			System.out.println("Stos jest pe³ny");
		else
			stck[++tos] = item;
	}
	//Metoda zdjêcia elementu ze szczytu stosu
	int pop() {
		if (tos<0) {
			System.out.println("Stos nie zawiera ¿adnych elementów.");
			return 0;
		}
		else
			return stck[tos--];
	}
}
