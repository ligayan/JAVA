// Obliczanie odleg�o�ci przebytej przez �wiat�o za pomoc� zmiennych typu long
public class Light {

	public static void main(String[] args) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		//Przybli�ona pr�dko�� �wiat�a w kilometrach na sekund�
		lightspeed = 299792;
		days = 1000;
		seconds = days * 24 * 60 * 60 ; //konwersja na sekundy
		distance = lightspeed * seconds; //obliczanie odleg�o�ci
		
		System.out.print("W "+ days);
		System.out.print(" dni �wiat�o przeb�dzie ");
		System.out.print(distance+ " kilometr�w");
		
	}

}
