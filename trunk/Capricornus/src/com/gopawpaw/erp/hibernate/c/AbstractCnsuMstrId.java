package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCnsuMstrId entity provides the base persistence definition of the
 * CnsuMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCnsuMstrId implements java.io.Serializable {

	// Fields

	private String cnsuDomain;
	private Integer cnsuPkey;

	// Constructors

	/** default constructor */
	public AbstractCnsuMstrId() {
	}

	/** full constructor */
	public AbstractCnsuMstrId(String cnsuDomain, Integer cnsuPkey) {
		this.cnsuDomain = cnsuDomain;
		this.cnsuPkey = cnsuPkey;
	}

	// Property accessors

	public String getCnsuDomain() {
		return this.cnsuDomain;
	}

	public void setCnsuDomain(String cnsuDomain) {
		this.cnsuDomain = cnsuDomain;
	}

	public Integer getCnsuPkey() {
		return this.cnsuPkey;
	}

	public void setCnsuPkey(Integer cnsuPkey) {
		this.cnsuPkey = cnsuPkey;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCnsuMstrId))
			return false;
		AbstractCnsuMstrId castOther = (AbstractCnsuMstrId) other;

		return ((this.getCnsuDomain() == castOther.getCnsuDomain()) || (this
				.getCnsuDomain() != null
				&& castOther.getCnsuDomain() != null && this.getCnsuDomain()
				.equals(castOther.getCnsuDomain())))
				&& ((this.getCnsuPkey() == castOther.getCnsuPkey()) || (this
						.getCnsuPkey() != null
						&& castOther.getCnsuPkey() != null && this
						.getCnsuPkey().equals(castOther.getCnsuPkey())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCnsuDomain() == null ? 0 : this.getCnsuDomain()
						.hashCode());
		result = 37 * result
				+ (getCnsuPkey() == null ? 0 : this.getCnsuPkey().hashCode());
		return result;
	}

}