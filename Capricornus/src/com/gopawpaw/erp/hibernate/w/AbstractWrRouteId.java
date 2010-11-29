package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWrRouteId entity provides the base persistence definition of the
 * WrRouteId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWrRouteId implements java.io.Serializable {

	// Fields

	private String wrDomain;
	private String wrNbr;
	private String wrLot;
	private Integer wrOp;

	// Constructors

	/** default constructor */
	public AbstractWrRouteId() {
	}

	/** minimal constructor */
	public AbstractWrRouteId(String wrDomain, String wrNbr, Integer wrOp) {
		this.wrDomain = wrDomain;
		this.wrNbr = wrNbr;
		this.wrOp = wrOp;
	}

	/** full constructor */
	public AbstractWrRouteId(String wrDomain, String wrNbr, String wrLot,
			Integer wrOp) {
		this.wrDomain = wrDomain;
		this.wrNbr = wrNbr;
		this.wrLot = wrLot;
		this.wrOp = wrOp;
	}

	// Property accessors

	public String getWrDomain() {
		return this.wrDomain;
	}

	public void setWrDomain(String wrDomain) {
		this.wrDomain = wrDomain;
	}

	public String getWrNbr() {
		return this.wrNbr;
	}

	public void setWrNbr(String wrNbr) {
		this.wrNbr = wrNbr;
	}

	public String getWrLot() {
		return this.wrLot;
	}

	public void setWrLot(String wrLot) {
		this.wrLot = wrLot;
	}

	public Integer getWrOp() {
		return this.wrOp;
	}

	public void setWrOp(Integer wrOp) {
		this.wrOp = wrOp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWrRouteId))
			return false;
		AbstractWrRouteId castOther = (AbstractWrRouteId) other;

		return ((this.getWrDomain() == castOther.getWrDomain()) || (this
				.getWrDomain() != null
				&& castOther.getWrDomain() != null && this.getWrDomain()
				.equals(castOther.getWrDomain())))
				&& ((this.getWrNbr() == castOther.getWrNbr()) || (this
						.getWrNbr() != null
						&& castOther.getWrNbr() != null && this.getWrNbr()
						.equals(castOther.getWrNbr())))
				&& ((this.getWrLot() == castOther.getWrLot()) || (this
						.getWrLot() != null
						&& castOther.getWrLot() != null && this.getWrLot()
						.equals(castOther.getWrLot())))
				&& ((this.getWrOp() == castOther.getWrOp()) || (this.getWrOp() != null
						&& castOther.getWrOp() != null && this.getWrOp()
						.equals(castOther.getWrOp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWrDomain() == null ? 0 : this.getWrDomain().hashCode());
		result = 37 * result
				+ (getWrNbr() == null ? 0 : this.getWrNbr().hashCode());
		result = 37 * result
				+ (getWrLot() == null ? 0 : this.getWrLot().hashCode());
		result = 37 * result
				+ (getWrOp() == null ? 0 : this.getWrOp().hashCode());
		return result;
	}

}