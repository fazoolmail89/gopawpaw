package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractApMstrId entity provides the base persistence definition of the
 * ApMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractApMstrId implements java.io.Serializable {

	// Fields

	private String apDomain;
	private String apType;
	private String apRef;

	// Constructors

	/** default constructor */
	public AbstractApMstrId() {
	}

	/** minimal constructor */
	public AbstractApMstrId(String apDomain) {
		this.apDomain = apDomain;
	}

	/** full constructor */
	public AbstractApMstrId(String apDomain, String apType, String apRef) {
		this.apDomain = apDomain;
		this.apType = apType;
		this.apRef = apRef;
	}

	// Property accessors

	public String getApDomain() {
		return this.apDomain;
	}

	public void setApDomain(String apDomain) {
		this.apDomain = apDomain;
	}

	public String getApType() {
		return this.apType;
	}

	public void setApType(String apType) {
		this.apType = apType;
	}

	public String getApRef() {
		return this.apRef;
	}

	public void setApRef(String apRef) {
		this.apRef = apRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractApMstrId))
			return false;
		AbstractApMstrId castOther = (AbstractApMstrId) other;

		return ((this.getApDomain() == castOther.getApDomain()) || (this
				.getApDomain() != null
				&& castOther.getApDomain() != null && this.getApDomain()
				.equals(castOther.getApDomain())))
				&& ((this.getApType() == castOther.getApType()) || (this
						.getApType() != null
						&& castOther.getApType() != null && this.getApType()
						.equals(castOther.getApType())))
				&& ((this.getApRef() == castOther.getApRef()) || (this
						.getApRef() != null
						&& castOther.getApRef() != null && this.getApRef()
						.equals(castOther.getApRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getApDomain() == null ? 0 : this.getApDomain().hashCode());
		result = 37 * result
				+ (getApType() == null ? 0 : this.getApType().hashCode());
		result = 37 * result
				+ (getApRef() == null ? 0 : this.getApRef().hashCode());
		return result;
	}

}