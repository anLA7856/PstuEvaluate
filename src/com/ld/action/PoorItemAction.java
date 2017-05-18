package com.ld.action;

import java.util.ArrayList;
import java.util.List;

import com.ld.model.ItemType;
import com.ld.service.PoorItemService;
import com.ld.vo.MyItem;
import com.ld.vo.PoorItem;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class PoorItemAction extends ActionSupport{
	private PoorItem poorItem;
	private MyItem myItem;
	private PoorItemService poorItemService;
	public String getAllPoorItem(){
		List<PoorItem> poorItemList = new ArrayList<PoorItem>();
		List<MyItem> myItemList = null;
		List<ItemType> itemTypeList = poorItemService.getAllPoorItem();
		String iType = null;
		//指标循环
		for(int i=0;i<itemTypeList.size();i++){
			//先将数据封装
			    myItem = new MyItem(); 
			    myItem.setId(itemTypeList.get(i).getId());
			    myItem.setiName(itemTypeList.get(i).getItName());
				myItem.setiWeight(itemTypeList.get(i).getItWeight());
				
				
			//第一条记录直接加入
			if(iType == null){
				poorItem = new PoorItem();
				myItemList = new ArrayList<MyItem>();				
				iType = itemTypeList.get(i).getItType(); 
				poorItem.setiType(iType);
												
				myItemList.add(myItem);
			}
			else{
				if(iType.equals(itemTypeList.get(i).getItType())){
					//相等的					
					myItemList.add(myItem);
				}else{
					iType = itemTypeList.get(i).getItType();
					poorItem.setMyItemList(myItemList);
					poorItemList.add(poorItem);
					
					myItemList = new ArrayList<MyItem>();	
					poorItem = new PoorItem();
					
					poorItem.setiType(iType);
					myItemList.add(myItem);
				}				
			}
			//判断最后一条记录
			if(i == itemTypeList.size()-1){				
				poorItem.setMyItemList(myItemList);
				poorItemList.add(poorItem);
			}
					
		}
	  //System.out.println(poorItemList.size());
		ActionContext.getContext().put("poorItemList", poorItemList);
		return SUCCESS;
	}
	
	public MyItem getMyItem() {
		return myItem;
	}

	public void setMyItem(MyItem myItem) {
		this.myItem = myItem;
	}

	public PoorItem getPoorItem() {
		return poorItem;
	}
	public void setPoorItem(PoorItem poorItem) {
		this.poorItem = poorItem;
	}
	public PoorItemService getPoorItemService() {
		return poorItemService;
	}
	public void setPoorItemService(PoorItemService poorItemService) {
		this.poorItemService = poorItemService;
	}
	
}
