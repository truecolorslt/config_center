package com.lt.dao.impl;

import java.util.List;
import java.util.Map;

import com.lt.dao.IUserDao;
import com.lt.model.User;

public class UserDaoImpl extends BaseDaoImpl implements IUserDao {

	@Override
	public User queryByPrimaryKey(Integer id) {
		return null;
	}

	@Override
	public List<User> queryUserByBatch(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertUserByBatch(List<User> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delteUserByBatch(Map<String, Object> params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
