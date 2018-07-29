
public class BoxDemo5 {

	public static void main(String[] args) {

		Box mybox1 = new Box();
		Box mybox2 = new Box();
		Box mybox3 = new Box(20,20,20);
		Box mybox4 = new Box(10,10,30);

		double vol;

		vol = mybox1.volumeRet();
		System.out.println("Objêtoœæ 1 pude³ka = " + vol);
		vol = mybox2.volumeRet();
		System.out.println("Objêtoœæ 2 pude³ka = " + vol);
		vol = mybox3.volumeRet();
		System.out.println("Objêtoœæ 3 pude³ka = " + vol);
		vol = mybox4.volumeRet();
		System.out.println("Objêtoœæ 4 pude³ka = " + vol);
	}

}
