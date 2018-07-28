
public class Continue {

	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			System.out.print(i+" ");
			if (i%2==0) continue;
			System.out.println("");
		}
		
		
		outer: for (int k=0;k<10;k++) {
					for(int j=0;j<10;j++) {
						if(j>k) {
							System.out.println();
							continue outer;
						}
						System.out.print(" "+(k*j));
					}
			
			
		}
		System.out.println();
	}

}
