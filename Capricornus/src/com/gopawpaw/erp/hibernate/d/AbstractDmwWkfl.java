package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDmwWkfl entity provides the base persistence definition of the
 * DmwWkfl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDmwWkfl implements java.io.Serializable {

	// Fields

	private DmwWkflId id;
	private Double dmwAmt;
	private Double dmwDisc;
	private Double dmwAppl;
	private Date dmwDate;
	private Date dmwDueDate;
	private Date dmwDte01;
	private String dmwChar01;
	private String dmwChar02;
	private String dmwChar03;
	private String dmwChar04;
	private String dmwChar05;
	private Boolean dmwLog01;
	private String dmwType;
	private String dmwEntity;
	private String dmwCurr;
	private String dmwBank;
	private String dmwUser1;
	private String dmwUser2;
	private Double oidDmwWkfl;

	// Constructors

	/** default constructor */
	public AbstractDmwWkfl() {
	}

	/** minimal constructor */
	public AbstractDmwWkfl(DmwWkflId id, Double dmwAmt, Double dmwDisc,
			Double dmwAppl, Date dmwDate, Date dmwDueDate, Date dmwDte01,
			String dmwChar01, String dmwChar02, String dmwChar03,
			String dmwChar04, String dmwChar05, Boolean dmwLog01,
			String dmwType, String dmwEntity, String dmwCurr, String dmwBank,
			Double oidDmwWkfl) {
		this.id = id;
		this.dmwAmt = dmwAmt;
		this.dmwDisc = dmwDisc;
		this.dmwAppl = dmwAppl;
		this.dmwDate = dmwDate;
		this.dmwDueDate = dmwDueDate;
		this.dmwDte01 = dmwDte01;
		this.dmwChar01 = dmwChar01;
		this.dmwChar02 = dmwChar02;
		this.dmwChar03 = dmwChar03;
		this.dmwChar04 = dmwChar04;
		this.dmwChar05 = dmwChar05;
		this.dmwLog01 = dmwLog01;
		this.dmwType = dmwType;
		this.dmwEntity = dmwEntity;
		this.dmwCurr = dmwCurr;
		this.dmwBank = dmwBank;
		this.oidDmwWkfl = oidDmwWkfl;
	}

	/** full constructor */
	public AbstractDmwWkfl(DmwWkflId id, Double dmwAmt, Double dmwDisc,
			Double dmwAppl, Date dmwDate, Date dmwDueDate, Date dmwDte01,
			String dmwChar01, String dmwChar02, String dmwChar03,
			String dmwChar04, String dmwChar05, Boolean dmwLog01,
			String dmwType, String dmwEntity, String dmwCurr, String dmwBank,
			String dmwUser1, String dmwUser2, Double oidDmwWkfl) {
		this.id = id;
		this.dmwAmt = dmwAmt;
		this.dmwDisc = dmwDisc;
		this.dmwAppl = dmwAppl;
		this.dmwDate = dmwDate;
		this.dmwDueDate = dmwDueDate;
		this.dmwDte01 = dmwDte01;
		this.dmwChar01 = dmwChar01;
		this.dmwChar02 = dmwChar02;
		this.dmwChar03 = dmwChar03;
		this.dmwChar04 = dmwChar04;
		this.dmwChar05 = dmwChar05;
		this.dmwLog01 = dmwLog01;
		this.dmwType = dmwType;
		this.dmwEntity = dmwEntity;
		this.dmwCurr = dmwCurr;
		this.dmwBank = dmwBank;
		this.dmwUser1 = dmwUser1;
		this.dmwUser2 = dmwUser2;
		this.oidDmwWkfl = oidDmwWkfl;
	}

	// Property accessors

	public DmwWkflId getId() {
		return this.id;
	}

	public void setId(DmwWkflId id) {
		this.id = id;
	}

	public Double getDmwAmt() {
		return this.dmwAmt;
	}

	public void setDmwAmt(Double dmwAmt) {
		this.dmwAmt = dmwAmt;
	}

	public Double getDmwDisc() {
		return this.dmwDisc;
	}

	public void setDmwDisc(Double dmwDisc) {
		this.dmwDisc = dmwDisc;
	}

	public Double getDmwAppl() {
		return this.dmwAppl;
	}

	public void setDmwAppl(Double dmwAppl) {
		this.dmwAppl = dmwAppl;
	}

	public Date getDmwDate() {
		return this.dmwDate;
	}

	public void setDmwDate(Date dmwDate) {
		this.dmwDate = dmwDate;
	}

	public Date getDmwDueDate() {
		return this.dmwDueDate;
	}

	public void setDmwDueDate(Date dmwDueDate) {
		this.dmwDueDate = dmwDueDate;
	}

	public Date getDmwDte01() {
		return this.dmwDte01;
	}

	public void setDmwDte01(Date dmwDte01) {
		this.dmwDte01 = dmwDte01;
	}

	public String getDmwChar01() {
		return this.dmwChar01;
	}

	public void setDmwChar01(String dmwChar01) {
		this.dmwChar01 = dmwChar01;
	}

	public String getDmwChar02() {
		return this.dmwChar02;
	}

	public void setDmwChar02(String dmwChar02) {
		this.dmwChar02 = dmwChar02;
	}

	public String getDmwChar03() {
		return this.dmwChar03;
	}

	public void setDmwChar03(String dmwChar03) {
		this.dmwChar03 = dmwChar03;
	}

	public String getDmwChar04() {
		return this.dmwChar04;
	}

	public void setDmwChar04(String dmwChar04) {
		this.dmwChar04 = dmwChar04;
	}

	public String getDmwChar05() {
		return this.dmwChar05;
	}

	public void setDmwChar05(String dmwChar05) {
		this.dmwChar05 = dmwChar05;
	}

	public Boolean getDmwLog01() {
		return this.dmwLog01;
	}

	public void setDmwLog01(Boolean dmwLog01) {
		this.dmwLog01 = dmwLog01;
	}

	public String getDmwType() {
		return this.dmwType;
	}

	public void setDmwType(String dmwType) {
		this.dmwType = dmwType;
	}

	public String getDmwEntity() {
		return this.dmwEntity;
	}

	public void setDmwEntity(String dmwEntity) {
		this.dmwEntity = dmwEntity;
	}

	public String getDmwCurr() {
		return this.dmwCurr;
	}

	public void setDmwCurr(String dmwCurr) {
		this.dmwCurr = dmwCurr;
	}

	public String getDmwBank() {
		return this.dmwBank;
	}

	public void setDmwBank(String dmwBank) {
		this.dmwBank = dmwBank;
	}

	public String getDmwUser1() {
		return this.dmwUser1;
	}

	public void setDmwUser1(String dmwUser1) {
		this.dmwUser1 = dmwUser1;
	}

	public String getDmwUser2() {
		return this.dmwUser2;
	}

	public void setDmwUser2(String dmwUser2) {
		this.dmwUser2 = dmwUser2;
	}

	public Double getOidDmwWkfl() {
		return this.oidDmwWkfl;
	}

	public void setOidDmwWkfl(Double oidDmwWkfl) {
		this.oidDmwWkfl = oidDmwWkfl;
	}

}