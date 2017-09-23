package com.ldu.register.service;

import java.sql.*;

import com.ldu.register.model.User;

public class UserManager {
	public boolean exists(User u){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/spring_register","root","123456");
			String sqlQuery="select * from user where userName=?";
			PreparedStatement ps=conn.prepareStatement(sqlQuery);
			ps.setString(1, u.getUserName());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				conn.close();
				ps.close();
				return true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean add(User u){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/spring_register","root","123456");
			String sql="insert into user values(null,?,?)";
			PreparedStatement ps2=conn.prepareStatement(sql);
			ps2.setString(1, u.getUserName());
			ps2.setString(2, u.getPassWord());
			int count=ps2.executeUpdate();
			if(count>0){
				conn.close();
				ps2.close();
				return true;
			}else{
				conn.close();
				ps2.close();
				return false;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
