
public class Breakloop {

	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			if(i==10) break; //Opuszczenie pêtli
			System.out.println("i: "+i);
		}
		System.out.println("Koniec pêtli");
	}

}


