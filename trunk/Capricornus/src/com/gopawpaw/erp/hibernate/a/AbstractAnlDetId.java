package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAnlDetId entity provides the base persistence definition of the
 * AnlDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAnlDetId implements java.io.Serializable {

	// Fields

	private String anlDomain;
	private String anlType;
	private String anlCode;
	private String anlLinkCode;

	// Constructors

	/** default constructor */
	public AbstractAnlDetId() {
	}

	/** minimal constructor */
	public AbstractAnlDetId(String anlDomain, String anlType, String anlCode) {
		this.anlDomain = anlDomain;
		this.anlType = anlType;
		this.anlCode = anlCode;
	}

	/** full constructor */
	public AbstractAnlDetId(String anlDomain, String anlType, String anlCode,
			String anlLinkCode) {
		this.anlDomain = anlDomain;
		this.anlType = anlType;
		this.anlCode = anlCode;
		this.anlLinkCode = anlLinkCode;
	}

	// Property accessors

	public String getAnlDomain() {
		return this.anlDomain;
	}

	public void setAnlDomain(String anlDomain) {
		this.anlDomain = anlDomain;
	}

	public String getAnlType() {
		return this.anlType;
	}

	public void setAnlType(String anlType) {
		this.anlType = anlType;
	}

	public String getAnlCode() {
		return this.anlCode;
	}

	public void setAnlCode(String anlCode) {
		this.anlCode = anlCode;
	}

	public String getAnlLinkCode() {
		return this.anlLinkCode;
	}

	public void setAnlLinkCode(String anlLinkCode) {
		this.anlLinkCode = anlLinkCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAnlDetId))
			return false;
		AbstractAnlDetId castOther = (AbstractAnlDetId) other;

		return ((this.getAnlDomain() == castOther.getAnlDomain()) || (this
				.getAnlDomain() != null
				&& castOther.getAnlDomain() != null && this.getAnlDomain()
				.equals(castOther.getAnlDomain())))
				&& ((this.getAnlType() == castOther.getAnlType()) || (this
						.getAnlType() != null
						&& castOther.getAnlType() != null && this.getAnlType()
						.equals(castOther.getAnlType())))
				&& ((this.getAnlCode() == castOther.getAnlCode()) || (this
						.getAnlCode() != null
						&& castOther.getAnlCode() != null && this.getAnlCode()
						.equals(castOther.getAnlCode())))
				&& ((this.getAnlLinkCode() == castOther.getAnlLinkCode()) || (this
						.getAnlLinkCode() != null
						&& castOther.getAnlLinkCode() != null && this
						.getAnlLinkCode().equals(castOther.getAnlLinkCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAnlDomain() == null ? 0 : this.getAnlDomain().hashCode());
		result = 37 * result
				+ (getAnlType() == null ? 0 : this.getAnlType().hashCode());
		result = 37 * result
				+ (getAnlCode() == null ? 0 : this.getAnlCode().hashCode());
		result = 37
				* result
				+ (getAnlLinkCode() == null ? 0 : this.getAnlLinkCode()
						.hashCode());
		return result;
	}

}