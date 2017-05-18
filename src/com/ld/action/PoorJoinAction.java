package com.ld.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.ld.model.ItemType;
import com.ld.service.PoorItemService;
import com.ld.service.StuItemService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class PoorJoinAction extends ActionSupport implements
		ServletRequestAware {
	private HttpServletRequest request = null;
   
	private PoorItemService poorItemService;
    private StuItemService stuItemService;
	public String addStuItem() {
		// 获得指标名称
		String iType = null;
		List<String> iTypeList = new ArrayList<String>();
		List<ItemType> itemTypeList = poorItemService.getAllPoorItem();
		for (int i = 0; i < itemTypeList.size(); i++) {
			iType = itemTypeList.get(i).getItType();
			if (!(iTypeList.contains(iType))) {
				iTypeList.add(iType);
			}
		}
		request =ServletActionContext.getRequest();
		int z_id ;
        int s_id =Integer.parseInt(request.getParameter("s_id"));
		// 通过名称获得该学生所有对应指标项
		for (int i = 0; i < iTypeList.size(); i++) {
		    z_id = Integer.parseInt(request.getParameter(iTypeList.get(i)));
			stuItemService.addStuItem(s_id, z_id);
		}
		
		return SUCCESS;
	}

	public void setServletRequest(HttpServletRequest req) {
		request = req;

	}

	public PoorItemService getPoorItemService() {
		return poorItemService;
	}

	public void setPoorItemService(PoorItemService poorItemService) {
		this.poorItemService = poorItemService;
	}

	public StuItemService getStuItemService() {
		return stuItemService;
	}

	public void setStuItemService(StuItemService stuItemService) {
		this.stuItemService = stuItemService;
	}

}
