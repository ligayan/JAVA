
public class BlockTest {

	public static void main(String[] args) {
		int x,y;
		
		y = 20;
		
		//instrukcj� wykonywan� przez p�tle jest blok kodu
		for(x = 0; x < 10; x++) {
			System.out.println("Warto�� x wynosi " + x);
			System.out.println("Warto�� y wynosi " + y);
			y = y - 2;
			
		}
	}

}
