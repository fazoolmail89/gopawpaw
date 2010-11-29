package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPexMstr entity provides the base persistence definition of the
 * PexMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPexMstr implements java.io.Serializable {

	// Fields

	private PexMstrId id;
	private String pexDesc;
	private Integer pexHwm;
	private String pexUser1;
	private String pexUser2;
	private String pexQadc01;
	private Integer pexQadi01;
	private Double pexQadd01;
	private Boolean pexQadl01;
	private Date pexQadt01;
	private String pexModUserid;
	private Date pexModDate;
	private Integer pexAudDays;
	private Date pexAudDdate;
	private Date pexAudDate;
	private String pexAudUser;
	private String pexAudPswd;
	private Integer pexAudNbr;
	private Double oidPexMstr;

	// Constructors

	/** default constructor */
	public AbstractPexMstr() {
	}

	/** minimal constructor */
	public AbstractPexMstr(PexMstrId id, String pexModUserid,
			Integer pexAudDays, String pexAudUser, String pexAudPswd,
			Integer pexAudNbr, Double oidPexMstr) {
		this.id = id;
		this.pexModUserid = pexModUserid;
		this.pexAudDays = pexAudDays;
		this.pexAudUser = pexAudUser;
		this.pexAudPswd = pexAudPswd;
		this.pexAudNbr = pexAudNbr;
		this.oidPexMstr = oidPexMstr;
	}

	/** full constructor */
	public AbstractPexMstr(PexMstrId id, String pexDesc, Integer pexHwm,
			String pexUser1, String pexUser2, String pexQadc01,
			Integer pexQadi01, Double pexQadd01, Boolean pexQadl01,
			Date pexQadt01, String pexModUserid, Date pexModDate,
			Integer pexAudDays, Date pexAudDdate, Date pexAudDate,
			String pexAudUser, String pexAudPswd, Integer pexAudNbr,
			Double oidPexMstr) {
		this.id = id;
		this.pexDesc = pexDesc;
		this.pexHwm = pexHwm;
		this.pexUser1 = pexUser1;
		this.pexUser2 = pexUser2;
		this.pexQadc01 = pexQadc01;
		this.pexQadi01 = pexQadi01;
		this.pexQadd01 = pexQadd01;
		this.pexQadl01 = pexQadl01;
		this.pexQadt01 = pexQadt01;
		this.pexModUserid = pexModUserid;
		this.pexModDate = pexModDate;
		this.pexAudDays = pexAudDays;
		this.pexAudDdate = pexAudDdate;
		this.pexAudDate = pexAudDate;
		this.pexAudUser = pexAudUser;
		this.pexAudPswd = pexAudPswd;
		this.pexAudNbr = pexAudNbr;
		this.oidPexMstr = oidPexMstr;
	}

	// Property accessors

	public PexMstrId getId() {
		return this.id;
	}

	public void setId(PexMstrId id) {
		this.id = id;
	}

	public String getPexDesc() {
		return this.pexDesc;
	}

	public void setPexDesc(String pexDesc) {
		this.pexDesc = pexDesc;
	}

	public Integer getPexHwm() {
		return this.pexHwm;
	}

	public void setPexHwm(Integer pexHwm) {
		this.pexHwm = pexHwm;
	}

	public String getPexUser1() {
		return this.pexUser1;
	}

	public void setPexUser1(String pexUser1) {
		this.pexUser1 = pexUser1;
	}

	public String getPexUser2() {
		return this.pexUser2;
	}

	public void setPexUser2(String pexUser2) {
		this.pexUser2 = pexUser2;
	}

	public String getPexQadc01() {
		return this.pexQadc01;
	}

	public void setPexQadc01(String pexQadc01) {
		this.pexQadc01 = pexQadc01;
	}

	public Integer getPexQadi01() {
		return this.pexQadi01;
	}

	public void setPexQadi01(Integer pexQadi01) {
		this.pexQadi01 = pexQadi01;
	}

	public Double getPexQadd01() {
		return this.pexQadd01;
	}

	public void setPexQadd01(Double pexQadd01) {
		this.pexQadd01 = pexQadd01;
	}

	public Boolean getPexQadl01() {
		return this.pexQadl01;
	}

	public void setPexQadl01(Boolean pexQadl01) {
		this.pexQadl01 = pexQadl01;
	}

	public Date getPexQadt01() {
		return this.pexQadt01;
	}

	public void setPexQadt01(Date pexQadt01) {
		this.pexQadt01 = pexQadt01;
	}

	public String getPexModUserid() {
		return this.pexModUserid;
	}

	public void setPexModUserid(String pexModUserid) {
		this.pexModUserid = pexModUserid;
	}

	public Date getPexModDate() {
		return this.pexModDate;
	}

	public void setPexModDate(Date pexModDate) {
		this.pexModDate = pexModDate;
	}

	public Integer getPexAudDays() {
		return this.pexAudDays;
	}

	public void setPexAudDays(Integer pexAudDays) {
		this.pexAudDays = pexAudDays;
	}

	public Date getPexAudDdate() {
		return this.pexAudDdate;
	}

	public void setPexAudDdate(Date pexAudDdate) {
		this.pexAudDdate = pexAudDdate;
	}

	public Date getPexAudDate() {
		return this.pexAudDate;
	}

	public void setPexAudDate(Date pexAudDate) {
		this.pexAudDate = pexAudDate;
	}

	public String getPexAudUser() {
		return this.pexAudUser;
	}

	public void setPexAudUser(String pexAudUser) {
		this.pexAudUser = pexAudUser;
	}

	public String getPexAudPswd() {
		return this.pexAudPswd;
	}

	public void setPexAudPswd(String pexAudPswd) {
		this.pexAudPswd = pexAudPswd;
	}

	public Integer getPexAudNbr() {
		return this.pexAudNbr;
	}

	public void setPexAudNbr(Integer pexAudNbr) {
		this.pexAudNbr = pexAudNbr;
	}

	public Double getOidPexMstr() {
		return this.oidPexMstr;
	}

	public void setOidPexMstr(Double oidPexMstr) {
		this.oidPexMstr = oidPexMstr;
	}

}