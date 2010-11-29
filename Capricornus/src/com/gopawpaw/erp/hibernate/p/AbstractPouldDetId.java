package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPouldDetId entity provides the base persistence definition of the
 * PouldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPouldDetId implements java.io.Serializable {

	// Fields

	private String pouldDomain;
	private Integer pouldPoulRefKey;
	private String pouldLoc;

	// Constructors

	/** default constructor */
	public AbstractPouldDetId() {
	}

	/** full constructor */
	public AbstractPouldDetId(String pouldDomain, Integer pouldPoulRefKey,
			String pouldLoc) {
		this.pouldDomain = pouldDomain;
		this.pouldPoulRefKey = pouldPoulRefKey;
		this.pouldLoc = pouldLoc;
	}

	// Property accessors

	public String getPouldDomain() {
		return this.pouldDomain;
	}

	public void setPouldDomain(String pouldDomain) {
		this.pouldDomain = pouldDomain;
	}

	public Integer getPouldPoulRefKey() {
		return this.pouldPoulRefKey;
	}

	public void setPouldPoulRefKey(Integer pouldPoulRefKey) {
		this.pouldPoulRefKey = pouldPoulRefKey;
	}

	public String getPouldLoc() {
		return this.pouldLoc;
	}

	public void setPouldLoc(String pouldLoc) {
		this.pouldLoc = pouldLoc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPouldDetId))
			return false;
		AbstractPouldDetId castOther = (AbstractPouldDetId) other;

		return ((this.getPouldDomain() == castOther.getPouldDomain()) || (this
				.getPouldDomain() != null
				&& castOther.getPouldDomain() != null && this.getPouldDomain()
				.equals(castOther.getPouldDomain())))
				&& ((this.getPouldPoulRefKey() == castOther
						.getPouldPoulRefKey()) || (this.getPouldPoulRefKey() != null
						&& castOther.getPouldPoulRefKey() != null && this
						.getPouldPoulRefKey().equals(
								castOther.getPouldPoulRefKey())))
				&& ((this.getPouldLoc() == castOther.getPouldLoc()) || (this
						.getPouldLoc() != null
						&& castOther.getPouldLoc() != null && this
						.getPouldLoc().equals(castOther.getPouldLoc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPouldDomain() == null ? 0 : this.getPouldDomain()
						.hashCode());
		result = 37
				* result
				+ (getPouldPoulRefKey() == null ? 0 : this.getPouldPoulRefKey()
						.hashCode());
		result = 37 * result
				+ (getPouldLoc() == null ? 0 : this.getPouldLoc().hashCode());
		return result;
	}

}