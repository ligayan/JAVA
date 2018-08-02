class Box {
	double width;
	double height;
	double depth;

	// Tworzenie klonu obiektu

	Box(Box ob) { // przekazanie obiektu do kontruktora
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// Konstruktor uzywany gdy podano wszystkie wymairy
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// Konstruktor u¿ywany przy braku wymiarów
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// kontruktor u¿ywany do tworzenia szczeœcianów
	Box(double len) {
		width = height = depth = len;
	}

	// oblicz i zwróæ objêtoœæ
	double volume() {
		return width * height * depth;
	}
}

public class OverloadCons2 {

	public static void main(String[] args) {
		// tworzenie pide³ek za pomoc¹ ró¿nych konstruktorów
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(5);

		Box myclone = new Box(mybox1); // Tworzenie kopii pude³ka mybox

		double vol;

		vol = mybox1.volume();
		System.out.println("Objêtoœæ mbox1 wynosi :" + vol);
		vol = mybox2.volume();
		System.out.println("Objêtoœæ mbox2 wynosi :" + vol);
		vol = mycube.volume();
		System.out.println("Objêtoœæ mycube wynosi :" + vol);
		vol = myclone.volume();
		System.out.println("Objêtoœæ myclone wynosi :" + vol);
	}

}
