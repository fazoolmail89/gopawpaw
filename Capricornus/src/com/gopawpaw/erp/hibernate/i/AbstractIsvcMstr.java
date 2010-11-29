package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIsvcMstr entity provides the base persistence definition of the
 * IsvcMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIsvcMstr implements java.io.Serializable {

	// Fields

	private IsvcMstrId id;
	private Double isvcMinValue;
	private Double isvcPercentage;
	private Double isvcPerUnit;
	private Double isvcPerWeight;
	private Date isvcModDate;
	private String isvcModUserid;
	private String isvcUser1;
	private String isvcUser2;
	private String isvcQadc01;
	private String isvcQadc02;
	private String isvcUm;
	private Double oidIsvcMstr;

	// Constructors

	/** default constructor */
	public AbstractIsvcMstr() {
	}

	/** full constructor */
	public AbstractIsvcMstr(IsvcMstrId id, Double isvcMinValue,
			Double isvcPercentage, Double isvcPerUnit, Double isvcPerWeight,
			Date isvcModDate, String isvcModUserid, String isvcUser1,
			String isvcUser2, String isvcQadc01, String isvcQadc02,
			String isvcUm, Double oidIsvcMstr) {
		this.id = id;
		this.isvcMinValue = isvcMinValue;
		this.isvcPercentage = isvcPercentage;
		this.isvcPerUnit = isvcPerUnit;
		this.isvcPerWeight = isvcPerWeight;
		this.isvcModDate = isvcModDate;
		this.isvcModUserid = isvcModUserid;
		this.isvcUser1 = isvcUser1;
		this.isvcUser2 = isvcUser2;
		this.isvcQadc01 = isvcQadc01;
		this.isvcQadc02 = isvcQadc02;
		this.isvcUm = isvcUm;
		this.oidIsvcMstr = oidIsvcMstr;
	}

	// Property accessors

	public IsvcMstrId getId() {
		return this.id;
	}

	public void setId(IsvcMstrId id) {
		this.id = id;
	}

	public Double getIsvcMinValue() {
		return this.isvcMinValue;
	}

	public void setIsvcMinValue(Double isvcMinValue) {
		this.isvcMinValue = isvcMinValue;
	}

	public Double getIsvcPercentage() {
		return this.isvcPercentage;
	}

	public void setIsvcPercentage(Double isvcPercentage) {
		this.isvcPercentage = isvcPercentage;
	}

	public Double getIsvcPerUnit() {
		return this.isvcPerUnit;
	}

	public void setIsvcPerUnit(Double isvcPerUnit) {
		this.isvcPerUnit = isvcPerUnit;
	}

	public Double getIsvcPerWeight() {
		return this.isvcPerWeight;
	}

	public void setIsvcPerWeight(Double isvcPerWeight) {
		this.isvcPerWeight = isvcPerWeight;
	}

	public Date getIsvcModDate() {
		return this.isvcModDate;
	}

	public void setIsvcModDate(Date isvcModDate) {
		this.isvcModDate = isvcModDate;
	}

	public String getIsvcModUserid() {
		return this.isvcModUserid;
	}

	public void setIsvcModUserid(String isvcModUserid) {
		this.isvcModUserid = isvcModUserid;
	}

	public String getIsvcUser1() {
		return this.isvcUser1;
	}

	public void setIsvcUser1(String isvcUser1) {
		this.isvcUser1 = isvcUser1;
	}

	public String getIsvcUser2() {
		return this.isvcUser2;
	}

	public void setIsvcUser2(String isvcUser2) {
		this.isvcUser2 = isvcUser2;
	}

	public String getIsvcQadc01() {
		return this.isvcQadc01;
	}

	public void setIsvcQadc01(String isvcQadc01) {
		this.isvcQadc01 = isvcQadc01;
	}

	public String getIsvcQadc02() {
		return this.isvcQadc02;
	}

	public void setIsvcQadc02(String isvcQadc02) {
		this.isvcQadc02 = isvcQadc02;
	}

	public String getIsvcUm() {
		return this.isvcUm;
	}

	public void setIsvcUm(String isvcUm) {
		this.isvcUm = isvcUm;
	}

	public Double getOidIsvcMstr() {
		return this.oidIsvcMstr;
	}

	public void setOidIsvcMstr(Double oidIsvcMstr) {
		this.oidIsvcMstr = oidIsvcMstr;
	}

}