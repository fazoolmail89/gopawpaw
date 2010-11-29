package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrrMstrId entity provides the base persistence definition of the
 * GrrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrrMstrId implements java.io.Serializable {

	// Fields

	private String grrDomain;
	private String grrRowGroup;

	// Constructors

	/** default constructor */
	public AbstractGrrMstrId() {
	}

	/** minimal constructor */
	public AbstractGrrMstrId(String grrDomain) {
		this.grrDomain = grrDomain;
	}

	/** full constructor */
	public AbstractGrrMstrId(String grrDomain, String grrRowGroup) {
		this.grrDomain = grrDomain;
		this.grrRowGroup = grrRowGroup;
	}

	// Property accessors

	public String getGrrDomain() {
		return this.grrDomain;
	}

	public void setGrrDomain(String grrDomain) {
		this.grrDomain = grrDomain;
	}

	public String getGrrRowGroup() {
		return this.grrRowGroup;
	}

	public void setGrrRowGroup(String grrRowGroup) {
		this.grrRowGroup = grrRowGroup;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrrMstrId))
			return false;
		AbstractGrrMstrId castOther = (AbstractGrrMstrId) other;

		return ((this.getGrrDomain() == castOther.getGrrDomain()) || (this
				.getGrrDomain() != null
				&& castOther.getGrrDomain() != null && this.getGrrDomain()
				.equals(castOther.getGrrDomain())))
				&& ((this.getGrrRowGroup() == castOther.getGrrRowGroup()) || (this
						.getGrrRowGroup() != null
						&& castOther.getGrrRowGroup() != null && this
						.getGrrRowGroup().equals(castOther.getGrrRowGroup())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGrrDomain() == null ? 0 : this.getGrrDomain().hashCode());
		result = 37
				* result
				+ (getGrrRowGroup() == null ? 0 : this.getGrrRowGroup()
						.hashCode());
		return result;
	}

}