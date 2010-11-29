package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFlpwMstrId entity provides the base persistence definition of the
 * FlpwMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlpwMstrId implements java.io.Serializable {

	// Fields

	private String flpwDomain;
	private String flpwField;
	private String flpwUserid;

	// Constructors

	/** default constructor */
	public AbstractFlpwMstrId() {
	}

	/** minimal constructor */
	public AbstractFlpwMstrId(String flpwDomain) {
		this.flpwDomain = flpwDomain;
	}

	/** full constructor */
	public AbstractFlpwMstrId(String flpwDomain, String flpwField,
			String flpwUserid) {
		this.flpwDomain = flpwDomain;
		this.flpwField = flpwField;
		this.flpwUserid = flpwUserid;
	}

	// Property accessors

	public String getFlpwDomain() {
		return this.flpwDomain;
	}

	public void setFlpwDomain(String flpwDomain) {
		this.flpwDomain = flpwDomain;
	}

	public String getFlpwField() {
		return this.flpwField;
	}

	public void setFlpwField(String flpwField) {
		this.flpwField = flpwField;
	}

	public String getFlpwUserid() {
		return this.flpwUserid;
	}

	public void setFlpwUserid(String flpwUserid) {
		this.flpwUserid = flpwUserid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFlpwMstrId))
			return false;
		AbstractFlpwMstrId castOther = (AbstractFlpwMstrId) other;

		return ((this.getFlpwDomain() == castOther.getFlpwDomain()) || (this
				.getFlpwDomain() != null
				&& castOther.getFlpwDomain() != null && this.getFlpwDomain()
				.equals(castOther.getFlpwDomain())))
				&& ((this.getFlpwField() == castOther.getFlpwField()) || (this
						.getFlpwField() != null
						&& castOther.getFlpwField() != null && this
						.getFlpwField().equals(castOther.getFlpwField())))
				&& ((this.getFlpwUserid() == castOther.getFlpwUserid()) || (this
						.getFlpwUserid() != null
						&& castOther.getFlpwUserid() != null && this
						.getFlpwUserid().equals(castOther.getFlpwUserid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFlpwDomain() == null ? 0 : this.getFlpwDomain()
						.hashCode());
		result = 37 * result
				+ (getFlpwField() == null ? 0 : this.getFlpwField().hashCode());
		result = 37
				* result
				+ (getFlpwUserid() == null ? 0 : this.getFlpwUserid()
						.hashCode());
		return result;
	}

}