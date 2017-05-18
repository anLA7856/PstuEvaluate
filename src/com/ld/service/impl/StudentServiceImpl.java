package com.ld.service.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ld.model.Student;
import com.ld.service.StudentService;

public class StudentServiceImpl implements StudentService {
	 private HibernateTemplate ht;
	    
		public HibernateTemplate getHt() {
			return ht;
		}

		public void setHt(HibernateTemplate ht) {
			this.ht = ht;
		}
	public List<Student> getAllStudent() {
		String sql="from Student";		
		@SuppressWarnings("unchecked")
		List<Student> studentList =ht.find(sql);
		return studentList;
	}

	public void updateGrade(int id , float grade) {
		StringBuffer sql = new StringBuffer("update Student set SGrade =");
		sql.append(grade+" where id =");
		sql.append(id);
		//ht.find(sql.toString());
		ht.bulkUpdate(sql.toString());		
	}

}
