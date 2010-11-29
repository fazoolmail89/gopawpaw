package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCtMstr entity provides the base persistence definition of the CtMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCtMstr implements java.io.Serializable {

	// Fields

	private CtMstrId id;
	private String ctDesc;
	private Double ctDiscPct;
	private Double ctDiscDays;
	private Double ctDueDays;
	private Date ctDueDate;
	private Boolean ctXfromInv;
	private Date ctDiscDate;
	private Boolean ctXdueInv;
	private Boolean ctDating;
	private String ctUser1;
	private String ctUser2;
	private String ctUserid;
	private Date ctModDate;
	private Integer ctDueInv;
	private Integer ctFromInv;
	private Double ctTermsInt;
	private Double ctLateInt;
	private Date ctBaseDate;
	private Integer ctBaseDays;
	private Integer ctMinDays;
	private Integer ctGraceDays;
	private String ctQadc01;
	private Boolean ctMtdDisc;
	private Boolean ctMtdDue;
	private Double oidCtMstr;

	// Constructors

	/** default constructor */
	public AbstractCtMstr() {
	}

	/** minimal constructor */
	public AbstractCtMstr(CtMstrId id, Boolean ctMtdDisc, Boolean ctMtdDue,
			Double oidCtMstr) {
		this.id = id;
		this.ctMtdDisc = ctMtdDisc;
		this.ctMtdDue = ctMtdDue;
		this.oidCtMstr = oidCtMstr;
	}

	/** full constructor */
	public AbstractCtMstr(CtMstrId id, String ctDesc, Double ctDiscPct,
			Double ctDiscDays, Double ctDueDays, Date ctDueDate,
			Boolean ctXfromInv, Date ctDiscDate, Boolean ctXdueInv,
			Boolean ctDating, String ctUser1, String ctUser2, String ctUserid,
			Date ctModDate, Integer ctDueInv, Integer ctFromInv,
			Double ctTermsInt, Double ctLateInt, Date ctBaseDate,
			Integer ctBaseDays, Integer ctMinDays, Integer ctGraceDays,
			String ctQadc01, Boolean ctMtdDisc, Boolean ctMtdDue,
			Double oidCtMstr) {
		this.id = id;
		this.ctDesc = ctDesc;
		this.ctDiscPct = ctDiscPct;
		this.ctDiscDays = ctDiscDays;
		this.ctDueDays = ctDueDays;
		this.ctDueDate = ctDueDate;
		this.ctXfromInv = ctXfromInv;
		this.ctDiscDate = ctDiscDate;
		this.ctXdueInv = ctXdueInv;
		this.ctDating = ctDating;
		this.ctUser1 = ctUser1;
		this.ctUser2 = ctUser2;
		this.ctUserid = ctUserid;
		this.ctModDate = ctModDate;
		this.ctDueInv = ctDueInv;
		this.ctFromInv = ctFromInv;
		this.ctTermsInt = ctTermsInt;
		this.ctLateInt = ctLateInt;
		this.ctBaseDate = ctBaseDate;
		this.ctBaseDays = ctBaseDays;
		this.ctMinDays = ctMinDays;
		this.ctGraceDays = ctGraceDays;
		this.ctQadc01 = ctQadc01;
		this.ctMtdDisc = ctMtdDisc;
		this.ctMtdDue = ctMtdDue;
		this.oidCtMstr = oidCtMstr;
	}

	// Property accessors

	public CtMstrId getId() {
		return this.id;
	}

	public void setId(CtMstrId id) {
		this.id = id;
	}

	public String getCtDesc() {
		return this.ctDesc;
	}

	public void setCtDesc(String ctDesc) {
		this.ctDesc = ctDesc;
	}

	public Double getCtDiscPct() {
		return this.ctDiscPct;
	}

	public void setCtDiscPct(Double ctDiscPct) {
		this.ctDiscPct = ctDiscPct;
	}

	public Double getCtDiscDays() {
		return this.ctDiscDays;
	}

	public void setCtDiscDays(Double ctDiscDays) {
		this.ctDiscDays = ctDiscDays;
	}

	public Double getCtDueDays() {
		return this.ctDueDays;
	}

	public void setCtDueDays(Double ctDueDays) {
		this.ctDueDays = ctDueDays;
	}

	public Date getCtDueDate() {
		return this.ctDueDate;
	}

	public void setCtDueDate(Date ctDueDate) {
		this.ctDueDate = ctDueDate;
	}

	public Boolean getCtXfromInv() {
		return this.ctXfromInv;
	}

	public void setCtXfromInv(Boolean ctXfromInv) {
		this.ctXfromInv = ctXfromInv;
	}

	public Date getCtDiscDate() {
		return this.ctDiscDate;
	}

	public void setCtDiscDate(Date ctDiscDate) {
		this.ctDiscDate = ctDiscDate;
	}

	public Boolean getCtXdueInv() {
		return this.ctXdueInv;
	}

	public void setCtXdueInv(Boolean ctXdueInv) {
		this.ctXdueInv = ctXdueInv;
	}

	public Boolean getCtDating() {
		return this.ctDating;
	}

	public void setCtDating(Boolean ctDating) {
		this.ctDating = ctDating;
	}

	public String getCtUser1() {
		return this.ctUser1;
	}

	public void setCtUser1(String ctUser1) {
		this.ctUser1 = ctUser1;
	}

	public String getCtUser2() {
		return this.ctUser2;
	}

	public void setCtUser2(String ctUser2) {
		this.ctUser2 = ctUser2;
	}

	public String getCtUserid() {
		return this.ctUserid;
	}

	public void setCtUserid(String ctUserid) {
		this.ctUserid = ctUserid;
	}

	public Date getCtModDate() {
		return this.ctModDate;
	}

	public void setCtModDate(Date ctModDate) {
		this.ctModDate = ctModDate;
	}

	public Integer getCtDueInv() {
		return this.ctDueInv;
	}

	public void setCtDueInv(Integer ctDueInv) {
		this.ctDueInv = ctDueInv;
	}

	public Integer getCtFromInv() {
		return this.ctFromInv;
	}

	public void setCtFromInv(Integer ctFromInv) {
		this.ctFromInv = ctFromInv;
	}

	public Double getCtTermsInt() {
		return this.ctTermsInt;
	}

	public void setCtTermsInt(Double ctTermsInt) {
		this.ctTermsInt = ctTermsInt;
	}

	public Double getCtLateInt() {
		return this.ctLateInt;
	}

	public void setCtLateInt(Double ctLateInt) {
		this.ctLateInt = ctLateInt;
	}

	public Date getCtBaseDate() {
		return this.ctBaseDate;
	}

	public void setCtBaseDate(Date ctBaseDate) {
		this.ctBaseDate = ctBaseDate;
	}

	public Integer getCtBaseDays() {
		return this.ctBaseDays;
	}

	public void setCtBaseDays(Integer ctBaseDays) {
		this.ctBaseDays = ctBaseDays;
	}

	public Integer getCtMinDays() {
		return this.ctMinDays;
	}

	public void setCtMinDays(Integer ctMinDays) {
		this.ctMinDays = ctMinDays;
	}

	public Integer getCtGraceDays() {
		return this.ctGraceDays;
	}

	public void setCtGraceDays(Integer ctGraceDays) {
		this.ctGraceDays = ctGraceDays;
	}

	public String getCtQadc01() {
		return this.ctQadc01;
	}

	public void setCtQadc01(String ctQadc01) {
		this.ctQadc01 = ctQadc01;
	}

	public Boolean getCtMtdDisc() {
		return this.ctMtdDisc;
	}

	public void setCtMtdDisc(Boolean ctMtdDisc) {
		this.ctMtdDisc = ctMtdDisc;
	}

	public Boolean getCtMtdDue() {
		return this.ctMtdDue;
	}

	public void setCtMtdDue(Boolean ctMtdDue) {
		this.ctMtdDue = ctMtdDue;
	}

	public Double getOidCtMstr() {
		return this.oidCtMstr;
	}

	public void setOidCtMstr(Double oidCtMstr) {
		this.oidCtMstr = oidCtMstr;
	}

}