package com.ld.service;

import java.util.List;

//学生指标
public interface StuItemService {
	//添加学生指标
    void addStuItem(int s_id,int z_id);
    //通过学生id获取指标id
	List<Integer> getItem(int id);
}
