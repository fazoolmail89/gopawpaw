package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRqaMstr entity provides the base persistence definition of the
 * RqaMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqaMstr implements java.io.Serializable {

	// Fields

	private RqaMstrId id;
	private String rqaSubTo;
	private String rqaCcTo;
	private Date rqaEnd;
	private Integer rqaRvwLevel;
	private Boolean rqaRvwReq;
	private Integer rqaAprLevel;
	private Boolean rqaAprReq;
	private String rqaAltApr;
	private String rqaAdminApr;
	private String rqaChr01;
	private String rqaChr02;
	private String rqaChr03;
	private String rqaChr04;
	private String rqaQadc01;
	private String rqaQadc02;
	private String rqaQadc03;
	private String rqaQadc04;
	private Double oidRqaMstr;

	// Constructors

	/** default constructor */
	public AbstractRqaMstr() {
	}

	/** minimal constructor */
	public AbstractRqaMstr(RqaMstrId id, Double oidRqaMstr) {
		this.id = id;
		this.oidRqaMstr = oidRqaMstr;
	}

	/** full constructor */
	public AbstractRqaMstr(RqaMstrId id, String rqaSubTo, String rqaCcTo,
			Date rqaEnd, Integer rqaRvwLevel, Boolean rqaRvwReq,
			Integer rqaAprLevel, Boolean rqaAprReq, String rqaAltApr,
			String rqaAdminApr, String rqaChr01, String rqaChr02,
			String rqaChr03, String rqaChr04, String rqaQadc01,
			String rqaQadc02, String rqaQadc03, String rqaQadc04,
			Double oidRqaMstr) {
		this.id = id;
		this.rqaSubTo = rqaSubTo;
		this.rqaCcTo = rqaCcTo;
		this.rqaEnd = rqaEnd;
		this.rqaRvwLevel = rqaRvwLevel;
		this.rqaRvwReq = rqaRvwReq;
		this.rqaAprLevel = rqaAprLevel;
		this.rqaAprReq = rqaAprReq;
		this.rqaAltApr = rqaAltApr;
		this.rqaAdminApr = rqaAdminApr;
		this.rqaChr01 = rqaChr01;
		this.rqaChr02 = rqaChr02;
		this.rqaChr03 = rqaChr03;
		this.rqaChr04 = rqaChr04;
		this.rqaQadc01 = rqaQadc01;
		this.rqaQadc02 = rqaQadc02;
		this.rqaQadc03 = rqaQadc03;
		this.rqaQadc04 = rqaQadc04;
		this.oidRqaMstr = oidRqaMstr;
	}

	// Property accessors

	public RqaMstrId getId() {
		return this.id;
	}

	public void setId(RqaMstrId id) {
		this.id = id;
	}

	public String getRqaSubTo() {
		return this.rqaSubTo;
	}

	public void setRqaSubTo(String rqaSubTo) {
		this.rqaSubTo = rqaSubTo;
	}

	public String getRqaCcTo() {
		return this.rqaCcTo;
	}

	public void setRqaCcTo(String rqaCcTo) {
		this.rqaCcTo = rqaCcTo;
	}

	public Date getRqaEnd() {
		return this.rqaEnd;
	}

	public void setRqaEnd(Date rqaEnd) {
		this.rqaEnd = rqaEnd;
	}

	public Integer getRqaRvwLevel() {
		return this.rqaRvwLevel;
	}

	public void setRqaRvwLevel(Integer rqaRvwLevel) {
		this.rqaRvwLevel = rqaRvwLevel;
	}

	public Boolean getRqaRvwReq() {
		return this.rqaRvwReq;
	}

	public void setRqaRvwReq(Boolean rqaRvwReq) {
		this.rqaRvwReq = rqaRvwReq;
	}

	public Integer getRqaAprLevel() {
		return this.rqaAprLevel;
	}

	public void setRqaAprLevel(Integer rqaAprLevel) {
		this.rqaAprLevel = rqaAprLevel;
	}

	public Boolean getRqaAprReq() {
		return this.rqaAprReq;
	}

	public void setRqaAprReq(Boolean rqaAprReq) {
		this.rqaAprReq = rqaAprReq;
	}

	public String getRqaAltApr() {
		return this.rqaAltApr;
	}

	public void setRqaAltApr(String rqaAltApr) {
		this.rqaAltApr = rqaAltApr;
	}

	public String getRqaAdminApr() {
		return this.rqaAdminApr;
	}

	public void setRqaAdminApr(String rqaAdminApr) {
		this.rqaAdminApr = rqaAdminApr;
	}

	public String getRqaChr01() {
		return this.rqaChr01;
	}

	public void setRqaChr01(String rqaChr01) {
		this.rqaChr01 = rqaChr01;
	}

	public String getRqaChr02() {
		return this.rqaChr02;
	}

	public void setRqaChr02(String rqaChr02) {
		this.rqaChr02 = rqaChr02;
	}

	public String getRqaChr03() {
		return this.rqaChr03;
	}

	public void setRqaChr03(String rqaChr03) {
		this.rqaChr03 = rqaChr03;
	}

	public String getRqaChr04() {
		return this.rqaChr04;
	}

	public void setRqaChr04(String rqaChr04) {
		this.rqaChr04 = rqaChr04;
	}

	public String getRqaQadc01() {
		return this.rqaQadc01;
	}

	public void setRqaQadc01(String rqaQadc01) {
		this.rqaQadc01 = rqaQadc01;
	}

	public String getRqaQadc02() {
		return this.rqaQadc02;
	}

	public void setRqaQadc02(String rqaQadc02) {
		this.rqaQadc02 = rqaQadc02;
	}

	public String getRqaQadc03() {
		return this.rqaQadc03;
	}

	public void setRqaQadc03(String rqaQadc03) {
		this.rqaQadc03 = rqaQadc03;
	}

	public String getRqaQadc04() {
		return this.rqaQadc04;
	}

	public void setRqaQadc04(String rqaQadc04) {
		this.rqaQadc04 = rqaQadc04;
	}

	public Double getOidRqaMstr() {
		return this.oidRqaMstr;
	}

	public void setOidRqaMstr(Double oidRqaMstr) {
		this.oidRqaMstr = oidRqaMstr;
	}

}