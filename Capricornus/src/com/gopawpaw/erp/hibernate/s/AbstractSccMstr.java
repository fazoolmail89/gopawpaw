package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSccMstr entity provides the base persistence definition of the
 * SccMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSccMstr implements java.io.Serializable {

	// Fields

	private SccMstrId id;
	private Boolean sccActive;
	private Boolean sccUseCurrent;
	private Integer sccShipLt;
	private Integer sccSchedType;
	private Boolean sccIncludeSo;
	private Boolean sccIncludeSched;
	private Boolean sccIncludeRma;
	private Boolean sccIncludeMo;
	private Boolean sccIncludeDo;
	private String sccQadc01;
	private String sccQadc02;
	private String sccModUserid;
	private Date sccModDate;
	private String sccUser1;
	private String sccUser2;
	private Double oidSccMstr;

	// Constructors

	/** default constructor */
	public AbstractSccMstr() {
	}

	/** full constructor */
	public AbstractSccMstr(SccMstrId id, Boolean sccActive,
			Boolean sccUseCurrent, Integer sccShipLt, Integer sccSchedType,
			Boolean sccIncludeSo, Boolean sccIncludeSched,
			Boolean sccIncludeRma, Boolean sccIncludeMo, Boolean sccIncludeDo,
			String sccQadc01, String sccQadc02, String sccModUserid,
			Date sccModDate, String sccUser1, String sccUser2, Double oidSccMstr) {
		this.id = id;
		this.sccActive = sccActive;
		this.sccUseCurrent = sccUseCurrent;
		this.sccShipLt = sccShipLt;
		this.sccSchedType = sccSchedType;
		this.sccIncludeSo = sccIncludeSo;
		this.sccIncludeSched = sccIncludeSched;
		this.sccIncludeRma = sccIncludeRma;
		this.sccIncludeMo = sccIncludeMo;
		this.sccIncludeDo = sccIncludeDo;
		this.sccQadc01 = sccQadc01;
		this.sccQadc02 = sccQadc02;
		this.sccModUserid = sccModUserid;
		this.sccModDate = sccModDate;
		this.sccUser1 = sccUser1;
		this.sccUser2 = sccUser2;
		this.oidSccMstr = oidSccMstr;
	}

	// Property accessors

	public SccMstrId getId() {
		return this.id;
	}

	public void setId(SccMstrId id) {
		this.id = id;
	}

	public Boolean getSccActive() {
		return this.sccActive;
	}

	public void setSccActive(Boolean sccActive) {
		this.sccActive = sccActive;
	}

	public Boolean getSccUseCurrent() {
		return this.sccUseCurrent;
	}

	public void setSccUseCurrent(Boolean sccUseCurrent) {
		this.sccUseCurrent = sccUseCurrent;
	}

	public Integer getSccShipLt() {
		return this.sccShipLt;
	}

	public void setSccShipLt(Integer sccShipLt) {
		this.sccShipLt = sccShipLt;
	}

	public Integer getSccSchedType() {
		return this.sccSchedType;
	}

	public void setSccSchedType(Integer sccSchedType) {
		this.sccSchedType = sccSchedType;
	}

	public Boolean getSccIncludeSo() {
		return this.sccIncludeSo;
	}

	public void setSccIncludeSo(Boolean sccIncludeSo) {
		this.sccIncludeSo = sccIncludeSo;
	}

	public Boolean getSccIncludeSched() {
		return this.sccIncludeSched;
	}

	public void setSccIncludeSched(Boolean sccIncludeSched) {
		this.sccIncludeSched = sccIncludeSched;
	}

	public Boolean getSccIncludeRma() {
		return this.sccIncludeRma;
	}

	public void setSccIncludeRma(Boolean sccIncludeRma) {
		this.sccIncludeRma = sccIncludeRma;
	}

	public Boolean getSccIncludeMo() {
		return this.sccIncludeMo;
	}

	public void setSccIncludeMo(Boolean sccIncludeMo) {
		this.sccIncludeMo = sccIncludeMo;
	}

	public Boolean getSccIncludeDo() {
		return this.sccIncludeDo;
	}

	public void setSccIncludeDo(Boolean sccIncludeDo) {
		this.sccIncludeDo = sccIncludeDo;
	}

	public String getSccQadc01() {
		return this.sccQadc01;
	}

	public void setSccQadc01(String sccQadc01) {
		this.sccQadc01 = sccQadc01;
	}

	public String getSccQadc02() {
		return this.sccQadc02;
	}

	public void setSccQadc02(String sccQadc02) {
		this.sccQadc02 = sccQadc02;
	}

	public String getSccModUserid() {
		return this.sccModUserid;
	}

	public void setSccModUserid(String sccModUserid) {
		this.sccModUserid = sccModUserid;
	}

	public Date getSccModDate() {
		return this.sccModDate;
	}

	public void setSccModDate(Date sccModDate) {
		this.sccModDate = sccModDate;
	}

	public String getSccUser1() {
		return this.sccUser1;
	}

	public void setSccUser1(String sccUser1) {
		this.sccUser1 = sccUser1;
	}

	public String getSccUser2() {
		return this.sccUser2;
	}

	public void setSccUser2(String sccUser2) {
		this.sccUser2 = sccUser2;
	}

	public Double getOidSccMstr() {
		return this.oidSccMstr;
	}

	public void setOidSccMstr(Double oidSccMstr) {
		this.oidSccMstr = oidSccMstr;
	}

}