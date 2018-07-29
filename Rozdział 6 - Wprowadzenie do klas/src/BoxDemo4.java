
public class BoxDemo4 {

	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		mybox1.setDim(20, 15, 5);
		mybox2.setDim(3, 6, 9);
		
		vol = mybox1.volumeRet();
		System.out.println("Objêtoœæ pude³ka 1 = "+ vol);
		
		vol = mybox2.volumeRet();
		System.out.println("Objêtoœæ pude³ka 1 = "+ vol);

	}

}
