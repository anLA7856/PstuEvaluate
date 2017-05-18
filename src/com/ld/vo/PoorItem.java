package com.ld.vo;

import java.util.List;

public class PoorItem {
	private String iType;
	private List<MyItem> myItemList;

	public String getiType() {
		return iType;
	}

	public void setiType(String iType) {
		this.iType = iType;
	}

	public List<MyItem> getMyItemList() {
		return myItemList;
	}

	public void setMyItemList(List<MyItem> myItemList) {
		this.myItemList = myItemList;
	}

}
