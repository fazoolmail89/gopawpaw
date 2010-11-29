package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlrdDetId entity provides the base persistence definition of the
 * GlrdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlrdDetId implements java.io.Serializable {

	// Fields

	private String glrdDomain;
	private String glrdCode;
	private Integer glrdFpos;
	private Integer glrdLine;

	// Constructors

	/** default constructor */
	public AbstractGlrdDetId() {
	}

	/** minimal constructor */
	public AbstractGlrdDetId(String glrdDomain) {
		this.glrdDomain = glrdDomain;
	}

	/** full constructor */
	public AbstractGlrdDetId(String glrdDomain, String glrdCode,
			Integer glrdFpos, Integer glrdLine) {
		this.glrdDomain = glrdDomain;
		this.glrdCode = glrdCode;
		this.glrdFpos = glrdFpos;
		this.glrdLine = glrdLine;
	}

	// Property accessors

	public String getGlrdDomain() {
		return this.glrdDomain;
	}

	public void setGlrdDomain(String glrdDomain) {
		this.glrdDomain = glrdDomain;
	}

	public String getGlrdCode() {
		return this.glrdCode;
	}

	public void setGlrdCode(String glrdCode) {
		this.glrdCode = glrdCode;
	}

	public Integer getGlrdFpos() {
		return this.glrdFpos;
	}

	public void setGlrdFpos(Integer glrdFpos) {
		this.glrdFpos = glrdFpos;
	}

	public Integer getGlrdLine() {
		return this.glrdLine;
	}

	public void setGlrdLine(Integer glrdLine) {
		this.glrdLine = glrdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGlrdDetId))
			return false;
		AbstractGlrdDetId castOther = (AbstractGlrdDetId) other;

		return ((this.getGlrdDomain() == castOther.getGlrdDomain()) || (this
				.getGlrdDomain() != null
				&& castOther.getGlrdDomain() != null && this.getGlrdDomain()
				.equals(castOther.getGlrdDomain())))
				&& ((this.getGlrdCode() == castOther.getGlrdCode()) || (this
						.getGlrdCode() != null
						&& castOther.getGlrdCode() != null && this
						.getGlrdCode().equals(castOther.getGlrdCode())))
				&& ((this.getGlrdFpos() == castOther.getGlrdFpos()) || (this
						.getGlrdFpos() != null
						&& castOther.getGlrdFpos() != null && this
						.getGlrdFpos().equals(castOther.getGlrdFpos())))
				&& ((this.getGlrdLine() == castOther.getGlrdLine()) || (this
						.getGlrdLine() != null
						&& castOther.getGlrdLine() != null && this
						.getGlrdLine().equals(castOther.getGlrdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGlrdDomain() == null ? 0 : this.getGlrdDomain()
						.hashCode());
		result = 37 * result
				+ (getGlrdCode() == null ? 0 : this.getGlrdCode().hashCode());
		result = 37 * result
				+ (getGlrdFpos() == null ? 0 : this.getGlrdFpos().hashCode());
		result = 37 * result
				+ (getGlrdLine() == null ? 0 : this.getGlrdLine().hashCode());
		return result;
	}

}