
public class BoxDemo3 {

	public static void main(String[] args) {

		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;

		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;

		// Pobranie obj�to�ci 1 obiektu
		vol = mybox1.volumeRet();
		System.out.println("Obj�to��: " + vol);

		// Pobranie obj�to�ci 2 obiektu
		vol = mybox2.volumeRet();
		System.out.println("Obj�to��: " + vol);

		// Kr�cej:

		System.out.println("Obj�to��: " + mybox1.volumeRet());
		System.out.println("Obj�to��: " + mybox2.volumeRet());
	}

}
