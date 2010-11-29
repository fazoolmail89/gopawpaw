package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCaqMstrId entity provides the base persistence definition of the
 * CaqMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCaqMstrId implements java.io.Serializable {

	// Fields

	private String caqDomain;
	private String caqQue;
	private String caqFileType;

	// Constructors

	/** default constructor */
	public AbstractCaqMstrId() {
	}

	/** minimal constructor */
	public AbstractCaqMstrId(String caqDomain) {
		this.caqDomain = caqDomain;
	}

	/** full constructor */
	public AbstractCaqMstrId(String caqDomain, String caqQue, String caqFileType) {
		this.caqDomain = caqDomain;
		this.caqQue = caqQue;
		this.caqFileType = caqFileType;
	}

	// Property accessors

	public String getCaqDomain() {
		return this.caqDomain;
	}

	public void setCaqDomain(String caqDomain) {
		this.caqDomain = caqDomain;
	}

	public String getCaqQue() {
		return this.caqQue;
	}

	public void setCaqQue(String caqQue) {
		this.caqQue = caqQue;
	}

	public String getCaqFileType() {
		return this.caqFileType;
	}

	public void setCaqFileType(String caqFileType) {
		this.caqFileType = caqFileType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCaqMstrId))
			return false;
		AbstractCaqMstrId castOther = (AbstractCaqMstrId) other;

		return ((this.getCaqDomain() == castOther.getCaqDomain()) || (this
				.getCaqDomain() != null
				&& castOther.getCaqDomain() != null && this.getCaqDomain()
				.equals(castOther.getCaqDomain())))
				&& ((this.getCaqQue() == castOther.getCaqQue()) || (this
						.getCaqQue() != null
						&& castOther.getCaqQue() != null && this.getCaqQue()
						.equals(castOther.getCaqQue())))
				&& ((this.getCaqFileType() == castOther.getCaqFileType()) || (this
						.getCaqFileType() != null
						&& castOther.getCaqFileType() != null && this
						.getCaqFileType().equals(castOther.getCaqFileType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCaqDomain() == null ? 0 : this.getCaqDomain().hashCode());
		result = 37 * result
				+ (getCaqQue() == null ? 0 : this.getCaqQue().hashCode());
		result = 37
				* result
				+ (getCaqFileType() == null ? 0 : this.getCaqFileType()
						.hashCode());
		return result;
	}

}