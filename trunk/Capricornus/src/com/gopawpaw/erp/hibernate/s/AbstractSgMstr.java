package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSgMstr entity provides the base persistence definition of the SgMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSgMstr implements java.io.Serializable {

	// Fields

	private SgMstrId id;
	private String sgDesc;
	private String sgInvMov;
	private Boolean sgAutoTr;
	private String sgMasterNrId;
	private String sgUser1;
	private String sgUser2;
	private String sgQadc01;
	private Double oidSgMstr;

	// Constructors

	/** default constructor */
	public AbstractSgMstr() {
	}

	/** minimal constructor */
	public AbstractSgMstr(SgMstrId id, String sgDesc, String sgInvMov,
			Boolean sgAutoTr, String sgMasterNrId, Double oidSgMstr) {
		this.id = id;
		this.sgDesc = sgDesc;
		this.sgInvMov = sgInvMov;
		this.sgAutoTr = sgAutoTr;
		this.sgMasterNrId = sgMasterNrId;
		this.oidSgMstr = oidSgMstr;
	}

	/** full constructor */
	public AbstractSgMstr(SgMstrId id, String sgDesc, String sgInvMov,
			Boolean sgAutoTr, String sgMasterNrId, String sgUser1,
			String sgUser2, String sgQadc01, Double oidSgMstr) {
		this.id = id;
		this.sgDesc = sgDesc;
		this.sgInvMov = sgInvMov;
		this.sgAutoTr = sgAutoTr;
		this.sgMasterNrId = sgMasterNrId;
		this.sgUser1 = sgUser1;
		this.sgUser2 = sgUser2;
		this.sgQadc01 = sgQadc01;
		this.oidSgMstr = oidSgMstr;
	}

	// Property accessors

	public SgMstrId getId() {
		return this.id;
	}

	public void setId(SgMstrId id) {
		this.id = id;
	}

	public String getSgDesc() {
		return this.sgDesc;
	}

	public void setSgDesc(String sgDesc) {
		this.sgDesc = sgDesc;
	}

	public String getSgInvMov() {
		return this.sgInvMov;
	}

	public void setSgInvMov(String sgInvMov) {
		this.sgInvMov = sgInvMov;
	}

	public Boolean getSgAutoTr() {
		return this.sgAutoTr;
	}

	public void setSgAutoTr(Boolean sgAutoTr) {
		this.sgAutoTr = sgAutoTr;
	}

	public String getSgMasterNrId() {
		return this.sgMasterNrId;
	}

	public void setSgMasterNrId(String sgMasterNrId) {
		this.sgMasterNrId = sgMasterNrId;
	}

	public String getSgUser1() {
		return this.sgUser1;
	}

	public void setSgUser1(String sgUser1) {
		this.sgUser1 = sgUser1;
	}

	public String getSgUser2() {
		return this.sgUser2;
	}

	public void setSgUser2(String sgUser2) {
		this.sgUser2 = sgUser2;
	}

	public String getSgQadc01() {
		return this.sgQadc01;
	}

	public void setSgQadc01(String sgQadc01) {
		this.sgQadc01 = sgQadc01;
	}

	public Double getOidSgMstr() {
		return this.oidSgMstr;
	}

	public void setOidSgMstr(Double oidSgMstr) {
		this.oidSgMstr = oidSgMstr;
	}

}