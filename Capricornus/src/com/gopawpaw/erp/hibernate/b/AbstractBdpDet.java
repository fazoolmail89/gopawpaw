package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBdpDet entity provides the base persistence definition of the BdpDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBdpDet implements java.io.Serializable {

	// Fields

	private BdpDetId id;
	private String bdpCharacter;
	private Date bdpDate;
	private Double bdpDecimal;
	private Integer bdpInteger;
	private Boolean bdpLogical;
	private String bdpUser1;
	private String bdpUser2;
	private String bdpQadc01;
	private String bdpQadc02;
	private Double bdpQadd01;
	private Integer bdpQadi01;
	private Boolean bdpQadl01;
	private Date bdpQadt01;
	private Boolean bdpSplit;
	private Double bdpUserd01;
	private Integer bdpUseri01;
	private Boolean bdpUserl01;
	private Date bdpUsert01;
	private Date bdpModDate;
	private String bdpModUserid;
	private Double oidBdpDet;

	// Constructors

	/** default constructor */
	public AbstractBdpDet() {
	}

	/** minimal constructor */
	public AbstractBdpDet(BdpDetId id, String bdpCharacter, Double bdpDecimal,
			Integer bdpInteger, Boolean bdpLogical, String bdpUser1,
			String bdpUser2, String bdpQadc01, String bdpQadc02,
			Double bdpQadd01, Integer bdpQadi01, Boolean bdpQadl01,
			Boolean bdpSplit, Double bdpUserd01, Integer bdpUseri01,
			Boolean bdpUserl01, Date bdpModDate, String bdpModUserid,
			Double oidBdpDet) {
		this.id = id;
		this.bdpCharacter = bdpCharacter;
		this.bdpDecimal = bdpDecimal;
		this.bdpInteger = bdpInteger;
		this.bdpLogical = bdpLogical;
		this.bdpUser1 = bdpUser1;
		this.bdpUser2 = bdpUser2;
		this.bdpQadc01 = bdpQadc01;
		this.bdpQadc02 = bdpQadc02;
		this.bdpQadd01 = bdpQadd01;
		this.bdpQadi01 = bdpQadi01;
		this.bdpQadl01 = bdpQadl01;
		this.bdpSplit = bdpSplit;
		this.bdpUserd01 = bdpUserd01;
		this.bdpUseri01 = bdpUseri01;
		this.bdpUserl01 = bdpUserl01;
		this.bdpModDate = bdpModDate;
		this.bdpModUserid = bdpModUserid;
		this.oidBdpDet = oidBdpDet;
	}

	/** full constructor */
	public AbstractBdpDet(BdpDetId id, String bdpCharacter, Date bdpDate,
			Double bdpDecimal, Integer bdpInteger, Boolean bdpLogical,
			String bdpUser1, String bdpUser2, String bdpQadc01,
			String bdpQadc02, Double bdpQadd01, Integer bdpQadi01,
			Boolean bdpQadl01, Date bdpQadt01, Boolean bdpSplit,
			Double bdpUserd01, Integer bdpUseri01, Boolean bdpUserl01,
			Date bdpUsert01, Date bdpModDate, String bdpModUserid,
			Double oidBdpDet) {
		this.id = id;
		this.bdpCharacter = bdpCharacter;
		this.bdpDate = bdpDate;
		this.bdpDecimal = bdpDecimal;
		this.bdpInteger = bdpInteger;
		this.bdpLogical = bdpLogical;
		this.bdpUser1 = bdpUser1;
		this.bdpUser2 = bdpUser2;
		this.bdpQadc01 = bdpQadc01;
		this.bdpQadc02 = bdpQadc02;
		this.bdpQadd01 = bdpQadd01;
		this.bdpQadi01 = bdpQadi01;
		this.bdpQadl01 = bdpQadl01;
		this.bdpQadt01 = bdpQadt01;
		this.bdpSplit = bdpSplit;
		this.bdpUserd01 = bdpUserd01;
		this.bdpUseri01 = bdpUseri01;
		this.bdpUserl01 = bdpUserl01;
		this.bdpUsert01 = bdpUsert01;
		this.bdpModDate = bdpModDate;
		this.bdpModUserid = bdpModUserid;
		this.oidBdpDet = oidBdpDet;
	}

	// Property accessors

	public BdpDetId getId() {
		return this.id;
	}

	public void setId(BdpDetId id) {
		this.id = id;
	}

	public String getBdpCharacter() {
		return this.bdpCharacter;
	}

	public void setBdpCharacter(String bdpCharacter) {
		this.bdpCharacter = bdpCharacter;
	}

	public Date getBdpDate() {
		return this.bdpDate;
	}

	public void setBdpDate(Date bdpDate) {
		this.bdpDate = bdpDate;
	}

	public Double getBdpDecimal() {
		return this.bdpDecimal;
	}

	public void setBdpDecimal(Double bdpDecimal) {
		this.bdpDecimal = bdpDecimal;
	}

	public Integer getBdpInteger() {
		return this.bdpInteger;
	}

	public void setBdpInteger(Integer bdpInteger) {
		this.bdpInteger = bdpInteger;
	}

	public Boolean getBdpLogical() {
		return this.bdpLogical;
	}

	public void setBdpLogical(Boolean bdpLogical) {
		this.bdpLogical = bdpLogical;
	}

	public String getBdpUser1() {
		return this.bdpUser1;
	}

	public void setBdpUser1(String bdpUser1) {
		this.bdpUser1 = bdpUser1;
	}

	public String getBdpUser2() {
		return this.bdpUser2;
	}

	public void setBdpUser2(String bdpUser2) {
		this.bdpUser2 = bdpUser2;
	}

	public String getBdpQadc01() {
		return this.bdpQadc01;
	}

	public void setBdpQadc01(String bdpQadc01) {
		this.bdpQadc01 = bdpQadc01;
	}

	public String getBdpQadc02() {
		return this.bdpQadc02;
	}

	public void setBdpQadc02(String bdpQadc02) {
		this.bdpQadc02 = bdpQadc02;
	}

	public Double getBdpQadd01() {
		return this.bdpQadd01;
	}

	public void setBdpQadd01(Double bdpQadd01) {
		this.bdpQadd01 = bdpQadd01;
	}

	public Integer getBdpQadi01() {
		return this.bdpQadi01;
	}

	public void setBdpQadi01(Integer bdpQadi01) {
		this.bdpQadi01 = bdpQadi01;
	}

	public Boolean getBdpQadl01() {
		return this.bdpQadl01;
	}

	public void setBdpQadl01(Boolean bdpQadl01) {
		this.bdpQadl01 = bdpQadl01;
	}

	public Date getBdpQadt01() {
		return this.bdpQadt01;
	}

	public void setBdpQadt01(Date bdpQadt01) {
		this.bdpQadt01 = bdpQadt01;
	}

	public Boolean getBdpSplit() {
		return this.bdpSplit;
	}

	public void setBdpSplit(Boolean bdpSplit) {
		this.bdpSplit = bdpSplit;
	}

	public Double getBdpUserd01() {
		return this.bdpUserd01;
	}

	public void setBdpUserd01(Double bdpUserd01) {
		this.bdpUserd01 = bdpUserd01;
	}

	public Integer getBdpUseri01() {
		return this.bdpUseri01;
	}

	public void setBdpUseri01(Integer bdpUseri01) {
		this.bdpUseri01 = bdpUseri01;
	}

	public Boolean getBdpUserl01() {
		return this.bdpUserl01;
	}

	public void setBdpUserl01(Boolean bdpUserl01) {
		this.bdpUserl01 = bdpUserl01;
	}

	public Date getBdpUsert01() {
		return this.bdpUsert01;
	}

	public void setBdpUsert01(Date bdpUsert01) {
		this.bdpUsert01 = bdpUsert01;
	}

	public Date getBdpModDate() {
		return this.bdpModDate;
	}

	public void setBdpModDate(Date bdpModDate) {
		this.bdpModDate = bdpModDate;
	}

	public String getBdpModUserid() {
		return this.bdpModUserid;
	}

	public void setBdpModUserid(String bdpModUserid) {
		this.bdpModUserid = bdpModUserid;
	}

	public Double getOidBdpDet() {
		return this.oidBdpDet;
	}

	public void setOidBdpDet(Double oidBdpDet) {
		this.oidBdpDet = oidBdpDet;
	}

}