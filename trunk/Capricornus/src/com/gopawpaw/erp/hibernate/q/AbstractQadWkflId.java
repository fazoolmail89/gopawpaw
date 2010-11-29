package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQadWkflId entity provides the base persistence definition of the
 * QadWkflId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQadWkflId implements java.io.Serializable {

	// Fields

	private String qadDomain;
	private String qadKey1;
	private String qadKey2;

	// Constructors

	/** default constructor */
	public AbstractQadWkflId() {
	}

	/** minimal constructor */
	public AbstractQadWkflId(String qadDomain) {
		this.qadDomain = qadDomain;
	}

	/** full constructor */
	public AbstractQadWkflId(String qadDomain, String qadKey1, String qadKey2) {
		this.qadDomain = qadDomain;
		this.qadKey1 = qadKey1;
		this.qadKey2 = qadKey2;
	}

	// Property accessors

	public String getQadDomain() {
		return this.qadDomain;
	}

	public void setQadDomain(String qadDomain) {
		this.qadDomain = qadDomain;
	}

	public String getQadKey1() {
		return this.qadKey1;
	}

	public void setQadKey1(String qadKey1) {
		this.qadKey1 = qadKey1;
	}

	public String getQadKey2() {
		return this.qadKey2;
	}

	public void setQadKey2(String qadKey2) {
		this.qadKey2 = qadKey2;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQadWkflId))
			return false;
		AbstractQadWkflId castOther = (AbstractQadWkflId) other;

		return ((this.getQadDomain() == castOther.getQadDomain()) || (this
				.getQadDomain() != null
				&& castOther.getQadDomain() != null && this.getQadDomain()
				.equals(castOther.getQadDomain())))
				&& ((this.getQadKey1() == castOther.getQadKey1()) || (this
						.getQadKey1() != null
						&& castOther.getQadKey1() != null && this.getQadKey1()
						.equals(castOther.getQadKey1())))
				&& ((this.getQadKey2() == castOther.getQadKey2()) || (this
						.getQadKey2() != null
						&& castOther.getQadKey2() != null && this.getQadKey2()
						.equals(castOther.getQadKey2())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQadDomain() == null ? 0 : this.getQadDomain().hashCode());
		result = 37 * result
				+ (getQadKey1() == null ? 0 : this.getQadKey1().hashCode());
		result = 37 * result
				+ (getQadKey2() == null ? 0 : this.getQadKey2().hashCode());
		return result;
	}

}