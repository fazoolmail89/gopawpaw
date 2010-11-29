package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIlgHistId entity provides the base persistence definition of the
 * IlgHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIlgHistId implements java.io.Serializable {

	// Fields

	private Integer ilgDocId;
	private Integer ilgDocSufx;
	private String ilgDomain;

	// Constructors

	/** default constructor */
	public AbstractIlgHistId() {
	}

	/** minimal constructor */
	public AbstractIlgHistId(String ilgDomain) {
		this.ilgDomain = ilgDomain;
	}

	/** full constructor */
	public AbstractIlgHistId(Integer ilgDocId, Integer ilgDocSufx,
			String ilgDomain) {
		this.ilgDocId = ilgDocId;
		this.ilgDocSufx = ilgDocSufx;
		this.ilgDomain = ilgDomain;
	}

	// Property accessors

	public Integer getIlgDocId() {
		return this.ilgDocId;
	}

	public void setIlgDocId(Integer ilgDocId) {
		this.ilgDocId = ilgDocId;
	}

	public Integer getIlgDocSufx() {
		return this.ilgDocSufx;
	}

	public void setIlgDocSufx(Integer ilgDocSufx) {
		this.ilgDocSufx = ilgDocSufx;
	}

	public String getIlgDomain() {
		return this.ilgDomain;
	}

	public void setIlgDomain(String ilgDomain) {
		this.ilgDomain = ilgDomain;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIlgHistId))
			return false;
		AbstractIlgHistId castOther = (AbstractIlgHistId) other;

		return ((this.getIlgDocId() == castOther.getIlgDocId()) || (this
				.getIlgDocId() != null
				&& castOther.getIlgDocId() != null && this.getIlgDocId()
				.equals(castOther.getIlgDocId())))
				&& ((this.getIlgDocSufx() == castOther.getIlgDocSufx()) || (this
						.getIlgDocSufx() != null
						&& castOther.getIlgDocSufx() != null && this
						.getIlgDocSufx().equals(castOther.getIlgDocSufx())))
				&& ((this.getIlgDomain() == castOther.getIlgDomain()) || (this
						.getIlgDomain() != null
						&& castOther.getIlgDomain() != null && this
						.getIlgDomain().equals(castOther.getIlgDomain())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIlgDocId() == null ? 0 : this.getIlgDocId().hashCode());
		result = 37
				* result
				+ (getIlgDocSufx() == null ? 0 : this.getIlgDocSufx()
						.hashCode());
		result = 37 * result
				+ (getIlgDomain() == null ? 0 : this.getIlgDomain().hashCode());
		return result;
	}

}