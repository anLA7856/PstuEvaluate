package com.ld.model;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer id;
	private String SId;
	private String SPassword;
	private String SName;
	private Integer SYuan;
	private Integer SZhuan;
	private Integer SBan;
	private String SPhone;
	private Float SGrade;
	private Integer SRank;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String SId, String SPassword, String SName, Integer SYuan,
			Integer SZhuan, Integer SBan, String SPhone, Float SGrade,
			Integer SRank) {
		this.SId = SId;
		this.SPassword = SPassword;
		this.SName = SName;
		this.SYuan = SYuan;
		this.SZhuan = SZhuan;
		this.SBan = SBan;
		this.SPhone = SPhone;
		this.SGrade = SGrade;
		this.SRank = SRank;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSId() {
		return this.SId;
	}

	public void setSId(String SId) {
		this.SId = SId;
	}

	public String getSPassword() {
		return this.SPassword;
	}

	public void setSPassword(String SPassword) {
		this.SPassword = SPassword;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	public Integer getSYuan() {
		return this.SYuan;
	}

	public void setSYuan(Integer SYuan) {
		this.SYuan = SYuan;
	}

	public Integer getSZhuan() {
		return this.SZhuan;
	}

	public void setSZhuan(Integer SZhuan) {
		this.SZhuan = SZhuan;
	}

	public Integer getSBan() {
		return this.SBan;
	}

	public void setSBan(Integer SBan) {
		this.SBan = SBan;
	}

	public String getSPhone() {
		return this.SPhone;
	}

	public void setSPhone(String SPhone) {
		this.SPhone = SPhone;
	}

	public Float getSGrade() {
		return SGrade;
	}

	public void setSGrade(Float sGrade) {
		SGrade = sGrade;
	}

	public Integer getSRank() {
		return this.SRank;
	}

	public void setSRank(Integer SRank) {
		this.SRank = SRank;
	}

}