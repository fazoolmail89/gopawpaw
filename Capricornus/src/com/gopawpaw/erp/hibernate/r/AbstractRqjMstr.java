package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRqjMstr entity provides the base persistence definition of the
 * RqjMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqjMstr implements java.io.Serializable {

	// Fields

	private RqjMstrId id;
	private String rqjDesc;
	private Date rqjStart;
	private Date rqjEnd;
	private String rqjChr01;
	private String rqjChr02;
	private String rqjChr03;
	private String rqjChr04;
	private String rqjQadc01;
	private String rqjQadc02;
	private String rqjQadc03;
	private String rqjQadc04;
	private Double oidRqjMstr;

	// Constructors

	/** default constructor */
	public AbstractRqjMstr() {
	}

	/** minimal constructor */
	public AbstractRqjMstr(RqjMstrId id, Double oidRqjMstr) {
		this.id = id;
		this.oidRqjMstr = oidRqjMstr;
	}

	/** full constructor */
	public AbstractRqjMstr(RqjMstrId id, String rqjDesc, Date rqjStart,
			Date rqjEnd, String rqjChr01, String rqjChr02, String rqjChr03,
			String rqjChr04, String rqjQadc01, String rqjQadc02,
			String rqjQadc03, String rqjQadc04, Double oidRqjMstr) {
		this.id = id;
		this.rqjDesc = rqjDesc;
		this.rqjStart = rqjStart;
		this.rqjEnd = rqjEnd;
		this.rqjChr01 = rqjChr01;
		this.rqjChr02 = rqjChr02;
		this.rqjChr03 = rqjChr03;
		this.rqjChr04 = rqjChr04;
		this.rqjQadc01 = rqjQadc01;
		this.rqjQadc02 = rqjQadc02;
		this.rqjQadc03 = rqjQadc03;
		this.rqjQadc04 = rqjQadc04;
		this.oidRqjMstr = oidRqjMstr;
	}

	// Property accessors

	public RqjMstrId getId() {
		return this.id;
	}

	public void setId(RqjMstrId id) {
		this.id = id;
	}

	public String getRqjDesc() {
		return this.rqjDesc;
	}

	public void setRqjDesc(String rqjDesc) {
		this.rqjDesc = rqjDesc;
	}

	public Date getRqjStart() {
		return this.rqjStart;
	}

	public void setRqjStart(Date rqjStart) {
		this.rqjStart = rqjStart;
	}

	public Date getRqjEnd() {
		return this.rqjEnd;
	}

	public void setRqjEnd(Date rqjEnd) {
		this.rqjEnd = rqjEnd;
	}

	public String getRqjChr01() {
		return this.rqjChr01;
	}

	public void setRqjChr01(String rqjChr01) {
		this.rqjChr01 = rqjChr01;
	}

	public String getRqjChr02() {
		return this.rqjChr02;
	}

	public void setRqjChr02(String rqjChr02) {
		this.rqjChr02 = rqjChr02;
	}

	public String getRqjChr03() {
		return this.rqjChr03;
	}

	public void setRqjChr03(String rqjChr03) {
		this.rqjChr03 = rqjChr03;
	}

	public String getRqjChr04() {
		return this.rqjChr04;
	}

	public void setRqjChr04(String rqjChr04) {
		this.rqjChr04 = rqjChr04;
	}

	public String getRqjQadc01() {
		return this.rqjQadc01;
	}

	public void setRqjQadc01(String rqjQadc01) {
		this.rqjQadc01 = rqjQadc01;
	}

	public String getRqjQadc02() {
		return this.rqjQadc02;
	}

	public void setRqjQadc02(String rqjQadc02) {
		this.rqjQadc02 = rqjQadc02;
	}

	public String getRqjQadc03() {
		return this.rqjQadc03;
	}

	public void setRqjQadc03(String rqjQadc03) {
		this.rqjQadc03 = rqjQadc03;
	}

	public String getRqjQadc04() {
		return this.rqjQadc04;
	}

	public void setRqjQadc04(String rqjQadc04) {
		this.rqjQadc04 = rqjQadc04;
	}

	public Double getOidRqjMstr() {
		return this.oidRqjMstr;
	}

	public void setOidRqjMstr(Double oidRqjMstr) {
		this.oidRqjMstr = oidRqjMstr;
	}

}