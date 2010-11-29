package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPacMstrId entity provides the base persistence definition of the
 * PacMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPacMstrId implements java.io.Serializable {

	// Fields

	private String pacDomain;
	private String pacCode;

	// Constructors

	/** default constructor */
	public AbstractPacMstrId() {
	}

	/** minimal constructor */
	public AbstractPacMstrId(String pacDomain) {
		this.pacDomain = pacDomain;
	}

	/** full constructor */
	public AbstractPacMstrId(String pacDomain, String pacCode) {
		this.pacDomain = pacDomain;
		this.pacCode = pacCode;
	}

	// Property accessors

	public String getPacDomain() {
		return this.pacDomain;
	}

	public void setPacDomain(String pacDomain) {
		this.pacDomain = pacDomain;
	}

	public String getPacCode() {
		return this.pacCode;
	}

	public void setPacCode(String pacCode) {
		this.pacCode = pacCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPacMstrId))
			return false;
		AbstractPacMstrId castOther = (AbstractPacMstrId) other;

		return ((this.getPacDomain() == castOther.getPacDomain()) || (this
				.getPacDomain() != null
				&& castOther.getPacDomain() != null && this.getPacDomain()
				.equals(castOther.getPacDomain())))
				&& ((this.getPacCode() == castOther.getPacCode()) || (this
						.getPacCode() != null
						&& castOther.getPacCode() != null && this.getPacCode()
						.equals(castOther.getPacCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPacDomain() == null ? 0 : this.getPacDomain().hashCode());
		result = 37 * result
				+ (getPacCode() == null ? 0 : this.getPacCode().hashCode());
		return result;
	}

}