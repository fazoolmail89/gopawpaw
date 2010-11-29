package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWlcCtrl entity provides the base persistence definition of the
 * WlcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWlcCtrl implements java.io.Serializable {

	// Fields

	private String wlcDomain;
	private Boolean wlcTrcParents;
	private Double wlcMaxlotsize;
	private String wlcNrmId;
	private Boolean wlcWipSplitOk;
	private Boolean wlcWipCmbOk;
	private Boolean wlcOverissue;
	private Boolean wlcTrcComps;
	private Boolean wlcTrcRef;
	private Boolean wlcCompCmbOk;
	private Integer wlcQadi03;
	private Date wlcModDate;
	private String wlcModUserid;
	private String wlcQadc01;
	private String wlcQadc02;
	private String wlcQadc03;
	private String wlcQadc04;
	private Double wlcQadd01;
	private Double wlcQadd02;
	private Integer wlcQadi01;
	private Integer wlcQadi02;
	private Boolean wlcQadl01;
	private Boolean wlcQadl02;
	private Date wlcQadt01;
	private Date wlcQadt02;
	private String wlcChr01;
	private String wlcChr02;
	private String wlcChr03;
	private String wlcChr04;
	private Double wlcDec01;
	private Double wlcDec02;
	private Integer wlcInt01;
	private Integer wlcInt02;
	private Boolean wlcLog01;
	private Boolean wlcLog02;
	private Date wlcDte01;
	private Date wlcDte02;
	private String wlcUser1;
	private String wlcUser2;
	private Boolean wlcEnableWlt;
	private Double oidWlcCtrl;

	// Constructors

	/** default constructor */
	public AbstractWlcCtrl() {
	}

	/** minimal constructor */
	public AbstractWlcCtrl(Double oidWlcCtrl) {
		this.oidWlcCtrl = oidWlcCtrl;
	}

	/** full constructor */
	public AbstractWlcCtrl(Boolean wlcTrcParents, Double wlcMaxlotsize,
			String wlcNrmId, Boolean wlcWipSplitOk, Boolean wlcWipCmbOk,
			Boolean wlcOverissue, Boolean wlcTrcComps, Boolean wlcTrcRef,
			Boolean wlcCompCmbOk, Integer wlcQadi03, Date wlcModDate,
			String wlcModUserid, String wlcQadc01, String wlcQadc02,
			String wlcQadc03, String wlcQadc04, Double wlcQadd01,
			Double wlcQadd02, Integer wlcQadi01, Integer wlcQadi02,
			Boolean wlcQadl01, Boolean wlcQadl02, Date wlcQadt01,
			Date wlcQadt02, String wlcChr01, String wlcChr02, String wlcChr03,
			String wlcChr04, Double wlcDec01, Double wlcDec02,
			Integer wlcInt01, Integer wlcInt02, Boolean wlcLog01,
			Boolean wlcLog02, Date wlcDte01, Date wlcDte02, String wlcUser1,
			String wlcUser2, Boolean wlcEnableWlt, Double oidWlcCtrl) {
		this.wlcTrcParents = wlcTrcParents;
		this.wlcMaxlotsize = wlcMaxlotsize;
		this.wlcNrmId = wlcNrmId;
		this.wlcWipSplitOk = wlcWipSplitOk;
		this.wlcWipCmbOk = wlcWipCmbOk;
		this.wlcOverissue = wlcOverissue;
		this.wlcTrcComps = wlcTrcComps;
		this.wlcTrcRef = wlcTrcRef;
		this.wlcCompCmbOk = wlcCompCmbOk;
		this.wlcQadi03 = wlcQadi03;
		this.wlcModDate = wlcModDate;
		this.wlcModUserid = wlcModUserid;
		this.wlcQadc01 = wlcQadc01;
		this.wlcQadc02 = wlcQadc02;
		this.wlcQadc03 = wlcQadc03;
		this.wlcQadc04 = wlcQadc04;
		this.wlcQadd01 = wlcQadd01;
		this.wlcQadd02 = wlcQadd02;
		this.wlcQadi01 = wlcQadi01;
		this.wlcQadi02 = wlcQadi02;
		this.wlcQadl01 = wlcQadl01;
		this.wlcQadl02 = wlcQadl02;
		this.wlcQadt01 = wlcQadt01;
		this.wlcQadt02 = wlcQadt02;
		this.wlcChr01 = wlcChr01;
		this.wlcChr02 = wlcChr02;
		this.wlcChr03 = wlcChr03;
		this.wlcChr04 = wlcChr04;
		this.wlcDec01 = wlcDec01;
		this.wlcDec02 = wlcDec02;
		this.wlcInt01 = wlcInt01;
		this.wlcInt02 = wlcInt02;
		this.wlcLog01 = wlcLog01;
		this.wlcLog02 = wlcLog02;
		this.wlcDte01 = wlcDte01;
		this.wlcDte02 = wlcDte02;
		this.wlcUser1 = wlcUser1;
		this.wlcUser2 = wlcUser2;
		this.wlcEnableWlt = wlcEnableWlt;
		this.oidWlcCtrl = oidWlcCtrl;
	}

	// Property accessors

	public String getWlcDomain() {
		return this.wlcDomain;
	}

	public void setWlcDomain(String wlcDomain) {
		this.wlcDomain = wlcDomain;
	}

	public Boolean getWlcTrcParents() {
		return this.wlcTrcParents;
	}

	public void setWlcTrcParents(Boolean wlcTrcParents) {
		this.wlcTrcParents = wlcTrcParents;
	}

	public Double getWlcMaxlotsize() {
		return this.wlcMaxlotsize;
	}

	public void setWlcMaxlotsize(Double wlcMaxlotsize) {
		this.wlcMaxlotsize = wlcMaxlotsize;
	}

	public String getWlcNrmId() {
		return this.wlcNrmId;
	}

	public void setWlcNrmId(String wlcNrmId) {
		this.wlcNrmId = wlcNrmId;
	}

	public Boolean getWlcWipSplitOk() {
		return this.wlcWipSplitOk;
	}

	public void setWlcWipSplitOk(Boolean wlcWipSplitOk) {
		this.wlcWipSplitOk = wlcWipSplitOk;
	}

	public Boolean getWlcWipCmbOk() {
		return this.wlcWipCmbOk;
	}

	public void setWlcWipCmbOk(Boolean wlcWipCmbOk) {
		this.wlcWipCmbOk = wlcWipCmbOk;
	}

	public Boolean getWlcOverissue() {
		return this.wlcOverissue;
	}

	public void setWlcOverissue(Boolean wlcOverissue) {
		this.wlcOverissue = wlcOverissue;
	}

	public Boolean getWlcTrcComps() {
		return this.wlcTrcComps;
	}

	public void setWlcTrcComps(Boolean wlcTrcComps) {
		this.wlcTrcComps = wlcTrcComps;
	}

	public Boolean getWlcTrcRef() {
		return this.wlcTrcRef;
	}

	public void setWlcTrcRef(Boolean wlcTrcRef) {
		this.wlcTrcRef = wlcTrcRef;
	}

	public Boolean getWlcCompCmbOk() {
		return this.wlcCompCmbOk;
	}

	public void setWlcCompCmbOk(Boolean wlcCompCmbOk) {
		this.wlcCompCmbOk = wlcCompCmbOk;
	}

	public Integer getWlcQadi03() {
		return this.wlcQadi03;
	}

	public void setWlcQadi03(Integer wlcQadi03) {
		this.wlcQadi03 = wlcQadi03;
	}

	public Date getWlcModDate() {
		return this.wlcModDate;
	}

	public void setWlcModDate(Date wlcModDate) {
		this.wlcModDate = wlcModDate;
	}

	public String getWlcModUserid() {
		return this.wlcModUserid;
	}

	public void setWlcModUserid(String wlcModUserid) {
		this.wlcModUserid = wlcModUserid;
	}

	public String getWlcQadc01() {
		return this.wlcQadc01;
	}

	public void setWlcQadc01(String wlcQadc01) {
		this.wlcQadc01 = wlcQadc01;
	}

	public String getWlcQadc02() {
		return this.wlcQadc02;
	}

	public void setWlcQadc02(String wlcQadc02) {
		this.wlcQadc02 = wlcQadc02;
	}

	public String getWlcQadc03() {
		return this.wlcQadc03;
	}

	public void setWlcQadc03(String wlcQadc03) {
		this.wlcQadc03 = wlcQadc03;
	}

	public String getWlcQadc04() {
		return this.wlcQadc04;
	}

	public void setWlcQadc04(String wlcQadc04) {
		this.wlcQadc04 = wlcQadc04;
	}

	public Double getWlcQadd01() {
		return this.wlcQadd01;
	}

	public void setWlcQadd01(Double wlcQadd01) {
		this.wlcQadd01 = wlcQadd01;
	}

	public Double getWlcQadd02() {
		return this.wlcQadd02;
	}

	public void setWlcQadd02(Double wlcQadd02) {
		this.wlcQadd02 = wlcQadd02;
	}

	public Integer getWlcQadi01() {
		return this.wlcQadi01;
	}

	public void setWlcQadi01(Integer wlcQadi01) {
		this.wlcQadi01 = wlcQadi01;
	}

	public Integer getWlcQadi02() {
		return this.wlcQadi02;
	}

	public void setWlcQadi02(Integer wlcQadi02) {
		this.wlcQadi02 = wlcQadi02;
	}

	public Boolean getWlcQadl01() {
		return this.wlcQadl01;
	}

	public void setWlcQadl01(Boolean wlcQadl01) {
		this.wlcQadl01 = wlcQadl01;
	}

	public Boolean getWlcQadl02() {
		return this.wlcQadl02;
	}

	public void setWlcQadl02(Boolean wlcQadl02) {
		this.wlcQadl02 = wlcQadl02;
	}

	public Date getWlcQadt01() {
		return this.wlcQadt01;
	}

	public void setWlcQadt01(Date wlcQadt01) {
		this.wlcQadt01 = wlcQadt01;
	}

	public Date getWlcQadt02() {
		return this.wlcQadt02;
	}

	public void setWlcQadt02(Date wlcQadt02) {
		this.wlcQadt02 = wlcQadt02;
	}

	public String getWlcChr01() {
		return this.wlcChr01;
	}

	public void setWlcChr01(String wlcChr01) {
		this.wlcChr01 = wlcChr01;
	}

	public String getWlcChr02() {
		return this.wlcChr02;
	}

	public void setWlcChr02(String wlcChr02) {
		this.wlcChr02 = wlcChr02;
	}

	public String getWlcChr03() {
		return this.wlcChr03;
	}

	public void setWlcChr03(String wlcChr03) {
		this.wlcChr03 = wlcChr03;
	}

	public String getWlcChr04() {
		return this.wlcChr04;
	}

	public void setWlcChr04(String wlcChr04) {
		this.wlcChr04 = wlcChr04;
	}

	public Double getWlcDec01() {
		return this.wlcDec01;
	}

	public void setWlcDec01(Double wlcDec01) {
		this.wlcDec01 = wlcDec01;
	}

	public Double getWlcDec02() {
		return this.wlcDec02;
	}

	public void setWlcDec02(Double wlcDec02) {
		this.wlcDec02 = wlcDec02;
	}

	public Integer getWlcInt01() {
		return this.wlcInt01;
	}

	public void setWlcInt01(Integer wlcInt01) {
		this.wlcInt01 = wlcInt01;
	}

	public Integer getWlcInt02() {
		return this.wlcInt02;
	}

	public void setWlcInt02(Integer wlcInt02) {
		this.wlcInt02 = wlcInt02;
	}

	public Boolean getWlcLog01() {
		return this.wlcLog01;
	}

	public void setWlcLog01(Boolean wlcLog01) {
		this.wlcLog01 = wlcLog01;
	}

	public Boolean getWlcLog02() {
		return this.wlcLog02;
	}

	public void setWlcLog02(Boolean wlcLog02) {
		this.wlcLog02 = wlcLog02;
	}

	public Date getWlcDte01() {
		return this.wlcDte01;
	}

	public void setWlcDte01(Date wlcDte01) {
		this.wlcDte01 = wlcDte01;
	}

	public Date getWlcDte02() {
		return this.wlcDte02;
	}

	public void setWlcDte02(Date wlcDte02) {
		this.wlcDte02 = wlcDte02;
	}

	public String getWlcUser1() {
		return this.wlcUser1;
	}

	public void setWlcUser1(String wlcUser1) {
		this.wlcUser1 = wlcUser1;
	}

	public String getWlcUser2() {
		return this.wlcUser2;
	}

	public void setWlcUser2(String wlcUser2) {
		this.wlcUser2 = wlcUser2;
	}

	public Boolean getWlcEnableWlt() {
		return this.wlcEnableWlt;
	}

	public void setWlcEnableWlt(Boolean wlcEnableWlt) {
		this.wlcEnableWlt = wlcEnableWlt;
	}

	public Double getOidWlcCtrl() {
		return this.oidWlcCtrl;
	}

	public void setOidWlcCtrl(Double oidWlcCtrl) {
		this.oidWlcCtrl = oidWlcCtrl;
	}

}