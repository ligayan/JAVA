
public class Scope {

	public static void main(String[] args) {
		int x; // widziany przez ca³y kod metody
		
		x = 10;
		if(x == 10 ) { 		//pocz¹tek nowego zasiêgu
			
			int y = 20; 	//o tej zmiennej wie tylko ten blok
			
			//tutaj znana jest zarówno x jak i y
			System.out.println("x i y: "+ x + " " + y);
			x = y + 2;
		}
		//y = 100; //b³¹d y nie jest znana

		//nadal znamy wartoœæ zmiennej x
		System.out.println("x wynosi "+ x );
		

	}

}
