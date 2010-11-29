package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMrpDetId entity provides the base persistence definition of the
 * MrpDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMrpDetId implements java.io.Serializable {

	// Fields

	private String mrpDomain;
	private String mrpDataset;
	private String mrpPart;
	private String mrpNbr;
	private String mrpLine;
	private String mrpLine2;

	// Constructors

	/** default constructor */
	public AbstractMrpDetId() {
	}

	/** minimal constructor */
	public AbstractMrpDetId(String mrpDomain) {
		this.mrpDomain = mrpDomain;
	}

	/** full constructor */
	public AbstractMrpDetId(String mrpDomain, String mrpDataset,
			String mrpPart, String mrpNbr, String mrpLine, String mrpLine2) {
		this.mrpDomain = mrpDomain;
		this.mrpDataset = mrpDataset;
		this.mrpPart = mrpPart;
		this.mrpNbr = mrpNbr;
		this.mrpLine = mrpLine;
		this.mrpLine2 = mrpLine2;
	}

	// Property accessors

	public String getMrpDomain() {
		return this.mrpDomain;
	}

	public void setMrpDomain(String mrpDomain) {
		this.mrpDomain = mrpDomain;
	}

	public String getMrpDataset() {
		return this.mrpDataset;
	}

	public void setMrpDataset(String mrpDataset) {
		this.mrpDataset = mrpDataset;
	}

	public String getMrpPart() {
		return this.mrpPart;
	}

	public void setMrpPart(String mrpPart) {
		this.mrpPart = mrpPart;
	}

	public String getMrpNbr() {
		return this.mrpNbr;
	}

	public void setMrpNbr(String mrpNbr) {
		this.mrpNbr = mrpNbr;
	}

	public String getMrpLine() {
		return this.mrpLine;
	}

	public void setMrpLine(String mrpLine) {
		this.mrpLine = mrpLine;
	}

	public String getMrpLine2() {
		return this.mrpLine2;
	}

	public void setMrpLine2(String mrpLine2) {
		this.mrpLine2 = mrpLine2;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMrpDetId))
			return false;
		AbstractMrpDetId castOther = (AbstractMrpDetId) other;

		return ((this.getMrpDomain() == castOther.getMrpDomain()) || (this
				.getMrpDomain() != null
				&& castOther.getMrpDomain() != null && this.getMrpDomain()
				.equals(castOther.getMrpDomain())))
				&& ((this.getMrpDataset() == castOther.getMrpDataset()) || (this
						.getMrpDataset() != null
						&& castOther.getMrpDataset() != null && this
						.getMrpDataset().equals(castOther.getMrpDataset())))
				&& ((this.getMrpPart() == castOther.getMrpPart()) || (this
						.getMrpPart() != null
						&& castOther.getMrpPart() != null && this.getMrpPart()
						.equals(castOther.getMrpPart())))
				&& ((this.getMrpNbr() == castOther.getMrpNbr()) || (this
						.getMrpNbr() != null
						&& castOther.getMrpNbr() != null && this.getMrpNbr()
						.equals(castOther.getMrpNbr())))
				&& ((this.getMrpLine() == castOther.getMrpLine()) || (this
						.getMrpLine() != null
						&& castOther.getMrpLine() != null && this.getMrpLine()
						.equals(castOther.getMrpLine())))
				&& ((this.getMrpLine2() == castOther.getMrpLine2()) || (this
						.getMrpLine2() != null
						&& castOther.getMrpLine2() != null && this
						.getMrpLine2().equals(castOther.getMrpLine2())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMrpDomain() == null ? 0 : this.getMrpDomain().hashCode());
		result = 37
				* result
				+ (getMrpDataset() == null ? 0 : this.getMrpDataset()
						.hashCode());
		result = 37 * result
				+ (getMrpPart() == null ? 0 : this.getMrpPart().hashCode());
		result = 37 * result
				+ (getMrpNbr() == null ? 0 : this.getMrpNbr().hashCode());
		result = 37 * result
				+ (getMrpLine() == null ? 0 : this.getMrpLine().hashCode());
		result = 37 * result
				+ (getMrpLine2() == null ? 0 : this.getMrpLine2().hashCode());
		return result;
	}

}