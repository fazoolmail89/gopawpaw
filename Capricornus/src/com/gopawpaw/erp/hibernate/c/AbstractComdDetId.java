package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractComdDetId entity provides the base persistence definition of the
 * ComdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractComdDetId implements java.io.Serializable {

	// Fields

	private String comdDomain;
	private String comdCommCode;
	private String comdPart;

	// Constructors

	/** default constructor */
	public AbstractComdDetId() {
	}

	/** full constructor */
	public AbstractComdDetId(String comdDomain, String comdCommCode,
			String comdPart) {
		this.comdDomain = comdDomain;
		this.comdCommCode = comdCommCode;
		this.comdPart = comdPart;
	}

	// Property accessors

	public String getComdDomain() {
		return this.comdDomain;
	}

	public void setComdDomain(String comdDomain) {
		this.comdDomain = comdDomain;
	}

	public String getComdCommCode() {
		return this.comdCommCode;
	}

	public void setComdCommCode(String comdCommCode) {
		this.comdCommCode = comdCommCode;
	}

	public String getComdPart() {
		return this.comdPart;
	}

	public void setComdPart(String comdPart) {
		this.comdPart = comdPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractComdDetId))
			return false;
		AbstractComdDetId castOther = (AbstractComdDetId) other;

		return ((this.getComdDomain() == castOther.getComdDomain()) || (this
				.getComdDomain() != null
				&& castOther.getComdDomain() != null && this.getComdDomain()
				.equals(castOther.getComdDomain())))
				&& ((this.getComdCommCode() == castOther.getComdCommCode()) || (this
						.getComdCommCode() != null
						&& castOther.getComdCommCode() != null && this
						.getComdCommCode().equals(castOther.getComdCommCode())))
				&& ((this.getComdPart() == castOther.getComdPart()) || (this
						.getComdPart() != null
						&& castOther.getComdPart() != null && this
						.getComdPart().equals(castOther.getComdPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getComdDomain() == null ? 0 : this.getComdDomain()
						.hashCode());
		result = 37
				* result
				+ (getComdCommCode() == null ? 0 : this.getComdCommCode()
						.hashCode());
		result = 37 * result
				+ (getComdPart() == null ? 0 : this.getComdPart().hashCode());
		return result;
	}

}