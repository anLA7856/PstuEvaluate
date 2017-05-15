package com.ld.model;

/**
 * RankNum entity. @author MyEclipse Persistence Tools
 */

public class RankNum implements java.io.Serializable {

	// Fields

	private Integer id;
	private String rnName;
	private Integer rnNum;

	// Constructors

	/** default constructor */
	public RankNum() {
	}

	/** full constructor */
	public RankNum(String rnName, Integer rnNum) {
		this.rnName = rnName;
		this.rnNum = rnNum;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRnName() {
		return this.rnName;
	}

	public void setRnName(String rnName) {
		this.rnName = rnName;
	}

	public Integer getRnNum() {
		return this.rnNum;
	}

	public void setRnNum(Integer rnNum) {
		this.rnNum = rnNum;
	}

}