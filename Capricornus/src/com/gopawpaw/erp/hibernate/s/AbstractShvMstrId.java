package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractShvMstrId entity provides the base persistence definition of the
 * ShvMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShvMstrId implements java.io.Serializable {

	// Fields

	private String shvDomain;
	private String shvShipvia;

	// Constructors

	/** default constructor */
	public AbstractShvMstrId() {
	}

	/** full constructor */
	public AbstractShvMstrId(String shvDomain, String shvShipvia) {
		this.shvDomain = shvDomain;
		this.shvShipvia = shvShipvia;
	}

	// Property accessors

	public String getShvDomain() {
		return this.shvDomain;
	}

	public void setShvDomain(String shvDomain) {
		this.shvDomain = shvDomain;
	}

	public String getShvShipvia() {
		return this.shvShipvia;
	}

	public void setShvShipvia(String shvShipvia) {
		this.shvShipvia = shvShipvia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractShvMstrId))
			return false;
		AbstractShvMstrId castOther = (AbstractShvMstrId) other;

		return ((this.getShvDomain() == castOther.getShvDomain()) || (this
				.getShvDomain() != null
				&& castOther.getShvDomain() != null && this.getShvDomain()
				.equals(castOther.getShvDomain())))
				&& ((this.getShvShipvia() == castOther.getShvShipvia()) || (this
						.getShvShipvia() != null
						&& castOther.getShvShipvia() != null && this
						.getShvShipvia().equals(castOther.getShvShipvia())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getShvDomain() == null ? 0 : this.getShvDomain().hashCode());
		result = 37
				* result
				+ (getShvShipvia() == null ? 0 : this.getShvShipvia()
						.hashCode());
		return result;
	}

}