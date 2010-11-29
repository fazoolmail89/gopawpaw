package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWlMstrId entity provides the base persistence definition of the
 * WlMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWlMstrId implements java.io.Serializable {

	// Fields

	private String wlDomain;
	private String wlProdbyId;
	private Integer wlProdbyOp;
	private String wlLotser;

	// Constructors

	/** default constructor */
	public AbstractWlMstrId() {
	}

	/** minimal constructor */
	public AbstractWlMstrId(String wlDomain, Integer wlProdbyOp) {
		this.wlDomain = wlDomain;
		this.wlProdbyOp = wlProdbyOp;
	}

	/** full constructor */
	public AbstractWlMstrId(String wlDomain, String wlProdbyId,
			Integer wlProdbyOp, String wlLotser) {
		this.wlDomain = wlDomain;
		this.wlProdbyId = wlProdbyId;
		this.wlProdbyOp = wlProdbyOp;
		this.wlLotser = wlLotser;
	}

	// Property accessors

	public String getWlDomain() {
		return this.wlDomain;
	}

	public void setWlDomain(String wlDomain) {
		this.wlDomain = wlDomain;
	}

	public String getWlProdbyId() {
		return this.wlProdbyId;
	}

	public void setWlProdbyId(String wlProdbyId) {
		this.wlProdbyId = wlProdbyId;
	}

	public Integer getWlProdbyOp() {
		return this.wlProdbyOp;
	}

	public void setWlProdbyOp(Integer wlProdbyOp) {
		this.wlProdbyOp = wlProdbyOp;
	}

	public String getWlLotser() {
		return this.wlLotser;
	}

	public void setWlLotser(String wlLotser) {
		this.wlLotser = wlLotser;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWlMstrId))
			return false;
		AbstractWlMstrId castOther = (AbstractWlMstrId) other;

		return ((this.getWlDomain() == castOther.getWlDomain()) || (this
				.getWlDomain() != null
				&& castOther.getWlDomain() != null && this.getWlDomain()
				.equals(castOther.getWlDomain())))
				&& ((this.getWlProdbyId() == castOther.getWlProdbyId()) || (this
						.getWlProdbyId() != null
						&& castOther.getWlProdbyId() != null && this
						.getWlProdbyId().equals(castOther.getWlProdbyId())))
				&& ((this.getWlProdbyOp() == castOther.getWlProdbyOp()) || (this
						.getWlProdbyOp() != null
						&& castOther.getWlProdbyOp() != null && this
						.getWlProdbyOp().equals(castOther.getWlProdbyOp())))
				&& ((this.getWlLotser() == castOther.getWlLotser()) || (this
						.getWlLotser() != null
						&& castOther.getWlLotser() != null && this
						.getWlLotser().equals(castOther.getWlLotser())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWlDomain() == null ? 0 : this.getWlDomain().hashCode());
		result = 37
				* result
				+ (getWlProdbyId() == null ? 0 : this.getWlProdbyId()
						.hashCode());
		result = 37
				* result
				+ (getWlProdbyOp() == null ? 0 : this.getWlProdbyOp()
						.hashCode());
		result = 37 * result
				+ (getWlLotser() == null ? 0 : this.getWlLotser().hashCode());
		return result;
	}

}