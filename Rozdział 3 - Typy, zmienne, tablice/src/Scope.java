
public class Scope {

	public static void main(String[] args) {
		int x; // widziany przez ca�y kod metody
		
		x = 10;
		if(x == 10 ) { 		//pocz�tek nowego zasi�gu
			
			int y = 20; 	//o tej zmiennej wie tylko ten blok
			
			//tutaj znana jest zar�wno x jak i y
			System.out.println("x i y: "+ x + " " + y);
			x = y + 2;
		}
		//y = 100; //b��d y nie jest znana

		//nadal znamy warto�� zmiennej x
		System.out.println("x wynosi "+ x );
		

	}

}
