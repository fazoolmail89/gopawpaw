package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRqdaDet entity provides the base persistence definition of the
 * RqdaDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqdaDet implements java.io.Serializable {

	// Fields

	private RqdaDetId id;
	private String rqdaAction;
	private Date rqdaDate;
	private Integer rqdaTime;
	private String rqdaEntUserid;
	private String rqdaChr01;
	private String rqdaChr02;
	private String rqdaChr03;
	private String rqdaChr04;
	private String rqdaQadc01;
	private String rqdaQadc02;
	private String rqdaQadc03;
	private String rqdaQadc04;
	private Double oidRqdaDet;

	// Constructors

	/** default constructor */
	public AbstractRqdaDet() {
	}

	/** minimal constructor */
	public AbstractRqdaDet(RqdaDetId id, Double oidRqdaDet) {
		this.id = id;
		this.oidRqdaDet = oidRqdaDet;
	}

	/** full constructor */
	public AbstractRqdaDet(RqdaDetId id, String rqdaAction, Date rqdaDate,
			Integer rqdaTime, String rqdaEntUserid, String rqdaChr01,
			String rqdaChr02, String rqdaChr03, String rqdaChr04,
			String rqdaQadc01, String rqdaQadc02, String rqdaQadc03,
			String rqdaQadc04, Double oidRqdaDet) {
		this.id = id;
		this.rqdaAction = rqdaAction;
		this.rqdaDate = rqdaDate;
		this.rqdaTime = rqdaTime;
		this.rqdaEntUserid = rqdaEntUserid;
		this.rqdaChr01 = rqdaChr01;
		this.rqdaChr02 = rqdaChr02;
		this.rqdaChr03 = rqdaChr03;
		this.rqdaChr04 = rqdaChr04;
		this.rqdaQadc01 = rqdaQadc01;
		this.rqdaQadc02 = rqdaQadc02;
		this.rqdaQadc03 = rqdaQadc03;
		this.rqdaQadc04 = rqdaQadc04;
		this.oidRqdaDet = oidRqdaDet;
	}

	// Property accessors

	public RqdaDetId getId() {
		return this.id;
	}

	public void setId(RqdaDetId id) {
		this.id = id;
	}

	public String getRqdaAction() {
		return this.rqdaAction;
	}

	public void setRqdaAction(String rqdaAction) {
		this.rqdaAction = rqdaAction;
	}

	public Date getRqdaDate() {
		return this.rqdaDate;
	}

	public void setRqdaDate(Date rqdaDate) {
		this.rqdaDate = rqdaDate;
	}

	public Integer getRqdaTime() {
		return this.rqdaTime;
	}

	public void setRqdaTime(Integer rqdaTime) {
		this.rqdaTime = rqdaTime;
	}

	public String getRqdaEntUserid() {
		return this.rqdaEntUserid;
	}

	public void setRqdaEntUserid(String rqdaEntUserid) {
		this.rqdaEntUserid = rqdaEntUserid;
	}

	public String getRqdaChr01() {
		return this.rqdaChr01;
	}

	public void setRqdaChr01(String rqdaChr01) {
		this.rqdaChr01 = rqdaChr01;
	}

	public String getRqdaChr02() {
		return this.rqdaChr02;
	}

	public void setRqdaChr02(String rqdaChr02) {
		this.rqdaChr02 = rqdaChr02;
	}

	public String getRqdaChr03() {
		return this.rqdaChr03;
	}

	public void setRqdaChr03(String rqdaChr03) {
		this.rqdaChr03 = rqdaChr03;
	}

	public String getRqdaChr04() {
		return this.rqdaChr04;
	}

	public void setRqdaChr04(String rqdaChr04) {
		this.rqdaChr04 = rqdaChr04;
	}

	public String getRqdaQadc01() {
		return this.rqdaQadc01;
	}

	public void setRqdaQadc01(String rqdaQadc01) {
		this.rqdaQadc01 = rqdaQadc01;
	}

	public String getRqdaQadc02() {
		return this.rqdaQadc02;
	}

	public void setRqdaQadc02(String rqdaQadc02) {
		this.rqdaQadc02 = rqdaQadc02;
	}

	public String getRqdaQadc03() {
		return this.rqdaQadc03;
	}

	public void setRqdaQadc03(String rqdaQadc03) {
		this.rqdaQadc03 = rqdaQadc03;
	}

	public String getRqdaQadc04() {
		return this.rqdaQadc04;
	}

	public void setRqdaQadc04(String rqdaQadc04) {
		this.rqdaQadc04 = rqdaQadc04;
	}

	public Double getOidRqdaDet() {
		return this.oidRqdaDet;
	}

	public void setOidRqdaDet(Double oidRqdaDet) {
		this.oidRqdaDet = oidRqdaDet;
	}

}