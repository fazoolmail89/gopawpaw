package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlsdMstrId entity provides the base persistence definition of the
 * GlsdMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlsdMstrId implements java.io.Serializable {

	// Fields

	private String glsdDomain;
	private String glsdNbr;
	private Integer glsdSelect;
	private String glsdLang;

	// Constructors

	/** default constructor */
	public AbstractGlsdMstrId() {
	}

	/** full constructor */
	public AbstractGlsdMstrId(String glsdDomain, String glsdNbr,
			Integer glsdSelect, String glsdLang) {
		this.glsdDomain = glsdDomain;
		this.glsdNbr = glsdNbr;
		this.glsdSelect = glsdSelect;
		this.glsdLang = glsdLang;
	}

	// Property accessors

	public String getGlsdDomain() {
		return this.glsdDomain;
	}

	public void setGlsdDomain(String glsdDomain) {
		this.glsdDomain = glsdDomain;
	}

	public String getGlsdNbr() {
		return this.glsdNbr;
	}

	public void setGlsdNbr(String glsdNbr) {
		this.glsdNbr = glsdNbr;
	}

	public Integer getGlsdSelect() {
		return this.glsdSelect;
	}

	public void setGlsdSelect(Integer glsdSelect) {
		this.glsdSelect = glsdSelect;
	}

	public String getGlsdLang() {
		return this.glsdLang;
	}

	public void setGlsdLang(String glsdLang) {
		this.glsdLang = glsdLang;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGlsdMstrId))
			return false;
		AbstractGlsdMstrId castOther = (AbstractGlsdMstrId) other;

		return ((this.getGlsdDomain() == castOther.getGlsdDomain()) || (this
				.getGlsdDomain() != null
				&& castOther.getGlsdDomain() != null && this.getGlsdDomain()
				.equals(castOther.getGlsdDomain())))
				&& ((this.getGlsdNbr() == castOther.getGlsdNbr()) || (this
						.getGlsdNbr() != null
						&& castOther.getGlsdNbr() != null && this.getGlsdNbr()
						.equals(castOther.getGlsdNbr())))
				&& ((this.getGlsdSelect() == castOther.getGlsdSelect()) || (this
						.getGlsdSelect() != null
						&& castOther.getGlsdSelect() != null && this
						.getGlsdSelect().equals(castOther.getGlsdSelect())))
				&& ((this.getGlsdLang() == castOther.getGlsdLang()) || (this
						.getGlsdLang() != null
						&& castOther.getGlsdLang() != null && this
						.getGlsdLang().equals(castOther.getGlsdLang())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGlsdDomain() == null ? 0 : this.getGlsdDomain()
						.hashCode());
		result = 37 * result
				+ (getGlsdNbr() == null ? 0 : this.getGlsdNbr().hashCode());
		result = 37
				* result
				+ (getGlsdSelect() == null ? 0 : this.getGlsdSelect()
						.hashCode());
		result = 37 * result
				+ (getGlsdLang() == null ? 0 : this.getGlsdLang().hashCode());
		return result;
	}

}