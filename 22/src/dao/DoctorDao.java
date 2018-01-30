package dao;

import java.sql.*;
import java.util.ArrayList;  
import java.util.List;

import connection.*;
import dto.DoctorRegistration;
  
public class DoctorDao {
	
	/*public static DoctorRegistration getRecordById(int id){ 
		DoctorRegistration d=new DoctorRegistration();  
	    try{
	    	Connection con=DB_Conn.getConnection();
	        PreparedStatement ps=con.prepareStatement("select * from doctor_registration where doctor_id=?");  
	        ps.setInt(1,id);
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){  
	            d.setDoctorId(rs.getInt("doctorId"));  
	            d.setFirstName(rs.getString("firstName"));
	            d.setLastName(rs.getString("lastName"));
	            d.setEmail(rs.getString("email"));
	            d.setPassword(rs.getString("password"));
	            d.setContactNo(rs.getString("contactNo"));
	            d.setAddress(rs.getString("address"));  
	            d.setCity(rs.getString("city"));
	            d.setPinCode(rs.getInt("pincode"));
	            d.setDegree(rs.getString("degree"));
	            d.setSpecialization(rs.getString("specialization"));
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return d;  
	}
	
	public DoctorRegistration getUserByEmail(String email, String password) {
		DoctorRegistration doctor = new DoctorRegistration();
		try {
			Connection con=DB_Conn.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM doctor_registration WHERE email LIKE ? AND password LIKE ?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				doctor.setDoctorId(rs.getInt("doctorId"));
				doctor.setFirstName(rs.getString("firstName"));
				doctor.setLastName(rs.getString("lastName"));
				doctor.setEmail(rs.getString("email"));
				doctor.setPassword(rs.getString("password"));
				doctor.setContactNo(rs.getString("contactNo"));
				doctor.setAddress(rs.getString("address"));
				doctor.setCity(rs.getString("city"));
				doctor.setPinCode(rs.getInt("pincode"));
				doctor.setDegree(rs.getString("degree"));
				doctor.setSpecialization(rs.getString("specialization"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return doctor;
	}
*/	
	public static List<DoctorRegistration> getAllRecords(){  
	    List<DoctorRegistration> list=new ArrayList<>();  
	      
	    try{  
	    	Connection con=DB_Conn.getConnection(); 
	        PreparedStatement ps=con.prepareStatement("select * from doctor_registration");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            DoctorRegistration d=new DoctorRegistration();  
	            d.setDoctorId(rs.getInt("doctorid"));  
	            d.setFirstName(rs.getString("firstName"));
	            d.setLastName(rs.getString("lastName"));
	            d.setEmail(rs.getString("email"));
	            d.setPassword(rs.getString("password"));
	            d.setContactNo(rs.getString("contactNo"));
	            d.setAddress(rs.getString("address"));
	            d.setCity(rs.getString("city"));
	            d.setPinCode(rs.getInt("pincode"));
	            d.setDegree(rs.getString("degree"));
				d.setSpecialization(rs.getString("specialization"));
	            list.add(d);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}  
	
	public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=DB_Conn.getConnection(); 
            PreparedStatement ps=con.prepareStatement("delete from doctor_registration where doctor_id=?");  
            ps.setInt(1,id);
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }
}