package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTzoMstrId entity provides the base persistence definition of the
 * TzoMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTzoMstrId implements java.io.Serializable {

	// Fields

	private String tzoLabel;
	private String tzoArea;

	// Constructors

	/** default constructor */
	public AbstractTzoMstrId() {
	}

	/** full constructor */
	public AbstractTzoMstrId(String tzoLabel, String tzoArea) {
		this.tzoLabel = tzoLabel;
		this.tzoArea = tzoArea;
	}

	// Property accessors

	public String getTzoLabel() {
		return this.tzoLabel;
	}

	public void setTzoLabel(String tzoLabel) {
		this.tzoLabel = tzoLabel;
	}

	public String getTzoArea() {
		return this.tzoArea;
	}

	public void setTzoArea(String tzoArea) {
		this.tzoArea = tzoArea;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTzoMstrId))
			return false;
		AbstractTzoMstrId castOther = (AbstractTzoMstrId) other;

		return ((this.getTzoLabel() == castOther.getTzoLabel()) || (this
				.getTzoLabel() != null
				&& castOther.getTzoLabel() != null && this.getTzoLabel()
				.equals(castOther.getTzoLabel())))
				&& ((this.getTzoArea() == castOther.getTzoArea()) || (this
						.getTzoArea() != null
						&& castOther.getTzoArea() != null && this.getTzoArea()
						.equals(castOther.getTzoArea())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTzoLabel() == null ? 0 : this.getTzoLabel().hashCode());
		result = 37 * result
				+ (getTzoArea() == null ? 0 : this.getTzoArea().hashCode());
		return result;
	}

}