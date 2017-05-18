package com.ld.service.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ld.model.ItemType;
import com.ld.service.PoorItemService;

public class PoorItemServiceImpl implements PoorItemService{
	 private HibernateTemplate ht;
	    
		public HibernateTemplate getHt() {
			return ht;
		}

		public void setHt(HibernateTemplate ht) {
			this.ht = ht;
		}
	
	public List<ItemType> getAllPoorItem() {
		String sql="from ItemType order by itType desc";
		@SuppressWarnings("unchecked")
		List<ItemType> itemTypeList = ht.find(sql);
		return itemTypeList;
	}

	public ItemType getItem(int z_id) {
		String sql = "from ItemType where id = ";
		sql = sql + z_id;
		@SuppressWarnings("unchecked")
		ItemType itemType = (ItemType) ht.find(sql).get(0);
		return itemType;
	}

}
