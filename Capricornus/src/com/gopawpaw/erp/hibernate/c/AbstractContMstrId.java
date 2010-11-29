package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractContMstrId entity provides the base persistence definition of the
 * ContMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractContMstrId implements java.io.Serializable {

	// Fields

	private String contDomain;
	private String contType;

	// Constructors

	/** default constructor */
	public AbstractContMstrId() {
	}

	/** full constructor */
	public AbstractContMstrId(String contDomain, String contType) {
		this.contDomain = contDomain;
		this.contType = contType;
	}

	// Property accessors

	public String getContDomain() {
		return this.contDomain;
	}

	public void setContDomain(String contDomain) {
		this.contDomain = contDomain;
	}

	public String getContType() {
		return this.contType;
	}

	public void setContType(String contType) {
		this.contType = contType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractContMstrId))
			return false;
		AbstractContMstrId castOther = (AbstractContMstrId) other;

		return ((this.getContDomain() == castOther.getContDomain()) || (this
				.getContDomain() != null
				&& castOther.getContDomain() != null && this.getContDomain()
				.equals(castOther.getContDomain())))
				&& ((this.getContType() == castOther.getContType()) || (this
						.getContType() != null
						&& castOther.getContType() != null && this
						.getContType().equals(castOther.getContType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getContDomain() == null ? 0 : this.getContDomain()
						.hashCode());
		result = 37 * result
				+ (getContType() == null ? 0 : this.getContType().hashCode());
		return result;
	}

}