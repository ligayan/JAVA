
public class For_each {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i=0; i<10; i++) sum+=nums[i];
		
		System.out.println("suma wartoœci - " + sum);
		
		// FOR EACH
		int nums2[] = {1,2,3,4,5,6,7,8,9,10};
		int sum2 = 0;
		for (int x : nums2) {
			System.out.println(" Wartosc - "+ x);
			sum2+=x;
		}
		System.out.println("suma wartoœci - " + sum2);
		
		//Dodanie Break wyswietlenie 5 wartosci
		
		for (int x : nums2) {
			System.out.println(" Wartosc - "+ x);
			sum2+=x;
			if(x==5)break;
		}
		System.out.println("suma wartoœci - " + sum2);
		
		
		
	}

}
