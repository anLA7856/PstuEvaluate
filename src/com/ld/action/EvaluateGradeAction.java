package com.ld.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ld.model.ItemType;
import com.ld.service.ItemService;
import com.ld.service.PoorItemService;
import com.ld.service.StuItemService;
import com.ld.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class EvaluateGradeAction extends ActionSupport {
	private StuItemService stuItemService;
	private PoorItemService poorItemService;
	private ItemService itemService;
	private StudentService studentService;
	private ItemType itemType = new ItemType();

	public ItemType getModel() {
		return itemType;
	}

	public String evaluateGrade() {
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("id"));
		// 通过学生id获取学生指标id集合
		List<Integer> zidList = stuItemService.getItem(id);
		// 通过指标id获取贫困信息
		float grade = 0;
		for (int i = 0; i < zidList.size(); i++) {
			int z_id = zidList.get(i);			
			String itType = poorItemService.getItem(z_id).getItType();
			int itWeight = poorItemService.getItem(z_id).getItWeight();
			//通过itName获取指标权重
			float itemWeight = itemService.getWeight(itType); 
			grade += itWeight*itemWeight;
		}
		//学生评分的修改
		studentService.updateGrade(id,grade);
		return SUCCESS;
	}

	public StuItemService getStuItemService() {
		return stuItemService;
	}

	public void setStuItemService(StuItemService stuItemService) {
		this.stuItemService = stuItemService;
	}

	public PoorItemService getPoorItemService() {
		return poorItemService;
	}

	public void setPoorItemService(PoorItemService poorItemService) {
		this.poorItemService = poorItemService;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public ItemService getItemService() {
		return itemService;
	}

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

}
