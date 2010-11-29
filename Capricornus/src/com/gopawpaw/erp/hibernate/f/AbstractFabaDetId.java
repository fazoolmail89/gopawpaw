package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFabaDetId entity provides the base persistence definition of the
 * FabaDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabaDetId implements java.io.Serializable {

	// Fields

	private String fabaDomain;
	private String fabaFaId;
	private String fabaAcctype;
	private Integer fabaGlseq;

	// Constructors

	/** default constructor */
	public AbstractFabaDetId() {
	}

	/** full constructor */
	public AbstractFabaDetId(String fabaDomain, String fabaFaId,
			String fabaAcctype, Integer fabaGlseq) {
		this.fabaDomain = fabaDomain;
		this.fabaFaId = fabaFaId;
		this.fabaAcctype = fabaAcctype;
		this.fabaGlseq = fabaGlseq;
	}

	// Property accessors

	public String getFabaDomain() {
		return this.fabaDomain;
	}

	public void setFabaDomain(String fabaDomain) {
		this.fabaDomain = fabaDomain;
	}

	public String getFabaFaId() {
		return this.fabaFaId;
	}

	public void setFabaFaId(String fabaFaId) {
		this.fabaFaId = fabaFaId;
	}

	public String getFabaAcctype() {
		return this.fabaAcctype;
	}

	public void setFabaAcctype(String fabaAcctype) {
		this.fabaAcctype = fabaAcctype;
	}

	public Integer getFabaGlseq() {
		return this.fabaGlseq;
	}

	public void setFabaGlseq(Integer fabaGlseq) {
		this.fabaGlseq = fabaGlseq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFabaDetId))
			return false;
		AbstractFabaDetId castOther = (AbstractFabaDetId) other;

		return ((this.getFabaDomain() == castOther.getFabaDomain()) || (this
				.getFabaDomain() != null
				&& castOther.getFabaDomain() != null && this.getFabaDomain()
				.equals(castOther.getFabaDomain())))
				&& ((this.getFabaFaId() == castOther.getFabaFaId()) || (this
						.getFabaFaId() != null
						&& castOther.getFabaFaId() != null && this
						.getFabaFaId().equals(castOther.getFabaFaId())))
				&& ((this.getFabaAcctype() == castOther.getFabaAcctype()) || (this
						.getFabaAcctype() != null
						&& castOther.getFabaAcctype() != null && this
						.getFabaAcctype().equals(castOther.getFabaAcctype())))
				&& ((this.getFabaGlseq() == castOther.getFabaGlseq()) || (this
						.getFabaGlseq() != null
						&& castOther.getFabaGlseq() != null && this
						.getFabaGlseq().equals(castOther.getFabaGlseq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFabaDomain() == null ? 0 : this.getFabaDomain()
						.hashCode());
		result = 37 * result
				+ (getFabaFaId() == null ? 0 : this.getFabaFaId().hashCode());
		result = 37
				* result
				+ (getFabaAcctype() == null ? 0 : this.getFabaAcctype()
						.hashCode());
		result = 37 * result
				+ (getFabaGlseq() == null ? 0 : this.getFabaGlseq().hashCode());
		return result;
	}

}