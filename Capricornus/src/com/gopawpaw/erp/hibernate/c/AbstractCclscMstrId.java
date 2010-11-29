package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCclscMstrId entity provides the base persistence definition of the
 * CclscMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCclscMstrId implements java.io.Serializable {

	// Fields

	private String cclscDomain;
	private String cclscShipto;
	private String cclscPart;
	private String cclscCurr;

	// Constructors

	/** default constructor */
	public AbstractCclscMstrId() {
	}

	/** full constructor */
	public AbstractCclscMstrId(String cclscDomain, String cclscShipto,
			String cclscPart, String cclscCurr) {
		this.cclscDomain = cclscDomain;
		this.cclscShipto = cclscShipto;
		this.cclscPart = cclscPart;
		this.cclscCurr = cclscCurr;
	}

	// Property accessors

	public String getCclscDomain() {
		return this.cclscDomain;
	}

	public void setCclscDomain(String cclscDomain) {
		this.cclscDomain = cclscDomain;
	}

	public String getCclscShipto() {
		return this.cclscShipto;
	}

	public void setCclscShipto(String cclscShipto) {
		this.cclscShipto = cclscShipto;
	}

	public String getCclscPart() {
		return this.cclscPart;
	}

	public void setCclscPart(String cclscPart) {
		this.cclscPart = cclscPart;
	}

	public String getCclscCurr() {
		return this.cclscCurr;
	}

	public void setCclscCurr(String cclscCurr) {
		this.cclscCurr = cclscCurr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCclscMstrId))
			return false;
		AbstractCclscMstrId castOther = (AbstractCclscMstrId) other;

		return ((this.getCclscDomain() == castOther.getCclscDomain()) || (this
				.getCclscDomain() != null
				&& castOther.getCclscDomain() != null && this.getCclscDomain()
				.equals(castOther.getCclscDomain())))
				&& ((this.getCclscShipto() == castOther.getCclscShipto()) || (this
						.getCclscShipto() != null
						&& castOther.getCclscShipto() != null && this
						.getCclscShipto().equals(castOther.getCclscShipto())))
				&& ((this.getCclscPart() == castOther.getCclscPart()) || (this
						.getCclscPart() != null
						&& castOther.getCclscPart() != null && this
						.getCclscPart().equals(castOther.getCclscPart())))
				&& ((this.getCclscCurr() == castOther.getCclscCurr()) || (this
						.getCclscCurr() != null
						&& castOther.getCclscCurr() != null && this
						.getCclscCurr().equals(castOther.getCclscCurr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCclscDomain() == null ? 0 : this.getCclscDomain()
						.hashCode());
		result = 37
				* result
				+ (getCclscShipto() == null ? 0 : this.getCclscShipto()
						.hashCode());
		result = 37 * result
				+ (getCclscPart() == null ? 0 : this.getCclscPart().hashCode());
		result = 37 * result
				+ (getCclscCurr() == null ? 0 : this.getCclscCurr().hashCode());
		return result;
	}

}