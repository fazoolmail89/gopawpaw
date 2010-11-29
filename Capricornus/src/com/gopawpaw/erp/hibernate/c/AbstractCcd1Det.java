package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCcd1Det entity provides the base persistence definition of the
 * Ccd1Det entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCcd1Det implements java.io.Serializable {

	// Fields

	private Ccd1DetId id;
	private String ccd1AccBeg;
	private String ccd1AccEnd;
	private String ccd1User1;
	private String ccd1User2;
	private String ccd1Qadc01;
	private Double oidCcd1Det;

	// Constructors

	/** default constructor */
	public AbstractCcd1Det() {
	}

	/** minimal constructor */
	public AbstractCcd1Det(Ccd1DetId id, Double oidCcd1Det) {
		this.id = id;
		this.oidCcd1Det = oidCcd1Det;
	}

	/** full constructor */
	public AbstractCcd1Det(Ccd1DetId id, String ccd1AccBeg, String ccd1AccEnd,
			String ccd1User1, String ccd1User2, String ccd1Qadc01,
			Double oidCcd1Det) {
		this.id = id;
		this.ccd1AccBeg = ccd1AccBeg;
		this.ccd1AccEnd = ccd1AccEnd;
		this.ccd1User1 = ccd1User1;
		this.ccd1User2 = ccd1User2;
		this.ccd1Qadc01 = ccd1Qadc01;
		this.oidCcd1Det = oidCcd1Det;
	}

	// Property accessors

	public Ccd1DetId getId() {
		return this.id;
	}

	public void setId(Ccd1DetId id) {
		this.id = id;
	}

	public String getCcd1AccBeg() {
		return this.ccd1AccBeg;
	}

	public void setCcd1AccBeg(String ccd1AccBeg) {
		this.ccd1AccBeg = ccd1AccBeg;
	}

	public String getCcd1AccEnd() {
		return this.ccd1AccEnd;
	}

	public void setCcd1AccEnd(String ccd1AccEnd) {
		this.ccd1AccEnd = ccd1AccEnd;
	}

	public String getCcd1User1() {
		return this.ccd1User1;
	}

	public void setCcd1User1(String ccd1User1) {
		this.ccd1User1 = ccd1User1;
	}

	public String getCcd1User2() {
		return this.ccd1User2;
	}

	public void setCcd1User2(String ccd1User2) {
		this.ccd1User2 = ccd1User2;
	}

	public String getCcd1Qadc01() {
		return this.ccd1Qadc01;
	}

	public void setCcd1Qadc01(String ccd1Qadc01) {
		this.ccd1Qadc01 = ccd1Qadc01;
	}

	public Double getOidCcd1Det() {
		return this.oidCcd1Det;
	}

	public void setOidCcd1Det(Double oidCcd1Det) {
		this.oidCcd1Det = oidCcd1Det;
	}

}