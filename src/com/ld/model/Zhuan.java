package com.ld.model;

/**
 * Zhuan entity. @author MyEclipse Persistence Tools
 */

public class Zhuan implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer ZId;
	private Integer YId;
	private String ZName;

	// Constructors

	/** default constructor */
	public Zhuan() {
	}

	/** full constructor */
	public Zhuan(Integer ZId, Integer YId, String ZName) {
		this.ZId = ZId;
		this.YId = YId;
		this.ZName = ZName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getZId() {
		return this.ZId;
	}

	public void setZId(Integer ZId) {
		this.ZId = ZId;
	}

	public Integer getYId() {
		return this.YId;
	}

	public void setYId(Integer YId) {
		this.YId = YId;
	}

	public String getZName() {
		return this.ZName;
	}

	public void setZName(String ZName) {
		this.ZName = ZName;
	}

}