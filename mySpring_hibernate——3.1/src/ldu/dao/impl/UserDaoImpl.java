package ldu.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import ldu.dao.UserDao;
import ldu.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao{

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}
	@Resource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void save(User user) {
		try {
			Connection conn=dataSource.getConnection();
			conn.createStatement().executeUpdate("insert into user values(null,'admin','123456')");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("save successful");
		
	}

}
