package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAcxMstr entity provides the base persistence definition of the
 * AcxMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcxMstr implements java.io.Serializable {

	// Fields

	private AcxMstrId id;
	private Boolean acxQad01;
	private String acxToAcc;
	private String acxToCc;
	private Boolean acxXconsCc;
	private String acxUser1;
	private String acxUser2;
	private String acxToSub;
	private String acxToDomain;
	private Double oidAcxMstr;

	// Constructors

	/** default constructor */
	public AbstractAcxMstr() {
	}

	/** minimal constructor */
	public AbstractAcxMstr(AcxMstrId id, String acxToDomain, Double oidAcxMstr) {
		this.id = id;
		this.acxToDomain = acxToDomain;
		this.oidAcxMstr = oidAcxMstr;
	}

	/** full constructor */
	public AbstractAcxMstr(AcxMstrId id, Boolean acxQad01, String acxToAcc,
			String acxToCc, Boolean acxXconsCc, String acxUser1,
			String acxUser2, String acxToSub, String acxToDomain,
			Double oidAcxMstr) {
		this.id = id;
		this.acxQad01 = acxQad01;
		this.acxToAcc = acxToAcc;
		this.acxToCc = acxToCc;
		this.acxXconsCc = acxXconsCc;
		this.acxUser1 = acxUser1;
		this.acxUser2 = acxUser2;
		this.acxToSub = acxToSub;
		this.acxToDomain = acxToDomain;
		this.oidAcxMstr = oidAcxMstr;
	}

	// Property accessors

	public AcxMstrId getId() {
		return this.id;
	}

	public void setId(AcxMstrId id) {
		this.id = id;
	}

	public Boolean getAcxQad01() {
		return this.acxQad01;
	}

	public void setAcxQad01(Boolean acxQad01) {
		this.acxQad01 = acxQad01;
	}

	public String getAcxToAcc() {
		return this.acxToAcc;
	}

	public void setAcxToAcc(String acxToAcc) {
		this.acxToAcc = acxToAcc;
	}

	public String getAcxToCc() {
		return this.acxToCc;
	}

	public void setAcxToCc(String acxToCc) {
		this.acxToCc = acxToCc;
	}

	public Boolean getAcxXconsCc() {
		return this.acxXconsCc;
	}

	public void setAcxXconsCc(Boolean acxXconsCc) {
		this.acxXconsCc = acxXconsCc;
	}

	public String getAcxUser1() {
		return this.acxUser1;
	}

	public void setAcxUser1(String acxUser1) {
		this.acxUser1 = acxUser1;
	}

	public String getAcxUser2() {
		return this.acxUser2;
	}

	public void setAcxUser2(String acxUser2) {
		this.acxUser2 = acxUser2;
	}

	public String getAcxToSub() {
		return this.acxToSub;
	}

	public void setAcxToSub(String acxToSub) {
		this.acxToSub = acxToSub;
	}

	public String getAcxToDomain() {
		return this.acxToDomain;
	}

	public void setAcxToDomain(String acxToDomain) {
		this.acxToDomain = acxToDomain;
	}

	public Double getOidAcxMstr() {
		return this.oidAcxMstr;
	}

	public void setOidAcxMstr(Double oidAcxMstr) {
		this.oidAcxMstr = oidAcxMstr;
	}

}