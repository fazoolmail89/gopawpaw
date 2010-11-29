package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEscCtrl entity provides the base persistence definition of the
 * EscCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEscCtrl implements java.io.Serializable {

	// Fields

	private EscCtrlId id;
	private String escEsPrefix;
	private Integer escNbr;
	private String escUser1;
	private String escUser2;
	private String escModUserid;
	private Date escModDate;
	private String escChr01;
	private String escChr02;
	private Date escDte01;
	private Boolean escLog01;
	private Integer escInt01;
	private String escQadc01;
	private String escQadc02;
	private Date escQadt01;
	private Boolean escQadl01;
	private Integer escQadi01;
	private String escRrcPre;
	private Integer escRrcNbr;
	private Double oidEscCtrl;

	// Constructors

	/** default constructor */
	public AbstractEscCtrl() {
	}

	/** minimal constructor */
	public AbstractEscCtrl(EscCtrlId id, Double oidEscCtrl) {
		this.id = id;
		this.oidEscCtrl = oidEscCtrl;
	}

	/** full constructor */
	public AbstractEscCtrl(EscCtrlId id, String escEsPrefix, Integer escNbr,
			String escUser1, String escUser2, String escModUserid,
			Date escModDate, String escChr01, String escChr02, Date escDte01,
			Boolean escLog01, Integer escInt01, String escQadc01,
			String escQadc02, Date escQadt01, Boolean escQadl01,
			Integer escQadi01, String escRrcPre, Integer escRrcNbr,
			Double oidEscCtrl) {
		this.id = id;
		this.escEsPrefix = escEsPrefix;
		this.escNbr = escNbr;
		this.escUser1 = escUser1;
		this.escUser2 = escUser2;
		this.escModUserid = escModUserid;
		this.escModDate = escModDate;
		this.escChr01 = escChr01;
		this.escChr02 = escChr02;
		this.escDte01 = escDte01;
		this.escLog01 = escLog01;
		this.escInt01 = escInt01;
		this.escQadc01 = escQadc01;
		this.escQadc02 = escQadc02;
		this.escQadt01 = escQadt01;
		this.escQadl01 = escQadl01;
		this.escQadi01 = escQadi01;
		this.escRrcPre = escRrcPre;
		this.escRrcNbr = escRrcNbr;
		this.oidEscCtrl = oidEscCtrl;
	}

	// Property accessors

	public EscCtrlId getId() {
		return this.id;
	}

	public void setId(EscCtrlId id) {
		this.id = id;
	}

	public String getEscEsPrefix() {
		return this.escEsPrefix;
	}

	public void setEscEsPrefix(String escEsPrefix) {
		this.escEsPrefix = escEsPrefix;
	}

	public Integer getEscNbr() {
		return this.escNbr;
	}

	public void setEscNbr(Integer escNbr) {
		this.escNbr = escNbr;
	}

	public String getEscUser1() {
		return this.escUser1;
	}

	public void setEscUser1(String escUser1) {
		this.escUser1 = escUser1;
	}

	public String getEscUser2() {
		return this.escUser2;
	}

	public void setEscUser2(String escUser2) {
		this.escUser2 = escUser2;
	}

	public String getEscModUserid() {
		return this.escModUserid;
	}

	public void setEscModUserid(String escModUserid) {
		this.escModUserid = escModUserid;
	}

	public Date getEscModDate() {
		return this.escModDate;
	}

	public void setEscModDate(Date escModDate) {
		this.escModDate = escModDate;
	}

	public String getEscChr01() {
		return this.escChr01;
	}

	public void setEscChr01(String escChr01) {
		this.escChr01 = escChr01;
	}

	public String getEscChr02() {
		return this.escChr02;
	}

	public void setEscChr02(String escChr02) {
		this.escChr02 = escChr02;
	}

	public Date getEscDte01() {
		return this.escDte01;
	}

	public void setEscDte01(Date escDte01) {
		this.escDte01 = escDte01;
	}

	public Boolean getEscLog01() {
		return this.escLog01;
	}

	public void setEscLog01(Boolean escLog01) {
		this.escLog01 = escLog01;
	}

	public Integer getEscInt01() {
		return this.escInt01;
	}

	public void setEscInt01(Integer escInt01) {
		this.escInt01 = escInt01;
	}

	public String getEscQadc01() {
		return this.escQadc01;
	}

	public void setEscQadc01(String escQadc01) {
		this.escQadc01 = escQadc01;
	}

	public String getEscQadc02() {
		return this.escQadc02;
	}

	public void setEscQadc02(String escQadc02) {
		this.escQadc02 = escQadc02;
	}

	public Date getEscQadt01() {
		return this.escQadt01;
	}

	public void setEscQadt01(Date escQadt01) {
		this.escQadt01 = escQadt01;
	}

	public Boolean getEscQadl01() {
		return this.escQadl01;
	}

	public void setEscQadl01(Boolean escQadl01) {
		this.escQadl01 = escQadl01;
	}

	public Integer getEscQadi01() {
		return this.escQadi01;
	}

	public void setEscQadi01(Integer escQadi01) {
		this.escQadi01 = escQadi01;
	}

	public String getEscRrcPre() {
		return this.escRrcPre;
	}

	public void setEscRrcPre(String escRrcPre) {
		this.escRrcPre = escRrcPre;
	}

	public Integer getEscRrcNbr() {
		return this.escRrcNbr;
	}

	public void setEscRrcNbr(Integer escRrcNbr) {
		this.escRrcNbr = escRrcNbr;
	}

	public Double getOidEscCtrl() {
		return this.oidEscCtrl;
	}

	public void setOidEscCtrl(Double oidEscCtrl) {
		this.oidEscCtrl = oidEscCtrl;
	}

}