package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrcMstrId entity provides the base persistence definition of the
 * GrcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrcMstrId implements java.io.Serializable {

	// Fields

	private String grcDomain;
	private String grcColGroup;

	// Constructors

	/** default constructor */
	public AbstractGrcMstrId() {
	}

	/** minimal constructor */
	public AbstractGrcMstrId(String grcDomain) {
		this.grcDomain = grcDomain;
	}

	/** full constructor */
	public AbstractGrcMstrId(String grcDomain, String grcColGroup) {
		this.grcDomain = grcDomain;
		this.grcColGroup = grcColGroup;
	}

	// Property accessors

	public String getGrcDomain() {
		return this.grcDomain;
	}

	public void setGrcDomain(String grcDomain) {
		this.grcDomain = grcDomain;
	}

	public String getGrcColGroup() {
		return this.grcColGroup;
	}

	public void setGrcColGroup(String grcColGroup) {
		this.grcColGroup = grcColGroup;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrcMstrId))
			return false;
		AbstractGrcMstrId castOther = (AbstractGrcMstrId) other;

		return ((this.getGrcDomain() == castOther.getGrcDomain()) || (this
				.getGrcDomain() != null
				&& castOther.getGrcDomain() != null && this.getGrcDomain()
				.equals(castOther.getGrcDomain())))
				&& ((this.getGrcColGroup() == castOther.getGrcColGroup()) || (this
						.getGrcColGroup() != null
						&& castOther.getGrcColGroup() != null && this
						.getGrcColGroup().equals(castOther.getGrcColGroup())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGrcDomain() == null ? 0 : this.getGrcDomain().hashCode());
		result = 37
				* result
				+ (getGrcColGroup() == null ? 0 : this.getGrcColGroup()
						.hashCode());
		return result;
	}

}