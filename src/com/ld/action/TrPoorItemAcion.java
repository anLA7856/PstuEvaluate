package com.ld.action;

import java.util.List;

import com.ld.model.ItemType;
import com.ld.service.PoorItemService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TrPoorItemAcion extends ActionSupport {
	private ItemType itemType = new ItemType();
	private  PoorItemService poorItemService;
	public String trPoorItem() {
        List<ItemType> poorItemList = poorItemService.getAllPoorItem();
        ActionContext.getContext().put("poorItemList", poorItemList);
		return SUCCESS;
	}
	public ItemType getModel(){
		return itemType;
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
