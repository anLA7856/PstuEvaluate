package com.ld.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ld.model.ItemType;
import com.ld.service.PoorItemService;
import com.ld.service.StuItemService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class EvaluateStuAction extends ActionSupport {
	private StuItemService stuItemService;
	private PoorItemService poorItemService;
	private ItemType itemType = new ItemType();

	public ItemType getModel() {
		return itemType;
	}

	@SuppressWarnings("null")
	public String evaluateStu() {
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("id"));
		//System.out.println(this);
		// 通过学生id获取学生指标id集合
		List<Integer> zidList = stuItemService.getItem(id);
		// 通过指标id获取贫困信息
		List<ItemType> itemTypeList = new ArrayList<ItemType>();
		for(int i=0 ;i<zidList.size();i++){
			int z_id = zidList.get(i);
			 itemTypeList.add(poorItemService.getItem(z_id));
		}		
		// 数据信息封装传递到前台
		ActionContext.getContext().put("id", id);
		ActionContext.getContext().put("itemTypeList", itemTypeList);
		return SUCCESS;
	}

	
	public StuItemService getStuItemService() {
		return stuItemService;
	}

	public void setStuItemService(StuItemService stuItemService) {
		this.stuItemService = stuItemService;
		//System.out.println(this);
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

}
