package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractInMstrId entity provides the base persistence definition of the
 * InMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractInMstrId implements java.io.Serializable {

	// Fields

	private String inDomain;
	private String inPart;
	private String inSite;

	// Constructors

	/** default constructor */
	public AbstractInMstrId() {
	}

	/** minimal constructor */
	public AbstractInMstrId(String inDomain, String inPart) {
		this.inDomain = inDomain;
		this.inPart = inPart;
	}

	/** full constructor */
	public AbstractInMstrId(String inDomain, String inPart, String inSite) {
		this.inDomain = inDomain;
		this.inPart = inPart;
		this.inSite = inSite;
	}

	// Property accessors

	public String getInDomain() {
		return this.inDomain;
	}

	public void setInDomain(String inDomain) {
		this.inDomain = inDomain;
	}

	public String getInPart() {
		return this.inPart;
	}

	public void setInPart(String inPart) {
		this.inPart = inPart;
	}

	public String getInSite() {
		return this.inSite;
	}

	public void setInSite(String inSite) {
		this.inSite = inSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractInMstrId))
			return false;
		AbstractInMstrId castOther = (AbstractInMstrId) other;

		return ((this.getInDomain() == castOther.getInDomain()) || (this
				.getInDomain() != null
				&& castOther.getInDomain() != null && this.getInDomain()
				.equals(castOther.getInDomain())))
				&& ((this.getInPart() == castOther.getInPart()) || (this
						.getInPart() != null
						&& castOther.getInPart() != null && this.getInPart()
						.equals(castOther.getInPart())))
				&& ((this.getInSite() == castOther.getInSite()) || (this
						.getInSite() != null
						&& castOther.getInSite() != null && this.getInSite()
						.equals(castOther.getInSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getInDomain() == null ? 0 : this.getInDomain().hashCode());
		result = 37 * result
				+ (getInPart() == null ? 0 : this.getInPart().hashCode());
		result = 37 * result
				+ (getInSite() == null ? 0 : this.getInSite().hashCode());
		return result;
	}

}