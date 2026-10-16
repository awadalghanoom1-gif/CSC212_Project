package project;

public class Rider extends Person implements IRider {
	private String email;
	private String homeCity;

	public Rider(int id, String name, String email, String phoneNumber, String homeCity) {
		super(id, name, phoneNumber);
		this.email = email;
		this.homeCity = homeCity;
	}
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String getHomeCity() {
		return homeCity;
	}
	@Override
	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}

	@Override
	public int compareTo(IRider other) {
		return Integer.compare(getId(), other.getId());
	}
	@Override
	public String toString() {
		return "Rider " + getId() + ": " + getName() + ", " + email + ", " + getPhoneNumber() + ", " + homeCity;
	}
}
