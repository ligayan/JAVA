//Przyk�ad u�ycia boolean
public class BoolTest {

	public static void main(String[] args) {
		boolean b;
		
		b = false;
		System.out.println("b wynosi " + b);
		b = true;
		System.out.println("b wynosi " + b);
		
		//warto�� logiczna mo�e sterowa� instrukcj� if
		
		if(b) System.out.println("To zosta�o wykonane");
		
		b = false;
		if(b) System.out.println("To nie zosta�o wynonane");
		
		//wynik operatora relacji jest warto�ci� logiczn�
		System.out.println("10 > 9 to warto�� " + (10 > 9));

	}

}
