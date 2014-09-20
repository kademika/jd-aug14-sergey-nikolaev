package shop;

public class Client {
	private String name;
	private String secondName;
	private int phoneNumber;

	public Client(String name) {
		this.name = name;
	}

	public Client(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public Client(String name, String secondName, int phoneNumber) {
		this.name = name;
		this.secondName = secondName;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
