package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEaMstrId entity provides the base persistence definition of the
 * EaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEaMstrId implements java.io.Serializable {

	// Fields

	private String eaDomain;
	private String eaEarn;

	// Constructors

	/** default constructor */
	public AbstractEaMstrId() {
	}

	/** full constructor */
	public AbstractEaMstrId(String eaDomain, String eaEarn) {
		this.eaDomain = eaDomain;
		this.eaEarn = eaEarn;
	}

	// Property accessors

	public String getEaDomain() {
		return this.eaDomain;
	}

	public void setEaDomain(String eaDomain) {
		this.eaDomain = eaDomain;
	}

	public String getEaEarn() {
		return this.eaEarn;
	}

	public void setEaEarn(String eaEarn) {
		this.eaEarn = eaEarn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEaMstrId))
			return false;
		AbstractEaMstrId castOther = (AbstractEaMstrId) other;

		return ((this.getEaDomain() == castOther.getEaDomain()) || (this
				.getEaDomain() != null
				&& castOther.getEaDomain() != null && this.getEaDomain()
				.equals(castOther.getEaDomain())))
				&& ((this.getEaEarn() == castOther.getEaEarn()) || (this
						.getEaEarn() != null
						&& castOther.getEaEarn() != null && this.getEaEarn()
						.equals(castOther.getEaEarn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEaDomain() == null ? 0 : this.getEaDomain().hashCode());
		result = 37 * result
				+ (getEaEarn() == null ? 0 : this.getEaEarn().hashCode());
		return result;
	}

}