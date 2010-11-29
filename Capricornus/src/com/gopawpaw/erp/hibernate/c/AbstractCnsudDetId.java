package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCnsudDetId entity provides the base persistence definition of the
 * CnsudDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCnsudDetId implements java.io.Serializable {

	// Fields

	private String cnsudDomain;
	private Integer cnsudCnsuPkey;
	private Integer cnsudCnsixPkey;

	// Constructors

	/** default constructor */
	public AbstractCnsudDetId() {
	}

	/** full constructor */
	public AbstractCnsudDetId(String cnsudDomain, Integer cnsudCnsuPkey,
			Integer cnsudCnsixPkey) {
		this.cnsudDomain = cnsudDomain;
		this.cnsudCnsuPkey = cnsudCnsuPkey;
		this.cnsudCnsixPkey = cnsudCnsixPkey;
	}

	// Property accessors

	public String getCnsudDomain() {
		return this.cnsudDomain;
	}

	public void setCnsudDomain(String cnsudDomain) {
		this.cnsudDomain = cnsudDomain;
	}

	public Integer getCnsudCnsuPkey() {
		return this.cnsudCnsuPkey;
	}

	public void setCnsudCnsuPkey(Integer cnsudCnsuPkey) {
		this.cnsudCnsuPkey = cnsudCnsuPkey;
	}

	public Integer getCnsudCnsixPkey() {
		return this.cnsudCnsixPkey;
	}

	public void setCnsudCnsixPkey(Integer cnsudCnsixPkey) {
		this.cnsudCnsixPkey = cnsudCnsixPkey;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCnsudDetId))
			return false;
		AbstractCnsudDetId castOther = (AbstractCnsudDetId) other;

		return ((this.getCnsudDomain() == castOther.getCnsudDomain()) || (this
				.getCnsudDomain() != null
				&& castOther.getCnsudDomain() != null && this.getCnsudDomain()
				.equals(castOther.getCnsudDomain())))
				&& ((this.getCnsudCnsuPkey() == castOther.getCnsudCnsuPkey()) || (this
						.getCnsudCnsuPkey() != null
						&& castOther.getCnsudCnsuPkey() != null && this
						.getCnsudCnsuPkey()
						.equals(castOther.getCnsudCnsuPkey())))
				&& ((this.getCnsudCnsixPkey() == castOther.getCnsudCnsixPkey()) || (this
						.getCnsudCnsixPkey() != null
						&& castOther.getCnsudCnsixPkey() != null && this
						.getCnsudCnsixPkey().equals(
								castOther.getCnsudCnsixPkey())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCnsudDomain() == null ? 0 : this.getCnsudDomain()
						.hashCode());
		result = 37
				* result
				+ (getCnsudCnsuPkey() == null ? 0 : this.getCnsudCnsuPkey()
						.hashCode());
		result = 37
				* result
				+ (getCnsudCnsixPkey() == null ? 0 : this.getCnsudCnsixPkey()
						.hashCode());
		return result;
	}

}