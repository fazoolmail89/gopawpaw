package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTrglDetId entity provides the base persistence definition of the
 * TrglDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrglDetId implements java.io.Serializable {

	// Fields

	private String trglDomain;
	private Integer trglTrnbr;
	private String trglGlRef;
	private Integer trglSequence;

	// Constructors

	/** default constructor */
	public AbstractTrglDetId() {
	}

	/** minimal constructor */
	public AbstractTrglDetId(String trglDomain) {
		this.trglDomain = trglDomain;
	}

	/** full constructor */
	public AbstractTrglDetId(String trglDomain, Integer trglTrnbr,
			String trglGlRef, Integer trglSequence) {
		this.trglDomain = trglDomain;
		this.trglTrnbr = trglTrnbr;
		this.trglGlRef = trglGlRef;
		this.trglSequence = trglSequence;
	}

	// Property accessors

	public String getTrglDomain() {
		return this.trglDomain;
	}

	public void setTrglDomain(String trglDomain) {
		this.trglDomain = trglDomain;
	}

	public Integer getTrglTrnbr() {
		return this.trglTrnbr;
	}

	public void setTrglTrnbr(Integer trglTrnbr) {
		this.trglTrnbr = trglTrnbr;
	}

	public String getTrglGlRef() {
		return this.trglGlRef;
	}

	public void setTrglGlRef(String trglGlRef) {
		this.trglGlRef = trglGlRef;
	}

	public Integer getTrglSequence() {
		return this.trglSequence;
	}

	public void setTrglSequence(Integer trglSequence) {
		this.trglSequence = trglSequence;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTrglDetId))
			return false;
		AbstractTrglDetId castOther = (AbstractTrglDetId) other;

		return ((this.getTrglDomain() == castOther.getTrglDomain()) || (this
				.getTrglDomain() != null
				&& castOther.getTrglDomain() != null && this.getTrglDomain()
				.equals(castOther.getTrglDomain())))
				&& ((this.getTrglTrnbr() == castOther.getTrglTrnbr()) || (this
						.getTrglTrnbr() != null
						&& castOther.getTrglTrnbr() != null && this
						.getTrglTrnbr().equals(castOther.getTrglTrnbr())))
				&& ((this.getTrglGlRef() == castOther.getTrglGlRef()) || (this
						.getTrglGlRef() != null
						&& castOther.getTrglGlRef() != null && this
						.getTrglGlRef().equals(castOther.getTrglGlRef())))
				&& ((this.getTrglSequence() == castOther.getTrglSequence()) || (this
						.getTrglSequence() != null
						&& castOther.getTrglSequence() != null && this
						.getTrglSequence().equals(castOther.getTrglSequence())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTrglDomain() == null ? 0 : this.getTrglDomain()
						.hashCode());
		result = 37 * result
				+ (getTrglTrnbr() == null ? 0 : this.getTrglTrnbr().hashCode());
		result = 37 * result
				+ (getTrglGlRef() == null ? 0 : this.getTrglGlRef().hashCode());
		result = 37
				* result
				+ (getTrglSequence() == null ? 0 : this.getTrglSequence()
						.hashCode());
		return result;
	}

}