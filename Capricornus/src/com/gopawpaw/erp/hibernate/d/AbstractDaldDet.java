package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDaldDet entity provides the base persistence definition of the
 * DaldDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDaldDet implements java.io.Serializable {

	// Fields

	private DaldDetId id;
	private Date daldEffDtOut;
	private String daldModUserid;
	private Date daldModDate;
	private String daldUser1;
	private String daldUser2;
	private String daldChr01;
	private String daldChr02;
	private Double daldDec01;
	private Double daldDec02;
	private Integer daldInt01;
	private Integer daldInt02;
	private Boolean daldLog01;
	private Boolean daldLog02;
	private Date daldDte01;
	private Date daldDte02;
	private String daldQadc01;
	private String daldQadc02;
	private String daldQadc03;
	private String daldQadc04;
	private Double daldQadd01;
	private Double daldQadd02;
	private Integer daldQadi01;
	private Integer daldQadi02;
	private Boolean daldQadl01;
	private Boolean daldQadl02;
	private Date daldQadt01;
	private Date daldQadt02;
	private Double oidDaldDet;

	// Constructors

	/** default constructor */
	public AbstractDaldDet() {
	}

	/** minimal constructor */
	public AbstractDaldDet(DaldDetId id, Double oidDaldDet) {
		this.id = id;
		this.oidDaldDet = oidDaldDet;
	}

	/** full constructor */
	public AbstractDaldDet(DaldDetId id, Date daldEffDtOut,
			String daldModUserid, Date daldModDate, String daldUser1,
			String daldUser2, String daldChr01, String daldChr02,
			Double daldDec01, Double daldDec02, Integer daldInt01,
			Integer daldInt02, Boolean daldLog01, Boolean daldLog02,
			Date daldDte01, Date daldDte02, String daldQadc01,
			String daldQadc02, String daldQadc03, String daldQadc04,
			Double daldQadd01, Double daldQadd02, Integer daldQadi01,
			Integer daldQadi02, Boolean daldQadl01, Boolean daldQadl02,
			Date daldQadt01, Date daldQadt02, Double oidDaldDet) {
		this.id = id;
		this.daldEffDtOut = daldEffDtOut;
		this.daldModUserid = daldModUserid;
		this.daldModDate = daldModDate;
		this.daldUser1 = daldUser1;
		this.daldUser2 = daldUser2;
		this.daldChr01 = daldChr01;
		this.daldChr02 = daldChr02;
		this.daldDec01 = daldDec01;
		this.daldDec02 = daldDec02;
		this.daldInt01 = daldInt01;
		this.daldInt02 = daldInt02;
		this.daldLog01 = daldLog01;
		this.daldLog02 = daldLog02;
		this.daldDte01 = daldDte01;
		this.daldDte02 = daldDte02;
		this.daldQadc01 = daldQadc01;
		this.daldQadc02 = daldQadc02;
		this.daldQadc03 = daldQadc03;
		this.daldQadc04 = daldQadc04;
		this.daldQadd01 = daldQadd01;
		this.daldQadd02 = daldQadd02;
		this.daldQadi01 = daldQadi01;
		this.daldQadi02 = daldQadi02;
		this.daldQadl01 = daldQadl01;
		this.daldQadl02 = daldQadl02;
		this.daldQadt01 = daldQadt01;
		this.daldQadt02 = daldQadt02;
		this.oidDaldDet = oidDaldDet;
	}

	// Property accessors

	public DaldDetId getId() {
		return this.id;
	}

	public void setId(DaldDetId id) {
		this.id = id;
	}

	public Date getDaldEffDtOut() {
		return this.daldEffDtOut;
	}

	public void setDaldEffDtOut(Date daldEffDtOut) {
		this.daldEffDtOut = daldEffDtOut;
	}

	public String getDaldModUserid() {
		return this.daldModUserid;
	}

	public void setDaldModUserid(String daldModUserid) {
		this.daldModUserid = daldModUserid;
	}

	public Date getDaldModDate() {
		return this.daldModDate;
	}

	public void setDaldModDate(Date daldModDate) {
		this.daldModDate = daldModDate;
	}

	public String getDaldUser1() {
		return this.daldUser1;
	}

	public void setDaldUser1(String daldUser1) {
		this.daldUser1 = daldUser1;
	}

	public String getDaldUser2() {
		return this.daldUser2;
	}

	public void setDaldUser2(String daldUser2) {
		this.daldUser2 = daldUser2;
	}

	public String getDaldChr01() {
		return this.daldChr01;
	}

	public void setDaldChr01(String daldChr01) {
		this.daldChr01 = daldChr01;
	}

	public String getDaldChr02() {
		return this.daldChr02;
	}

	public void setDaldChr02(String daldChr02) {
		this.daldChr02 = daldChr02;
	}

	public Double getDaldDec01() {
		return this.daldDec01;
	}

	public void setDaldDec01(Double daldDec01) {
		this.daldDec01 = daldDec01;
	}

	public Double getDaldDec02() {
		return this.daldDec02;
	}

	public void setDaldDec02(Double daldDec02) {
		this.daldDec02 = daldDec02;
	}

	public Integer getDaldInt01() {
		return this.daldInt01;
	}

	public void setDaldInt01(Integer daldInt01) {
		this.daldInt01 = daldInt01;
	}

	public Integer getDaldInt02() {
		return this.daldInt02;
	}

	public void setDaldInt02(Integer daldInt02) {
		this.daldInt02 = daldInt02;
	}

	public Boolean getDaldLog01() {
		return this.daldLog01;
	}

	public void setDaldLog01(Boolean daldLog01) {
		this.daldLog01 = daldLog01;
	}

	public Boolean getDaldLog02() {
		return this.daldLog02;
	}

	public void setDaldLog02(Boolean daldLog02) {
		this.daldLog02 = daldLog02;
	}

	public Date getDaldDte01() {
		return this.daldDte01;
	}

	public void setDaldDte01(Date daldDte01) {
		this.daldDte01 = daldDte01;
	}

	public Date getDaldDte02() {
		return this.daldDte02;
	}

	public void setDaldDte02(Date daldDte02) {
		this.daldDte02 = daldDte02;
	}

	public String getDaldQadc01() {
		return this.daldQadc01;
	}

	public void setDaldQadc01(String daldQadc01) {
		this.daldQadc01 = daldQadc01;
	}

	public String getDaldQadc02() {
		return this.daldQadc02;
	}

	public void setDaldQadc02(String daldQadc02) {
		this.daldQadc02 = daldQadc02;
	}

	public String getDaldQadc03() {
		return this.daldQadc03;
	}

	public void setDaldQadc03(String daldQadc03) {
		this.daldQadc03 = daldQadc03;
	}

	public String getDaldQadc04() {
		return this.daldQadc04;
	}

	public void setDaldQadc04(String daldQadc04) {
		this.daldQadc04 = daldQadc04;
	}

	public Double getDaldQadd01() {
		return this.daldQadd01;
	}

	public void setDaldQadd01(Double daldQadd01) {
		this.daldQadd01 = daldQadd01;
	}

	public Double getDaldQadd02() {
		return this.daldQadd02;
	}

	public void setDaldQadd02(Double daldQadd02) {
		this.daldQadd02 = daldQadd02;
	}

	public Integer getDaldQadi01() {
		return this.daldQadi01;
	}

	public void setDaldQadi01(Integer daldQadi01) {
		this.daldQadi01 = daldQadi01;
	}

	public Integer getDaldQadi02() {
		return this.daldQadi02;
	}

	public void setDaldQadi02(Integer daldQadi02) {
		this.daldQadi02 = daldQadi02;
	}

	public Boolean getDaldQadl01() {
		return this.daldQadl01;
	}

	public void setDaldQadl01(Boolean daldQadl01) {
		this.daldQadl01 = daldQadl01;
	}

	public Boolean getDaldQadl02() {
		return this.daldQadl02;
	}

	public void setDaldQadl02(Boolean daldQadl02) {
		this.daldQadl02 = daldQadl02;
	}

	public Date getDaldQadt01() {
		return this.daldQadt01;
	}

	public void setDaldQadt01(Date daldQadt01) {
		this.daldQadt01 = daldQadt01;
	}

	public Date getDaldQadt02() {
		return this.daldQadt02;
	}

	public void setDaldQadt02(Date daldQadt02) {
		this.daldQadt02 = daldQadt02;
	}

	public Double getOidDaldDet() {
		return this.oidDaldDet;
	}

	public void setOidDaldDet(Double oidDaldDet) {
		this.oidDaldDet = oidDaldDet;
	}

}