package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractShpHistId entity provides the base persistence definition of the
 * ShpHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShpHistId implements java.io.Serializable {

	// Fields

	private String shpDomain;
	private Integer shpTranId;

	// Constructors

	/** default constructor */
	public AbstractShpHistId() {
	}

	/** full constructor */
	public AbstractShpHistId(String shpDomain, Integer shpTranId) {
		this.shpDomain = shpDomain;
		this.shpTranId = shpTranId;
	}

	// Property accessors

	public String getShpDomain() {
		return this.shpDomain;
	}

	public void setShpDomain(String shpDomain) {
		this.shpDomain = shpDomain;
	}

	public Integer getShpTranId() {
		return this.shpTranId;
	}

	public void setShpTranId(Integer shpTranId) {
		this.shpTranId = shpTranId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractShpHistId))
			return false;
		AbstractShpHistId castOther = (AbstractShpHistId) other;

		return ((this.getShpDomain() == castOther.getShpDomain()) || (this
				.getShpDomain() != null
				&& castOther.getShpDomain() != null && this.getShpDomain()
				.equals(castOther.getShpDomain())))
				&& ((this.getShpTranId() == castOther.getShpTranId()) || (this
						.getShpTranId() != null
						&& castOther.getShpTranId() != null && this
						.getShpTranId().equals(castOther.getShpTranId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getShpDomain() == null ? 0 : this.getShpDomain().hashCode());
		result = 37 * result
				+ (getShpTranId() == null ? 0 : this.getShpTranId().hashCode());
		return result;
	}

}