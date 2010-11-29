package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCncsMstrId entity provides the base persistence definition of the
 * CncsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCncsMstrId implements java.io.Serializable {

	// Fields

	private String cncsDomain;
	private String cncsShipto;
	private String cncsPart;

	// Constructors

	/** default constructor */
	public AbstractCncsMstrId() {
	}

	/** full constructor */
	public AbstractCncsMstrId(String cncsDomain, String cncsShipto,
			String cncsPart) {
		this.cncsDomain = cncsDomain;
		this.cncsShipto = cncsShipto;
		this.cncsPart = cncsPart;
	}

	// Property accessors

	public String getCncsDomain() {
		return this.cncsDomain;
	}

	public void setCncsDomain(String cncsDomain) {
		this.cncsDomain = cncsDomain;
	}

	public String getCncsShipto() {
		return this.cncsShipto;
	}

	public void setCncsShipto(String cncsShipto) {
		this.cncsShipto = cncsShipto;
	}

	public String getCncsPart() {
		return this.cncsPart;
	}

	public void setCncsPart(String cncsPart) {
		this.cncsPart = cncsPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCncsMstrId))
			return false;
		AbstractCncsMstrId castOther = (AbstractCncsMstrId) other;

		return ((this.getCncsDomain() == castOther.getCncsDomain()) || (this
				.getCncsDomain() != null
				&& castOther.getCncsDomain() != null && this.getCncsDomain()
				.equals(castOther.getCncsDomain())))
				&& ((this.getCncsShipto() == castOther.getCncsShipto()) || (this
						.getCncsShipto() != null
						&& castOther.getCncsShipto() != null && this
						.getCncsShipto().equals(castOther.getCncsShipto())))
				&& ((this.getCncsPart() == castOther.getCncsPart()) || (this
						.getCncsPart() != null
						&& castOther.getCncsPart() != null && this
						.getCncsPart().equals(castOther.getCncsPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCncsDomain() == null ? 0 : this.getCncsDomain()
						.hashCode());
		result = 37
				* result
				+ (getCncsShipto() == null ? 0 : this.getCncsShipto()
						.hashCode());
		result = 37 * result
				+ (getCncsPart() == null ? 0 : this.getCncsPart().hashCode());
		return result;
	}

}