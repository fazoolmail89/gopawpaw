package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCcd2DetId entity provides the base persistence definition of the
 * Ccd2DetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCcd2DetId implements java.io.Serializable {

	// Fields

	private String ccd2Cc;
	private Integer ccd2Line;

	// Constructors

	/** default constructor */
	public AbstractCcd2DetId() {
	}

	/** full constructor */
	public AbstractCcd2DetId(String ccd2Cc, Integer ccd2Line) {
		this.ccd2Cc = ccd2Cc;
		this.ccd2Line = ccd2Line;
	}

	// Property accessors

	public String getCcd2Cc() {
		return this.ccd2Cc;
	}

	public void setCcd2Cc(String ccd2Cc) {
		this.ccd2Cc = ccd2Cc;
	}

	public Integer getCcd2Line() {
		return this.ccd2Line;
	}

	public void setCcd2Line(Integer ccd2Line) {
		this.ccd2Line = ccd2Line;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCcd2DetId))
			return false;
		AbstractCcd2DetId castOther = (AbstractCcd2DetId) other;

		return ((this.getCcd2Cc() == castOther.getCcd2Cc()) || (this
				.getCcd2Cc() != null
				&& castOther.getCcd2Cc() != null && this.getCcd2Cc().equals(
				castOther.getCcd2Cc())))
				&& ((this.getCcd2Line() == castOther.getCcd2Line()) || (this
						.getCcd2Line() != null
						&& castOther.getCcd2Line() != null && this
						.getCcd2Line().equals(castOther.getCcd2Line())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCcd2Cc() == null ? 0 : this.getCcd2Cc().hashCode());
		result = 37 * result
				+ (getCcd2Line() == null ? 0 : this.getCcd2Line().hashCode());
		return result;
	}

}