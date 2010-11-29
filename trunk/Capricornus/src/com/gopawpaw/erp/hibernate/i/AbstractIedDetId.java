package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIedDetId entity provides the base persistence definition of the
 * IedDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIedDetId implements java.io.Serializable {

	// Fields

	private String iedDomain;
	private String iedType;
	private String iedNbr;
	private Integer iedLine;

	// Constructors

	/** default constructor */
	public AbstractIedDetId() {
	}

	/** minimal constructor */
	public AbstractIedDetId(String iedDomain) {
		this.iedDomain = iedDomain;
	}

	/** full constructor */
	public AbstractIedDetId(String iedDomain, String iedType, String iedNbr,
			Integer iedLine) {
		this.iedDomain = iedDomain;
		this.iedType = iedType;
		this.iedNbr = iedNbr;
		this.iedLine = iedLine;
	}

	// Property accessors

	public String getIedDomain() {
		return this.iedDomain;
	}

	public void setIedDomain(String iedDomain) {
		this.iedDomain = iedDomain;
	}

	public String getIedType() {
		return this.iedType;
	}

	public void setIedType(String iedType) {
		this.iedType = iedType;
	}

	public String getIedNbr() {
		return this.iedNbr;
	}

	public void setIedNbr(String iedNbr) {
		this.iedNbr = iedNbr;
	}

	public Integer getIedLine() {
		return this.iedLine;
	}

	public void setIedLine(Integer iedLine) {
		this.iedLine = iedLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIedDetId))
			return false;
		AbstractIedDetId castOther = (AbstractIedDetId) other;

		return ((this.getIedDomain() == castOther.getIedDomain()) || (this
				.getIedDomain() != null
				&& castOther.getIedDomain() != null && this.getIedDomain()
				.equals(castOther.getIedDomain())))
				&& ((this.getIedType() == castOther.getIedType()) || (this
						.getIedType() != null
						&& castOther.getIedType() != null && this.getIedType()
						.equals(castOther.getIedType())))
				&& ((this.getIedNbr() == castOther.getIedNbr()) || (this
						.getIedNbr() != null
						&& castOther.getIedNbr() != null && this.getIedNbr()
						.equals(castOther.getIedNbr())))
				&& ((this.getIedLine() == castOther.getIedLine()) || (this
						.getIedLine() != null
						&& castOther.getIedLine() != null && this.getIedLine()
						.equals(castOther.getIedLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIedDomain() == null ? 0 : this.getIedDomain().hashCode());
		result = 37 * result
				+ (getIedType() == null ? 0 : this.getIedType().hashCode());
		result = 37 * result
				+ (getIedNbr() == null ? 0 : this.getIedNbr().hashCode());
		result = 37 * result
				+ (getIedLine() == null ? 0 : this.getIedLine().hashCode());
		return result;
	}

}