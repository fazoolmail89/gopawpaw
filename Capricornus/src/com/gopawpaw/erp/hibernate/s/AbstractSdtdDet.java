package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSdtdDet entity provides the base persistence definition of the
 * SdtdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSdtdDet implements java.io.Serializable {

	// Fields

	private SdtdDetId id;
	private String sdtdModUserid;
	private Date sdtdModDate;
	private String sdtdUser1;
	private String sdtdUser2;
	private String sdtdChr01;
	private String sdtdChr02;
	private Double sdtdDec01;
	private Double sdtdDec02;
	private Date sdtdDte01;
	private Date sdtdDte02;
	private Boolean sdtdLog01;
	private String sdtdQadc01;
	private String sdtdQadc02;
	private Double sdtdQadd01;
	private Double sdtdQadd02;
	private Date sdtdQadt01;
	private Date sdtdQadt02;
	private Boolean sdtdQadl01;
	private Boolean sdtdQadl02;
	private Integer sdtdQadi01;
	private Integer sdtdQadi02;
	private Double oidSdtdDet;

	// Constructors

	/** default constructor */
	public AbstractSdtdDet() {
	}

	/** minimal constructor */
	public AbstractSdtdDet(SdtdDetId id, Double oidSdtdDet) {
		this.id = id;
		this.oidSdtdDet = oidSdtdDet;
	}

	/** full constructor */
	public AbstractSdtdDet(SdtdDetId id, String sdtdModUserid,
			Date sdtdModDate, String sdtdUser1, String sdtdUser2,
			String sdtdChr01, String sdtdChr02, Double sdtdDec01,
			Double sdtdDec02, Date sdtdDte01, Date sdtdDte02,
			Boolean sdtdLog01, String sdtdQadc01, String sdtdQadc02,
			Double sdtdQadd01, Double sdtdQadd02, Date sdtdQadt01,
			Date sdtdQadt02, Boolean sdtdQadl01, Boolean sdtdQadl02,
			Integer sdtdQadi01, Integer sdtdQadi02, Double oidSdtdDet) {
		this.id = id;
		this.sdtdModUserid = sdtdModUserid;
		this.sdtdModDate = sdtdModDate;
		this.sdtdUser1 = sdtdUser1;
		this.sdtdUser2 = sdtdUser2;
		this.sdtdChr01 = sdtdChr01;
		this.sdtdChr02 = sdtdChr02;
		this.sdtdDec01 = sdtdDec01;
		this.sdtdDec02 = sdtdDec02;
		this.sdtdDte01 = sdtdDte01;
		this.sdtdDte02 = sdtdDte02;
		this.sdtdLog01 = sdtdLog01;
		this.sdtdQadc01 = sdtdQadc01;
		this.sdtdQadc02 = sdtdQadc02;
		this.sdtdQadd01 = sdtdQadd01;
		this.sdtdQadd02 = sdtdQadd02;
		this.sdtdQadt01 = sdtdQadt01;
		this.sdtdQadt02 = sdtdQadt02;
		this.sdtdQadl01 = sdtdQadl01;
		this.sdtdQadl02 = sdtdQadl02;
		this.sdtdQadi01 = sdtdQadi01;
		this.sdtdQadi02 = sdtdQadi02;
		this.oidSdtdDet = oidSdtdDet;
	}

	// Property accessors

	public SdtdDetId getId() {
		return this.id;
	}

	public void setId(SdtdDetId id) {
		this.id = id;
	}

	public String getSdtdModUserid() {
		return this.sdtdModUserid;
	}

	public void setSdtdModUserid(String sdtdModUserid) {
		this.sdtdModUserid = sdtdModUserid;
	}

	public Date getSdtdModDate() {
		return this.sdtdModDate;
	}

	public void setSdtdModDate(Date sdtdModDate) {
		this.sdtdModDate = sdtdModDate;
	}

	public String getSdtdUser1() {
		return this.sdtdUser1;
	}

	public void setSdtdUser1(String sdtdUser1) {
		this.sdtdUser1 = sdtdUser1;
	}

	public String getSdtdUser2() {
		return this.sdtdUser2;
	}

	public void setSdtdUser2(String sdtdUser2) {
		this.sdtdUser2 = sdtdUser2;
	}

	public String getSdtdChr01() {
		return this.sdtdChr01;
	}

	public void setSdtdChr01(String sdtdChr01) {
		this.sdtdChr01 = sdtdChr01;
	}

	public String getSdtdChr02() {
		return this.sdtdChr02;
	}

	public void setSdtdChr02(String sdtdChr02) {
		this.sdtdChr02 = sdtdChr02;
	}

	public Double getSdtdDec01() {
		return this.sdtdDec01;
	}

	public void setSdtdDec01(Double sdtdDec01) {
		this.sdtdDec01 = sdtdDec01;
	}

	public Double getSdtdDec02() {
		return this.sdtdDec02;
	}

	public void setSdtdDec02(Double sdtdDec02) {
		this.sdtdDec02 = sdtdDec02;
	}

	public Date getSdtdDte01() {
		return this.sdtdDte01;
	}

	public void setSdtdDte01(Date sdtdDte01) {
		this.sdtdDte01 = sdtdDte01;
	}

	public Date getSdtdDte02() {
		return this.sdtdDte02;
	}

	public void setSdtdDte02(Date sdtdDte02) {
		this.sdtdDte02 = sdtdDte02;
	}

	public Boolean getSdtdLog01() {
		return this.sdtdLog01;
	}

	public void setSdtdLog01(Boolean sdtdLog01) {
		this.sdtdLog01 = sdtdLog01;
	}

	public String getSdtdQadc01() {
		return this.sdtdQadc01;
	}

	public void setSdtdQadc01(String sdtdQadc01) {
		this.sdtdQadc01 = sdtdQadc01;
	}

	public String getSdtdQadc02() {
		return this.sdtdQadc02;
	}

	public void setSdtdQadc02(String sdtdQadc02) {
		this.sdtdQadc02 = sdtdQadc02;
	}

	public Double getSdtdQadd01() {
		return this.sdtdQadd01;
	}

	public void setSdtdQadd01(Double sdtdQadd01) {
		this.sdtdQadd01 = sdtdQadd01;
	}

	public Double getSdtdQadd02() {
		return this.sdtdQadd02;
	}

	public void setSdtdQadd02(Double sdtdQadd02) {
		this.sdtdQadd02 = sdtdQadd02;
	}

	public Date getSdtdQadt01() {
		return this.sdtdQadt01;
	}

	public void setSdtdQadt01(Date sdtdQadt01) {
		this.sdtdQadt01 = sdtdQadt01;
	}

	public Date getSdtdQadt02() {
		return this.sdtdQadt02;
	}

	public void setSdtdQadt02(Date sdtdQadt02) {
		this.sdtdQadt02 = sdtdQadt02;
	}

	public Boolean getSdtdQadl01() {
		return this.sdtdQadl01;
	}

	public void setSdtdQadl01(Boolean sdtdQadl01) {
		this.sdtdQadl01 = sdtdQadl01;
	}

	public Boolean getSdtdQadl02() {
		return this.sdtdQadl02;
	}

	public void setSdtdQadl02(Boolean sdtdQadl02) {
		this.sdtdQadl02 = sdtdQadl02;
	}

	public Integer getSdtdQadi01() {
		return this.sdtdQadi01;
	}

	public void setSdtdQadi01(Integer sdtdQadi01) {
		this.sdtdQadi01 = sdtdQadi01;
	}

	public Integer getSdtdQadi02() {
		return this.sdtdQadi02;
	}

	public void setSdtdQadi02(Integer sdtdQadi02) {
		this.sdtdQadi02 = sdtdQadi02;
	}

	public Double getOidSdtdDet() {
		return this.oidSdtdDet;
	}

	public void setOidSdtdDet(Double oidSdtdDet) {
		this.oidSdtdDet = oidSdtdDet;
	}

}