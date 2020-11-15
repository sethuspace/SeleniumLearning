package week1.day2;

public class Mobile {
	
	public String imeiNumber;
	public String model;
	public int simSlots;
	public boolean isTouchEnabled;
	
	protected void sendSms(String text) {
		System.out.println("Send the SMS "+text);
	}
	
	protected void makeAcall(long mobileNumber) {
		System.out.println("Call connected to: "+mobileNumber);
	}
	
	protected boolean isTouchEnabled() {
		return isTouchEnabled;
	}
}
