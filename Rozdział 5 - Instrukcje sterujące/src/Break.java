
public class Break {

	public static void main(String[] args) {
		boolean t = true;
		first: {
			second:{
				third:{
					System.out.println("Przed break.");
					if(t) break second; //Wyjscie poza 2 blok
					System.out.println("To sie nie wykona");
				}
			System.out.println("To sie nie wykona");
			}
		System.out.println("Po 2 bloku");
		}

	}

}
