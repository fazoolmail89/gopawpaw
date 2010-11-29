package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMphHistId entity provides the base persistence definition of the
 * MphHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMphHistId implements java.io.Serializable {

	// Fields

	private String mphDomain;
	private String mphLot;
	private String mphPart;
	private String mphRouting;
	private Integer mphOp;
	private String mphTest;

	// Constructors

	/** default constructor */
	public AbstractMphHistId() {
	}

	/** minimal constructor */
	public AbstractMphHistId(String mphDomain, String mphPart,
			String mphRouting, Integer mphOp, String mphTest) {
		this.mphDomain = mphDomain;
		this.mphPart = mphPart;
		this.mphRouting = mphRouting;
		this.mphOp = mphOp;
		this.mphTest = mphTest;
	}

	/** full constructor */
	public AbstractMphHistId(String mphDomain, String mphLot, String mphPart,
			String mphRouting, Integer mphOp, String mphTest) {
		this.mphDomain = mphDomain;
		this.mphLot = mphLot;
		this.mphPart = mphPart;
		this.mphRouting = mphRouting;
		this.mphOp = mphOp;
		this.mphTest = mphTest;
	}

	// Property accessors

	public String getMphDomain() {
		return this.mphDomain;
	}

	public void setMphDomain(String mphDomain) {
		this.mphDomain = mphDomain;
	}

	public String getMphLot() {
		return this.mphLot;
	}

	public void setMphLot(String mphLot) {
		this.mphLot = mphLot;
	}

	public String getMphPart() {
		return this.mphPart;
	}

	public void setMphPart(String mphPart) {
		this.mphPart = mphPart;
	}

	public String getMphRouting() {
		return this.mphRouting;
	}

	public void setMphRouting(String mphRouting) {
		this.mphRouting = mphRouting;
	}

	public Integer getMphOp() {
		return this.mphOp;
	}

	public void setMphOp(Integer mphOp) {
		this.mphOp = mphOp;
	}

	public String getMphTest() {
		return this.mphTest;
	}

	public void setMphTest(String mphTest) {
		this.mphTest = mphTest;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMphHistId))
			return false;
		AbstractMphHistId castOther = (AbstractMphHistId) other;

		return ((this.getMphDomain() == castOther.getMphDomain()) || (this
				.getMphDomain() != null
				&& castOther.getMphDomain() != null && this.getMphDomain()
				.equals(castOther.getMphDomain())))
				&& ((this.getMphLot() == castOther.getMphLot()) || (this
						.getMphLot() != null
						&& castOther.getMphLot() != null && this.getMphLot()
						.equals(castOther.getMphLot())))
				&& ((this.getMphPart() == castOther.getMphPart()) || (this
						.getMphPart() != null
						&& castOther.getMphPart() != null && this.getMphPart()
						.equals(castOther.getMphPart())))
				&& ((this.getMphRouting() == castOther.getMphRouting()) || (this
						.getMphRouting() != null
						&& castOther.getMphRouting() != null && this
						.getMphRouting().equals(castOther.getMphRouting())))
				&& ((this.getMphOp() == castOther.getMphOp()) || (this
						.getMphOp() != null
						&& castOther.getMphOp() != null && this.getMphOp()
						.equals(castOther.getMphOp())))
				&& ((this.getMphTest() == castOther.getMphTest()) || (this
						.getMphTest() != null
						&& castOther.getMphTest() != null && this.getMphTest()
						.equals(castOther.getMphTest())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMphDomain() == null ? 0 : this.getMphDomain().hashCode());
		result = 37 * result
				+ (getMphLot() == null ? 0 : this.getMphLot().hashCode());
		result = 37 * result
				+ (getMphPart() == null ? 0 : this.getMphPart().hashCode());
		result = 37
				* result
				+ (getMphRouting() == null ? 0 : this.getMphRouting()
						.hashCode());
		result = 37 * result
				+ (getMphOp() == null ? 0 : this.getMphOp().hashCode());
		result = 37 * result
				+ (getMphTest() == null ? 0 : this.getMphTest().hashCode());
		return result;
	}

}