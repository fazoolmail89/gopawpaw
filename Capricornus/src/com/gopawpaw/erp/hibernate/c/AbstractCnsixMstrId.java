package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCnsixMstrId entity provides the base persistence definition of the
 * CnsixMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCnsixMstrId implements java.io.Serializable {

	// Fields

	private String cnsixDomain;
	private Integer cnsixPkey;

	// Constructors

	/** default constructor */
	public AbstractCnsixMstrId() {
	}

	/** full constructor */
	public AbstractCnsixMstrId(String cnsixDomain, Integer cnsixPkey) {
		this.cnsixDomain = cnsixDomain;
		this.cnsixPkey = cnsixPkey;
	}

	// Property accessors

	public String getCnsixDomain() {
		return this.cnsixDomain;
	}

	public void setCnsixDomain(String cnsixDomain) {
		this.cnsixDomain = cnsixDomain;
	}

	public Integer getCnsixPkey() {
		return this.cnsixPkey;
	}

	public void setCnsixPkey(Integer cnsixPkey) {
		this.cnsixPkey = cnsixPkey;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCnsixMstrId))
			return false;
		AbstractCnsixMstrId castOther = (AbstractCnsixMstrId) other;

		return ((this.getCnsixDomain() == castOther.getCnsixDomain()) || (this
				.getCnsixDomain() != null
				&& castOther.getCnsixDomain() != null && this.getCnsixDomain()
				.equals(castOther.getCnsixDomain())))
				&& ((this.getCnsixPkey() == castOther.getCnsixPkey()) || (this
						.getCnsixPkey() != null
						&& castOther.getCnsixPkey() != null && this
						.getCnsixPkey().equals(castOther.getCnsixPkey())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCnsixDomain() == null ? 0 : this.getCnsixDomain()
						.hashCode());
		result = 37 * result
				+ (getCnsixPkey() == null ? 0 : this.getCnsixPkey().hashCode());
		return result;
	}

}