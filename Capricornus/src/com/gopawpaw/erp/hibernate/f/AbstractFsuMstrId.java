package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFsuMstrId entity provides the base persistence definition of the
 * FsuMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFsuMstrId implements java.io.Serializable {

	// Fields

	private String fsuDomain;
	private String fsuUserid;

	// Constructors

	/** default constructor */
	public AbstractFsuMstrId() {
	}

	/** full constructor */
	public AbstractFsuMstrId(String fsuDomain, String fsuUserid) {
		this.fsuDomain = fsuDomain;
		this.fsuUserid = fsuUserid;
	}

	// Property accessors

	public String getFsuDomain() {
		return this.fsuDomain;
	}

	public void setFsuDomain(String fsuDomain) {
		this.fsuDomain = fsuDomain;
	}

	public String getFsuUserid() {
		return this.fsuUserid;
	}

	public void setFsuUserid(String fsuUserid) {
		this.fsuUserid = fsuUserid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFsuMstrId))
			return false;
		AbstractFsuMstrId castOther = (AbstractFsuMstrId) other;

		return ((this.getFsuDomain() == castOther.getFsuDomain()) || (this
				.getFsuDomain() != null
				&& castOther.getFsuDomain() != null && this.getFsuDomain()
				.equals(castOther.getFsuDomain())))
				&& ((this.getFsuUserid() == castOther.getFsuUserid()) || (this
						.getFsuUserid() != null
						&& castOther.getFsuUserid() != null && this
						.getFsuUserid().equals(castOther.getFsuUserid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFsuDomain() == null ? 0 : this.getFsuDomain().hashCode());
		result = 37 * result
				+ (getFsuUserid() == null ? 0 : this.getFsuUserid().hashCode());
		return result;
	}

}