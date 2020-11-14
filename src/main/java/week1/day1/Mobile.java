package week1.day1;

public class Mobile {
	
	public String imeiNumber;
	public String model;
	public int simSlots;
	public boolean isTouchEnabled;
	
	public void sendSms(String text) {
		System.out.println("Send the SMS "+text);
	}
	
	public void makeAcall(long mobileNumber) {
		System.out.println("Call connected to: "+mobileNumber);
	}
	
	public boolean isTouchEnabled() {
		return isTouchEnabled;
	}

	public static void main(String[] args) {
		Mobile samsung = new Mobile();
		samsung.imeiNumber = "IEEE1234567TUI";
		samsung.model = "A51S";
		samsung.simSlots = 2;
		samsung.isTouchEnabled = true;
		
		samsung.sendSms("Hello");
		samsung.makeAcall(988409525);
		boolean isTouch = samsung.isTouchEnabled();
		System.out.println("touchEnabled for Samsung: "+ isTouch);
		System.out.println("Samsung Model: "+samsung.model);
		
		Mobile nokia = new Mobile();
		nokia.imeiNumber = "IEEE1234567TTT";
		nokia.model = "3310";
		nokia.simSlots = 1;
		nokia.isTouchEnabled =  false;
		
		nokia.sendSms("Hai");
		nokia.makeAcall(988407525);
		boolean touchEnabled = nokia.isTouchEnabled();
		System.out.println("touchEnabled for Nokia: "+touchEnabled);
		System.out.println("Nokia Model: "+nokia.model);

	}

}
