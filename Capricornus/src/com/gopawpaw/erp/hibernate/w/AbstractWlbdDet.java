package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWlbdDet entity provides the base persistence definition of the
 * WlbdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWlbdDet implements java.io.Serializable {

	// Fields

	private WlbdDetId id;
	private Boolean wlbdTrcComps;
	private Boolean wlbdTrcRef;
	private Boolean wlbdCompCmbOk;
	private Date wlbdModDate;
	private String wlbdModUserid;
	private String wlbdQadc01;
	private String wlbdQadc02;
	private String wlbdQadc03;
	private String wlbdQadc04;
	private Double wlbdQadd01;
	private Double wlbdQadd02;
	private Integer wlbdQadi01;
	private Integer wlbdQadi02;
	private Boolean wlbdQadl01;
	private Boolean wlbdQadl02;
	private Date wlbdQadt01;
	private Date wlbdQadt02;
	private String wlbdChr01;
	private String wlbdChr02;
	private String wlbdChr03;
	private String wlbdChr04;
	private Double wlbdDec01;
	private Double wlbdDec02;
	private Integer wlbdInt01;
	private Integer wlbdInt02;
	private Boolean wlbdLog01;
	private Boolean wlbdLog02;
	private Date wlbdDte01;
	private Date wlbdDte02;
	private String wlbdUser1;
	private String wlbdUser2;
	private Double oidWlbdDet;

	// Constructors

	/** default constructor */
	public AbstractWlbdDet() {
	}

	/** minimal constructor */
	public AbstractWlbdDet(WlbdDetId id, Double oidWlbdDet) {
		this.id = id;
		this.oidWlbdDet = oidWlbdDet;
	}

	/** full constructor */
	public AbstractWlbdDet(WlbdDetId id, Boolean wlbdTrcComps,
			Boolean wlbdTrcRef, Boolean wlbdCompCmbOk, Date wlbdModDate,
			String wlbdModUserid, String wlbdQadc01, String wlbdQadc02,
			String wlbdQadc03, String wlbdQadc04, Double wlbdQadd01,
			Double wlbdQadd02, Integer wlbdQadi01, Integer wlbdQadi02,
			Boolean wlbdQadl01, Boolean wlbdQadl02, Date wlbdQadt01,
			Date wlbdQadt02, String wlbdChr01, String wlbdChr02,
			String wlbdChr03, String wlbdChr04, Double wlbdDec01,
			Double wlbdDec02, Integer wlbdInt01, Integer wlbdInt02,
			Boolean wlbdLog01, Boolean wlbdLog02, Date wlbdDte01,
			Date wlbdDte02, String wlbdUser1, String wlbdUser2,
			Double oidWlbdDet) {
		this.id = id;
		this.wlbdTrcComps = wlbdTrcComps;
		this.wlbdTrcRef = wlbdTrcRef;
		this.wlbdCompCmbOk = wlbdCompCmbOk;
		this.wlbdModDate = wlbdModDate;
		this.wlbdModUserid = wlbdModUserid;
		this.wlbdQadc01 = wlbdQadc01;
		this.wlbdQadc02 = wlbdQadc02;
		this.wlbdQadc03 = wlbdQadc03;
		this.wlbdQadc04 = wlbdQadc04;
		this.wlbdQadd01 = wlbdQadd01;
		this.wlbdQadd02 = wlbdQadd02;
		this.wlbdQadi01 = wlbdQadi01;
		this.wlbdQadi02 = wlbdQadi02;
		this.wlbdQadl01 = wlbdQadl01;
		this.wlbdQadl02 = wlbdQadl02;
		this.wlbdQadt01 = wlbdQadt01;
		this.wlbdQadt02 = wlbdQadt02;
		this.wlbdChr01 = wlbdChr01;
		this.wlbdChr02 = wlbdChr02;
		this.wlbdChr03 = wlbdChr03;
		this.wlbdChr04 = wlbdChr04;
		this.wlbdDec01 = wlbdDec01;
		this.wlbdDec02 = wlbdDec02;
		this.wlbdInt01 = wlbdInt01;
		this.wlbdInt02 = wlbdInt02;
		this.wlbdLog01 = wlbdLog01;
		this.wlbdLog02 = wlbdLog02;
		this.wlbdDte01 = wlbdDte01;
		this.wlbdDte02 = wlbdDte02;
		this.wlbdUser1 = wlbdUser1;
		this.wlbdUser2 = wlbdUser2;
		this.oidWlbdDet = oidWlbdDet;
	}

	// Property accessors

	public WlbdDetId getId() {
		return this.id;
	}

	public void setId(WlbdDetId id) {
		this.id = id;
	}

	public Boolean getWlbdTrcComps() {
		return this.wlbdTrcComps;
	}

	public void setWlbdTrcComps(Boolean wlbdTrcComps) {
		this.wlbdTrcComps = wlbdTrcComps;
	}

	public Boolean getWlbdTrcRef() {
		return this.wlbdTrcRef;
	}

	public void setWlbdTrcRef(Boolean wlbdTrcRef) {
		this.wlbdTrcRef = wlbdTrcRef;
	}

	public Boolean getWlbdCompCmbOk() {
		return this.wlbdCompCmbOk;
	}

	public void setWlbdCompCmbOk(Boolean wlbdCompCmbOk) {
		this.wlbdCompCmbOk = wlbdCompCmbOk;
	}

	public Date getWlbdModDate() {
		return this.wlbdModDate;
	}

	public void setWlbdModDate(Date wlbdModDate) {
		this.wlbdModDate = wlbdModDate;
	}

	public String getWlbdModUserid() {
		return this.wlbdModUserid;
	}

	public void setWlbdModUserid(String wlbdModUserid) {
		this.wlbdModUserid = wlbdModUserid;
	}

	public String getWlbdQadc01() {
		return this.wlbdQadc01;
	}

	public void setWlbdQadc01(String wlbdQadc01) {
		this.wlbdQadc01 = wlbdQadc01;
	}

	public String getWlbdQadc02() {
		return this.wlbdQadc02;
	}

	public void setWlbdQadc02(String wlbdQadc02) {
		this.wlbdQadc02 = wlbdQadc02;
	}

	public String getWlbdQadc03() {
		return this.wlbdQadc03;
	}

	public void setWlbdQadc03(String wlbdQadc03) {
		this.wlbdQadc03 = wlbdQadc03;
	}

	public String getWlbdQadc04() {
		return this.wlbdQadc04;
	}

	public void setWlbdQadc04(String wlbdQadc04) {
		this.wlbdQadc04 = wlbdQadc04;
	}

	public Double getWlbdQadd01() {
		return this.wlbdQadd01;
	}

	public void setWlbdQadd01(Double wlbdQadd01) {
		this.wlbdQadd01 = wlbdQadd01;
	}

	public Double getWlbdQadd02() {
		return this.wlbdQadd02;
	}

	public void setWlbdQadd02(Double wlbdQadd02) {
		this.wlbdQadd02 = wlbdQadd02;
	}

	public Integer getWlbdQadi01() {
		return this.wlbdQadi01;
	}

	public void setWlbdQadi01(Integer wlbdQadi01) {
		this.wlbdQadi01 = wlbdQadi01;
	}

	public Integer getWlbdQadi02() {
		return this.wlbdQadi02;
	}

	public void setWlbdQadi02(Integer wlbdQadi02) {
		this.wlbdQadi02 = wlbdQadi02;
	}

	public Boolean getWlbdQadl01() {
		return this.wlbdQadl01;
	}

	public void setWlbdQadl01(Boolean wlbdQadl01) {
		this.wlbdQadl01 = wlbdQadl01;
	}

	public Boolean getWlbdQadl02() {
		return this.wlbdQadl02;
	}

	public void setWlbdQadl02(Boolean wlbdQadl02) {
		this.wlbdQadl02 = wlbdQadl02;
	}

	public Date getWlbdQadt01() {
		return this.wlbdQadt01;
	}

	public void setWlbdQadt01(Date wlbdQadt01) {
		this.wlbdQadt01 = wlbdQadt01;
	}

	public Date getWlbdQadt02() {
		return this.wlbdQadt02;
	}

	public void setWlbdQadt02(Date wlbdQadt02) {
		this.wlbdQadt02 = wlbdQadt02;
	}

	public String getWlbdChr01() {
		return this.wlbdChr01;
	}

	public void setWlbdChr01(String wlbdChr01) {
		this.wlbdChr01 = wlbdChr01;
	}

	public String getWlbdChr02() {
		return this.wlbdChr02;
	}

	public void setWlbdChr02(String wlbdChr02) {
		this.wlbdChr02 = wlbdChr02;
	}

	public String getWlbdChr03() {
		return this.wlbdChr03;
	}

	public void setWlbdChr03(String wlbdChr03) {
		this.wlbdChr03 = wlbdChr03;
	}

	public String getWlbdChr04() {
		return this.wlbdChr04;
	}

	public void setWlbdChr04(String wlbdChr04) {
		this.wlbdChr04 = wlbdChr04;
	}

	public Double getWlbdDec01() {
		return this.wlbdDec01;
	}

	public void setWlbdDec01(Double wlbdDec01) {
		this.wlbdDec01 = wlbdDec01;
	}

	public Double getWlbdDec02() {
		return this.wlbdDec02;
	}

	public void setWlbdDec02(Double wlbdDec02) {
		this.wlbdDec02 = wlbdDec02;
	}

	public Integer getWlbdInt01() {
		return this.wlbdInt01;
	}

	public void setWlbdInt01(Integer wlbdInt01) {
		this.wlbdInt01 = wlbdInt01;
	}

	public Integer getWlbdInt02() {
		return this.wlbdInt02;
	}

	public void setWlbdInt02(Integer wlbdInt02) {
		this.wlbdInt02 = wlbdInt02;
	}

	public Boolean getWlbdLog01() {
		return this.wlbdLog01;
	}

	public void setWlbdLog01(Boolean wlbdLog01) {
		this.wlbdLog01 = wlbdLog01;
	}

	public Boolean getWlbdLog02() {
		return this.wlbdLog02;
	}

	public void setWlbdLog02(Boolean wlbdLog02) {
		this.wlbdLog02 = wlbdLog02;
	}

	public Date getWlbdDte01() {
		return this.wlbdDte01;
	}

	public void setWlbdDte01(Date wlbdDte01) {
		this.wlbdDte01 = wlbdDte01;
	}

	public Date getWlbdDte02() {
		return this.wlbdDte02;
	}

	public void setWlbdDte02(Date wlbdDte02) {
		this.wlbdDte02 = wlbdDte02;
	}

	public String getWlbdUser1() {
		return this.wlbdUser1;
	}

	public void setWlbdUser1(String wlbdUser1) {
		this.wlbdUser1 = wlbdUser1;
	}

	public String getWlbdUser2() {
		return this.wlbdUser2;
	}

	public void setWlbdUser2(String wlbdUser2) {
		this.wlbdUser2 = wlbdUser2;
	}

	public Double getOidWlbdDet() {
		return this.oidWlbdDet;
	}

	public void setOidWlbdDet(Double oidWlbdDet) {
		this.oidWlbdDet = oidWlbdDet;
	}

}