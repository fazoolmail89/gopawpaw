package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPtqaDetId entity provides the base persistence definition of the
 * PtqaDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtqaDetId implements java.io.Serializable {

	// Fields

	private String ptqaDomain;
	private String ptqaPart;
	private String ptqaElement;

	// Constructors

	/** default constructor */
	public AbstractPtqaDetId() {
	}

	/** minimal constructor */
	public AbstractPtqaDetId(String ptqaDomain) {
		this.ptqaDomain = ptqaDomain;
	}

	/** full constructor */
	public AbstractPtqaDetId(String ptqaDomain, String ptqaPart,
			String ptqaElement) {
		this.ptqaDomain = ptqaDomain;
		this.ptqaPart = ptqaPart;
		this.ptqaElement = ptqaElement;
	}

	// Property accessors

	public String getPtqaDomain() {
		return this.ptqaDomain;
	}

	public void setPtqaDomain(String ptqaDomain) {
		this.ptqaDomain = ptqaDomain;
	}

	public String getPtqaPart() {
		return this.ptqaPart;
	}

	public void setPtqaPart(String ptqaPart) {
		this.ptqaPart = ptqaPart;
	}

	public String getPtqaElement() {
		return this.ptqaElement;
	}

	public void setPtqaElement(String ptqaElement) {
		this.ptqaElement = ptqaElement;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPtqaDetId))
			return false;
		AbstractPtqaDetId castOther = (AbstractPtqaDetId) other;

		return ((this.getPtqaDomain() == castOther.getPtqaDomain()) || (this
				.getPtqaDomain() != null
				&& castOther.getPtqaDomain() != null && this.getPtqaDomain()
				.equals(castOther.getPtqaDomain())))
				&& ((this.getPtqaPart() == castOther.getPtqaPart()) || (this
						.getPtqaPart() != null
						&& castOther.getPtqaPart() != null && this
						.getPtqaPart().equals(castOther.getPtqaPart())))
				&& ((this.getPtqaElement() == castOther.getPtqaElement()) || (this
						.getPtqaElement() != null
						&& castOther.getPtqaElement() != null && this
						.getPtqaElement().equals(castOther.getPtqaElement())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPtqaDomain() == null ? 0 : this.getPtqaDomain()
						.hashCode());
		result = 37 * result
				+ (getPtqaPart() == null ? 0 : this.getPtqaPart().hashCode());
		result = 37
				* result
				+ (getPtqaElement() == null ? 0 : this.getPtqaElement()
						.hashCode());
		return result;
	}

}