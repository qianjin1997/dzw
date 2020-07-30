package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.UsersMapper;
import com.accp.domain.Users;
import com.accp.domain.UsersExample;

/**
 * 登录
 * 
 *
 */
@Service
@Transactional
public class LoginService {

	@Autowired
	private UsersMapper userMapper;
	
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	public Users login(Users user) {
		UsersExample example = new UsersExample();
		example.createCriteria().andAusernameEqualTo(user.getAusername()).andApasswordEqualTo(user.getApassword());
		return userMapper.selectByExample(example).get(0);
	}
}
