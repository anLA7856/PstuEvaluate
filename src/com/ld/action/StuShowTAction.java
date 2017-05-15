package com.ld.action;

import java.util.List;

import com.ld.model.Student;
import com.ld.service.StudentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class StuShowTAction extends ActionSupport {
	private Student student = new Student();
	private StudentService studentService;

	// 封装前台表单数据
	public Student getModel() {
		return student;

	}

	public String getAllStudent() {
		List<Student> stuList = studentService.getAllStudent();
		ActionContext.getContext().put("stuList", stuList);
		return SUCCESS;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
