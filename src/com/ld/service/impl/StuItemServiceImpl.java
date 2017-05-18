package com.ld.service.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ld.service.StuItemService;

public class StuItemServiceImpl implements StuItemService {
	private HibernateTemplate ht = new HibernateTemplate();

	public void addStuItem(int s_id, int z_id) {

	}
	//通过学生id获取
	public List<Integer> getItem(int id) {
		StringBuffer sql = new StringBuffer("Select ZId from StuItem where SId = ");
		sql.append(id);
		List<Integer> z_id =  ht.find(sql.toString());
		return z_id;
	}
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	

}
