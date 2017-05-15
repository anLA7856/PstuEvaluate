package com.ld.vo;

public class MyItem {
	private int id;
	private String iName;
	private int iWeight;

	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public int getiWeight() {
		return iWeight;
	}

	public void setiWeight(int iWeight) {
		this.iWeight = iWeight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "MyItem [id=" + id + ", iName=" + iName + ", iWeight=" + iWeight
				+ "]";
	}

	
	
}