package com.ld.model;

/**
 * ItemType entity. @author MyEclipse Persistence Tools
 */

public class ItemType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String itType;
	private String itName;
	private Integer itWeight;

	// Constructors

	/** default constructor */
	public ItemType() {
	}

	/** full constructor */
	public ItemType(String itType, String itName, Integer itWeight) {
		this.itType = itType;
		this.itName = itName;
		this.itWeight = itWeight;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItType() {
		return this.itType;
	}

	public void setItType(String itType) {
		this.itType = itType;
	}

	public String getItName() {
		return this.itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public Integer getItWeight() {
		return this.itWeight;
	}

	public void setItWeight(Integer itWeight) {
		this.itWeight = itWeight;
	}

}