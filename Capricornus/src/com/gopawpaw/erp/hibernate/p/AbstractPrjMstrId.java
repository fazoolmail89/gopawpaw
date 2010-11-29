package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPrjMstrId entity provides the base persistence definition of the
 * PrjMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPrjMstrId implements java.io.Serializable {

	// Fields

	private String prjDomain;
	private String prjNbr;

	// Constructors

	/** default constructor */
	public AbstractPrjMstrId() {
	}

	/** full constructor */
	public AbstractPrjMstrId(String prjDomain, String prjNbr) {
		this.prjDomain = prjDomain;
		this.prjNbr = prjNbr;
	}

	// Property accessors

	public String getPrjDomain() {
		return this.prjDomain;
	}

	public void setPrjDomain(String prjDomain) {
		this.prjDomain = prjDomain;
	}

	public String getPrjNbr() {
		return this.prjNbr;
	}

	public void setPrjNbr(String prjNbr) {
		this.prjNbr = prjNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPrjMstrId))
			return false;
		AbstractPrjMstrId castOther = (AbstractPrjMstrId) other;

		return ((this.getPrjDomain() == castOther.getPrjDomain()) || (this
				.getPrjDomain() != null
				&& castOther.getPrjDomain() != null && this.getPrjDomain()
				.equals(castOther.getPrjDomain())))
				&& ((this.getPrjNbr() == castOther.getPrjNbr()) || (this
						.getPrjNbr() != null
						&& castOther.getPrjNbr() != null && this.getPrjNbr()
						.equals(castOther.getPrjNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPrjDomain() == null ? 0 : this.getPrjDomain().hashCode());
		result = 37 * result
				+ (getPrjNbr() == null ? 0 : this.getPrjNbr().hashCode());
		return result;
	}

}