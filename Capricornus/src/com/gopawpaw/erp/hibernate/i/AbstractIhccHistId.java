package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIhccHistId entity provides the base persistence definition of the
 * IhccHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIhccHistId implements java.io.Serializable {

	// Fields

	private String ihccDomain;
	private String ihccInvNbr;
	private String ihccCcNbr;

	// Constructors

	/** default constructor */
	public AbstractIhccHistId() {
	}

	/** full constructor */
	public AbstractIhccHistId(String ihccDomain, String ihccInvNbr,
			String ihccCcNbr) {
		this.ihccDomain = ihccDomain;
		this.ihccInvNbr = ihccInvNbr;
		this.ihccCcNbr = ihccCcNbr;
	}

	// Property accessors

	public String getIhccDomain() {
		return this.ihccDomain;
	}

	public void setIhccDomain(String ihccDomain) {
		this.ihccDomain = ihccDomain;
	}

	public String getIhccInvNbr() {
		return this.ihccInvNbr;
	}

	public void setIhccInvNbr(String ihccInvNbr) {
		this.ihccInvNbr = ihccInvNbr;
	}

	public String getIhccCcNbr() {
		return this.ihccCcNbr;
	}

	public void setIhccCcNbr(String ihccCcNbr) {
		this.ihccCcNbr = ihccCcNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIhccHistId))
			return false;
		AbstractIhccHistId castOther = (AbstractIhccHistId) other;

		return ((this.getIhccDomain() == castOther.getIhccDomain()) || (this
				.getIhccDomain() != null
				&& castOther.getIhccDomain() != null && this.getIhccDomain()
				.equals(castOther.getIhccDomain())))
				&& ((this.getIhccInvNbr() == castOther.getIhccInvNbr()) || (this
						.getIhccInvNbr() != null
						&& castOther.getIhccInvNbr() != null && this
						.getIhccInvNbr().equals(castOther.getIhccInvNbr())))
				&& ((this.getIhccCcNbr() == castOther.getIhccCcNbr()) || (this
						.getIhccCcNbr() != null
						&& castOther.getIhccCcNbr() != null && this
						.getIhccCcNbr().equals(castOther.getIhccCcNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIhccDomain() == null ? 0 : this.getIhccDomain()
						.hashCode());
		result = 37
				* result
				+ (getIhccInvNbr() == null ? 0 : this.getIhccInvNbr()
						.hashCode());
		result = 37 * result
				+ (getIhccCcNbr() == null ? 0 : this.getIhccCcNbr().hashCode());
		return result;
	}

}