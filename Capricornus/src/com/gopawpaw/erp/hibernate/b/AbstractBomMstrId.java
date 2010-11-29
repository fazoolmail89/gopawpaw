package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBomMstrId entity provides the base persistence definition of the
 * BomMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBomMstrId implements java.io.Serializable {

	// Fields

	private String bomDomain;
	private String bomParent;

	// Constructors

	/** default constructor */
	public AbstractBomMstrId() {
	}

	/** full constructor */
	public AbstractBomMstrId(String bomDomain, String bomParent) {
		this.bomDomain = bomDomain;
		this.bomParent = bomParent;
	}

	// Property accessors

	public String getBomDomain() {
		return this.bomDomain;
	}

	public void setBomDomain(String bomDomain) {
		this.bomDomain = bomDomain;
	}

	public String getBomParent() {
		return this.bomParent;
	}

	public void setBomParent(String bomParent) {
		this.bomParent = bomParent;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBomMstrId))
			return false;
		AbstractBomMstrId castOther = (AbstractBomMstrId) other;

		return ((this.getBomDomain() == castOther.getBomDomain()) || (this
				.getBomDomain() != null
				&& castOther.getBomDomain() != null && this.getBomDomain()
				.equals(castOther.getBomDomain())))
				&& ((this.getBomParent() == castOther.getBomParent()) || (this
						.getBomParent() != null
						&& castOther.getBomParent() != null && this
						.getBomParent().equals(castOther.getBomParent())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBomDomain() == null ? 0 : this.getBomDomain().hashCode());
		result = 37 * result
				+ (getBomParent() == null ? 0 : this.getBomParent().hashCode());
		return result;
	}

}