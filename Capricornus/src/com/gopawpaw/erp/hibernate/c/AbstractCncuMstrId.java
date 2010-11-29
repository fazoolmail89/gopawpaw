package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCncuMstrId entity provides the base persistence definition of the
 * CncuMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCncuMstrId implements java.io.Serializable {

	// Fields

	private String cncuDomain;
	private Integer cncuPkey;

	// Constructors

	/** default constructor */
	public AbstractCncuMstrId() {
	}

	/** full constructor */
	public AbstractCncuMstrId(String cncuDomain, Integer cncuPkey) {
		this.cncuDomain = cncuDomain;
		this.cncuPkey = cncuPkey;
	}

	// Property accessors

	public String getCncuDomain() {
		return this.cncuDomain;
	}

	public void setCncuDomain(String cncuDomain) {
		this.cncuDomain = cncuDomain;
	}

	public Integer getCncuPkey() {
		return this.cncuPkey;
	}

	public void setCncuPkey(Integer cncuPkey) {
		this.cncuPkey = cncuPkey;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCncuMstrId))
			return false;
		AbstractCncuMstrId castOther = (AbstractCncuMstrId) other;

		return ((this.getCncuDomain() == castOther.getCncuDomain()) || (this
				.getCncuDomain() != null
				&& castOther.getCncuDomain() != null && this.getCncuDomain()
				.equals(castOther.getCncuDomain())))
				&& ((this.getCncuPkey() == castOther.getCncuPkey()) || (this
						.getCncuPkey() != null
						&& castOther.getCncuPkey() != null && this
						.getCncuPkey().equals(castOther.getCncuPkey())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCncuDomain() == null ? 0 : this.getCncuDomain()
						.hashCode());
		result = 37 * result
				+ (getCncuPkey() == null ? 0 : this.getCncuPkey().hashCode());
		return result;
	}

}