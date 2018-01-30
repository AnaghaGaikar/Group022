package dto;

import java.sql.Blob;

public class Patientissuedto {

	private String patientFname;
	private String patientLname;
	private String patientEmail;
	private String disease;
	private String symptoms;
	private Blob files;
	private String doctorEmail;
	private String doctorFname;
	private String doctorLname;
	
	
	
	public Patientissuedto(String disease, String symptoms) {
		super();
		this.disease = disease;
		this.symptoms = symptoms;
	}
	public Patientissuedto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patientissuedto(String patientFname, String patientLname, String patientEmail, String disease,
			String symptoms, Blob files, String doctorEmail, String doctorFname, String doctorLname) {
		super();
		this.patientFname = patientFname;
		this.patientLname = patientLname;
		this.patientEmail = patientEmail;
		this.disease = disease;
		this.symptoms = symptoms;
		this.files = files;
		this.doctorEmail = doctorEmail;
		this.doctorFname = doctorFname;
		this.doctorLname = doctorLname;
	}
	public String getPatientFname() {
		return patientFname;
	}
	public void setPatientFname(String patientFname) {
		this.patientFname = patientFname;
	}
	public String getPatientLname() {
		return patientLname;
	}
	public void setPatientLname(String patientLname) {
		this.patientLname = patientLname;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public Blob getFiles() {
		return files;
	}
	public void setFiles(Blob files) {
		this.files = files;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getDoctorFname() {
		return doctorFname;
	}
	public void setDoctorFname(String doctorFname) {
		this.doctorFname = doctorFname;
	}
	public String getDoctorLname() {
		return doctorLname;
	}
	public void setDoctorLname(String doctorLname) {
		this.doctorLname = doctorLname;
	}
	@Override
	public String toString() {
		return "Patientissuedto [patientFname=" + patientFname + ", patientLname=" + patientLname + ", patientEmail="
				+ patientEmail + ", disease=" + disease + ", symptoms=" + symptoms + ", files=" + files
				+ ", doctorEmail=" + doctorEmail + ", doctorFname=" + doctorFname + ", doctorLname=" + doctorLname
				+ "]";
	}

	
	
}
