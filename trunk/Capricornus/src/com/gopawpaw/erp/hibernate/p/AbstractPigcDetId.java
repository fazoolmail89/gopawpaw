package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPigcDetId entity provides the base persistence definition of the
 * PigcDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPigcDetId implements java.io.Serializable {

	// Fields

	private String pigcDomain;
	private String pigcCode;
	private Integer pigcMemType;
	private String pigcMemRef;
	private String pigcAmtType;

	// Constructors

	/** default constructor */
	public AbstractPigcDetId() {
	}

	/** minimal constructor */
	public AbstractPigcDetId(String pigcDomain) {
		this.pigcDomain = pigcDomain;
	}

	/** full constructor */
	public AbstractPigcDetId(String pigcDomain, String pigcCode,
			Integer pigcMemType, String pigcMemRef, String pigcAmtType) {
		this.pigcDomain = pigcDomain;
		this.pigcCode = pigcCode;
		this.pigcMemType = pigcMemType;
		this.pigcMemRef = pigcMemRef;
		this.pigcAmtType = pigcAmtType;
	}

	// Property accessors

	public String getPigcDomain() {
		return this.pigcDomain;
	}

	public void setPigcDomain(String pigcDomain) {
		this.pigcDomain = pigcDomain;
	}

	public String getPigcCode() {
		return this.pigcCode;
	}

	public void setPigcCode(String pigcCode) {
		this.pigcCode = pigcCode;
	}

	public Integer getPigcMemType() {
		return this.pigcMemType;
	}

	public void setPigcMemType(Integer pigcMemType) {
		this.pigcMemType = pigcMemType;
	}

	public String getPigcMemRef() {
		return this.pigcMemRef;
	}

	public void setPigcMemRef(String pigcMemRef) {
		this.pigcMemRef = pigcMemRef;
	}

	public String getPigcAmtType() {
		return this.pigcAmtType;
	}

	public void setPigcAmtType(String pigcAmtType) {
		this.pigcAmtType = pigcAmtType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPigcDetId))
			return false;
		AbstractPigcDetId castOther = (AbstractPigcDetId) other;

		return ((this.getPigcDomain() == castOther.getPigcDomain()) || (this
				.getPigcDomain() != null
				&& castOther.getPigcDomain() != null && this.getPigcDomain()
				.equals(castOther.getPigcDomain())))
				&& ((this.getPigcCode() == castOther.getPigcCode()) || (this
						.getPigcCode() != null
						&& castOther.getPigcCode() != null && this
						.getPigcCode().equals(castOther.getPigcCode())))
				&& ((this.getPigcMemType() == castOther.getPigcMemType()) || (this
						.getPigcMemType() != null
						&& castOther.getPigcMemType() != null && this
						.getPigcMemType().equals(castOther.getPigcMemType())))
				&& ((this.getPigcMemRef() == castOther.getPigcMemRef()) || (this
						.getPigcMemRef() != null
						&& castOther.getPigcMemRef() != null && this
						.getPigcMemRef().equals(castOther.getPigcMemRef())))
				&& ((this.getPigcAmtType() == castOther.getPigcAmtType()) || (this
						.getPigcAmtType() != null
						&& castOther.getPigcAmtType() != null && this
						.getPigcAmtType().equals(castOther.getPigcAmtType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPigcDomain() == null ? 0 : this.getPigcDomain()
						.hashCode());
		result = 37 * result
				+ (getPigcCode() == null ? 0 : this.getPigcCode().hashCode());
		result = 37
				* result
				+ (getPigcMemType() == null ? 0 : this.getPigcMemType()
						.hashCode());
		result = 37
				* result
				+ (getPigcMemRef() == null ? 0 : this.getPigcMemRef()
						.hashCode());
		result = 37
				* result
				+ (getPigcAmtType() == null ? 0 : this.getPigcAmtType()
						.hashCode());
		return result;
	}

}