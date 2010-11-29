package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSbcMstr entity provides the base persistence definition of the
 * SbcMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSbcMstr implements java.io.Serializable {

	// Fields

	private SbcMstrId id;
	private String sbcDesc;
	private Integer sbcDuration;
	private Double sbcQtyBill;
	private String sbcChr01;
	private String sbcChr02;
	private String sbcChr03;
	private String sbcChr04;
	private String sbcChr05;
	private String sbcUser1;
	private String sbcUser2;
	private String sbcUm;
	private String sbcModUserid;
	private Date sbcModDate;
	private String sbcQadc01;
	private String sbcQadc02;
	private String sbcQadc03;
	private Double sbcQadd01;
	private Boolean sbcQadl01;
	private Double oidSbcMstr;

	// Constructors

	/** default constructor */
	public AbstractSbcMstr() {
	}

	/** minimal constructor */
	public AbstractSbcMstr(SbcMstrId id, Double oidSbcMstr) {
		this.id = id;
		this.oidSbcMstr = oidSbcMstr;
	}

	/** full constructor */
	public AbstractSbcMstr(SbcMstrId id, String sbcDesc, Integer sbcDuration,
			Double sbcQtyBill, String sbcChr01, String sbcChr02,
			String sbcChr03, String sbcChr04, String sbcChr05, String sbcUser1,
			String sbcUser2, String sbcUm, String sbcModUserid,
			Date sbcModDate, String sbcQadc01, String sbcQadc02,
			String sbcQadc03, Double sbcQadd01, Boolean sbcQadl01,
			Double oidSbcMstr) {
		this.id = id;
		this.sbcDesc = sbcDesc;
		this.sbcDuration = sbcDuration;
		this.sbcQtyBill = sbcQtyBill;
		this.sbcChr01 = sbcChr01;
		this.sbcChr02 = sbcChr02;
		this.sbcChr03 = sbcChr03;
		this.sbcChr04 = sbcChr04;
		this.sbcChr05 = sbcChr05;
		this.sbcUser1 = sbcUser1;
		this.sbcUser2 = sbcUser2;
		this.sbcUm = sbcUm;
		this.sbcModUserid = sbcModUserid;
		this.sbcModDate = sbcModDate;
		this.sbcQadc01 = sbcQadc01;
		this.sbcQadc02 = sbcQadc02;
		this.sbcQadc03 = sbcQadc03;
		this.sbcQadd01 = sbcQadd01;
		this.sbcQadl01 = sbcQadl01;
		this.oidSbcMstr = oidSbcMstr;
	}

	// Property accessors

	public SbcMstrId getId() {
		return this.id;
	}

	public void setId(SbcMstrId id) {
		this.id = id;
	}

	public String getSbcDesc() {
		return this.sbcDesc;
	}

	public void setSbcDesc(String sbcDesc) {
		this.sbcDesc = sbcDesc;
	}

	public Integer getSbcDuration() {
		return this.sbcDuration;
	}

	public void setSbcDuration(Integer sbcDuration) {
		this.sbcDuration = sbcDuration;
	}

	public Double getSbcQtyBill() {
		return this.sbcQtyBill;
	}

	public void setSbcQtyBill(Double sbcQtyBill) {
		this.sbcQtyBill = sbcQtyBill;
	}

	public String getSbcChr01() {
		return this.sbcChr01;
	}

	public void setSbcChr01(String sbcChr01) {
		this.sbcChr01 = sbcChr01;
	}

	public String getSbcChr02() {
		return this.sbcChr02;
	}

	public void setSbcChr02(String sbcChr02) {
		this.sbcChr02 = sbcChr02;
	}

	public String getSbcChr03() {
		return this.sbcChr03;
	}

	public void setSbcChr03(String sbcChr03) {
		this.sbcChr03 = sbcChr03;
	}

	public String getSbcChr04() {
		return this.sbcChr04;
	}

	public void setSbcChr04(String sbcChr04) {
		this.sbcChr04 = sbcChr04;
	}

	public String getSbcChr05() {
		return this.sbcChr05;
	}

	public void setSbcChr05(String sbcChr05) {
		this.sbcChr05 = sbcChr05;
	}

	public String getSbcUser1() {
		return this.sbcUser1;
	}

	public void setSbcUser1(String sbcUser1) {
		this.sbcUser1 = sbcUser1;
	}

	public String getSbcUser2() {
		return this.sbcUser2;
	}

	public void setSbcUser2(String sbcUser2) {
		this.sbcUser2 = sbcUser2;
	}

	public String getSbcUm() {
		return this.sbcUm;
	}

	public void setSbcUm(String sbcUm) {
		this.sbcUm = sbcUm;
	}

	public String getSbcModUserid() {
		return this.sbcModUserid;
	}

	public void setSbcModUserid(String sbcModUserid) {
		this.sbcModUserid = sbcModUserid;
	}

	public Date getSbcModDate() {
		return this.sbcModDate;
	}

	public void setSbcModDate(Date sbcModDate) {
		this.sbcModDate = sbcModDate;
	}

	public String getSbcQadc01() {
		return this.sbcQadc01;
	}

	public void setSbcQadc01(String sbcQadc01) {
		this.sbcQadc01 = sbcQadc01;
	}

	public String getSbcQadc02() {
		return this.sbcQadc02;
	}

	public void setSbcQadc02(String sbcQadc02) {
		this.sbcQadc02 = sbcQadc02;
	}

	public String getSbcQadc03() {
		return this.sbcQadc03;
	}

	public void setSbcQadc03(String sbcQadc03) {
		this.sbcQadc03 = sbcQadc03;
	}

	public Double getSbcQadd01() {
		return this.sbcQadd01;
	}

	public void setSbcQadd01(Double sbcQadd01) {
		this.sbcQadd01 = sbcQadd01;
	}

	public Boolean getSbcQadl01() {
		return this.sbcQadl01;
	}

	public void setSbcQadl01(Boolean sbcQadl01) {
		this.sbcQadl01 = sbcQadl01;
	}

	public Double getOidSbcMstr() {
		return this.oidSbcMstr;
	}

	public void setOidSbcMstr(Double oidSbcMstr) {
		this.oidSbcMstr = oidSbcMstr;
	}

}