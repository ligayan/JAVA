
public class IfElse {

	public static void main(String[] args) {
		int month = 4; //Kwiecie�
		String season;
		
		if(month == 12 || month == 1 || month == 2)
			season = "zima";
		else if(month == 3 || month == 4 || month == 5)
			season = "wiosna";
		else if(month == 6 || month == 7 || month == 8)
			season = "lato";
		else if(month == 9 || month == 10 || month == 11)
			season = "jesie�";
		else 
			season = "B��dny miesi�c";
		
		System.out.println("Miesi�c kwiecie� nale�y do pory roku "+season+".");


	}

}
