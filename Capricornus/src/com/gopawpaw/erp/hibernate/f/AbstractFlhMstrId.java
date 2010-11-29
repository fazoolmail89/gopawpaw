package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFlhMstrId entity provides the base persistence definition of the
 * FlhMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlhMstrId implements java.io.Serializable {

	// Fields

	private String flhField;
	private String flhCallPgm;

	// Constructors

	/** default constructor */
	public AbstractFlhMstrId() {
	}

	/** full constructor */
	public AbstractFlhMstrId(String flhField, String flhCallPgm) {
		this.flhField = flhField;
		this.flhCallPgm = flhCallPgm;
	}

	// Property accessors

	public String getFlhField() {
		return this.flhField;
	}

	public void setFlhField(String flhField) {
		this.flhField = flhField;
	}

	public String getFlhCallPgm() {
		return this.flhCallPgm;
	}

	public void setFlhCallPgm(String flhCallPgm) {
		this.flhCallPgm = flhCallPgm;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFlhMstrId))
			return false;
		AbstractFlhMstrId castOther = (AbstractFlhMstrId) other;

		return ((this.getFlhField() == castOther.getFlhField()) || (this
				.getFlhField() != null
				&& castOther.getFlhField() != null && this.getFlhField()
				.equals(castOther.getFlhField())))
				&& ((this.getFlhCallPgm() == castOther.getFlhCallPgm()) || (this
						.getFlhCallPgm() != null
						&& castOther.getFlhCallPgm() != null && this
						.getFlhCallPgm().equals(castOther.getFlhCallPgm())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFlhField() == null ? 0 : this.getFlhField().hashCode());
		result = 37
				* result
				+ (getFlhCallPgm() == null ? 0 : this.getFlhCallPgm()
						.hashCode());
		return result;
	}

}