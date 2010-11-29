package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFamtrdDetId entity provides the base persistence definition of the
 * FamtrdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFamtrdDetId implements java.io.Serializable {

	// Fields

	private String famtrdDomain;
	private String famtrdFamtrId;
	private Integer famtrdSeq;

	// Constructors

	/** default constructor */
	public AbstractFamtrdDetId() {
	}

	/** full constructor */
	public AbstractFamtrdDetId(String famtrdDomain, String famtrdFamtrId,
			Integer famtrdSeq) {
		this.famtrdDomain = famtrdDomain;
		this.famtrdFamtrId = famtrdFamtrId;
		this.famtrdSeq = famtrdSeq;
	}

	// Property accessors

	public String getFamtrdDomain() {
		return this.famtrdDomain;
	}

	public void setFamtrdDomain(String famtrdDomain) {
		this.famtrdDomain = famtrdDomain;
	}

	public String getFamtrdFamtrId() {
		return this.famtrdFamtrId;
	}

	public void setFamtrdFamtrId(String famtrdFamtrId) {
		this.famtrdFamtrId = famtrdFamtrId;
	}

	public Integer getFamtrdSeq() {
		return this.famtrdSeq;
	}

	public void setFamtrdSeq(Integer famtrdSeq) {
		this.famtrdSeq = famtrdSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFamtrdDetId))
			return false;
		AbstractFamtrdDetId castOther = (AbstractFamtrdDetId) other;

		return ((this.getFamtrdDomain() == castOther.getFamtrdDomain()) || (this
				.getFamtrdDomain() != null
				&& castOther.getFamtrdDomain() != null && this
				.getFamtrdDomain().equals(castOther.getFamtrdDomain())))
				&& ((this.getFamtrdFamtrId() == castOther.getFamtrdFamtrId()) || (this
						.getFamtrdFamtrId() != null
						&& castOther.getFamtrdFamtrId() != null && this
						.getFamtrdFamtrId()
						.equals(castOther.getFamtrdFamtrId())))
				&& ((this.getFamtrdSeq() == castOther.getFamtrdSeq()) || (this
						.getFamtrdSeq() != null
						&& castOther.getFamtrdSeq() != null && this
						.getFamtrdSeq().equals(castOther.getFamtrdSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFamtrdDomain() == null ? 0 : this.getFamtrdDomain()
						.hashCode());
		result = 37
				* result
				+ (getFamtrdFamtrId() == null ? 0 : this.getFamtrdFamtrId()
						.hashCode());
		result = 37 * result
				+ (getFamtrdSeq() == null ? 0 : this.getFamtrdSeq().hashCode());
		return result;
	}

}