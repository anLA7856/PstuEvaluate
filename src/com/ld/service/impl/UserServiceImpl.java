package com.ld.service.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ld.model.Manager;
import com.ld.service.UserService;

public class UserServiceImpl implements UserService{
	private HibernateTemplate ht;	

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public int getStudent(String username, String password) {
		StringBuffer sql=new StringBuffer("From Student where s_id='");
		sql.append(username+"' and s_password='");
		sql.append(password+"' ");
		return ht.find(sql.toString()).size();
	}

	@SuppressWarnings("unchecked")
	public List<Manager> getManager(String username, String password) {
		StringBuffer sql=new StringBuffer("From Manager where m_id='");
		sql.append(username+"' and m_password='");
		sql.append(password+"' ");
		return  ht.find(sql.toString());
	}
	

}
