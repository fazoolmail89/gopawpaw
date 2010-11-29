package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractImMstrId entity provides the base persistence definition of the
 * ImMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractImMstrId implements java.io.Serializable {

	// Fields

	private String imDomain;
	private String imInvMov;

	// Constructors

	/** default constructor */
	public AbstractImMstrId() {
	}

	/** full constructor */
	public AbstractImMstrId(String imDomain, String imInvMov) {
		this.imDomain = imDomain;
		this.imInvMov = imInvMov;
	}

	// Property accessors

	public String getImDomain() {
		return this.imDomain;
	}

	public void setImDomain(String imDomain) {
		this.imDomain = imDomain;
	}

	public String getImInvMov() {
		return this.imInvMov;
	}

	public void setImInvMov(String imInvMov) {
		this.imInvMov = imInvMov;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractImMstrId))
			return false;
		AbstractImMstrId castOther = (AbstractImMstrId) other;

		return ((this.getImDomain() == castOther.getImDomain()) || (this
				.getImDomain() != null
				&& castOther.getImDomain() != null && this.getImDomain()
				.equals(castOther.getImDomain())))
				&& ((this.getImInvMov() == castOther.getImInvMov()) || (this
						.getImInvMov() != null
						&& castOther.getImInvMov() != null && this
						.getImInvMov().equals(castOther.getImInvMov())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getImDomain() == null ? 0 : this.getImDomain().hashCode());
		result = 37 * result
				+ (getImInvMov() == null ? 0 : this.getImInvMov().hashCode());
		return result;
	}

}