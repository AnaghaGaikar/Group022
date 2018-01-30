package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

import connection.*;
import dto.*;
public class User_Registrationdao {

		private DB_Conn mcon;

		public User_Registrationdao() {
			mcon=new DB_Conn();
		}
		
		public int RegisterUser(User_registration userregister)
		{
			int i=0;
			
			try {
				Connection con=mcon.getConnection();
				PreparedStatement s=con.prepareStatement("insert into user_registration(first_name,last_name,email,password,address,state,city,pincode,gender,age,contact_no) values(?,?,?,?,?,?,?,?,?,?,?)");
				s.setString(1, userregister.getFirstname());
				s.setString(2, userregister.getLastname());
				s.setString(3, userregister.getEmail());
				s.setString(4, userregister.getPassword());
				s.setString(5, userregister.getAddress());
				s.setString(6, userregister.getState());
				s.setString(7, userregister.getCity());
				s.setInt(8, userregister.getPincode());
				s.setString(9, userregister.getGender());
				s.setInt(10, userregister.getAge());
				s.setString(11, userregister.getContact());
				i=s.executeUpdate();
				con.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return i;
		}
		
		
		public ArrayList<User_registration> selectUser(String email)
		{
			ArrayList<User_registration> list=new ArrayList<User_registration>();
			
			System.out.println("dao"+ email);
			Connection con=mcon.getConnection();
			try {
				PreparedStatement ps=con.prepareStatement("select first_name,last_name,email,address,state,city,pincode,age,contact_no from patient_issue where email=?");
				ps.setString(1,email );
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					User_registration update=new User_registration();
					update.setFirstname(rs.getString(1));
					update.setLastname(rs.getString(2));
					update.setEmail(rs.getString(3));
					update.setAddress(rs.getString(4));
					update.setState(rs.getString(5));
					update.setCity(rs.getString(6));
					update.setPincode(rs.getInt(7));
					update.setAge(rs.getInt(8));
					update.setContact(rs.getString(9));
					list.add(update);
					
				}
				
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("dao"+list);
			return list;
		}
		
		public int updateUser(User_registration user,String email)
		{
			int i=0;
			System.out.println("update"+ email);
			
			Connection con=mcon.getConnection();
			try {
				PreparedStatement ps=con.prepareStatement("update user_registration set address=?,state=?,city=?,pincode=?,age=?,contact_no=? where email=?");
				
				ps.setString(1, user.getAddress());
				ps.setString(2, user.getState());
				ps.setString(3, user.getCity());
				ps.setInt(4, user.getPincode());
				ps.setInt(5, user.getAge());
				ps.setString(6, user.getContact());
				ps.setString(7, email);
				i=ps.executeUpdate();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return i;
		}
		
		public ArrayList<Patientissuedto> getMedicalHistory(String email)
		{
			ArrayList<Patientissuedto> list=new ArrayList<Patientissuedto>();
			
			System.out.println("dao"+ email);
			Connection con=mcon.getConnection();
			try {
				System.out.println("in dao of get mrdi");
				PreparedStatement ps=con.prepareStatement("select patient_fname,patient_lname,patient_email,disease,symptoms,doctor_email,doctor_fname,doctor_lname from patient_issue where patient_email=?");
				ps.setString(1,email );
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					Patientissuedto pdto=new Patientissuedto();
					pdto.setPatientFname(rs.getString(1));
					pdto.setPatientLname(rs.getString(2));
					pdto.setPatientEmail(rs.getString(3));
					pdto.setDisease(rs.getString(4));
					pdto.setSymptoms(rs.getString(5));
					pdto.setDoctorEmail(rs.getString(6));
					pdto.setDoctorFname(rs.getString(7));
					pdto.setDoctorLname(rs.getString(8));
					
					list.add(pdto);
					
				}
				System.out.println(list);
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("dao"+list);
			return list;
		}
			
}
