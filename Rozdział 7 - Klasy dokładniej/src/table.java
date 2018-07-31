
public class table {

	int tablica[] = new int[20];
	int i;
	int k;
	int m;

	void napelnianie(int k, int m) {

		for (i = 0; i < 20; i++) {
			tablica[i] = k;
			k += m;

		}

	}

	void wysw() {

		for (i = 0; i < 20; i++) {
			System.out.println(tablica[i]);
		}

	}
	
	table(int j,int c){
		for(i=0;i<20;i++) {
			tablica[i]=c;
			c+=j;
			
		}
	}

}
