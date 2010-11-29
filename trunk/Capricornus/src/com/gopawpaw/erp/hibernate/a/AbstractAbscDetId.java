package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAbscDetId entity provides the base persistence definition of the
 * AbscDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbscDetId implements java.io.Serializable {

	// Fields

	private String abscDomain;
	private String abscAbsId;
	private Integer abscSeq;

	// Constructors

	/** default constructor */
	public AbstractAbscDetId() {
	}

	/** full constructor */
	public AbstractAbscDetId(String abscDomain, String abscAbsId,
			Integer abscSeq) {
		this.abscDomain = abscDomain;
		this.abscAbsId = abscAbsId;
		this.abscSeq = abscSeq;
	}

	// Property accessors

	public String getAbscDomain() {
		return this.abscDomain;
	}

	public void setAbscDomain(String abscDomain) {
		this.abscDomain = abscDomain;
	}

	public String getAbscAbsId() {
		return this.abscAbsId;
	}

	public void setAbscAbsId(String abscAbsId) {
		this.abscAbsId = abscAbsId;
	}

	public Integer getAbscSeq() {
		return this.abscSeq;
	}

	public void setAbscSeq(Integer abscSeq) {
		this.abscSeq = abscSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAbscDetId))
			return false;
		AbstractAbscDetId castOther = (AbstractAbscDetId) other;

		return ((this.getAbscDomain() == castOther.getAbscDomain()) || (this
				.getAbscDomain() != null
				&& castOther.getAbscDomain() != null && this.getAbscDomain()
				.equals(castOther.getAbscDomain())))
				&& ((this.getAbscAbsId() == castOther.getAbscAbsId()) || (this
						.getAbscAbsId() != null
						&& castOther.getAbscAbsId() != null && this
						.getAbscAbsId().equals(castOther.getAbscAbsId())))
				&& ((this.getAbscSeq() == castOther.getAbscSeq()) || (this
						.getAbscSeq() != null
						&& castOther.getAbscSeq() != null && this.getAbscSeq()
						.equals(castOther.getAbscSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAbscDomain() == null ? 0 : this.getAbscDomain()
						.hashCode());
		result = 37 * result
				+ (getAbscAbsId() == null ? 0 : this.getAbscAbsId().hashCode());
		result = 37 * result
				+ (getAbscSeq() == null ? 0 : this.getAbscSeq().hashCode());
		return result;
	}

}