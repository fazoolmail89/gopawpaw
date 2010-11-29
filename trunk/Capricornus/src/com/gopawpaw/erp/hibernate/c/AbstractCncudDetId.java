package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCncudDetId entity provides the base persistence definition of the
 * CncudDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCncudDetId implements java.io.Serializable {

	// Fields

	private String cncudDomain;
	private Integer cncudCncuPkey;
	private Integer cncudCncixPkey;

	// Constructors

	/** default constructor */
	public AbstractCncudDetId() {
	}

	/** full constructor */
	public AbstractCncudDetId(String cncudDomain, Integer cncudCncuPkey,
			Integer cncudCncixPkey) {
		this.cncudDomain = cncudDomain;
		this.cncudCncuPkey = cncudCncuPkey;
		this.cncudCncixPkey = cncudCncixPkey;
	}

	// Property accessors

	public String getCncudDomain() {
		return this.cncudDomain;
	}

	public void setCncudDomain(String cncudDomain) {
		this.cncudDomain = cncudDomain;
	}

	public Integer getCncudCncuPkey() {
		return this.cncudCncuPkey;
	}

	public void setCncudCncuPkey(Integer cncudCncuPkey) {
		this.cncudCncuPkey = cncudCncuPkey;
	}

	public Integer getCncudCncixPkey() {
		return this.cncudCncixPkey;
	}

	public void setCncudCncixPkey(Integer cncudCncixPkey) {
		this.cncudCncixPkey = cncudCncixPkey;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCncudDetId))
			return false;
		AbstractCncudDetId castOther = (AbstractCncudDetId) other;

		return ((this.getCncudDomain() == castOther.getCncudDomain()) || (this
				.getCncudDomain() != null
				&& castOther.getCncudDomain() != null && this.getCncudDomain()
				.equals(castOther.getCncudDomain())))
				&& ((this.getCncudCncuPkey() == castOther.getCncudCncuPkey()) || (this
						.getCncudCncuPkey() != null
						&& castOther.getCncudCncuPkey() != null && this
						.getCncudCncuPkey()
						.equals(castOther.getCncudCncuPkey())))
				&& ((this.getCncudCncixPkey() == castOther.getCncudCncixPkey()) || (this
						.getCncudCncixPkey() != null
						&& castOther.getCncudCncixPkey() != null && this
						.getCncudCncixPkey().equals(
								castOther.getCncudCncixPkey())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCncudDomain() == null ? 0 : this.getCncudDomain()
						.hashCode());
		result = 37
				* result
				+ (getCncudCncuPkey() == null ? 0 : this.getCncudCncuPkey()
						.hashCode());
		result = 37
				* result
				+ (getCncudCncixPkey() == null ? 0 : this.getCncudCncixPkey()
						.hashCode());
		return result;
	}

}