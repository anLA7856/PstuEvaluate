package com.ld.model;

/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager implements java.io.Serializable {

	// Fields

	private Integer id;
	private String MId;
	private Integer MType;
	private String MName;
	private String MPhone;
	private String MPassword;

	// Constructors

	/** default constructor */
	public Manager() {
	}

	/** full constructor */
	public Manager(String MId, Integer MType, String MName, String MPhone,
			String MPassword) {
		this.MId = MId;
		this.MType = MType;
		this.MName = MName;
		this.MPhone = MPhone;
		this.MPassword = MPassword;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMId() {
		return this.MId;
	}

	public void setMId(String MId) {
		this.MId = MId;
	}

	public Integer getMType() {
		return this.MType;
	}

	public void setMType(Integer MType) {
		this.MType = MType;
	}

	public String getMName() {
		return this.MName;
	}

	public void setMName(String MName) {
		this.MName = MName;
	}

	public String getMPhone() {
		return this.MPhone;
	}

	public void setMPhone(String MPhone) {
		this.MPhone = MPhone;
	}

	public String getMPassword() {
		return this.MPassword;
	}

	public void setMPassword(String MPassword) {
		this.MPassword = MPassword;
	}

}