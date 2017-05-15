package com.ld.service.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ld.service.StuItemService;

public class StuItemServiceImpl implements StuItemService {
    private HibernateTemplate ht = new HibernateTemplate();
	public void addStuItem(int s_id, int z_id) {		

	}
	public HibernateTemplate getHt() {
		return ht;
	}
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	public int getItem(int id) {
		String sql = "from StuItem s where s.SId = " + id;
		int z_id = (Integer) ht.find(sql).get(0);
		return z_id;
	}

}
