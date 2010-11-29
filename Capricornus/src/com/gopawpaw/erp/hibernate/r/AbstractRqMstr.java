package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRqMstr entity provides the base persistence definition of the RqMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqMstr implements java.io.Serializable {

	// Fields

	private RqMstrId id;
	private Double rqQtyPer;
	private Integer rqLead;
	private Integer rqLtOff;
	private Date rqEnd;
	private String rqUser1;
	private String rqUser2;
	private String rqChr01;
	private String rqChr02;
	private String rqChr03;
	private String rqChr04;
	private String rqChr05;
	private Date rqDte01;
	private Date rqDte02;
	private Double rqDec01;
	private Double rqDec02;
	private Boolean rqLog01;
	private Double oidRqMstr;

	// Constructors

	/** default constructor */
	public AbstractRqMstr() {
	}

	/** minimal constructor */
	public AbstractRqMstr(RqMstrId id, Double oidRqMstr) {
		this.id = id;
		this.oidRqMstr = oidRqMstr;
	}

	/** full constructor */
	public AbstractRqMstr(RqMstrId id, Double rqQtyPer, Integer rqLead,
			Integer rqLtOff, Date rqEnd, String rqUser1, String rqUser2,
			String rqChr01, String rqChr02, String rqChr03, String rqChr04,
			String rqChr05, Date rqDte01, Date rqDte02, Double rqDec01,
			Double rqDec02, Boolean rqLog01, Double oidRqMstr) {
		this.id = id;
		this.rqQtyPer = rqQtyPer;
		this.rqLead = rqLead;
		this.rqLtOff = rqLtOff;
		this.rqEnd = rqEnd;
		this.rqUser1 = rqUser1;
		this.rqUser2 = rqUser2;
		this.rqChr01 = rqChr01;
		this.rqChr02 = rqChr02;
		this.rqChr03 = rqChr03;
		this.rqChr04 = rqChr04;
		this.rqChr05 = rqChr05;
		this.rqDte01 = rqDte01;
		this.rqDte02 = rqDte02;
		this.rqDec01 = rqDec01;
		this.rqDec02 = rqDec02;
		this.rqLog01 = rqLog01;
		this.oidRqMstr = oidRqMstr;
	}

	// Property accessors

	public RqMstrId getId() {
		return this.id;
	}

	public void setId(RqMstrId id) {
		this.id = id;
	}

	public Double getRqQtyPer() {
		return this.rqQtyPer;
	}

	public void setRqQtyPer(Double rqQtyPer) {
		this.rqQtyPer = rqQtyPer;
	}

	public Integer getRqLead() {
		return this.rqLead;
	}

	public void setRqLead(Integer rqLead) {
		this.rqLead = rqLead;
	}

	public Integer getRqLtOff() {
		return this.rqLtOff;
	}

	public void setRqLtOff(Integer rqLtOff) {
		this.rqLtOff = rqLtOff;
	}

	public Date getRqEnd() {
		return this.rqEnd;
	}

	public void setRqEnd(Date rqEnd) {
		this.rqEnd = rqEnd;
	}

	public String getRqUser1() {
		return this.rqUser1;
	}

	public void setRqUser1(String rqUser1) {
		this.rqUser1 = rqUser1;
	}

	public String getRqUser2() {
		return this.rqUser2;
	}

	public void setRqUser2(String rqUser2) {
		this.rqUser2 = rqUser2;
	}

	public String getRqChr01() {
		return this.rqChr01;
	}

	public void setRqChr01(String rqChr01) {
		this.rqChr01 = rqChr01;
	}

	public String getRqChr02() {
		return this.rqChr02;
	}

	public void setRqChr02(String rqChr02) {
		this.rqChr02 = rqChr02;
	}

	public String getRqChr03() {
		return this.rqChr03;
	}

	public void setRqChr03(String rqChr03) {
		this.rqChr03 = rqChr03;
	}

	public String getRqChr04() {
		return this.rqChr04;
	}

	public void setRqChr04(String rqChr04) {
		this.rqChr04 = rqChr04;
	}

	public String getRqChr05() {
		return this.rqChr05;
	}

	public void setRqChr05(String rqChr05) {
		this.rqChr05 = rqChr05;
	}

	public Date getRqDte01() {
		return this.rqDte01;
	}

	public void setRqDte01(Date rqDte01) {
		this.rqDte01 = rqDte01;
	}

	public Date getRqDte02() {
		return this.rqDte02;
	}

	public void setRqDte02(Date rqDte02) {
		this.rqDte02 = rqDte02;
	}

	public Double getRqDec01() {
		return this.rqDec01;
	}

	public void setRqDec01(Double rqDec01) {
		this.rqDec01 = rqDec01;
	}

	public Double getRqDec02() {
		return this.rqDec02;
	}

	public void setRqDec02(Double rqDec02) {
		this.rqDec02 = rqDec02;
	}

	public Boolean getRqLog01() {
		return this.rqLog01;
	}

	public void setRqLog01(Boolean rqLog01) {
		this.rqLog01 = rqLog01;
	}

	public Double getOidRqMstr() {
		return this.oidRqMstr;
	}

	public void setOidRqMstr(Double oidRqMstr) {
		this.oidRqMstr = oidRqMstr;
	}

}