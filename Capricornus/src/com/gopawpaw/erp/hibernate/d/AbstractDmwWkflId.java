package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDmwWkflId entity provides the base persistence definition of the
 * DmwWkflId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDmwWkflId implements java.io.Serializable {

	// Fields

	private String dmwNbr;
	private String dmwBill;
	private String dmwSel;

	// Constructors

	/** default constructor */
	public AbstractDmwWkflId() {
	}

	/** full constructor */
	public AbstractDmwWkflId(String dmwNbr, String dmwBill, String dmwSel) {
		this.dmwNbr = dmwNbr;
		this.dmwBill = dmwBill;
		this.dmwSel = dmwSel;
	}

	// Property accessors

	public String getDmwNbr() {
		return this.dmwNbr;
	}

	public void setDmwNbr(String dmwNbr) {
		this.dmwNbr = dmwNbr;
	}

	public String getDmwBill() {
		return this.dmwBill;
	}

	public void setDmwBill(String dmwBill) {
		this.dmwBill = dmwBill;
	}

	public String getDmwSel() {
		return this.dmwSel;
	}

	public void setDmwSel(String dmwSel) {
		this.dmwSel = dmwSel;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDmwWkflId))
			return false;
		AbstractDmwWkflId castOther = (AbstractDmwWkflId) other;

		return ((this.getDmwNbr() == castOther.getDmwNbr()) || (this
				.getDmwNbr() != null
				&& castOther.getDmwNbr() != null && this.getDmwNbr().equals(
				castOther.getDmwNbr())))
				&& ((this.getDmwBill() == castOther.getDmwBill()) || (this
						.getDmwBill() != null
						&& castOther.getDmwBill() != null && this.getDmwBill()
						.equals(castOther.getDmwBill())))
				&& ((this.getDmwSel() == castOther.getDmwSel()) || (this
						.getDmwSel() != null
						&& castOther.getDmwSel() != null && this.getDmwSel()
						.equals(castOther.getDmwSel())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDmwNbr() == null ? 0 : this.getDmwNbr().hashCode());
		result = 37 * result
				+ (getDmwBill() == null ? 0 : this.getDmwBill().hashCode());
		result = 37 * result
				+ (getDmwSel() == null ? 0 : this.getDmwSel().hashCode());
		return result;
	}

}