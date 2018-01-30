package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.catalina.connector.Request;

import connection.MyConnection;
import dto.Admin;
import dto.DoctorRegistration;
import dto.PatientIssue;

// TODO: Auto-generated Javadoc
/**
 * The Class DoctorRegistrationDao.
 */
public class DoctorRegistrationDao {
	
	/** The mcon. */
	private MyConnection mcon;
	
	/**
	 * Instantiates a new doctor registration dao.
	 */
	public DoctorRegistrationDao()
	{
		mcon = new MyConnection();
	}
	
	/**
	 * Register doctor.
	 *
	 * @param doctorregister the doctorregister
	 * @return the int
	 */
	public int RegisterDoctor(DoctorRegistration doctorregister)
	{
		int i = 0;
		try {
			System.out.print(doctorregister.getFirstName());
			Connection con = mcon.getConn();
			PreparedStatement s = con.prepareStatement("insert into doctor_registration(dfirst_name,dlast_name,email,password,contact_no,address,city,pincode,degree,specialization) values(?,?,?,?,?,?,?,?,?,?)");
			s.setString(1, doctorregister.getFirstName());
			s.setString(2, doctorregister.getLastName());
			s.setString(3, doctorregister.getEmail());
			s.setString(4, doctorregister.getPassword());
			s.setString(5, doctorregister.getContactNo());
			s.setString(6, doctorregister.getAddress());
			s.setString(7, doctorregister.getCity());
			s.setInt(8, doctorregister.getPinCode());
			s.setString(9, doctorregister.getDegree());
			s.setString(10, doctorregister.getSpecialization());
			
			i = s.executeUpdate();
			con.close();
			
 		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
		
	}
	
	/**
	 * Select treating patients.
	 *
	 * @param a the a
	 * @return the array list
	 */
	public ArrayList<PatientIssue> SelectTreatingPatients(Admin a)
	{
		
		ArrayList<PatientIssue> list = new ArrayList<>();
		try {
			
			Connection con = mcon.getConn();
			PreparedStatement s = con.prepareStatement("select patient_id,patient_fname,patient_lname,patient_email,disease,symptoms,files from patient_issue where doctor_email=(select email from doctor_registration where email=?) and disease=(select specialization from doctor_registration where email=?) ");
			s.setString(1, a.getEmail());
			s.setString(2, a.getEmail());
			
			ResultSet rs = s.executeQuery();
			
			while(rs.next())
			{
				
				PatientIssue pi = new PatientIssue();
				pi.setPatientId(rs.getInt(1));
				pi.setPatientFname(rs.getString(2));
				pi.setPatientLname(rs.getString(3));
				pi.setPatientEmail(rs.getString(4));
				pi.setDisease(rs.getString(5));
				pi.setSymptoms(rs.getString(6));
				pi.setFiles(rs.getString(7));	
				list.add(pi);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.print(list);
		return list;
	}
	
	
	/**
	 * Select all patients.
	 *
	 * @param a the a
	 * @return the array list
	 */
	public ArrayList<PatientIssue> SelectAllPatients(Admin a)
	{
		System.out.println("dao"+a.getEmail());
		ArrayList<PatientIssue> list = new ArrayList<>();
		try {
			
			Connection con = mcon.getConn();
			PreparedStatement s = con.prepareStatement("select patient_id,patient_fname,patient_lname,patient_email,disease,symptoms,files from patient_issue where doctor_email is null and disease=(select specialization from doctor_registration where email=?)");
			s.setString(1, a.getEmail());
			
			ResultSet rs = s.executeQuery();
			
			while(rs.next())
			{
				
				PatientIssue pi = new PatientIssue();
				pi.setPatientId(rs.getInt(1));
				pi.setPatientFname(rs.getString(2));
				pi.setPatientLname(rs.getString(3));
				pi.setPatientEmail(rs.getString(4));
				pi.setDisease(rs.getString(5));
				pi.setSymptoms(rs.getString(6));
				pi.setFiles(rs.getString(7));	
				list.add(pi);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.print("dao"+list);
		return list;
	}
	
	/**
	 * Adds the patientto list.
	 *
	 * @param a the a
	 * @param pi the pi
	 * @return the int
	 */
	public int AddPatienttoList(Admin a, int pi)
	{
		int i = 0;
		try {
			System.out.print(a.getEmail());
			
			Connection con = mcon.getConn();
			PreparedStatement s = con.prepareStatement("update patient_issue set doctor_email=?,doctor_fname=(select dfirst_name from doctor_registration where email=? ),doctor_lname=(select dlast_name from doctor_registration where email=?) where patient_id = ? ;");
			s.setString(1, a.getEmail());
			s.setString(2, a.getEmail());
			s.setString(3, a.getEmail());
			s.setInt(4, pi);
			
			i = s.executeUpdate();
			con.close();
			
 			} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return i;	
	}

	/**
	 * Delete patient from list.
	 *
	 * @param pi the pi
	 * @return the int
	 */
	public int DeletePatientFromList(int pi)
	{
		int i = 0;
		try {
			
			Connection con = mcon.getConn();
			PreparedStatement s = con.prepareStatement("update patient_issue set doctor_email=null,doctor_fname=null,doctor_lname=null where patient_id = ? ;");		
			s.setInt(1, pi);			
			i = s.executeUpdate();
			con.close();
			
 			} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return i;	
	}
	
	
	public DoctorRegistration selectforupdate(Admin a)
	{
		DoctorRegistration d = new DoctorRegistration();
		try {
			Connection con = mcon.getConn();
			PreparedStatement s = con.prepareStatement("select dfirst_name,dlast_name,email,password,contact_no,address,city,pincode,degree,specialization from doctor_registration where email=?");
			s.setString(1, a.getEmail());
			
			ResultSet rs = s.executeQuery();
			if(rs.next())
			{
				d.setFirstName(rs.getString(1));
				d.setLastName(rs.getString(2));
				d.setEmail(rs.getString(3));
				d.setPassword(rs.getString(4));
				d.setContactNo(rs.getString(5));
				d.setAddress(rs.getString(6));
				d.setCity(rs.getString(7));
				d.setPinCode(rs.getInt(8));
				d.setDegree(rs.getString(9));
				d.setSpecialization(rs.getString(10));
				
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return d;
		
	}

	
	public int UpdateDoctorProfile(DoctorRegistration upateprofile)
	{
		int i = 0;
		try {
			System.out.print(upateprofile.getFirstName());
			Connection con = mcon.getConn();
			PreparedStatement s = con.prepareStatement("update doctor_registration set dfirst_name=?,dlast_name=?,password=?,contact_no=?,address=?,city=?,pincode=?,degree=?,specialization=? where email=?");
			s.setString(1, upateprofile.getFirstName());
			s.setString(2, upateprofile.getLastName());
			s.setString(3, upateprofile.getPassword());
			s.setString(4, upateprofile.getContactNo());
			s.setString(5, upateprofile.getAddress());
			s.setString(6, upateprofile.getCity());
			s.setInt(7, upateprofile.getPinCode());
			s.setString(8, upateprofile.getDegree());
			s.setString(9, upateprofile.getSpecialization());
			s.setString(10, upateprofile.getEmail());
			
			i = s.executeUpdate();
			con.close();
			
 		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
		
	}
}



























