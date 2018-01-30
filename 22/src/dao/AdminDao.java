package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.MyConnection;
import dto.DoctorRegistration;
import dto.PatientIssue;
import dto.User_registration;

public class AdminDao {
	
	
private static MyConnection mcon;

	public AdminDao()
	{
		mcon = new MyConnection();
	}
	

	public static ArrayList<DoctorRegistration> getDoctorsRecords(){  
	    ArrayList<DoctorRegistration> list=new ArrayList<>();  
	      
	    try{  
	    	Connection con= mcon.getConn();
	        PreparedStatement ps=con.prepareStatement("select * from doctor_registration");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            DoctorRegistration d=new DoctorRegistration();  
	          
	            d.setDoctorId(rs.getInt(1));  
	            d.setFirstName(rs.getString(2));
	            d.setLastName(rs.getString(3));
	            d.setEmail(rs.getString(4));
	            d.setPassword(rs.getString(5));
	            d.setContactNo(rs.getString(6));
	            d.setAddress(rs.getString(7));
	            d.setCity(rs.getString(8));
	            d.setPinCode(rs.getInt(9));
	            d.setDegree(rs.getString(10));
				d.setSpecialization(rs.getString(11));
	            list.add(d);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}  
	
	
	public static ArrayList<User_registration> getUserRecords()
	{
		ArrayList<User_registration> list=new ArrayList<>();  
		
		  try{  
		    	Connection con= mcon.getConn();
		        PreparedStatement ps=con.prepareStatement("select * from user_registration");  
		        ResultSet rs=ps.executeQuery();  
		        
		        while(rs.next()){  
		            User_registration u=new User_registration();  
		            u.setUserId(rs.getInt(1));
		            u.setFirstname(rs.getString(2));
		            u.setLastname(rs.getString(3));
		            u.setEmail(rs.getString(4));
		            u.setPassword(rs.getString(5));
		            u.setAddress(rs.getString(6));
		            u.setState(rs.getString(7));
		            u.setCity(rs.getString(8));
		            u.setPincode(rs.getInt(9));
		            u.setGender(rs.getString(10));
		            u.setAge(rs.getInt(11));
		            u.setContact(rs.getString(12));           
		            list.add(u);  
		        }  
		    }catch(Exception e){System.out.println(e);}  
		
		return list;
	}
	
	public static ArrayList<PatientIssue> getPatientIssue()
	{
		ArrayList<PatientIssue> list=new ArrayList<>();  
		
		  try{  
		    	Connection con= mcon.getConn();
		        PreparedStatement ps=con.prepareStatement("select * from patient_issue");  
		        ResultSet rs=ps.executeQuery();  
		        
		        while(rs.next()){  
		            PatientIssue u=new PatientIssue();  
		           
		            u.setPatientId(rs.getInt(1));
		            u.setPatientFname(rs.getString(2));
		            u.setPatientLname(rs.getString(3));
		            u.setPatientEmail(rs.getString(4));
		            u.setDisease(rs.getString(5));
		            u.setSymptoms(rs.getString(6));
		            u.setFiles(rs.getString(7));
		            u.setDoctorEmail(rs.getString(8));
		            u.setDoctorFname(rs.getString(9));
		            u.setDoctorLname(rs.getString(10));
		            list.add(u);
		           
		        }  
		    }catch(Exception e){System.out.println(e);}  
		
		return list;
	}
	
	
	public static  int DeleteDoctor(int pi)
	{
		int i =0;
		try {
			System.out.print(pi);
			
			Connection con = mcon.getConn();
			PreparedStatement s = con.prepareStatement("delete from doctor_registration where doctor_id=?");
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
	
	public static  int Deletepatient(int pi)
	{
		int i =0;
		try {
			System.out.print(pi);
			
			Connection con = mcon.getConn();
			PreparedStatement s = con.prepareStatement("delete from user_registration where patient_id=?");
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
	
}
