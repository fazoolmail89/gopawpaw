package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractScMstrId entity provides the base persistence definition of the
 * ScMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScMstrId implements java.io.Serializable {

	// Fields

	private String scDomain;
	private String scSim;
	private String scElement;

	// Constructors

	/** default constructor */
	public AbstractScMstrId() {
	}

	/** minimal constructor */
	public AbstractScMstrId(String scDomain) {
		this.scDomain = scDomain;
	}

	/** full constructor */
	public AbstractScMstrId(String scDomain, String scSim, String scElement) {
		this.scDomain = scDomain;
		this.scSim = scSim;
		this.scElement = scElement;
	}

	// Property accessors

	public String getScDomain() {
		return this.scDomain;
	}

	public void setScDomain(String scDomain) {
		this.scDomain = scDomain;
	}

	public String getScSim() {
		return this.scSim;
	}

	public void setScSim(String scSim) {
		this.scSim = scSim;
	}

	public String getScElement() {
		return this.scElement;
	}

	public void setScElement(String scElement) {
		this.scElement = scElement;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractScMstrId))
			return false;
		AbstractScMstrId castOther = (AbstractScMstrId) other;

		return ((this.getScDomain() == castOther.getScDomain()) || (this
				.getScDomain() != null
				&& castOther.getScDomain() != null && this.getScDomain()
				.equals(castOther.getScDomain())))
				&& ((this.getScSim() == castOther.getScSim()) || (this
						.getScSim() != null
						&& castOther.getScSim() != null && this.getScSim()
						.equals(castOther.getScSim())))
				&& ((this.getScElement() == castOther.getScElement()) || (this
						.getScElement() != null
						&& castOther.getScElement() != null && this
						.getScElement().equals(castOther.getScElement())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getScDomain() == null ? 0 : this.getScDomain().hashCode());
		result = 37 * result
				+ (getScSim() == null ? 0 : this.getScSim().hashCode());
		result = 37 * result
				+ (getScElement() == null ? 0 : this.getScElement().hashCode());
		return result;
	}

}