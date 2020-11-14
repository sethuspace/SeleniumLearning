package week1.day1;

public class Bicycle {
	String color = "Red";
	//Integer model = new Integer(2009);
	int model = 2009;
	int wheelNumber = 2;
	String brandName = "BSA";
	boolean isLadiesCycle = false;
	
	/*
	 * accessModifier returnType methodName(dataType varName){ }
	 */
	
	public void applyGear(int gearNumber) {
		System.out.println("Gear Number : "+gearNumber);
	}
	
	public void ringBell() {
		System.out.println("Bell Ranged");
	}
	
	public void applybrake(String type) {
		System.out.println("Break Applied on "+type);
	}
	
	public boolean cycleLock() {
		return true;	
	}
	
	public void setSpeed(int speedType) {
		System.out.println("Speed set as "+speedType);
	}
	
	public static void main(String[] args) {
		//ClassName objName = new ClassName();
		Bicycle thiyagu = new Bicycle();
		thiyagu.color = "Orange";
		thiyagu.isLadiesCycle = false;
		thiyagu.model = 2020;
		thiyagu.wheelNumber = 2;
		
		thiyagu.applybrake("front");
		thiyagu.applyGear(2);
		thiyagu.setSpeed(5);
		
		Bicycle vrSundar = new Bicycle();
		vrSundar.color = "Blue";
		vrSundar.isLadiesCycle = false;
		
		boolean isLocked = vrSundar.cycleLock();
		System.out.println("VR Sundar locK: "+isLocked);
		
		vrSundar.setSpeed(3);
	
	}

	

}
