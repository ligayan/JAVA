// Obliczanie odleg³oœci przebytej przez œwiat³o za pomoc¹ zmiennych typu long
public class Light {

	public static void main(String[] args) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		//Przybli¿ona prêdkoœæ œwiat³a w kilometrach na sekundê
		lightspeed = 299792;
		days = 1000;
		seconds = days * 24 * 60 * 60 ; //konwersja na sekundy
		distance = lightspeed * seconds; //obliczanie odleg³oœci
		
		System.out.print("W "+ days);
		System.out.print(" dni œwiat³o przebêdzie ");
		System.out.print(distance+ " kilometrów");
		
	}

}
