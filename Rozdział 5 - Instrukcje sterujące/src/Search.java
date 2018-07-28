
public class Search {

	public static void main(String[] args) {
		int nums[] = {5,8,3,7,2,3,1,5};
		int val =5;
		int i=0;
		boolean found = false;
		
		for (int x : nums) {
			i++;
			if (x==val) {
				found = true;
				break;
				
				
			}
		}
		if (found)
			System.out.println("Wartoœæ zosta³a odnaleziona");
			System.out.println("jest to pozycja "+ i);

	}

}
