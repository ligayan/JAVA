class Testowo{
	int a;
	
	Testowo(int i){
		a = i;
	}
	
	Testowo incrByTen() {
		Testowo temp = new Testowo(a+10);
		return temp;
	}
}
public class RetOb {

	public static void main(String[] args) {
		Testowo ob1 = new Testowo(2);
		Testowo ob2;
		
		ob2 = ob1.incrByTen();
		System.out.println("ob1.a: "+ob1.a);
		System.out.println("ob2.a: "+ob2.a);
		
		Testowo ob3 = ob2.incrByTen();
		
		System.out.println("ob3.a: "+ob3.a);

	}

}
