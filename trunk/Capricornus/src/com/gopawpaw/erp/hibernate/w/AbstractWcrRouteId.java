package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWcrRouteId entity provides the base persistence definition of the
 * WcrRouteId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWcrRouteId implements java.io.Serializable {

	// Fields

	private String wcrDomain;
	private String wcrWkctr;
	private String wcrMch;
	private String wcrPart;
	private Integer wcrOp;

	// Constructors

	/** default constructor */
	public AbstractWcrRouteId() {
	}

	/** minimal constructor */
	public AbstractWcrRouteId(String wcrDomain) {
		this.wcrDomain = wcrDomain;
	}

	/** full constructor */
	public AbstractWcrRouteId(String wcrDomain, String wcrWkctr, String wcrMch,
			String wcrPart, Integer wcrOp) {
		this.wcrDomain = wcrDomain;
		this.wcrWkctr = wcrWkctr;
		this.wcrMch = wcrMch;
		this.wcrPart = wcrPart;
		this.wcrOp = wcrOp;
	}

	// Property accessors

	public String getWcrDomain() {
		return this.wcrDomain;
	}

	public void setWcrDomain(String wcrDomain) {
		this.wcrDomain = wcrDomain;
	}

	public String getWcrWkctr() {
		return this.wcrWkctr;
	}

	public void setWcrWkctr(String wcrWkctr) {
		this.wcrWkctr = wcrWkctr;
	}

	public String getWcrMch() {
		return this.wcrMch;
	}

	public void setWcrMch(String wcrMch) {
		this.wcrMch = wcrMch;
	}

	public String getWcrPart() {
		return this.wcrPart;
	}

	public void setWcrPart(String wcrPart) {
		this.wcrPart = wcrPart;
	}

	public Integer getWcrOp() {
		return this.wcrOp;
	}

	public void setWcrOp(Integer wcrOp) {
		this.wcrOp = wcrOp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWcrRouteId))
			return false;
		AbstractWcrRouteId castOther = (AbstractWcrRouteId) other;

		return ((this.getWcrDomain() == castOther.getWcrDomain()) || (this
				.getWcrDomain() != null
				&& castOther.getWcrDomain() != null && this.getWcrDomain()
				.equals(castOther.getWcrDomain())))
				&& ((this.getWcrWkctr() == castOther.getWcrWkctr()) || (this
						.getWcrWkctr() != null
						&& castOther.getWcrWkctr() != null && this
						.getWcrWkctr().equals(castOther.getWcrWkctr())))
				&& ((this.getWcrMch() == castOther.getWcrMch()) || (this
						.getWcrMch() != null
						&& castOther.getWcrMch() != null && this.getWcrMch()
						.equals(castOther.getWcrMch())))
				&& ((this.getWcrPart() == castOther.getWcrPart()) || (this
						.getWcrPart() != null
						&& castOther.getWcrPart() != null && this.getWcrPart()
						.equals(castOther.getWcrPart())))
				&& ((this.getWcrOp() == castOther.getWcrOp()) || (this
						.getWcrOp() != null
						&& castOther.getWcrOp() != null && this.getWcrOp()
						.equals(castOther.getWcrOp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWcrDomain() == null ? 0 : this.getWcrDomain().hashCode());
		result = 37 * result
				+ (getWcrWkctr() == null ? 0 : this.getWcrWkctr().hashCode());
		result = 37 * result
				+ (getWcrMch() == null ? 0 : this.getWcrMch().hashCode());
		result = 37 * result
				+ (getWcrPart() == null ? 0 : this.getWcrPart().hashCode());
		result = 37 * result
				+ (getWcrOp() == null ? 0 : this.getWcrOp().hashCode());
		return result;
	}

}