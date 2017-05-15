package com.ld.model;

/**
 * Ban entity. @author MyEclipse Persistence Tools
 */

public class Ban implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer BId;
	private String BName;
	private Integer ZId;

	// Constructors

	/** default constructor */
	public Ban() {
	}

	/** full constructor */
	public Ban(Integer BId, String BName, Integer ZId) {
		this.BId = BId;
		this.BName = BName;
		this.ZId = ZId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBId() {
		return this.BId;
	}

	public void setBId(Integer BId) {
		this.BId = BId;
	}

	public String getBName() {
		return this.BName;
	}

	public void setBName(String BName) {
		this.BName = BName;
	}

	public Integer getZId() {
		return this.ZId;
	}

	public void setZId(Integer ZId) {
		this.ZId = ZId;
	}

}