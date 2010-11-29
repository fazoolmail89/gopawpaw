package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAdMstrId entity provides the base persistence definition of the
 * AdMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAdMstrId implements java.io.Serializable {

	// Fields

	private String adDomain;
	private String adAddr;

	// Constructors

	/** default constructor */
	public AbstractAdMstrId() {
	}

	/** full constructor */
	public AbstractAdMstrId(String adDomain, String adAddr) {
		this.adDomain = adDomain;
		this.adAddr = adAddr;
	}

	// Property accessors

	public String getAdDomain() {
		return this.adDomain;
	}

	public void setAdDomain(String adDomain) {
		this.adDomain = adDomain;
	}

	public String getAdAddr() {
		return this.adAddr;
	}

	public void setAdAddr(String adAddr) {
		this.adAddr = adAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAdMstrId))
			return false;
		AbstractAdMstrId castOther = (AbstractAdMstrId) other;

		return ((this.getAdDomain() == castOther.getAdDomain()) || (this
				.getAdDomain() != null
				&& castOther.getAdDomain() != null && this.getAdDomain()
				.equals(castOther.getAdDomain())))
				&& ((this.getAdAddr() == castOther.getAdAddr()) || (this
						.getAdAddr() != null
						&& castOther.getAdAddr() != null && this.getAdAddr()
						.equals(castOther.getAdAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAdDomain() == null ? 0 : this.getAdDomain().hashCode());
		result = 37 * result
				+ (getAdAddr() == null ? 0 : this.getAdAddr().hashCode());
		return result;
	}

}