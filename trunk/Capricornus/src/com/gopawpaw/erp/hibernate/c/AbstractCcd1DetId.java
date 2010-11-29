package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCcd1DetId entity provides the base persistence definition of the
 * Ccd1DetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCcd1DetId implements java.io.Serializable {

	// Fields

	private String ccd1Cc;
	private Integer ccd1Line;

	// Constructors

	/** default constructor */
	public AbstractCcd1DetId() {
	}

	/** full constructor */
	public AbstractCcd1DetId(String ccd1Cc, Integer ccd1Line) {
		this.ccd1Cc = ccd1Cc;
		this.ccd1Line = ccd1Line;
	}

	// Property accessors

	public String getCcd1Cc() {
		return this.ccd1Cc;
	}

	public void setCcd1Cc(String ccd1Cc) {
		this.ccd1Cc = ccd1Cc;
	}

	public Integer getCcd1Line() {
		return this.ccd1Line;
	}

	public void setCcd1Line(Integer ccd1Line) {
		this.ccd1Line = ccd1Line;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCcd1DetId))
			return false;
		AbstractCcd1DetId castOther = (AbstractCcd1DetId) other;

		return ((this.getCcd1Cc() == castOther.getCcd1Cc()) || (this
				.getCcd1Cc() != null
				&& castOther.getCcd1Cc() != null && this.getCcd1Cc().equals(
				castOther.getCcd1Cc())))
				&& ((this.getCcd1Line() == castOther.getCcd1Line()) || (this
						.getCcd1Line() != null
						&& castOther.getCcd1Line() != null && this
						.getCcd1Line().equals(castOther.getCcd1Line())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCcd1Cc() == null ? 0 : this.getCcd1Cc().hashCode());
		result = 37 * result
				+ (getCcd1Line() == null ? 0 : this.getCcd1Line().hashCode());
		return result;
	}

}