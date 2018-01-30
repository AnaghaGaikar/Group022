package dto;

import java.sql.Blob;

// TODO: Auto-generated Javadoc
/**
 * The Class PatientIssue.
 */
public class PatientIssue {
	
	/** The patient id. */
	private int patientId;
	
	/** The patient fname. */
	private String patientFname;
	
	/** The patient lname. */
	private String patientLname;
	
	/** The patient email. */
	private String patientEmail;
	
	/** The disease. */
	private String disease;
	
	/** The symptoms. */
	private String symptoms;
	
	/** The files. */
	private String files;
	
	/** The doctor email. */
	private String doctorEmail;
	
	/** The doctor fname. */
	private String doctorFname;
	
	/** The doctor lname. */
	private String doctorLname;
	
	

	public PatientIssue() {
		super();
	}



	@Override
	public String toString() {
		return "PatientIssue [patientId=" + patientId + ", patientFname=" + patientFname + ", patientLname="
				+ patientLname + ", patientEmail=" + patientEmail + ", disease=" + disease + ", symptoms=" + symptoms
				+ ", files=" + files + ", doctorEmail=" + doctorEmail + ", doctorFname=" + doctorFname
				+ ", doctorLname=" + doctorLname + "]";
	}



	public PatientIssue(String patientFname, String patientLname, String patientEmail, String disease, String symptoms,
			String files, String doctorEmail, String doctorFname, String doctorLname) {
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



	public int getPatientId() {
		return patientId;
	}



	public void setPatientId(int patientId) {
		this.patientId = patientId;
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



	public String getFiles() {
		return files;
	}



	public void setFiles(String files) {
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
	
	
}