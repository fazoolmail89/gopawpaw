package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEcdDetId entity provides the base persistence definition of the
 * EcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcdDetId implements java.io.Serializable {

	// Fields

	private String ecdDomain;
	private String ecdNbr;
	private String ecdPart;
	private Boolean ecdNew;

	// Constructors

	/** default constructor */
	public AbstractEcdDetId() {
	}

	/** minimal constructor */
	public AbstractEcdDetId(String ecdDomain) {
		this.ecdDomain = ecdDomain;
	}

	/** full constructor */
	public AbstractEcdDetId(String ecdDomain, String ecdNbr, String ecdPart,
			Boolean ecdNew) {
		this.ecdDomain = ecdDomain;
		this.ecdNbr = ecdNbr;
		this.ecdPart = ecdPart;
		this.ecdNew = ecdNew;
	}

	// Property accessors

	public String getEcdDomain() {
		return this.ecdDomain;
	}

	public void setEcdDomain(String ecdDomain) {
		this.ecdDomain = ecdDomain;
	}

	public String getEcdNbr() {
		return this.ecdNbr;
	}

	public void setEcdNbr(String ecdNbr) {
		this.ecdNbr = ecdNbr;
	}

	public String getEcdPart() {
		return this.ecdPart;
	}

	public void setEcdPart(String ecdPart) {
		this.ecdPart = ecdPart;
	}

	public Boolean getEcdNew() {
		return this.ecdNew;
	}

	public void setEcdNew(Boolean ecdNew) {
		this.ecdNew = ecdNew;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEcdDetId))
			return false;
		AbstractEcdDetId castOther = (AbstractEcdDetId) other;

		return ((this.getEcdDomain() == castOther.getEcdDomain()) || (this
				.getEcdDomain() != null
				&& castOther.getEcdDomain() != null && this.getEcdDomain()
				.equals(castOther.getEcdDomain())))
				&& ((this.getEcdNbr() == castOther.getEcdNbr()) || (this
						.getEcdNbr() != null
						&& castOther.getEcdNbr() != null && this.getEcdNbr()
						.equals(castOther.getEcdNbr())))
				&& ((this.getEcdPart() == castOther.getEcdPart()) || (this
						.getEcdPart() != null
						&& castOther.getEcdPart() != null && this.getEcdPart()
						.equals(castOther.getEcdPart())))
				&& ((this.getEcdNew() == castOther.getEcdNew()) || (this
						.getEcdNew() != null
						&& castOther.getEcdNew() != null && this.getEcdNew()
						.equals(castOther.getEcdNew())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEcdDomain() == null ? 0 : this.getEcdDomain().hashCode());
		result = 37 * result
				+ (getEcdNbr() == null ? 0 : this.getEcdNbr().hashCode());
		result = 37 * result
				+ (getEcdPart() == null ? 0 : this.getEcdPart().hashCode());
		result = 37 * result
				+ (getEcdNew() == null ? 0 : this.getEcdNew().hashCode());
		return result;
	}

}