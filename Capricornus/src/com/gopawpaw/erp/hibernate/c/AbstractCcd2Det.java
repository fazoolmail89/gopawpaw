package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCcd2Det entity provides the base persistence definition of the
 * Ccd2Det entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCcd2Det implements java.io.Serializable {

	// Fields

	private Ccd2DetId id;
	private String ccd2SubBeg;
	private String ccd2SubEnd;
	private String ccd2User1;
	private String ccd2User2;
	private String ccd2Qadc01;
	private Double oidCcd2Det;

	// Constructors

	/** default constructor */
	public AbstractCcd2Det() {
	}

	/** minimal constructor */
	public AbstractCcd2Det(Ccd2DetId id, Double oidCcd2Det) {
		this.id = id;
		this.oidCcd2Det = oidCcd2Det;
	}

	/** full constructor */
	public AbstractCcd2Det(Ccd2DetId id, String ccd2SubBeg, String ccd2SubEnd,
			String ccd2User1, String ccd2User2, String ccd2Qadc01,
			Double oidCcd2Det) {
		this.id = id;
		this.ccd2SubBeg = ccd2SubBeg;
		this.ccd2SubEnd = ccd2SubEnd;
		this.ccd2User1 = ccd2User1;
		this.ccd2User2 = ccd2User2;
		this.ccd2Qadc01 = ccd2Qadc01;
		this.oidCcd2Det = oidCcd2Det;
	}

	// Property accessors

	public Ccd2DetId getId() {
		return this.id;
	}

	public void setId(Ccd2DetId id) {
		this.id = id;
	}

	public String getCcd2SubBeg() {
		return this.ccd2SubBeg;
	}

	public void setCcd2SubBeg(String ccd2SubBeg) {
		this.ccd2SubBeg = ccd2SubBeg;
	}

	public String getCcd2SubEnd() {
		return this.ccd2SubEnd;
	}

	public void setCcd2SubEnd(String ccd2SubEnd) {
		this.ccd2SubEnd = ccd2SubEnd;
	}

	public String getCcd2User1() {
		return this.ccd2User1;
	}

	public void setCcd2User1(String ccd2User1) {
		this.ccd2User1 = ccd2User1;
	}

	public String getCcd2User2() {
		return this.ccd2User2;
	}

	public void setCcd2User2(String ccd2User2) {
		this.ccd2User2 = ccd2User2;
	}

	public String getCcd2Qadc01() {
		return this.ccd2Qadc01;
	}

	public void setCcd2Qadc01(String ccd2Qadc01) {
		this.ccd2Qadc01 = ccd2Qadc01;
	}

	public Double getOidCcd2Det() {
		return this.oidCcd2Det;
	}

	public void setOidCcd2Det(Double oidCcd2Det) {
		this.oidCcd2Det = oidCcd2Det;
	}

}