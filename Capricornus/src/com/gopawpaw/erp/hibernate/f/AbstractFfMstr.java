package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFfMstr entity provides the base persistence definition of the FfMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFfMstr implements java.io.Serializable {

	// Fields

	private FfMstrId id;
	private Date ffDate;
	private Integer ffTime;
	private String ffHisYr;
	private String ffOrigFc;
	private String ffAdjFc;
	private String ffUser1;
	private String ffUser2;
	private String ffQadc01;
	private Double oidFfMstr;

	// Constructors

	/** default constructor */
	public AbstractFfMstr() {
	}

	/** minimal constructor */
	public AbstractFfMstr(FfMstrId id, Double oidFfMstr) {
		this.id = id;
		this.oidFfMstr = oidFfMstr;
	}

	/** full constructor */
	public AbstractFfMstr(FfMstrId id, Date ffDate, Integer ffTime,
			String ffHisYr, String ffOrigFc, String ffAdjFc, String ffUser1,
			String ffUser2, String ffQadc01, Double oidFfMstr) {
		this.id = id;
		this.ffDate = ffDate;
		this.ffTime = ffTime;
		this.ffHisYr = ffHisYr;
		this.ffOrigFc = ffOrigFc;
		this.ffAdjFc = ffAdjFc;
		this.ffUser1 = ffUser1;
		this.ffUser2 = ffUser2;
		this.ffQadc01 = ffQadc01;
		this.oidFfMstr = oidFfMstr;
	}

	// Property accessors

	public FfMstrId getId() {
		return this.id;
	}

	public void setId(FfMstrId id) {
		this.id = id;
	}

	public Date getFfDate() {
		return this.ffDate;
	}

	public void setFfDate(Date ffDate) {
		this.ffDate = ffDate;
	}

	public Integer getFfTime() {
		return this.ffTime;
	}

	public void setFfTime(Integer ffTime) {
		this.ffTime = ffTime;
	}

	public String getFfHisYr() {
		return this.ffHisYr;
	}

	public void setFfHisYr(String ffHisYr) {
		this.ffHisYr = ffHisYr;
	}

	public String getFfOrigFc() {
		return this.ffOrigFc;
	}

	public void setFfOrigFc(String ffOrigFc) {
		this.ffOrigFc = ffOrigFc;
	}

	public String getFfAdjFc() {
		return this.ffAdjFc;
	}

	public void setFfAdjFc(String ffAdjFc) {
		this.ffAdjFc = ffAdjFc;
	}

	public String getFfUser1() {
		return this.ffUser1;
	}

	public void setFfUser1(String ffUser1) {
		this.ffUser1 = ffUser1;
	}

	public String getFfUser2() {
		return this.ffUser2;
	}

	public void setFfUser2(String ffUser2) {
		this.ffUser2 = ffUser2;
	}

	public String getFfQadc01() {
		return this.ffQadc01;
	}

	public void setFfQadc01(String ffQadc01) {
		this.ffQadc01 = ffQadc01;
	}

	public Double getOidFfMstr() {
		return this.oidFfMstr;
	}

	public void setOidFfMstr(Double oidFfMstr) {
		this.oidFfMstr = oidFfMstr;
	}

}