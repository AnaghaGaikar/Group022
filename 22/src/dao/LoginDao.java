package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.*;
import dto.*;
public class LoginDao {
	
	
	public static Admin adminValidate(String email, String password) {		
		Admin admin = new Admin();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			conn=DB_Conn.getConnection();
			pst = conn.prepareStatement("select * from admin where email=? and password=?");
			pst.setString(1, email);
			pst.setString(2, password);

			rs = pst.executeQuery();
			while(rs.next()){	
				admin.setEmail(rs.getString("email"));
				admin.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return admin;
	}
	
	public static DoctorRegistration doctorValidate(String email, String password) {		
		DoctorRegistration doctor = new DoctorRegistration();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			conn=DB_Conn.getConnection();
			pst = conn.prepareStatement("select * from doctor_registration where email=? and password=?");
			pst.setString(1, email);
			pst.setString(2, password);
            System.out.println("in doctor");
			rs = pst.executeQuery();
			while(rs.next()){	
				doctor.setEmail(rs.getString("email"));
				doctor.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return doctor;
	}
	
	public static User_registration userValidate(String email, String password) {		
		User_registration user = new User_registration();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			conn=DB_Conn.getConnection();
			pst = conn.prepareStatement("select * from user_registration where email=? and password=?");
			pst.setString(1, email);
			pst.setString(2, password);

			rs = pst.executeQuery();
			while(rs.next()){	
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return user;
	}
}
