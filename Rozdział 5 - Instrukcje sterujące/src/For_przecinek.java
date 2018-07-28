
public class For_przecinek {

	public static void main(String[] args) {
		int a, b;
		
		b = 4;
		for(a=1; a<b; a++) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			
		}
		System.out.println();
		//Wykorzystanie przecinka
		
		int c, d;
		for (c=1, d=4; c<d ; c++, d--) {
			System.out.println("c = " + c);
			System.out.println("d = " + d);
		}
		

	}

}
