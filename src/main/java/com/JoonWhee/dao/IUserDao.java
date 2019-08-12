package com.JoonWhee.dao;

import java.util.List;
import java.util.Map;
 
import com.JoonWhee.dto.User;
 
public interface IUserDao {
	
	public User queryByPrimaryKey(Integer id);
	
	public List<User> getAllUser();
		
	public void insertUser(User user);
	
	public void insertUserByBatch(List<User> list);
	
	public void deleteByPrimaryKey(Integer id);
	
	public void delteUserByBatch(Map<String,Object> params);
	
	public void updateByPrimaryKey(User user);
	
}
