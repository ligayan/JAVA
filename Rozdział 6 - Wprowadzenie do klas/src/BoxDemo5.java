
public class BoxDemo5 {

	public static void main(String[] args) {

		Box mybox1 = new Box();
		Box mybox2 = new Box();
		Box mybox3 = new Box(20,20,20);
		Box mybox4 = new Box(10,10,30);

		double vol;

		vol = mybox1.volumeRet();
		System.out.println("Obj�to�� 1 pude�ka = " + vol);
		vol = mybox2.volumeRet();
		System.out.println("Obj�to�� 2 pude�ka = " + vol);
		vol = mybox3.volumeRet();
		System.out.println("Obj�to�� 3 pude�ka = " + vol);
		vol = mybox4.volumeRet();
		System.out.println("Obj�to�� 4 pude�ka = " + vol);
	}

}
