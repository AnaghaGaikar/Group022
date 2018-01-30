package dto;

public class User_registration {

	private int userId;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String address;
	private String state;
	private String city;
	private int pincode;
	private String gender;
	private int age;
	private String contact;
	
	
	public User_registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User_registration(String firstname, String lastname, String address, String state, String city, int pincode,
			int age, String contact) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.age = age;
		this.contact = contact;
	}

	public User_registration( String firstname, String lastname, String email, String password,
			String address, String state, String city, int pincode, String gender, int age, String contact) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.address = address;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.gender = gender;
		this.age = age;
		this.contact = contact;
	}
	
	
	public User_registration(String address, String state, String city, int pincode, int age, String contact) {
		super();
		this.address = address;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.age = age;
		this.contact = contact;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User_registration [userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", password=" + password + ", address=" + address + ", state=" + state
				+ ", city=" + city + ", pincode=" + pincode + ", gender=" + gender + ", age=" + age + ", contact="
				+ contact + "]";
	}
}
