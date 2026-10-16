package project;

public abstract class Person implements IPerson {
	private final int id;
	private String name;
	private String phoneNumber;
	private LinkedList<IRide> rideHistory;

	public Person(int id, String name, String phoneNumber) {
		this.id = id;
		this.name = name;
		setPhoneNumber(phoneNumber);
		rideHistory = new LinkedList<IRide>();

	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}
	@Override
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Phone number must be exactly 10 digits: " + phoneNumber);
		}
		this.phoneNumber = phoneNumber;
	}
	@Override
	public LinkedList<IRide> getRideHistory() {
		return rideHistory;
	}
	@Override
	public int getId() {
		return id;
	}
}
