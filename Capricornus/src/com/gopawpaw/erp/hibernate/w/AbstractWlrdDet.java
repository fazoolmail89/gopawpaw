package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWlrdDet entity provides the base persistence definition of the
 * WlrdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWlrdDet implements java.io.Serializable {

	// Fields

	private WlrdDetId id;
	private Boolean wlrdWipSplitOk;
	private Boolean wlrdWipCmbOk;
	private Boolean wlrdOverissue;
	private Date wlrdModDate;
	private String wlrdModUserid;
	private String wlrdQadc01;
	private String wlrdQadc02;
	private String wlrdQadc03;
	private String wlrdQadc04;
	private Double wlrdQadd01;
	private Double wlrdQadd02;
	private Integer wlrdQadi01;
	private Integer wlrdQadi02;
	private Boolean wlrdQadl01;
	private Boolean wlrdQadl02;
	private Date wlrdQadt01;
	private Date wlrdQadt02;
	private String wlrdChr01;
	private String wlrdChr02;
	private String wlrdChr03;
	private String wlrdChr04;
	private Double wlrdDec01;
	private Double wlrdDec02;
	private Integer wlrdInt01;
	private Integer wlrdInt02;
	private Boolean wlrdLog01;
	private Boolean wlrdLog02;
	private Date wlrdDte01;
	private Date wlrdDte02;
	private String wlrdUser1;
	private String wlrdUser2;
	private Double oidWlrdDet;

	// Constructors

	/** default constructor */
	public AbstractWlrdDet() {
	}

	/** minimal constructor */
	public AbstractWlrdDet(WlrdDetId id, Double oidWlrdDet) {
		this.id = id;
		this.oidWlrdDet = oidWlrdDet;
	}

	/** full constructor */
	public AbstractWlrdDet(WlrdDetId id, Boolean wlrdWipSplitOk,
			Boolean wlrdWipCmbOk, Boolean wlrdOverissue, Date wlrdModDate,
			String wlrdModUserid, String wlrdQadc01, String wlrdQadc02,
			String wlrdQadc03, String wlrdQadc04, Double wlrdQadd01,
			Double wlrdQadd02, Integer wlrdQadi01, Integer wlrdQadi02,
			Boolean wlrdQadl01, Boolean wlrdQadl02, Date wlrdQadt01,
			Date wlrdQadt02, String wlrdChr01, String wlrdChr02,
			String wlrdChr03, String wlrdChr04, Double wlrdDec01,
			Double wlrdDec02, Integer wlrdInt01, Integer wlrdInt02,
			Boolean wlrdLog01, Boolean wlrdLog02, Date wlrdDte01,
			Date wlrdDte02, String wlrdUser1, String wlrdUser2,
			Double oidWlrdDet) {
		this.id = id;
		this.wlrdWipSplitOk = wlrdWipSplitOk;
		this.wlrdWipCmbOk = wlrdWipCmbOk;
		this.wlrdOverissue = wlrdOverissue;
		this.wlrdModDate = wlrdModDate;
		this.wlrdModUserid = wlrdModUserid;
		this.wlrdQadc01 = wlrdQadc01;
		this.wlrdQadc02 = wlrdQadc02;
		this.wlrdQadc03 = wlrdQadc03;
		this.wlrdQadc04 = wlrdQadc04;
		this.wlrdQadd01 = wlrdQadd01;
		this.wlrdQadd02 = wlrdQadd02;
		this.wlrdQadi01 = wlrdQadi01;
		this.wlrdQadi02 = wlrdQadi02;
		this.wlrdQadl01 = wlrdQadl01;
		this.wlrdQadl02 = wlrdQadl02;
		this.wlrdQadt01 = wlrdQadt01;
		this.wlrdQadt02 = wlrdQadt02;
		this.wlrdChr01 = wlrdChr01;
		this.wlrdChr02 = wlrdChr02;
		this.wlrdChr03 = wlrdChr03;
		this.wlrdChr04 = wlrdChr04;
		this.wlrdDec01 = wlrdDec01;
		this.wlrdDec02 = wlrdDec02;
		this.wlrdInt01 = wlrdInt01;
		this.wlrdInt02 = wlrdInt02;
		this.wlrdLog01 = wlrdLog01;
		this.wlrdLog02 = wlrdLog02;
		this.wlrdDte01 = wlrdDte01;
		this.wlrdDte02 = wlrdDte02;
		this.wlrdUser1 = wlrdUser1;
		this.wlrdUser2 = wlrdUser2;
		this.oidWlrdDet = oidWlrdDet;
	}

	// Property accessors

	public WlrdDetId getId() {
		return this.id;
	}

	public void setId(WlrdDetId id) {
		this.id = id;
	}

	public Boolean getWlrdWipSplitOk() {
		return this.wlrdWipSplitOk;
	}

	public void setWlrdWipSplitOk(Boolean wlrdWipSplitOk) {
		this.wlrdWipSplitOk = wlrdWipSplitOk;
	}

	public Boolean getWlrdWipCmbOk() {
		return this.wlrdWipCmbOk;
	}

	public void setWlrdWipCmbOk(Boolean wlrdWipCmbOk) {
		this.wlrdWipCmbOk = wlrdWipCmbOk;
	}

	public Boolean getWlrdOverissue() {
		return this.wlrdOverissue;
	}

	public void setWlrdOverissue(Boolean wlrdOverissue) {
		this.wlrdOverissue = wlrdOverissue;
	}

	public Date getWlrdModDate() {
		return this.wlrdModDate;
	}

	public void setWlrdModDate(Date wlrdModDate) {
		this.wlrdModDate = wlrdModDate;
	}

	public String getWlrdModUserid() {
		return this.wlrdModUserid;
	}

	public void setWlrdModUserid(String wlrdModUserid) {
		this.wlrdModUserid = wlrdModUserid;
	}

	public String getWlrdQadc01() {
		return this.wlrdQadc01;
	}

	public void setWlrdQadc01(String wlrdQadc01) {
		this.wlrdQadc01 = wlrdQadc01;
	}

	public String getWlrdQadc02() {
		return this.wlrdQadc02;
	}

	public void setWlrdQadc02(String wlrdQadc02) {
		this.wlrdQadc02 = wlrdQadc02;
	}

	public String getWlrdQadc03() {
		return this.wlrdQadc03;
	}

	public void setWlrdQadc03(String wlrdQadc03) {
		this.wlrdQadc03 = wlrdQadc03;
	}

	public String getWlrdQadc04() {
		return this.wlrdQadc04;
	}

	public void setWlrdQadc04(String wlrdQadc04) {
		this.wlrdQadc04 = wlrdQadc04;
	}

	public Double getWlrdQadd01() {
		return this.wlrdQadd01;
	}

	public void setWlrdQadd01(Double wlrdQadd01) {
		this.wlrdQadd01 = wlrdQadd01;
	}

	public Double getWlrdQadd02() {
		return this.wlrdQadd02;
	}

	public void setWlrdQadd02(Double wlrdQadd02) {
		this.wlrdQadd02 = wlrdQadd02;
	}

	public Integer getWlrdQadi01() {
		return this.wlrdQadi01;
	}

	public void setWlrdQadi01(Integer wlrdQadi01) {
		this.wlrdQadi01 = wlrdQadi01;
	}

	public Integer getWlrdQadi02() {
		return this.wlrdQadi02;
	}

	public void setWlrdQadi02(Integer wlrdQadi02) {
		this.wlrdQadi02 = wlrdQadi02;
	}

	public Boolean getWlrdQadl01() {
		return this.wlrdQadl01;
	}

	public void setWlrdQadl01(Boolean wlrdQadl01) {
		this.wlrdQadl01 = wlrdQadl01;
	}

	public Boolean getWlrdQadl02() {
		return this.wlrdQadl02;
	}

	public void setWlrdQadl02(Boolean wlrdQadl02) {
		this.wlrdQadl02 = wlrdQadl02;
	}

	public Date getWlrdQadt01() {
		return this.wlrdQadt01;
	}

	public void setWlrdQadt01(Date wlrdQadt01) {
		this.wlrdQadt01 = wlrdQadt01;
	}

	public Date getWlrdQadt02() {
		return this.wlrdQadt02;
	}

	public void setWlrdQadt02(Date wlrdQadt02) {
		this.wlrdQadt02 = wlrdQadt02;
	}

	public String getWlrdChr01() {
		return this.wlrdChr01;
	}

	public void setWlrdChr01(String wlrdChr01) {
		this.wlrdChr01 = wlrdChr01;
	}

	public String getWlrdChr02() {
		return this.wlrdChr02;
	}

	public void setWlrdChr02(String wlrdChr02) {
		this.wlrdChr02 = wlrdChr02;
	}

	public String getWlrdChr03() {
		return this.wlrdChr03;
	}

	public void setWlrdChr03(String wlrdChr03) {
		this.wlrdChr03 = wlrdChr03;
	}

	public String getWlrdChr04() {
		return this.wlrdChr04;
	}

	public void setWlrdChr04(String wlrdChr04) {
		this.wlrdChr04 = wlrdChr04;
	}

	public Double getWlrdDec01() {
		return this.wlrdDec01;
	}

	public void setWlrdDec01(Double wlrdDec01) {
		this.wlrdDec01 = wlrdDec01;
	}

	public Double getWlrdDec02() {
		return this.wlrdDec02;
	}

	public void setWlrdDec02(Double wlrdDec02) {
		this.wlrdDec02 = wlrdDec02;
	}

	public Integer getWlrdInt01() {
		return this.wlrdInt01;
	}

	public void setWlrdInt01(Integer wlrdInt01) {
		this.wlrdInt01 = wlrdInt01;
	}

	public Integer getWlrdInt02() {
		return this.wlrdInt02;
	}

	public void setWlrdInt02(Integer wlrdInt02) {
		this.wlrdInt02 = wlrdInt02;
	}

	public Boolean getWlrdLog01() {
		return this.wlrdLog01;
	}

	public void setWlrdLog01(Boolean wlrdLog01) {
		this.wlrdLog01 = wlrdLog01;
	}

	public Boolean getWlrdLog02() {
		return this.wlrdLog02;
	}

	public void setWlrdLog02(Boolean wlrdLog02) {
		this.wlrdLog02 = wlrdLog02;
	}

	public Date getWlrdDte01() {
		return this.wlrdDte01;
	}

	public void setWlrdDte01(Date wlrdDte01) {
		this.wlrdDte01 = wlrdDte01;
	}

	public Date getWlrdDte02() {
		return this.wlrdDte02;
	}

	public void setWlrdDte02(Date wlrdDte02) {
		this.wlrdDte02 = wlrdDte02;
	}

	public String getWlrdUser1() {
		return this.wlrdUser1;
	}

	public void setWlrdUser1(String wlrdUser1) {
		this.wlrdUser1 = wlrdUser1;
	}

	public String getWlrdUser2() {
		return this.wlrdUser2;
	}

	public void setWlrdUser2(String wlrdUser2) {
		this.wlrdUser2 = wlrdUser2;
	}

	public Double getOidWlrdDet() {
		return this.oidWlrdDet;
	}

	public void setOidWlrdDet(Double oidWlrdDet) {
		this.oidWlrdDet = oidWlrdDet;
	}

}