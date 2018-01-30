package dto;

// TODO: Auto-generated Javadoc
/**
 * The Class DoctorRegistration.
 */
public class DoctorRegistration {

	/** The doctor id. */
	private int doctorId;
	
	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The email. */
	private String email;
	
	/** The password. */
	private String password;
	
	/** The contact no. */
	private String contactNo;
	
	/** The address. */
	private String address;
	
	/** The city. */
	private String city;
	
	/** The pin code. */
	private int pinCode;
	
	/** The degree. */
	private String degree;
	
	/** The specialization. */
	private String specialization;

	public DoctorRegistration() {
		super();
	}
	
	

	public DoctorRegistration(String firstName, String lastName, String email, String password, String contactNo,
			String address, String city, int pinCode, String degree, String specialization) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.contactNo = contactNo;
		this.address = address;
		this.city = city;
		this.pinCode = pinCode;
		this.degree = degree;
		this.specialization = specialization;
	}



	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "DoctorRegistration [doctorId=" + doctorId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + ", contactNo=" + contactNo + ", address=" + address
				+ ", city=" + city + ", pinCode=" + pinCode + ", degree=" + degree + ", specialization="
				+ specialization + "]";
	}

	
	}
