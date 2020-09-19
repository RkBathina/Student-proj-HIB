package com.dxc.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.dxc.beans.User;
import com.dxc.dao.UserDAO;

public class UserServiceImpl implements UserService<User> {

	@Override
	public boolean edit(User e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(User e) {
		// TODO Auto-generated method stub
		boolean res = false;
			UserDAO userDAO = new UserDAO();
			res = userDAO.save(e);
			return res;
		
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static  boolean validate(String username, String password)
	{
		boolean res = false;
			UserDAO userDAO = new UserDAO();
			try {
				if(userDAO.validate(username, password))
				{
					res=true;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return res;
	}

}
