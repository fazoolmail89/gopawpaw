package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractElgHistId entity provides the base persistence definition of the
 * ElgHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractElgHistId implements java.io.Serializable {

	// Fields

	private Integer elgDocId;
	private Integer elgDocSufx;
	private String elgDomain;

	// Constructors

	/** default constructor */
	public AbstractElgHistId() {
	}

	/** minimal constructor */
	public AbstractElgHistId(String elgDomain) {
		this.elgDomain = elgDomain;
	}

	/** full constructor */
	public AbstractElgHistId(Integer elgDocId, Integer elgDocSufx,
			String elgDomain) {
		this.elgDocId = elgDocId;
		this.elgDocSufx = elgDocSufx;
		this.elgDomain = elgDomain;
	}

	// Property accessors

	public Integer getElgDocId() {
		return this.elgDocId;
	}

	public void setElgDocId(Integer elgDocId) {
		this.elgDocId = elgDocId;
	}

	public Integer getElgDocSufx() {
		return this.elgDocSufx;
	}

	public void setElgDocSufx(Integer elgDocSufx) {
		this.elgDocSufx = elgDocSufx;
	}

	public String getElgDomain() {
		return this.elgDomain;
	}

	public void setElgDomain(String elgDomain) {
		this.elgDomain = elgDomain;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractElgHistId))
			return false;
		AbstractElgHistId castOther = (AbstractElgHistId) other;

		return ((this.getElgDocId() == castOther.getElgDocId()) || (this
				.getElgDocId() != null
				&& castOther.getElgDocId() != null && this.getElgDocId()
				.equals(castOther.getElgDocId())))
				&& ((this.getElgDocSufx() == castOther.getElgDocSufx()) || (this
						.getElgDocSufx() != null
						&& castOther.getElgDocSufx() != null && this
						.getElgDocSufx().equals(castOther.getElgDocSufx())))
				&& ((this.getElgDomain() == castOther.getElgDomain()) || (this
						.getElgDomain() != null
						&& castOther.getElgDomain() != null && this
						.getElgDomain().equals(castOther.getElgDomain())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getElgDocId() == null ? 0 : this.getElgDocId().hashCode());
		result = 37
				* result
				+ (getElgDocSufx() == null ? 0 : this.getElgDocSufx()
						.hashCode());
		result = 37 * result
				+ (getElgDomain() == null ? 0 : this.getElgDomain().hashCode());
		return result;
	}

}