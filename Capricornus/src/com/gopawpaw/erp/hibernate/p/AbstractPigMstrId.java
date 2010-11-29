package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPigMstrId entity provides the base persistence definition of the
 * PigMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPigMstrId implements java.io.Serializable {

	// Fields

	private String pigDomain;
	private String pigCode;
	private String pigAmtType;

	// Constructors

	/** default constructor */
	public AbstractPigMstrId() {
	}

	/** minimal constructor */
	public AbstractPigMstrId(String pigDomain) {
		this.pigDomain = pigDomain;
	}

	/** full constructor */
	public AbstractPigMstrId(String pigDomain, String pigCode, String pigAmtType) {
		this.pigDomain = pigDomain;
		this.pigCode = pigCode;
		this.pigAmtType = pigAmtType;
	}

	// Property accessors

	public String getPigDomain() {
		return this.pigDomain;
	}

	public void setPigDomain(String pigDomain) {
		this.pigDomain = pigDomain;
	}

	public String getPigCode() {
		return this.pigCode;
	}

	public void setPigCode(String pigCode) {
		this.pigCode = pigCode;
	}

	public String getPigAmtType() {
		return this.pigAmtType;
	}

	public void setPigAmtType(String pigAmtType) {
		this.pigAmtType = pigAmtType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPigMstrId))
			return false;
		AbstractPigMstrId castOther = (AbstractPigMstrId) other;

		return ((this.getPigDomain() == castOther.getPigDomain()) || (this
				.getPigDomain() != null
				&& castOther.getPigDomain() != null && this.getPigDomain()
				.equals(castOther.getPigDomain())))
				&& ((this.getPigCode() == castOther.getPigCode()) || (this
						.getPigCode() != null
						&& castOther.getPigCode() != null && this.getPigCode()
						.equals(castOther.getPigCode())))
				&& ((this.getPigAmtType() == castOther.getPigAmtType()) || (this
						.getPigAmtType() != null
						&& castOther.getPigAmtType() != null && this
						.getPigAmtType().equals(castOther.getPigAmtType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPigDomain() == null ? 0 : this.getPigDomain().hashCode());
		result = 37 * result
				+ (getPigCode() == null ? 0 : this.getPigCode().hashCode());
		result = 37
				* result
				+ (getPigAmtType() == null ? 0 : this.getPigAmtType()
						.hashCode());
		return result;
	}

}