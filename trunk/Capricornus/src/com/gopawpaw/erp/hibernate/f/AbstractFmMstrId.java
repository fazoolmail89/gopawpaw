package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFmMstrId entity provides the base persistence definition of the
 * FmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFmMstrId implements java.io.Serializable {

	// Fields

	private String fmDomain;
	private Integer fmFpos;
	private String fmType;
	private Integer fmSumsInto;

	// Constructors

	/** default constructor */
	public AbstractFmMstrId() {
	}

	/** minimal constructor */
	public AbstractFmMstrId(String fmDomain) {
		this.fmDomain = fmDomain;
	}

	/** full constructor */
	public AbstractFmMstrId(String fmDomain, Integer fmFpos, String fmType,
			Integer fmSumsInto) {
		this.fmDomain = fmDomain;
		this.fmFpos = fmFpos;
		this.fmType = fmType;
		this.fmSumsInto = fmSumsInto;
	}

	// Property accessors

	public String getFmDomain() {
		return this.fmDomain;
	}

	public void setFmDomain(String fmDomain) {
		this.fmDomain = fmDomain;
	}

	public Integer getFmFpos() {
		return this.fmFpos;
	}

	public void setFmFpos(Integer fmFpos) {
		this.fmFpos = fmFpos;
	}

	public String getFmType() {
		return this.fmType;
	}

	public void setFmType(String fmType) {
		this.fmType = fmType;
	}

	public Integer getFmSumsInto() {
		return this.fmSumsInto;
	}

	public void setFmSumsInto(Integer fmSumsInto) {
		this.fmSumsInto = fmSumsInto;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFmMstrId))
			return false;
		AbstractFmMstrId castOther = (AbstractFmMstrId) other;

		return ((this.getFmDomain() == castOther.getFmDomain()) || (this
				.getFmDomain() != null
				&& castOther.getFmDomain() != null && this.getFmDomain()
				.equals(castOther.getFmDomain())))
				&& ((this.getFmFpos() == castOther.getFmFpos()) || (this
						.getFmFpos() != null
						&& castOther.getFmFpos() != null && this.getFmFpos()
						.equals(castOther.getFmFpos())))
				&& ((this.getFmType() == castOther.getFmType()) || (this
						.getFmType() != null
						&& castOther.getFmType() != null && this.getFmType()
						.equals(castOther.getFmType())))
				&& ((this.getFmSumsInto() == castOther.getFmSumsInto()) || (this
						.getFmSumsInto() != null
						&& castOther.getFmSumsInto() != null && this
						.getFmSumsInto().equals(castOther.getFmSumsInto())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFmDomain() == null ? 0 : this.getFmDomain().hashCode());
		result = 37 * result
				+ (getFmFpos() == null ? 0 : this.getFmFpos().hashCode());
		result = 37 * result
				+ (getFmType() == null ? 0 : this.getFmType().hashCode());
		result = 37
				* result
				+ (getFmSumsInto() == null ? 0 : this.getFmSumsInto()
						.hashCode());
		return result;
	}

}