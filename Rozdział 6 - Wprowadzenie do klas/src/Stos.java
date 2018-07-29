
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
			System.out.println("Stos jest pe�ny");
		else
			stck[++tos] = item;
	}
	//Metoda zdj�cia elementu ze szczytu stosu
	int pop() {
		if (tos<0) {
			System.out.println("Stos nie zawiera �adnych element�w.");
			return 0;
		}
		else
			return stck[tos--];
	}
}
