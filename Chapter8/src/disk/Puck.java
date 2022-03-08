package disk;

public class Puck {

	static boolean standard;
	static boolean youth;
	static double weight = 3.5;
	static boolean puck;

	public static boolean getWeight() {
		
		if(weight >= 5.0 && weight <= 5.5) 
		{
			standard = true;
		}
		else if(weight >= 4.0 && weight <= 4.5) {
			standard = false;
		}
		return standard;
	}
	
	public static String getDivision() {
		String rep = "";
		
		if(standard==true) {
			rep = "The puck is a standard ";
		}
		else if(standard == false) {
			rep = "The Puck is youth";
		}
		return rep;
	}
	
}

