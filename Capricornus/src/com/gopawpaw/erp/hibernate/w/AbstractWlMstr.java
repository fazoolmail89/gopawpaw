package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWlMstr entity provides the base persistence definition of the WlMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWlMstr implements java.io.Serializable {

	// Fields

	private WlMstrId id;
	private String wlCertStatus;
	private Double wlQtyCumprod;
	private Double wlQtyCumcons;
	private Double wlQtyCumrjct;
	private Double wlQtyCumrwrk;
	private Double wlQtyCumscrap;
	private Double wlQtyCumadj;
	private Double wlQtyCumtrin;
	private Double wlQtyCumtrout;
	private Date wlCrDate;
	private Integer wlCrTime;
	private Date wlModDate;
	private Integer wlModTime;
	private String wlModUserid;
	private String wlQadc01;
	private String wlQadc02;
	private String wlQadc03;
	private String wlQadc04;
	private Double wlQadd01;
	private Double wlQadd02;
	private Integer wlQadi01;
	private Integer wlQadi02;
	private Boolean wlQadl01;
	private Boolean wlQadl02;
	private Date wlQadt01;
	private Date wlQadt02;
	private String wlChr01;
	private String wlChr02;
	private String wlChr03;
	private String wlChr04;
	private Double wlDec01;
	private Double wlDec02;
	private Integer wlInt01;
	private Integer wlInt02;
	private Boolean wlLog01;
	private Boolean wlLog02;
	private Date wlDte01;
	private Date wlDte02;
	private String wlUser1;
	private String wlUser2;
	private Double oidWlMstr;

	// Constructors

	/** default constructor */
	public AbstractWlMstr() {
	}

	/** minimal constructor */
	public AbstractWlMstr(WlMstrId id, Double oidWlMstr) {
		this.id = id;
		this.oidWlMstr = oidWlMstr;
	}

	/** full constructor */
	public AbstractWlMstr(WlMstrId id, String wlCertStatus,
			Double wlQtyCumprod, Double wlQtyCumcons, Double wlQtyCumrjct,
			Double wlQtyCumrwrk, Double wlQtyCumscrap, Double wlQtyCumadj,
			Double wlQtyCumtrin, Double wlQtyCumtrout, Date wlCrDate,
			Integer wlCrTime, Date wlModDate, Integer wlModTime,
			String wlModUserid, String wlQadc01, String wlQadc02,
			String wlQadc03, String wlQadc04, Double wlQadd01, Double wlQadd02,
			Integer wlQadi01, Integer wlQadi02, Boolean wlQadl01,
			Boolean wlQadl02, Date wlQadt01, Date wlQadt02, String wlChr01,
			String wlChr02, String wlChr03, String wlChr04, Double wlDec01,
			Double wlDec02, Integer wlInt01, Integer wlInt02, Boolean wlLog01,
			Boolean wlLog02, Date wlDte01, Date wlDte02, String wlUser1,
			String wlUser2, Double oidWlMstr) {
		this.id = id;
		this.wlCertStatus = wlCertStatus;
		this.wlQtyCumprod = wlQtyCumprod;
		this.wlQtyCumcons = wlQtyCumcons;
		this.wlQtyCumrjct = wlQtyCumrjct;
		this.wlQtyCumrwrk = wlQtyCumrwrk;
		this.wlQtyCumscrap = wlQtyCumscrap;
		this.wlQtyCumadj = wlQtyCumadj;
		this.wlQtyCumtrin = wlQtyCumtrin;
		this.wlQtyCumtrout = wlQtyCumtrout;
		this.wlCrDate = wlCrDate;
		this.wlCrTime = wlCrTime;
		this.wlModDate = wlModDate;
		this.wlModTime = wlModTime;
		this.wlModUserid = wlModUserid;
		this.wlQadc01 = wlQadc01;
		this.wlQadc02 = wlQadc02;
		this.wlQadc03 = wlQadc03;
		this.wlQadc04 = wlQadc04;
		this.wlQadd01 = wlQadd01;
		this.wlQadd02 = wlQadd02;
		this.wlQadi01 = wlQadi01;
		this.wlQadi02 = wlQadi02;
		this.wlQadl01 = wlQadl01;
		this.wlQadl02 = wlQadl02;
		this.wlQadt01 = wlQadt01;
		this.wlQadt02 = wlQadt02;
		this.wlChr01 = wlChr01;
		this.wlChr02 = wlChr02;
		this.wlChr03 = wlChr03;
		this.wlChr04 = wlChr04;
		this.wlDec01 = wlDec01;
		this.wlDec02 = wlDec02;
		this.wlInt01 = wlInt01;
		this.wlInt02 = wlInt02;
		this.wlLog01 = wlLog01;
		this.wlLog02 = wlLog02;
		this.wlDte01 = wlDte01;
		this.wlDte02 = wlDte02;
		this.wlUser1 = wlUser1;
		this.wlUser2 = wlUser2;
		this.oidWlMstr = oidWlMstr;
	}

	// Property accessors

	public WlMstrId getId() {
		return this.id;
	}

	public void setId(WlMstrId id) {
		this.id = id;
	}

	public String getWlCertStatus() {
		return this.wlCertStatus;
	}

	public void setWlCertStatus(String wlCertStatus) {
		this.wlCertStatus = wlCertStatus;
	}

	public Double getWlQtyCumprod() {
		return this.wlQtyCumprod;
	}

	public void setWlQtyCumprod(Double wlQtyCumprod) {
		this.wlQtyCumprod = wlQtyCumprod;
	}

	public Double getWlQtyCumcons() {
		return this.wlQtyCumcons;
	}

	public void setWlQtyCumcons(Double wlQtyCumcons) {
		this.wlQtyCumcons = wlQtyCumcons;
	}

	public Double getWlQtyCumrjct() {
		return this.wlQtyCumrjct;
	}

	public void setWlQtyCumrjct(Double wlQtyCumrjct) {
		this.wlQtyCumrjct = wlQtyCumrjct;
	}

	public Double getWlQtyCumrwrk() {
		return this.wlQtyCumrwrk;
	}

	public void setWlQtyCumrwrk(Double wlQtyCumrwrk) {
		this.wlQtyCumrwrk = wlQtyCumrwrk;
	}

	public Double getWlQtyCumscrap() {
		return this.wlQtyCumscrap;
	}

	public void setWlQtyCumscrap(Double wlQtyCumscrap) {
		this.wlQtyCumscrap = wlQtyCumscrap;
	}

	public Double getWlQtyCumadj() {
		return this.wlQtyCumadj;
	}

	public void setWlQtyCumadj(Double wlQtyCumadj) {
		this.wlQtyCumadj = wlQtyCumadj;
	}

	public Double getWlQtyCumtrin() {
		return this.wlQtyCumtrin;
	}

	public void setWlQtyCumtrin(Double wlQtyCumtrin) {
		this.wlQtyCumtrin = wlQtyCumtrin;
	}

	public Double getWlQtyCumtrout() {
		return this.wlQtyCumtrout;
	}

	public void setWlQtyCumtrout(Double wlQtyCumtrout) {
		this.wlQtyCumtrout = wlQtyCumtrout;
	}

	public Date getWlCrDate() {
		return this.wlCrDate;
	}

	public void setWlCrDate(Date wlCrDate) {
		this.wlCrDate = wlCrDate;
	}

	public Integer getWlCrTime() {
		return this.wlCrTime;
	}

	public void setWlCrTime(Integer wlCrTime) {
		this.wlCrTime = wlCrTime;
	}

	public Date getWlModDate() {
		return this.wlModDate;
	}

	public void setWlModDate(Date wlModDate) {
		this.wlModDate = wlModDate;
	}

	public Integer getWlModTime() {
		return this.wlModTime;
	}

	public void setWlModTime(Integer wlModTime) {
		this.wlModTime = wlModTime;
	}

	public String getWlModUserid() {
		return this.wlModUserid;
	}

	public void setWlModUserid(String wlModUserid) {
		this.wlModUserid = wlModUserid;
	}

	public String getWlQadc01() {
		return this.wlQadc01;
	}

	public void setWlQadc01(String wlQadc01) {
		this.wlQadc01 = wlQadc01;
	}

	public String getWlQadc02() {
		return this.wlQadc02;
	}

	public void setWlQadc02(String wlQadc02) {
		this.wlQadc02 = wlQadc02;
	}

	public String getWlQadc03() {
		return this.wlQadc03;
	}

	public void setWlQadc03(String wlQadc03) {
		this.wlQadc03 = wlQadc03;
	}

	public String getWlQadc04() {
		return this.wlQadc04;
	}

	public void setWlQadc04(String wlQadc04) {
		this.wlQadc04 = wlQadc04;
	}

	public Double getWlQadd01() {
		return this.wlQadd01;
	}

	public void setWlQadd01(Double wlQadd01) {
		this.wlQadd01 = wlQadd01;
	}

	public Double getWlQadd02() {
		return this.wlQadd02;
	}

	public void setWlQadd02(Double wlQadd02) {
		this.wlQadd02 = wlQadd02;
	}

	public Integer getWlQadi01() {
		return this.wlQadi01;
	}

	public void setWlQadi01(Integer wlQadi01) {
		this.wlQadi01 = wlQadi01;
	}

	public Integer getWlQadi02() {
		return this.wlQadi02;
	}

	public void setWlQadi02(Integer wlQadi02) {
		this.wlQadi02 = wlQadi02;
	}

	public Boolean getWlQadl01() {
		return this.wlQadl01;
	}

	public void setWlQadl01(Boolean wlQadl01) {
		this.wlQadl01 = wlQadl01;
	}

	public Boolean getWlQadl02() {
		return this.wlQadl02;
	}

	public void setWlQadl02(Boolean wlQadl02) {
		this.wlQadl02 = wlQadl02;
	}

	public Date getWlQadt01() {
		return this.wlQadt01;
	}

	public void setWlQadt01(Date wlQadt01) {
		this.wlQadt01 = wlQadt01;
	}

	public Date getWlQadt02() {
		return this.wlQadt02;
	}

	public void setWlQadt02(Date wlQadt02) {
		this.wlQadt02 = wlQadt02;
	}

	public String getWlChr01() {
		return this.wlChr01;
	}

	public void setWlChr01(String wlChr01) {
		this.wlChr01 = wlChr01;
	}

	public String getWlChr02() {
		return this.wlChr02;
	}

	public void setWlChr02(String wlChr02) {
		this.wlChr02 = wlChr02;
	}

	public String getWlChr03() {
		return this.wlChr03;
	}

	public void setWlChr03(String wlChr03) {
		this.wlChr03 = wlChr03;
	}

	public String getWlChr04() {
		return this.wlChr04;
	}

	public void setWlChr04(String wlChr04) {
		this.wlChr04 = wlChr04;
	}

	public Double getWlDec01() {
		return this.wlDec01;
	}

	public void setWlDec01(Double wlDec01) {
		this.wlDec01 = wlDec01;
	}

	public Double getWlDec02() {
		return this.wlDec02;
	}

	public void setWlDec02(Double wlDec02) {
		this.wlDec02 = wlDec02;
	}

	public Integer getWlInt01() {
		return this.wlInt01;
	}

	public void setWlInt01(Integer wlInt01) {
		this.wlInt01 = wlInt01;
	}

	public Integer getWlInt02() {
		return this.wlInt02;
	}

	public void setWlInt02(Integer wlInt02) {
		this.wlInt02 = wlInt02;
	}

	public Boolean getWlLog01() {
		return this.wlLog01;
	}

	public void setWlLog01(Boolean wlLog01) {
		this.wlLog01 = wlLog01;
	}

	public Boolean getWlLog02() {
		return this.wlLog02;
	}

	public void setWlLog02(Boolean wlLog02) {
		this.wlLog02 = wlLog02;
	}

	public Date getWlDte01() {
		return this.wlDte01;
	}

	public void setWlDte01(Date wlDte01) {
		this.wlDte01 = wlDte01;
	}

	public Date getWlDte02() {
		return this.wlDte02;
	}

	public void setWlDte02(Date wlDte02) {
		this.wlDte02 = wlDte02;
	}

	public String getWlUser1() {
		return this.wlUser1;
	}

	public void setWlUser1(String wlUser1) {
		this.wlUser1 = wlUser1;
	}

	public String getWlUser2() {
		return this.wlUser2;
	}

	public void setWlUser2(String wlUser2) {
		this.wlUser2 = wlUser2;
	}

	public Double getOidWlMstr() {
		return this.oidWlMstr;
	}

	public void setOidWlMstr(Double oidWlMstr) {
		this.oidWlMstr = oidWlMstr;
	}

}