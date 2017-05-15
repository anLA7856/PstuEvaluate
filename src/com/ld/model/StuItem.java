package com.ld.model;

/**
 * StuItem entity. @author MyEclipse Persistence Tools
 */

public class StuItem implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer SId;
	private Integer ZId;

	// Constructors

	/** default constructor */
	public StuItem() {
	}

	/** full constructor */
	public StuItem(Integer SId, Integer ZId) {
		this.SId = SId;
		this.ZId = ZId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public Integer getZId() {
		return this.ZId;
	}

	public void setZId(Integer ZId) {
		this.ZId = ZId;
	}

}