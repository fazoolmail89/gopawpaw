package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTagMstrId entity provides the base persistence definition of the
 * TagMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTagMstrId implements java.io.Serializable {

	// Fields

	private String tagDomain;
	private Integer tagNbr;

	// Constructors

	/** default constructor */
	public AbstractTagMstrId() {
	}

	/** minimal constructor */
	public AbstractTagMstrId(String tagDomain) {
		this.tagDomain = tagDomain;
	}

	/** full constructor */
	public AbstractTagMstrId(String tagDomain, Integer tagNbr) {
		this.tagDomain = tagDomain;
		this.tagNbr = tagNbr;
	}

	// Property accessors

	public String getTagDomain() {
		return this.tagDomain;
	}

	public void setTagDomain(String tagDomain) {
		this.tagDomain = tagDomain;
	}

	public Integer getTagNbr() {
		return this.tagNbr;
	}

	public void setTagNbr(Integer tagNbr) {
		this.tagNbr = tagNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTagMstrId))
			return false;
		AbstractTagMstrId castOther = (AbstractTagMstrId) other;

		return ((this.getTagDomain() == castOther.getTagDomain()) || (this
				.getTagDomain() != null
				&& castOther.getTagDomain() != null && this.getTagDomain()
				.equals(castOther.getTagDomain())))
				&& ((this.getTagNbr() == castOther.getTagNbr()) || (this
						.getTagNbr() != null
						&& castOther.getTagNbr() != null && this.getTagNbr()
						.equals(castOther.getTagNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTagDomain() == null ? 0 : this.getTagDomain().hashCode());
		result = 37 * result
				+ (getTagNbr() == null ? 0 : this.getTagNbr().hashCode());
		return result;
	}

}