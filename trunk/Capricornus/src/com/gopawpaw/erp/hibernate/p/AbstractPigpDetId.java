package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPigpDetId entity provides the base persistence definition of the
 * PigpDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPigpDetId implements java.io.Serializable {

	// Fields

	private String pigpDomain;
	private String pigpCode;
	private Integer pigpProdType;
	private String pigpProdRef;
	private String pigpAmtType;

	// Constructors

	/** default constructor */
	public AbstractPigpDetId() {
	}

	/** minimal constructor */
	public AbstractPigpDetId(String pigpDomain) {
		this.pigpDomain = pigpDomain;
	}

	/** full constructor */
	public AbstractPigpDetId(String pigpDomain, String pigpCode,
			Integer pigpProdType, String pigpProdRef, String pigpAmtType) {
		this.pigpDomain = pigpDomain;
		this.pigpCode = pigpCode;
		this.pigpProdType = pigpProdType;
		this.pigpProdRef = pigpProdRef;
		this.pigpAmtType = pigpAmtType;
	}

	// Property accessors

	public String getPigpDomain() {
		return this.pigpDomain;
	}

	public void setPigpDomain(String pigpDomain) {
		this.pigpDomain = pigpDomain;
	}

	public String getPigpCode() {
		return this.pigpCode;
	}

	public void setPigpCode(String pigpCode) {
		this.pigpCode = pigpCode;
	}

	public Integer getPigpProdType() {
		return this.pigpProdType;
	}

	public void setPigpProdType(Integer pigpProdType) {
		this.pigpProdType = pigpProdType;
	}

	public String getPigpProdRef() {
		return this.pigpProdRef;
	}

	public void setPigpProdRef(String pigpProdRef) {
		this.pigpProdRef = pigpProdRef;
	}

	public String getPigpAmtType() {
		return this.pigpAmtType;
	}

	public void setPigpAmtType(String pigpAmtType) {
		this.pigpAmtType = pigpAmtType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPigpDetId))
			return false;
		AbstractPigpDetId castOther = (AbstractPigpDetId) other;

		return ((this.getPigpDomain() == castOther.getPigpDomain()) || (this
				.getPigpDomain() != null
				&& castOther.getPigpDomain() != null && this.getPigpDomain()
				.equals(castOther.getPigpDomain())))
				&& ((this.getPigpCode() == castOther.getPigpCode()) || (this
						.getPigpCode() != null
						&& castOther.getPigpCode() != null && this
						.getPigpCode().equals(castOther.getPigpCode())))
				&& ((this.getPigpProdType() == castOther.getPigpProdType()) || (this
						.getPigpProdType() != null
						&& castOther.getPigpProdType() != null && this
						.getPigpProdType().equals(castOther.getPigpProdType())))
				&& ((this.getPigpProdRef() == castOther.getPigpProdRef()) || (this
						.getPigpProdRef() != null
						&& castOther.getPigpProdRef() != null && this
						.getPigpProdRef().equals(castOther.getPigpProdRef())))
				&& ((this.getPigpAmtType() == castOther.getPigpAmtType()) || (this
						.getPigpAmtType() != null
						&& castOther.getPigpAmtType() != null && this
						.getPigpAmtType().equals(castOther.getPigpAmtType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPigpDomain() == null ? 0 : this.getPigpDomain()
						.hashCode());
		result = 37 * result
				+ (getPigpCode() == null ? 0 : this.getPigpCode().hashCode());
		result = 37
				* result
				+ (getPigpProdType() == null ? 0 : this.getPigpProdType()
						.hashCode());
		result = 37
				* result
				+ (getPigpProdRef() == null ? 0 : this.getPigpProdRef()
						.hashCode());
		result = 37
				* result
				+ (getPigpAmtType() == null ? 0 : this.getPigpAmtType()
						.hashCode());
		return result;
	}

}