package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractArsdDetId entity provides the base persistence definition of the
 * ArsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArsdDetId implements java.io.Serializable {

	// Fields

	private String arsdDomain;
	private String arsdBatch;
	private Integer arsdLine;
	private String arsdNbr;

	// Constructors

	/** default constructor */
	public AbstractArsdDetId() {
	}

	/** full constructor */
	public AbstractArsdDetId(String arsdDomain, String arsdBatch,
			Integer arsdLine, String arsdNbr) {
		this.arsdDomain = arsdDomain;
		this.arsdBatch = arsdBatch;
		this.arsdLine = arsdLine;
		this.arsdNbr = arsdNbr;
	}

	// Property accessors

	public String getArsdDomain() {
		return this.arsdDomain;
	}

	public void setArsdDomain(String arsdDomain) {
		this.arsdDomain = arsdDomain;
	}

	public String getArsdBatch() {
		return this.arsdBatch;
	}

	public void setArsdBatch(String arsdBatch) {
		this.arsdBatch = arsdBatch;
	}

	public Integer getArsdLine() {
		return this.arsdLine;
	}

	public void setArsdLine(Integer arsdLine) {
		this.arsdLine = arsdLine;
	}

	public String getArsdNbr() {
		return this.arsdNbr;
	}

	public void setArsdNbr(String arsdNbr) {
		this.arsdNbr = arsdNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractArsdDetId))
			return false;
		AbstractArsdDetId castOther = (AbstractArsdDetId) other;

		return ((this.getArsdDomain() == castOther.getArsdDomain()) || (this
				.getArsdDomain() != null
				&& castOther.getArsdDomain() != null && this.getArsdDomain()
				.equals(castOther.getArsdDomain())))
				&& ((this.getArsdBatch() == castOther.getArsdBatch()) || (this
						.getArsdBatch() != null
						&& castOther.getArsdBatch() != null && this
						.getArsdBatch().equals(castOther.getArsdBatch())))
				&& ((this.getArsdLine() == castOther.getArsdLine()) || (this
						.getArsdLine() != null
						&& castOther.getArsdLine() != null && this
						.getArsdLine().equals(castOther.getArsdLine())))
				&& ((this.getArsdNbr() == castOther.getArsdNbr()) || (this
						.getArsdNbr() != null
						&& castOther.getArsdNbr() != null && this.getArsdNbr()
						.equals(castOther.getArsdNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getArsdDomain() == null ? 0 : this.getArsdDomain()
						.hashCode());
		result = 37 * result
				+ (getArsdBatch() == null ? 0 : this.getArsdBatch().hashCode());
		result = 37 * result
				+ (getArsdLine() == null ? 0 : this.getArsdLine().hashCode());
		result = 37 * result
				+ (getArsdNbr() == null ? 0 : this.getArsdNbr().hashCode());
		return result;
	}

}