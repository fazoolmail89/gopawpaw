package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCilMstrId entity provides the base persistence definition of the
 * CilMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCilMstrId implements java.io.Serializable {

	// Fields

	private String cilDomain;
	private String cilCorInv;
	private String cilCorSoNbr;

	// Constructors

	/** default constructor */
	public AbstractCilMstrId() {
	}

	/** full constructor */
	public AbstractCilMstrId(String cilDomain, String cilCorInv,
			String cilCorSoNbr) {
		this.cilDomain = cilDomain;
		this.cilCorInv = cilCorInv;
		this.cilCorSoNbr = cilCorSoNbr;
	}

	// Property accessors

	public String getCilDomain() {
		return this.cilDomain;
	}

	public void setCilDomain(String cilDomain) {
		this.cilDomain = cilDomain;
	}

	public String getCilCorInv() {
		return this.cilCorInv;
	}

	public void setCilCorInv(String cilCorInv) {
		this.cilCorInv = cilCorInv;
	}

	public String getCilCorSoNbr() {
		return this.cilCorSoNbr;
	}

	public void setCilCorSoNbr(String cilCorSoNbr) {
		this.cilCorSoNbr = cilCorSoNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCilMstrId))
			return false;
		AbstractCilMstrId castOther = (AbstractCilMstrId) other;

		return ((this.getCilDomain() == castOther.getCilDomain()) || (this
				.getCilDomain() != null
				&& castOther.getCilDomain() != null && this.getCilDomain()
				.equals(castOther.getCilDomain())))
				&& ((this.getCilCorInv() == castOther.getCilCorInv()) || (this
						.getCilCorInv() != null
						&& castOther.getCilCorInv() != null && this
						.getCilCorInv().equals(castOther.getCilCorInv())))
				&& ((this.getCilCorSoNbr() == castOther.getCilCorSoNbr()) || (this
						.getCilCorSoNbr() != null
						&& castOther.getCilCorSoNbr() != null && this
						.getCilCorSoNbr().equals(castOther.getCilCorSoNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCilDomain() == null ? 0 : this.getCilDomain().hashCode());
		result = 37 * result
				+ (getCilCorInv() == null ? 0 : this.getCilCorInv().hashCode());
		result = 37
				* result
				+ (getCilCorSoNbr() == null ? 0 : this.getCilCorSoNbr()
						.hashCode());
		return result;
	}

}