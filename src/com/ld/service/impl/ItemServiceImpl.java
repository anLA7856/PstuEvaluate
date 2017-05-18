package com.ld.service.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ld.service.ItemService;

public class ItemServiceImpl implements ItemService{
    private HibernateTemplate ht;
	public float getWeight(String itName) {
		StringBuffer sql = new StringBuffer("select itemWeight from Item where itemName = '");
		sql.append(itName+"'");
		float itemWeight = (Float) ht.find(sql.toString()).get(0);
		return itemWeight;
	}
	public HibernateTemplate getHt() {
		return ht;
	}
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}
