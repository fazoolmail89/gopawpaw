package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQcsMstrId entity provides the base persistence definition of the
 * QcsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQcsMstrId implements java.io.Serializable {

	// Fields

	private String qcsDomain;
	private String qcsPart;

	// Constructors

	/** default constructor */
	public AbstractQcsMstrId() {
	}

	/** minimal constructor */
	public AbstractQcsMstrId(String qcsDomain) {
		this.qcsDomain = qcsDomain;
	}

	/** full constructor */
	public AbstractQcsMstrId(String qcsDomain, String qcsPart) {
		this.qcsDomain = qcsDomain;
		this.qcsPart = qcsPart;
	}

	// Property accessors

	public String getQcsDomain() {
		return this.qcsDomain;
	}

	public void setQcsDomain(String qcsDomain) {
		this.qcsDomain = qcsDomain;
	}

	public String getQcsPart() {
		return this.qcsPart;
	}

	public void setQcsPart(String qcsPart) {
		this.qcsPart = qcsPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQcsMstrId))
			return false;
		AbstractQcsMstrId castOther = (AbstractQcsMstrId) other;

		return ((this.getQcsDomain() == castOther.getQcsDomain()) || (this
				.getQcsDomain() != null
				&& castOther.getQcsDomain() != null && this.getQcsDomain()
				.equals(castOther.getQcsDomain())))
				&& ((this.getQcsPart() == castOther.getQcsPart()) || (this
						.getQcsPart() != null
						&& castOther.getQcsPart() != null && this.getQcsPart()
						.equals(castOther.getQcsPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQcsDomain() == null ? 0 : this.getQcsDomain().hashCode());
		result = 37 * result
				+ (getQcsPart() == null ? 0 : this.getQcsPart().hashCode());
		return result;
	}

}