package disk;

public class Puck {
	
	static double weight = 5.1;
	static boolean standard;
	static boolean youth;
	
	public boolean standard() {
	
	
		return(standard);
	}
	
	public boolean youth() {
	
			return(youth);
		}

	
	public boolean equals(Object p){
		Puck test = (Puck)p;
		
		}
	/*
	standard = true;
		youth = false;
		standard = false;
		youth = false;	
		if(weight >= 5.0 || weight <= 5.5) 
	{}
	if(weight >= 4.0 || weight <= 4.5) {
			standard =  false;
			youth = true;
	*/

	public static double getWeight() {
		
		return(weight);
	}

	
	public static String getDivision() {
		String rep = "";
		
		if(standard==true) {
			return rep = "The puck is a standard";
		}
		else if(youth==true) {
			return rep = "The Puck is youth";
		}
			return rep;
	}
	
}

