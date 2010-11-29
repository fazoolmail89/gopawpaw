package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQoMstrId entity provides the base persistence definition of the
 * QoMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQoMstrId implements java.io.Serializable {

	// Fields

	private String qoDomain;
	private String qoNbr;

	// Constructors

	/** default constructor */
	public AbstractQoMstrId() {
	}

	/** full constructor */
	public AbstractQoMstrId(String qoDomain, String qoNbr) {
		this.qoDomain = qoDomain;
		this.qoNbr = qoNbr;
	}

	// Property accessors

	public String getQoDomain() {
		return this.qoDomain;
	}

	public void setQoDomain(String qoDomain) {
		this.qoDomain = qoDomain;
	}

	public String getQoNbr() {
		return this.qoNbr;
	}

	public void setQoNbr(String qoNbr) {
		this.qoNbr = qoNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQoMstrId))
			return false;
		AbstractQoMstrId castOther = (AbstractQoMstrId) other;

		return ((this.getQoDomain() == castOther.getQoDomain()) || (this
				.getQoDomain() != null
				&& castOther.getQoDomain() != null && this.getQoDomain()
				.equals(castOther.getQoDomain())))
				&& ((this.getQoNbr() == castOther.getQoNbr()) || (this
						.getQoNbr() != null
						&& castOther.getQoNbr() != null && this.getQoNbr()
						.equals(castOther.getQoNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQoDomain() == null ? 0 : this.getQoDomain().hashCode());
		result = 37 * result
				+ (getQoNbr() == null ? 0 : this.getQoNbr().hashCode());
		return result;
	}

}