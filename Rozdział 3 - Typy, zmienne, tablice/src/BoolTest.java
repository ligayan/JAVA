//Przyk³ad u¿ycia boolean
public class BoolTest {

	public static void main(String[] args) {
		boolean b;
		
		b = false;
		System.out.println("b wynosi " + b);
		b = true;
		System.out.println("b wynosi " + b);
		
		//wartoœæ logiczna mo¿e sterowaæ instrukcj¹ if
		
		if(b) System.out.println("To zosta³o wykonane");
		
		b = false;
		if(b) System.out.println("To nie zosta³o wynonane");
		
		//wynik operatora relacji jest wartoœci¹ logiczn¹
		System.out.println("10 > 9 to wartoœæ " + (10 > 9));

	}

}
