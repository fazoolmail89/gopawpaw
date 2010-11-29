package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSbdDetId entity provides the base persistence definition of the
 * SbdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSbdDetId implements java.io.Serializable {

	// Fields

	private String sbdSub;
	private Integer sbdLine;

	// Constructors

	/** default constructor */
	public AbstractSbdDetId() {
	}

	/** full constructor */
	public AbstractSbdDetId(String sbdSub, Integer sbdLine) {
		this.sbdSub = sbdSub;
		this.sbdLine = sbdLine;
	}

	// Property accessors

	public String getSbdSub() {
		return this.sbdSub;
	}

	public void setSbdSub(String sbdSub) {
		this.sbdSub = sbdSub;
	}

	public Integer getSbdLine() {
		return this.sbdLine;
	}

	public void setSbdLine(Integer sbdLine) {
		this.sbdLine = sbdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSbdDetId))
			return false;
		AbstractSbdDetId castOther = (AbstractSbdDetId) other;

		return ((this.getSbdSub() == castOther.getSbdSub()) || (this
				.getSbdSub() != null
				&& castOther.getSbdSub() != null && this.getSbdSub().equals(
				castOther.getSbdSub())))
				&& ((this.getSbdLine() == castOther.getSbdLine()) || (this
						.getSbdLine() != null
						&& castOther.getSbdLine() != null && this.getSbdLine()
						.equals(castOther.getSbdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSbdSub() == null ? 0 : this.getSbdSub().hashCode());
		result = 37 * result
				+ (getSbdLine() == null ? 0 : this.getSbdLine().hashCode());
		return result;
	}

}