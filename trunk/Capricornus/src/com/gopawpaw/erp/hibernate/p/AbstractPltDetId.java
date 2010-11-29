package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPltDetId entity provides the base persistence definition of the
 * PltDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPltDetId implements java.io.Serializable {

	// Fields

	private String pltDomain;
	private String pltProdLine;
	private String pltTaxType;

	// Constructors

	/** default constructor */
	public AbstractPltDetId() {
	}

	/** minimal constructor */
	public AbstractPltDetId(String pltDomain) {
		this.pltDomain = pltDomain;
	}

	/** full constructor */
	public AbstractPltDetId(String pltDomain, String pltProdLine,
			String pltTaxType) {
		this.pltDomain = pltDomain;
		this.pltProdLine = pltProdLine;
		this.pltTaxType = pltTaxType;
	}

	// Property accessors

	public String getPltDomain() {
		return this.pltDomain;
	}

	public void setPltDomain(String pltDomain) {
		this.pltDomain = pltDomain;
	}

	public String getPltProdLine() {
		return this.pltProdLine;
	}

	public void setPltProdLine(String pltProdLine) {
		this.pltProdLine = pltProdLine;
	}

	public String getPltTaxType() {
		return this.pltTaxType;
	}

	public void setPltTaxType(String pltTaxType) {
		this.pltTaxType = pltTaxType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPltDetId))
			return false;
		AbstractPltDetId castOther = (AbstractPltDetId) other;

		return ((this.getPltDomain() == castOther.getPltDomain()) || (this
				.getPltDomain() != null
				&& castOther.getPltDomain() != null && this.getPltDomain()
				.equals(castOther.getPltDomain())))
				&& ((this.getPltProdLine() == castOther.getPltProdLine()) || (this
						.getPltProdLine() != null
						&& castOther.getPltProdLine() != null && this
						.getPltProdLine().equals(castOther.getPltProdLine())))
				&& ((this.getPltTaxType() == castOther.getPltTaxType()) || (this
						.getPltTaxType() != null
						&& castOther.getPltTaxType() != null && this
						.getPltTaxType().equals(castOther.getPltTaxType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPltDomain() == null ? 0 : this.getPltDomain().hashCode());
		result = 37
				* result
				+ (getPltProdLine() == null ? 0 : this.getPltProdLine()
						.hashCode());
		result = 37
				* result
				+ (getPltTaxType() == null ? 0 : this.getPltTaxType()
						.hashCode());
		return result;
	}

}