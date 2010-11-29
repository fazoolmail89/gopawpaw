package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPjMstr entity provides the base persistence definition of the PjMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjMstr implements java.io.Serializable {

	// Fields

	private PjMstrId id;
	private String pjDesc;
	private Boolean pjActive;
	private Date pjBegDt;
	private Integer pjCmtindx;
	private Date pjComp;
	private Date pjFindate;
	private Date pjRevdate;
	private Date pjRevfin;
	private String pjStat;
	private String pjType;
	private String pjUser1;
	private String pjUser2;
	private String pjQadc01;
	private Double oidPjMstr;

	// Constructors

	/** default constructor */
	public AbstractPjMstr() {
	}

	/** minimal constructor */
	public AbstractPjMstr(PjMstrId id, Double oidPjMstr) {
		this.id = id;
		this.oidPjMstr = oidPjMstr;
	}

	/** full constructor */
	public AbstractPjMstr(PjMstrId id, String pjDesc, Boolean pjActive,
			Date pjBegDt, Integer pjCmtindx, Date pjComp, Date pjFindate,
			Date pjRevdate, Date pjRevfin, String pjStat, String pjType,
			String pjUser1, String pjUser2, String pjQadc01, Double oidPjMstr) {
		this.id = id;
		this.pjDesc = pjDesc;
		this.pjActive = pjActive;
		this.pjBegDt = pjBegDt;
		this.pjCmtindx = pjCmtindx;
		this.pjComp = pjComp;
		this.pjFindate = pjFindate;
		this.pjRevdate = pjRevdate;
		this.pjRevfin = pjRevfin;
		this.pjStat = pjStat;
		this.pjType = pjType;
		this.pjUser1 = pjUser1;
		this.pjUser2 = pjUser2;
		this.pjQadc01 = pjQadc01;
		this.oidPjMstr = oidPjMstr;
	}

	// Property accessors

	public PjMstrId getId() {
		return this.id;
	}

	public void setId(PjMstrId id) {
		this.id = id;
	}

	public String getPjDesc() {
		return this.pjDesc;
	}

	public void setPjDesc(String pjDesc) {
		this.pjDesc = pjDesc;
	}

	public Boolean getPjActive() {
		return this.pjActive;
	}

	public void setPjActive(Boolean pjActive) {
		this.pjActive = pjActive;
	}

	public Date getPjBegDt() {
		return this.pjBegDt;
	}

	public void setPjBegDt(Date pjBegDt) {
		this.pjBegDt = pjBegDt;
	}

	public Integer getPjCmtindx() {
		return this.pjCmtindx;
	}

	public void setPjCmtindx(Integer pjCmtindx) {
		this.pjCmtindx = pjCmtindx;
	}

	public Date getPjComp() {
		return this.pjComp;
	}

	public void setPjComp(Date pjComp) {
		this.pjComp = pjComp;
	}

	public Date getPjFindate() {
		return this.pjFindate;
	}

	public void setPjFindate(Date pjFindate) {
		this.pjFindate = pjFindate;
	}

	public Date getPjRevdate() {
		return this.pjRevdate;
	}

	public void setPjRevdate(Date pjRevdate) {
		this.pjRevdate = pjRevdate;
	}

	public Date getPjRevfin() {
		return this.pjRevfin;
	}

	public void setPjRevfin(Date pjRevfin) {
		this.pjRevfin = pjRevfin;
	}

	public String getPjStat() {
		return this.pjStat;
	}

	public void setPjStat(String pjStat) {
		this.pjStat = pjStat;
	}

	public String getPjType() {
		return this.pjType;
	}

	public void setPjType(String pjType) {
		this.pjType = pjType;
	}

	public String getPjUser1() {
		return this.pjUser1;
	}

	public void setPjUser1(String pjUser1) {
		this.pjUser1 = pjUser1;
	}

	public String getPjUser2() {
		return this.pjUser2;
	}

	public void setPjUser2(String pjUser2) {
		this.pjUser2 = pjUser2;
	}

	public String getPjQadc01() {
		return this.pjQadc01;
	}

	public void setPjQadc01(String pjQadc01) {
		this.pjQadc01 = pjQadc01;
	}

	public Double getOidPjMstr() {
		return this.oidPjMstr;
	}

	public void setOidPjMstr(Double oidPjMstr) {
		this.oidPjMstr = oidPjMstr;
	}

}