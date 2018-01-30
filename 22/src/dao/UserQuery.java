package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.*;
import dto.*;

public class UserQuery {

	private DB_Conn mcon;

	public UserQuery() {
		
		mcon=new DB_Conn();
	}
	
	public int Register_User_Query(Patientissuedto patient,String email) 
	{
		int i=0;
		
		
		try {
			
		
			Connection conn=mcon.getConnection();
			
			PreparedStatement p=conn.prepareStatement("select patient_id,first_name,last_name,email from user_registration where email= ?");
			p.setString(1, email);
			ResultSet rs=p.executeQuery();
			
			int pid;
			String fname;
			String lname;
			String uemail;
			while(rs.next())
			{
				 pid=rs.getInt(1);
				 fname=rs.getString(2);
				 lname=rs.getString(3);
				 uemail=rs.getString(4);
				
			
		
			PreparedStatement ps=conn.prepareStatement("insert into patient_issue (patient_id,patient_fname,patient_lname,patient_email,disease,symptoms) values (?,?,?,?,?,?)");
			ps.setInt(1, pid);
			ps.setString(2, fname);
			ps.setString(3, lname);
			ps.setString(4, email);
			ps.setString(5, patient.getDisease());
			ps.setString(6, patient.getSymptoms());
			
			i=ps.executeUpdate();
			conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return i;
	}
	
	
	public int upload(String path,String email) 
	{
		int i=0;
		System.out.println(email+""+ path);
		Connection conn=mcon.getConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("update patient_issue set files= ? where patient_email=? and files is null");
			ps.setString(1, path);
			ps.setString(2, email);
			i=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return i;
	}
}

