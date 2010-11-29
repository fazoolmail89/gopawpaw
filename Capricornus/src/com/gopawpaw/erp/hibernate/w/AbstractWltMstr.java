package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWltMstr entity provides the base persistence definition of the
 * WltMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWltMstr implements java.io.Serializable {

	// Fields

	private WltMstrId id;
	private Double wltQty;
	private Date wltCrDate;
	private Integer wltCrTime;
	private Date wltModDate;
	private Integer wltModTime;
	private String wltModUserid;
	private String wltQadc01;
	private String wltQadc02;
	private String wltQadc03;
	private String wltQadc04;
	private Double wltQadd01;
	private Double wltQadd02;
	private Integer wltQadi01;
	private Integer wltQadi02;
	private Boolean wltQadl01;
	private Boolean wltQadl02;
	private Date wltQadt01;
	private Date wltQadt02;
	private String wltChr01;
	private String wltChr02;
	private String wltChr03;
	private String wltChr04;
	private Double wltDec01;
	private Double wltDec02;
	private Integer wltInt01;
	private Integer wltInt02;
	private Boolean wltLog01;
	private Boolean wltLog02;
	private Date wltDte01;
	private Date wltDte02;
	private String wltUser1;
	private String wltUser2;
	private Double oidWltMstr;

	// Constructors

	/** default constructor */
	public AbstractWltMstr() {
	}

	/** minimal constructor */
	public AbstractWltMstr(WltMstrId id, Double oidWltMstr) {
		this.id = id;
		this.oidWltMstr = oidWltMstr;
	}

	/** full constructor */
	public AbstractWltMstr(WltMstrId id, Double wltQty, Date wltCrDate,
			Integer wltCrTime, Date wltModDate, Integer wltModTime,
			String wltModUserid, String wltQadc01, String wltQadc02,
			String wltQadc03, String wltQadc04, Double wltQadd01,
			Double wltQadd02, Integer wltQadi01, Integer wltQadi02,
			Boolean wltQadl01, Boolean wltQadl02, Date wltQadt01,
			Date wltQadt02, String wltChr01, String wltChr02, String wltChr03,
			String wltChr04, Double wltDec01, Double wltDec02,
			Integer wltInt01, Integer wltInt02, Boolean wltLog01,
			Boolean wltLog02, Date wltDte01, Date wltDte02, String wltUser1,
			String wltUser2, Double oidWltMstr) {
		this.id = id;
		this.wltQty = wltQty;
		this.wltCrDate = wltCrDate;
		this.wltCrTime = wltCrTime;
		this.wltModDate = wltModDate;
		this.wltModTime = wltModTime;
		this.wltModUserid = wltModUserid;
		this.wltQadc01 = wltQadc01;
		this.wltQadc02 = wltQadc02;
		this.wltQadc03 = wltQadc03;
		this.wltQadc04 = wltQadc04;
		this.wltQadd01 = wltQadd01;
		this.wltQadd02 = wltQadd02;
		this.wltQadi01 = wltQadi01;
		this.wltQadi02 = wltQadi02;
		this.wltQadl01 = wltQadl01;
		this.wltQadl02 = wltQadl02;
		this.wltQadt01 = wltQadt01;
		this.wltQadt02 = wltQadt02;
		this.wltChr01 = wltChr01;
		this.wltChr02 = wltChr02;
		this.wltChr03 = wltChr03;
		this.wltChr04 = wltChr04;
		this.wltDec01 = wltDec01;
		this.wltDec02 = wltDec02;
		this.wltInt01 = wltInt01;
		this.wltInt02 = wltInt02;
		this.wltLog01 = wltLog01;
		this.wltLog02 = wltLog02;
		this.wltDte01 = wltDte01;
		this.wltDte02 = wltDte02;
		this.wltUser1 = wltUser1;
		this.wltUser2 = wltUser2;
		this.oidWltMstr = oidWltMstr;
	}

	// Property accessors

	public WltMstrId getId() {
		return this.id;
	}

	public void setId(WltMstrId id) {
		this.id = id;
	}

	public Double getWltQty() {
		return this.wltQty;
	}

	public void setWltQty(Double wltQty) {
		this.wltQty = wltQty;
	}

	public Date getWltCrDate() {
		return this.wltCrDate;
	}

	public void setWltCrDate(Date wltCrDate) {
		this.wltCrDate = wltCrDate;
	}

	public Integer getWltCrTime() {
		return this.wltCrTime;
	}

	public void setWltCrTime(Integer wltCrTime) {
		this.wltCrTime = wltCrTime;
	}

	public Date getWltModDate() {
		return this.wltModDate;
	}

	public void setWltModDate(Date wltModDate) {
		this.wltModDate = wltModDate;
	}

	public Integer getWltModTime() {
		return this.wltModTime;
	}

	public void setWltModTime(Integer wltModTime) {
		this.wltModTime = wltModTime;
	}

	public String getWltModUserid() {
		return this.wltModUserid;
	}

	public void setWltModUserid(String wltModUserid) {
		this.wltModUserid = wltModUserid;
	}

	public String getWltQadc01() {
		return this.wltQadc01;
	}

	public void setWltQadc01(String wltQadc01) {
		this.wltQadc01 = wltQadc01;
	}

	public String getWltQadc02() {
		return this.wltQadc02;
	}

	public void setWltQadc02(String wltQadc02) {
		this.wltQadc02 = wltQadc02;
	}

	public String getWltQadc03() {
		return this.wltQadc03;
	}

	public void setWltQadc03(String wltQadc03) {
		this.wltQadc03 = wltQadc03;
	}

	public String getWltQadc04() {
		return this.wltQadc04;
	}

	public void setWltQadc04(String wltQadc04) {
		this.wltQadc04 = wltQadc04;
	}

	public Double getWltQadd01() {
		return this.wltQadd01;
	}

	public void setWltQadd01(Double wltQadd01) {
		this.wltQadd01 = wltQadd01;
	}

	public Double getWltQadd02() {
		return this.wltQadd02;
	}

	public void setWltQadd02(Double wltQadd02) {
		this.wltQadd02 = wltQadd02;
	}

	public Integer getWltQadi01() {
		return this.wltQadi01;
	}

	public void setWltQadi01(Integer wltQadi01) {
		this.wltQadi01 = wltQadi01;
	}

	public Integer getWltQadi02() {
		return this.wltQadi02;
	}

	public void setWltQadi02(Integer wltQadi02) {
		this.wltQadi02 = wltQadi02;
	}

	public Boolean getWltQadl01() {
		return this.wltQadl01;
	}

	public void setWltQadl01(Boolean wltQadl01) {
		this.wltQadl01 = wltQadl01;
	}

	public Boolean getWltQadl02() {
		return this.wltQadl02;
	}

	public void setWltQadl02(Boolean wltQadl02) {
		this.wltQadl02 = wltQadl02;
	}

	public Date getWltQadt01() {
		return this.wltQadt01;
	}

	public void setWltQadt01(Date wltQadt01) {
		this.wltQadt01 = wltQadt01;
	}

	public Date getWltQadt02() {
		return this.wltQadt02;
	}

	public void setWltQadt02(Date wltQadt02) {
		this.wltQadt02 = wltQadt02;
	}

	public String getWltChr01() {
		return this.wltChr01;
	}

	public void setWltChr01(String wltChr01) {
		this.wltChr01 = wltChr01;
	}

	public String getWltChr02() {
		return this.wltChr02;
	}

	public void setWltChr02(String wltChr02) {
		this.wltChr02 = wltChr02;
	}

	public String getWltChr03() {
		return this.wltChr03;
	}

	public void setWltChr03(String wltChr03) {
		this.wltChr03 = wltChr03;
	}

	public String getWltChr04() {
		return this.wltChr04;
	}

	public void setWltChr04(String wltChr04) {
		this.wltChr04 = wltChr04;
	}

	public Double getWltDec01() {
		return this.wltDec01;
	}

	public void setWltDec01(Double wltDec01) {
		this.wltDec01 = wltDec01;
	}

	public Double getWltDec02() {
		return this.wltDec02;
	}

	public void setWltDec02(Double wltDec02) {
		this.wltDec02 = wltDec02;
	}

	public Integer getWltInt01() {
		return this.wltInt01;
	}

	public void setWltInt01(Integer wltInt01) {
		this.wltInt01 = wltInt01;
	}

	public Integer getWltInt02() {
		return this.wltInt02;
	}

	public void setWltInt02(Integer wltInt02) {
		this.wltInt02 = wltInt02;
	}

	public Boolean getWltLog01() {
		return this.wltLog01;
	}

	public void setWltLog01(Boolean wltLog01) {
		this.wltLog01 = wltLog01;
	}

	public Boolean getWltLog02() {
		return this.wltLog02;
	}

	public void setWltLog02(Boolean wltLog02) {
		this.wltLog02 = wltLog02;
	}

	public Date getWltDte01() {
		return this.wltDte01;
	}

	public void setWltDte01(Date wltDte01) {
		this.wltDte01 = wltDte01;
	}

	public Date getWltDte02() {
		return this.wltDte02;
	}

	public void setWltDte02(Date wltDte02) {
		this.wltDte02 = wltDte02;
	}

	public String getWltUser1() {
		return this.wltUser1;
	}

	public void setWltUser1(String wltUser1) {
		this.wltUser1 = wltUser1;
	}

	public String getWltUser2() {
		return this.wltUser2;
	}

	public void setWltUser2(String wltUser2) {
		this.wltUser2 = wltUser2;
	}

	public Double getOidWltMstr() {
		return this.oidWltMstr;
	}

	public void setOidWltMstr(Double oidWltMstr) {
		this.oidWltMstr = oidWltMstr;
	}

}