
public class TestStos {

	public static void main(String[] args) {
		Stos mystos1 = new Stos();
		Stos mystos2 = new Stos();
		
		//Umieszczenie liczb w stosie
		
		for(int i=0; i<10;i++) mystos1.push(i);
		for(int i=10; i<20;i++) mystos2.push(i);
		
		//Zdjêcie liczb ze stosu
		System.out.println("Stos w mystos 1: ");
		for(int i=0;i<10;i++)
			System.out.println(mystos1.pop());
		System.out.println("Stos w mystos 2: ");
		for(int i=0;i<10;i++)
			System.out.println(mystos2.pop());

	}

}
