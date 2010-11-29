package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFalocMstr entity provides the base persistence definition of the
 * FalocMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFalocMstr implements java.io.Serializable {

	// Fields

	private FalocMstrId id;
	private String falocDesc;
	private String falocCc;
	private String falocSub;
	private String falocEntity;
	private String falocModUserid;
	private Date falocModDate;
	private String falocUser1;
	private String falocUser2;
	private String falocChr01;
	private Double falocDec01;
	private Boolean falocLog01;
	private Date falocDte01;
	private Integer falocInt01;
	private String falocQadc01;
	private Double falocQadd01;
	private Integer falocQadi01;
	private Date falocQadt01;
	private Boolean falocQadl01;
	private String falocQadc02;
	private Double oidFalocMstr;

	// Constructors

	/** default constructor */
	public AbstractFalocMstr() {
	}

	/** minimal constructor */
	public AbstractFalocMstr(FalocMstrId id, String falocDesc, String falocCc,
			String falocSub, String falocEntity, String falocModUserid,
			Date falocModDate, String falocUser1, String falocUser2,
			String falocChr01, Double falocDec01, Boolean falocLog01,
			Integer falocInt01, String falocQadc01, Double falocQadd01,
			Integer falocQadi01, Boolean falocQadl01, String falocQadc02,
			Double oidFalocMstr) {
		this.id = id;
		this.falocDesc = falocDesc;
		this.falocCc = falocCc;
		this.falocSub = falocSub;
		this.falocEntity = falocEntity;
		this.falocModUserid = falocModUserid;
		this.falocModDate = falocModDate;
		this.falocUser1 = falocUser1;
		this.falocUser2 = falocUser2;
		this.falocChr01 = falocChr01;
		this.falocDec01 = falocDec01;
		this.falocLog01 = falocLog01;
		this.falocInt01 = falocInt01;
		this.falocQadc01 = falocQadc01;
		this.falocQadd01 = falocQadd01;
		this.falocQadi01 = falocQadi01;
		this.falocQadl01 = falocQadl01;
		this.falocQadc02 = falocQadc02;
		this.oidFalocMstr = oidFalocMstr;
	}

	/** full constructor */
	public AbstractFalocMstr(FalocMstrId id, String falocDesc, String falocCc,
			String falocSub, String falocEntity, String falocModUserid,
			Date falocModDate, String falocUser1, String falocUser2,
			String falocChr01, Double falocDec01, Boolean falocLog01,
			Date falocDte01, Integer falocInt01, String falocQadc01,
			Double falocQadd01, Integer falocQadi01, Date falocQadt01,
			Boolean falocQadl01, String falocQadc02, Double oidFalocMstr) {
		this.id = id;
		this.falocDesc = falocDesc;
		this.falocCc = falocCc;
		this.falocSub = falocSub;
		this.falocEntity = falocEntity;
		this.falocModUserid = falocModUserid;
		this.falocModDate = falocModDate;
		this.falocUser1 = falocUser1;
		this.falocUser2 = falocUser2;
		this.falocChr01 = falocChr01;
		this.falocDec01 = falocDec01;
		this.falocLog01 = falocLog01;
		this.falocDte01 = falocDte01;
		this.falocInt01 = falocInt01;
		this.falocQadc01 = falocQadc01;
		this.falocQadd01 = falocQadd01;
		this.falocQadi01 = falocQadi01;
		this.falocQadt01 = falocQadt01;
		this.falocQadl01 = falocQadl01;
		this.falocQadc02 = falocQadc02;
		this.oidFalocMstr = oidFalocMstr;
	}

	// Property accessors

	public FalocMstrId getId() {
		return this.id;
	}

	public void setId(FalocMstrId id) {
		this.id = id;
	}

	public String getFalocDesc() {
		return this.falocDesc;
	}

	public void setFalocDesc(String falocDesc) {
		this.falocDesc = falocDesc;
	}

	public String getFalocCc() {
		return this.falocCc;
	}

	public void setFalocCc(String falocCc) {
		this.falocCc = falocCc;
	}

	public String getFalocSub() {
		return this.falocSub;
	}

	public void setFalocSub(String falocSub) {
		this.falocSub = falocSub;
	}

	public String getFalocEntity() {
		return this.falocEntity;
	}

	public void setFalocEntity(String falocEntity) {
		this.falocEntity = falocEntity;
	}

	public String getFalocModUserid() {
		return this.falocModUserid;
	}

	public void setFalocModUserid(String falocModUserid) {
		this.falocModUserid = falocModUserid;
	}

	public Date getFalocModDate() {
		return this.falocModDate;
	}

	public void setFalocModDate(Date falocModDate) {
		this.falocModDate = falocModDate;
	}

	public String getFalocUser1() {
		return this.falocUser1;
	}

	public void setFalocUser1(String falocUser1) {
		this.falocUser1 = falocUser1;
	}

	public String getFalocUser2() {
		return this.falocUser2;
	}

	public void setFalocUser2(String falocUser2) {
		this.falocUser2 = falocUser2;
	}

	public String getFalocChr01() {
		return this.falocChr01;
	}

	public void setFalocChr01(String falocChr01) {
		this.falocChr01 = falocChr01;
	}

	public Double getFalocDec01() {
		return this.falocDec01;
	}

	public void setFalocDec01(Double falocDec01) {
		this.falocDec01 = falocDec01;
	}

	public Boolean getFalocLog01() {
		return this.falocLog01;
	}

	public void setFalocLog01(Boolean falocLog01) {
		this.falocLog01 = falocLog01;
	}

	public Date getFalocDte01() {
		return this.falocDte01;
	}

	public void setFalocDte01(Date falocDte01) {
		this.falocDte01 = falocDte01;
	}

	public Integer getFalocInt01() {
		return this.falocInt01;
	}

	public void setFalocInt01(Integer falocInt01) {
		this.falocInt01 = falocInt01;
	}

	public String getFalocQadc01() {
		return this.falocQadc01;
	}

	public void setFalocQadc01(String falocQadc01) {
		this.falocQadc01 = falocQadc01;
	}

	public Double getFalocQadd01() {
		return this.falocQadd01;
	}

	public void setFalocQadd01(Double falocQadd01) {
		this.falocQadd01 = falocQadd01;
	}

	public Integer getFalocQadi01() {
		return this.falocQadi01;
	}

	public void setFalocQadi01(Integer falocQadi01) {
		this.falocQadi01 = falocQadi01;
	}

	public Date getFalocQadt01() {
		return this.falocQadt01;
	}

	public void setFalocQadt01(Date falocQadt01) {
		this.falocQadt01 = falocQadt01;
	}

	public Boolean getFalocQadl01() {
		return this.falocQadl01;
	}

	public void setFalocQadl01(Boolean falocQadl01) {
		this.falocQadl01 = falocQadl01;
	}

	public String getFalocQadc02() {
		return this.falocQadc02;
	}

	public void setFalocQadc02(String falocQadc02) {
		this.falocQadc02 = falocQadc02;
	}

	public Double getOidFalocMstr() {
		return this.oidFalocMstr;
	}

	public void setOidFalocMstr(Double oidFalocMstr) {
		this.oidFalocMstr = oidFalocMstr;
	}

}