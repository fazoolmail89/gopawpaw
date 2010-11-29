package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDjrMstrId entity provides the base persistence definition of the
 * DjrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDjrMstrId implements java.io.Serializable {

	// Fields

	private String djrDomain;
	private String djrCode;

	// Constructors

	/** default constructor */
	public AbstractDjrMstrId() {
	}

	/** full constructor */
	public AbstractDjrMstrId(String djrDomain, String djrCode) {
		this.djrDomain = djrDomain;
		this.djrCode = djrCode;
	}

	// Property accessors

	public String getDjrDomain() {
		return this.djrDomain;
	}

	public void setDjrDomain(String djrDomain) {
		this.djrDomain = djrDomain;
	}

	public String getDjrCode() {
		return this.djrCode;
	}

	public void setDjrCode(String djrCode) {
		this.djrCode = djrCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDjrMstrId))
			return false;
		AbstractDjrMstrId castOther = (AbstractDjrMstrId) other;

		return ((this.getDjrDomain() == castOther.getDjrDomain()) || (this
				.getDjrDomain() != null
				&& castOther.getDjrDomain() != null && this.getDjrDomain()
				.equals(castOther.getDjrDomain())))
				&& ((this.getDjrCode() == castOther.getDjrCode()) || (this
						.getDjrCode() != null
						&& castOther.getDjrCode() != null && this.getDjrCode()
						.equals(castOther.getDjrCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDjrDomain() == null ? 0 : this.getDjrDomain().hashCode());
		result = 37 * result
				+ (getDjrCode() == null ? 0 : this.getDjrCode().hashCode());
		return result;
	}

}