package com.ld.service;

import java.util.List;

import com.ld.model.ItemType;

public interface PoorItemService {
	//获取全部指标信息
     List<ItemType> getAllPoorItem();
    //获取该学生贫困信息
	List<ItemType> getItem(int z_id);
}
