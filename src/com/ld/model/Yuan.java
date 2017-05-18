package com.ld.model;

/**
 * Yuan entity. @author MyEclipse Persistence Tools
 */

public class Yuan implements java.io.Serializable {

	// Fields

	private Integer id;
	private String YName;

	// Constructors

	/** default constructor */
	public Yuan() {
	}

	/** full constructor */
	public Yuan(String YName) {
		this.YName = YName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getYName() {
		return this.YName;
	}

	public void setYName(String YName) {
		this.YName = YName;
	}

}