package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSopDetId entity provides the base persistence definition of the
 * SopDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSopDetId implements java.io.Serializable {

	// Fields

	private String sopDomain;
	private String sopSim;
	private String sopRouting;
	private Integer sopOp;
	private String sopElement;

	// Constructors

	/** default constructor */
	public AbstractSopDetId() {
	}

	/** minimal constructor */
	public AbstractSopDetId(String sopDomain) {
		this.sopDomain = sopDomain;
	}

	/** full constructor */
	public AbstractSopDetId(String sopDomain, String sopSim, String sopRouting,
			Integer sopOp, String sopElement) {
		this.sopDomain = sopDomain;
		this.sopSim = sopSim;
		this.sopRouting = sopRouting;
		this.sopOp = sopOp;
		this.sopElement = sopElement;
	}

	// Property accessors

	public String getSopDomain() {
		return this.sopDomain;
	}

	public void setSopDomain(String sopDomain) {
		this.sopDomain = sopDomain;
	}

	public String getSopSim() {
		return this.sopSim;
	}

	public void setSopSim(String sopSim) {
		this.sopSim = sopSim;
	}

	public String getSopRouting() {
		return this.sopRouting;
	}

	public void setSopRouting(String sopRouting) {
		this.sopRouting = sopRouting;
	}

	public Integer getSopOp() {
		return this.sopOp;
	}

	public void setSopOp(Integer sopOp) {
		this.sopOp = sopOp;
	}

	public String getSopElement() {
		return this.sopElement;
	}

	public void setSopElement(String sopElement) {
		this.sopElement = sopElement;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSopDetId))
			return false;
		AbstractSopDetId castOther = (AbstractSopDetId) other;

		return ((this.getSopDomain() == castOther.getSopDomain()) || (this
				.getSopDomain() != null
				&& castOther.getSopDomain() != null && this.getSopDomain()
				.equals(castOther.getSopDomain())))
				&& ((this.getSopSim() == castOther.getSopSim()) || (this
						.getSopSim() != null
						&& castOther.getSopSim() != null && this.getSopSim()
						.equals(castOther.getSopSim())))
				&& ((this.getSopRouting() == castOther.getSopRouting()) || (this
						.getSopRouting() != null
						&& castOther.getSopRouting() != null && this
						.getSopRouting().equals(castOther.getSopRouting())))
				&& ((this.getSopOp() == castOther.getSopOp()) || (this
						.getSopOp() != null
						&& castOther.getSopOp() != null && this.getSopOp()
						.equals(castOther.getSopOp())))
				&& ((this.getSopElement() == castOther.getSopElement()) || (this
						.getSopElement() != null
						&& castOther.getSopElement() != null && this
						.getSopElement().equals(castOther.getSopElement())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSopDomain() == null ? 0 : this.getSopDomain().hashCode());
		result = 37 * result
				+ (getSopSim() == null ? 0 : this.getSopSim().hashCode());
		result = 37
				* result
				+ (getSopRouting() == null ? 0 : this.getSopRouting()
						.hashCode());
		result = 37 * result
				+ (getSopOp() == null ? 0 : this.getSopOp().hashCode());
		result = 37
				* result
				+ (getSopElement() == null ? 0 : this.getSopElement()
						.hashCode());
		return result;
	}

}