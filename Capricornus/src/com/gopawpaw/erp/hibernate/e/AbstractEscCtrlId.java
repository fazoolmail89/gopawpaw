package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEscCtrlId entity provides the base persistence definition of the
 * EscCtrlId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEscCtrlId implements java.io.Serializable {

	// Fields

	private String escDomain;
	private Integer escIndex;

	// Constructors

	/** default constructor */
	public AbstractEscCtrlId() {
	}

	/** minimal constructor */
	public AbstractEscCtrlId(String escDomain) {
		this.escDomain = escDomain;
	}

	/** full constructor */
	public AbstractEscCtrlId(String escDomain, Integer escIndex) {
		this.escDomain = escDomain;
		this.escIndex = escIndex;
	}

	// Property accessors

	public String getEscDomain() {
		return this.escDomain;
	}

	public void setEscDomain(String escDomain) {
		this.escDomain = escDomain;
	}

	public Integer getEscIndex() {
		return this.escIndex;
	}

	public void setEscIndex(Integer escIndex) {
		this.escIndex = escIndex;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEscCtrlId))
			return false;
		AbstractEscCtrlId castOther = (AbstractEscCtrlId) other;

		return ((this.getEscDomain() == castOther.getEscDomain()) || (this
				.getEscDomain() != null
				&& castOther.getEscDomain() != null && this.getEscDomain()
				.equals(castOther.getEscDomain())))
				&& ((this.getEscIndex() == castOther.getEscIndex()) || (this
						.getEscIndex() != null
						&& castOther.getEscIndex() != null && this
						.getEscIndex().equals(castOther.getEscIndex())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEscDomain() == null ? 0 : this.getEscDomain().hashCode());
		result = 37 * result
				+ (getEscIndex() == null ? 0 : this.getEscIndex().hashCode());
		return result;
	}

}