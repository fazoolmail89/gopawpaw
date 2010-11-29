package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRoDetId entity provides the base persistence definition of the
 * RoDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRoDetId implements java.io.Serializable {

	// Fields

	private String roDomain;
	private String roRouting;
	private Integer roOp;
	private Date roStart;

	// Constructors

	/** default constructor */
	public AbstractRoDetId() {
	}

	/** minimal constructor */
	public AbstractRoDetId(String roDomain, String roRouting, Integer roOp) {
		this.roDomain = roDomain;
		this.roRouting = roRouting;
		this.roOp = roOp;
	}

	/** full constructor */
	public AbstractRoDetId(String roDomain, String roRouting, Integer roOp,
			Date roStart) {
		this.roDomain = roDomain;
		this.roRouting = roRouting;
		this.roOp = roOp;
		this.roStart = roStart;
	}

	// Property accessors

	public String getRoDomain() {
		return this.roDomain;
	}

	public void setRoDomain(String roDomain) {
		this.roDomain = roDomain;
	}

	public String getRoRouting() {
		return this.roRouting;
	}

	public void setRoRouting(String roRouting) {
		this.roRouting = roRouting;
	}

	public Integer getRoOp() {
		return this.roOp;
	}

	public void setRoOp(Integer roOp) {
		this.roOp = roOp;
	}

	public Date getRoStart() {
		return this.roStart;
	}

	public void setRoStart(Date roStart) {
		this.roStart = roStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRoDetId))
			return false;
		AbstractRoDetId castOther = (AbstractRoDetId) other;

		return ((this.getRoDomain() == castOther.getRoDomain()) || (this
				.getRoDomain() != null
				&& castOther.getRoDomain() != null && this.getRoDomain()
				.equals(castOther.getRoDomain())))
				&& ((this.getRoRouting() == castOther.getRoRouting()) || (this
						.getRoRouting() != null
						&& castOther.getRoRouting() != null && this
						.getRoRouting().equals(castOther.getRoRouting())))
				&& ((this.getRoOp() == castOther.getRoOp()) || (this.getRoOp() != null
						&& castOther.getRoOp() != null && this.getRoOp()
						.equals(castOther.getRoOp())))
				&& ((this.getRoStart() == castOther.getRoStart()) || (this
						.getRoStart() != null
						&& castOther.getRoStart() != null && this.getRoStart()
						.equals(castOther.getRoStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRoDomain() == null ? 0 : this.getRoDomain().hashCode());
		result = 37 * result
				+ (getRoRouting() == null ? 0 : this.getRoRouting().hashCode());
		result = 37 * result
				+ (getRoOp() == null ? 0 : this.getRoOp().hashCode());
		result = 37 * result
				+ (getRoStart() == null ? 0 : this.getRoStart().hashCode());
		return result;
	}

}