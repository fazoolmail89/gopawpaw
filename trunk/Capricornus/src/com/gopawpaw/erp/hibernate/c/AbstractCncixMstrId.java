package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCncixMstrId entity provides the base persistence definition of the
 * CncixMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCncixMstrId implements java.io.Serializable {

	// Fields

	private String cncixDomain;
	private Integer cncixPkey;

	// Constructors

	/** default constructor */
	public AbstractCncixMstrId() {
	}

	/** full constructor */
	public AbstractCncixMstrId(String cncixDomain, Integer cncixPkey) {
		this.cncixDomain = cncixDomain;
		this.cncixPkey = cncixPkey;
	}

	// Property accessors

	public String getCncixDomain() {
		return this.cncixDomain;
	}

	public void setCncixDomain(String cncixDomain) {
		this.cncixDomain = cncixDomain;
	}

	public Integer getCncixPkey() {
		return this.cncixPkey;
	}

	public void setCncixPkey(Integer cncixPkey) {
		this.cncixPkey = cncixPkey;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCncixMstrId))
			return false;
		AbstractCncixMstrId castOther = (AbstractCncixMstrId) other;

		return ((this.getCncixDomain() == castOther.getCncixDomain()) || (this
				.getCncixDomain() != null
				&& castOther.getCncixDomain() != null && this.getCncixDomain()
				.equals(castOther.getCncixDomain())))
				&& ((this.getCncixPkey() == castOther.getCncixPkey()) || (this
						.getCncixPkey() != null
						&& castOther.getCncixPkey() != null && this
						.getCncixPkey().equals(castOther.getCncixPkey())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCncixDomain() == null ? 0 : this.getCncixDomain()
						.hashCode());
		result = 37 * result
				+ (getCncixPkey() == null ? 0 : this.getCncixPkey().hashCode());
		return result;
	}

}