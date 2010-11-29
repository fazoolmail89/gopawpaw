package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGipDet entity provides the base persistence definition of the GipDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGipDet implements java.io.Serializable {

	// Fields

	private GipDetId id;
	private String gipAppCode;
	private Boolean gipLogical;
	private Integer gipInteger;
	private String gipChar;
	private Double gipDecimal;
	private String gipTableName;
	private Date gipDate;
	private Date gipModDate;
	private String gipModUserid;
	private String gipUser1;
	private String gipUser2;
	private String gipQadc01;
	private String gipQadc02;
	private Double oidGipDet;

	// Constructors

	/** default constructor */
	public AbstractGipDet() {
	}

	/** minimal constructor */
	public AbstractGipDet(GipDetId id, String gipAppCode, Boolean gipLogical,
			Integer gipInteger, String gipChar, Double gipDecimal,
			String gipTableName, Date gipModDate, String gipModUserid,
			String gipUser1, String gipUser2, String gipQadc01,
			String gipQadc02, Double oidGipDet) {
		this.id = id;
		this.gipAppCode = gipAppCode;
		this.gipLogical = gipLogical;
		this.gipInteger = gipInteger;
		this.gipChar = gipChar;
		this.gipDecimal = gipDecimal;
		this.gipTableName = gipTableName;
		this.gipModDate = gipModDate;
		this.gipModUserid = gipModUserid;
		this.gipUser1 = gipUser1;
		this.gipUser2 = gipUser2;
		this.gipQadc01 = gipQadc01;
		this.gipQadc02 = gipQadc02;
		this.oidGipDet = oidGipDet;
	}

	/** full constructor */
	public AbstractGipDet(GipDetId id, String gipAppCode, Boolean gipLogical,
			Integer gipInteger, String gipChar, Double gipDecimal,
			String gipTableName, Date gipDate, Date gipModDate,
			String gipModUserid, String gipUser1, String gipUser2,
			String gipQadc01, String gipQadc02, Double oidGipDet) {
		this.id = id;
		this.gipAppCode = gipAppCode;
		this.gipLogical = gipLogical;
		this.gipInteger = gipInteger;
		this.gipChar = gipChar;
		this.gipDecimal = gipDecimal;
		this.gipTableName = gipTableName;
		this.gipDate = gipDate;
		this.gipModDate = gipModDate;
		this.gipModUserid = gipModUserid;
		this.gipUser1 = gipUser1;
		this.gipUser2 = gipUser2;
		this.gipQadc01 = gipQadc01;
		this.gipQadc02 = gipQadc02;
		this.oidGipDet = oidGipDet;
	}

	// Property accessors

	public GipDetId getId() {
		return this.id;
	}

	public void setId(GipDetId id) {
		this.id = id;
	}

	public String getGipAppCode() {
		return this.gipAppCode;
	}

	public void setGipAppCode(String gipAppCode) {
		this.gipAppCode = gipAppCode;
	}

	public Boolean getGipLogical() {
		return this.gipLogical;
	}

	public void setGipLogical(Boolean gipLogical) {
		this.gipLogical = gipLogical;
	}

	public Integer getGipInteger() {
		return this.gipInteger;
	}

	public void setGipInteger(Integer gipInteger) {
		this.gipInteger = gipInteger;
	}

	public String getGipChar() {
		return this.gipChar;
	}

	public void setGipChar(String gipChar) {
		this.gipChar = gipChar;
	}

	public Double getGipDecimal() {
		return this.gipDecimal;
	}

	public void setGipDecimal(Double gipDecimal) {
		this.gipDecimal = gipDecimal;
	}

	public String getGipTableName() {
		return this.gipTableName;
	}

	public void setGipTableName(String gipTableName) {
		this.gipTableName = gipTableName;
	}

	public Date getGipDate() {
		return this.gipDate;
	}

	public void setGipDate(Date gipDate) {
		this.gipDate = gipDate;
	}

	public Date getGipModDate() {
		return this.gipModDate;
	}

	public void setGipModDate(Date gipModDate) {
		this.gipModDate = gipModDate;
	}

	public String getGipModUserid() {
		return this.gipModUserid;
	}

	public void setGipModUserid(String gipModUserid) {
		this.gipModUserid = gipModUserid;
	}

	public String getGipUser1() {
		return this.gipUser1;
	}

	public void setGipUser1(String gipUser1) {
		this.gipUser1 = gipUser1;
	}

	public String getGipUser2() {
		return this.gipUser2;
	}

	public void setGipUser2(String gipUser2) {
		this.gipUser2 = gipUser2;
	}

	public String getGipQadc01() {
		return this.gipQadc01;
	}

	public void setGipQadc01(String gipQadc01) {
		this.gipQadc01 = gipQadc01;
	}

	public String getGipQadc02() {
		return this.gipQadc02;
	}

	public void setGipQadc02(String gipQadc02) {
		this.gipQadc02 = gipQadc02;
	}

	public Double getOidGipDet() {
		return this.oidGipDet;
	}

	public void setOidGipDet(Double oidGipDet) {
		this.oidGipDet = oidGipDet;
	}

}