package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUmMstrId entity provides the base persistence definition of the
 * UmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUmMstrId implements java.io.Serializable {

	// Fields

	private String umDomain;
	private String umUm;
	private String umAltUm;
	private String umPart;

	// Constructors

	/** default constructor */
	public AbstractUmMstrId() {
	}

	/** minimal constructor */
	public AbstractUmMstrId(String umDomain) {
		this.umDomain = umDomain;
	}

	/** full constructor */
	public AbstractUmMstrId(String umDomain, String umUm, String umAltUm,
			String umPart) {
		this.umDomain = umDomain;
		this.umUm = umUm;
		this.umAltUm = umAltUm;
		this.umPart = umPart;
	}

	// Property accessors

	public String getUmDomain() {
		return this.umDomain;
	}

	public void setUmDomain(String umDomain) {
		this.umDomain = umDomain;
	}

	public String getUmUm() {
		return this.umUm;
	}

	public void setUmUm(String umUm) {
		this.umUm = umUm;
	}

	public String getUmAltUm() {
		return this.umAltUm;
	}

	public void setUmAltUm(String umAltUm) {
		this.umAltUm = umAltUm;
	}

	public String getUmPart() {
		return this.umPart;
	}

	public void setUmPart(String umPart) {
		this.umPart = umPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUmMstrId))
			return false;
		AbstractUmMstrId castOther = (AbstractUmMstrId) other;

		return ((this.getUmDomain() == castOther.getUmDomain()) || (this
				.getUmDomain() != null
				&& castOther.getUmDomain() != null && this.getUmDomain()
				.equals(castOther.getUmDomain())))
				&& ((this.getUmUm() == castOther.getUmUm()) || (this.getUmUm() != null
						&& castOther.getUmUm() != null && this.getUmUm()
						.equals(castOther.getUmUm())))
				&& ((this.getUmAltUm() == castOther.getUmAltUm()) || (this
						.getUmAltUm() != null
						&& castOther.getUmAltUm() != null && this.getUmAltUm()
						.equals(castOther.getUmAltUm())))
				&& ((this.getUmPart() == castOther.getUmPart()) || (this
						.getUmPart() != null
						&& castOther.getUmPart() != null && this.getUmPart()
						.equals(castOther.getUmPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUmDomain() == null ? 0 : this.getUmDomain().hashCode());
		result = 37 * result
				+ (getUmUm() == null ? 0 : this.getUmUm().hashCode());
		result = 37 * result
				+ (getUmAltUm() == null ? 0 : this.getUmAltUm().hashCode());
		result = 37 * result
				+ (getUmPart() == null ? 0 : this.getUmPart().hashCode());
		return result;
	}

}