
public class Box {

	double width;
	double height;
	double depth;

//metody
	void volume() {
		System.out.print("Obj�to��: ");
		System.out.println(width * height * depth);
	}

// Obj�to��
	double volumeRet() {
		return width * height * depth;
	}

	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

//Konstruktor BOX
	Box() {
		System.out.println("Konstrukcja elementu box");
		width = 10;
		height = 10;
		depth = 10;
	}
	
//Konstruktor z parametrami
	
	Box(double w,double h, double d){
		width = w;
		height = h;
		depth = d;
	}

}
