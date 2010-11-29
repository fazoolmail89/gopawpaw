package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMaMstr entity provides the base persistence definition of the MaMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMaMstr implements java.io.Serializable {

	// Fields

	private MaMstrId id;
	private String maMrAcct1;
	private String maMrCc1;
	private String maMrAcct2;
	private String maMrCc2;
	private String maUser1;
	private String maUser2;
	private String maQadc01;
	private String maMrSub1;
	private String maMrSub2;
	private Double oidMaMstr;

	// Constructors

	/** default constructor */
	public AbstractMaMstr() {
	}

	/** minimal constructor */
	public AbstractMaMstr(MaMstrId id, Double oidMaMstr) {
		this.id = id;
		this.oidMaMstr = oidMaMstr;
	}

	/** full constructor */
	public AbstractMaMstr(MaMstrId id, String maMrAcct1, String maMrCc1,
			String maMrAcct2, String maMrCc2, String maUser1, String maUser2,
			String maQadc01, String maMrSub1, String maMrSub2, Double oidMaMstr) {
		this.id = id;
		this.maMrAcct1 = maMrAcct1;
		this.maMrCc1 = maMrCc1;
		this.maMrAcct2 = maMrAcct2;
		this.maMrCc2 = maMrCc2;
		this.maUser1 = maUser1;
		this.maUser2 = maUser2;
		this.maQadc01 = maQadc01;
		this.maMrSub1 = maMrSub1;
		this.maMrSub2 = maMrSub2;
		this.oidMaMstr = oidMaMstr;
	}

	// Property accessors

	public MaMstrId getId() {
		return this.id;
	}

	public void setId(MaMstrId id) {
		this.id = id;
	}

	public String getMaMrAcct1() {
		return this.maMrAcct1;
	}

	public void setMaMrAcct1(String maMrAcct1) {
		this.maMrAcct1 = maMrAcct1;
	}

	public String getMaMrCc1() {
		return this.maMrCc1;
	}

	public void setMaMrCc1(String maMrCc1) {
		this.maMrCc1 = maMrCc1;
	}

	public String getMaMrAcct2() {
		return this.maMrAcct2;
	}

	public void setMaMrAcct2(String maMrAcct2) {
		this.maMrAcct2 = maMrAcct2;
	}

	public String getMaMrCc2() {
		return this.maMrCc2;
	}

	public void setMaMrCc2(String maMrCc2) {
		this.maMrCc2 = maMrCc2;
	}

	public String getMaUser1() {
		return this.maUser1;
	}

	public void setMaUser1(String maUser1) {
		this.maUser1 = maUser1;
	}

	public String getMaUser2() {
		return this.maUser2;
	}

	public void setMaUser2(String maUser2) {
		this.maUser2 = maUser2;
	}

	public String getMaQadc01() {
		return this.maQadc01;
	}

	public void setMaQadc01(String maQadc01) {
		this.maQadc01 = maQadc01;
	}

	public String getMaMrSub1() {
		return this.maMrSub1;
	}

	public void setMaMrSub1(String maMrSub1) {
		this.maMrSub1 = maMrSub1;
	}

	public String getMaMrSub2() {
		return this.maMrSub2;
	}

	public void setMaMrSub2(String maMrSub2) {
		this.maMrSub2 = maMrSub2;
	}

	public Double getOidMaMstr() {
		return this.oidMaMstr;
	}

	public void setOidMaMstr(Double oidMaMstr) {
		this.oidMaMstr = oidMaMstr;
	}

}