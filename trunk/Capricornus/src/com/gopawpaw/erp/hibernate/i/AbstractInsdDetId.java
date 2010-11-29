package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractInsdDetId entity provides the base persistence definition of the
 * InsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractInsdDetId implements java.io.Serializable {

	// Fields

	private String insdDomain;
	private String insdPrjNbr;
	private Integer insdSubNbr;
	private String insdSchedNbr;
	private Integer insdPjsLine;

	// Constructors

	/** default constructor */
	public AbstractInsdDetId() {
	}

	/** full constructor */
	public AbstractInsdDetId(String insdDomain, String insdPrjNbr,
			Integer insdSubNbr, String insdSchedNbr, Integer insdPjsLine) {
		this.insdDomain = insdDomain;
		this.insdPrjNbr = insdPrjNbr;
		this.insdSubNbr = insdSubNbr;
		this.insdSchedNbr = insdSchedNbr;
		this.insdPjsLine = insdPjsLine;
	}

	// Property accessors

	public String getInsdDomain() {
		return this.insdDomain;
	}

	public void setInsdDomain(String insdDomain) {
		this.insdDomain = insdDomain;
	}

	public String getInsdPrjNbr() {
		return this.insdPrjNbr;
	}

	public void setInsdPrjNbr(String insdPrjNbr) {
		this.insdPrjNbr = insdPrjNbr;
	}

	public Integer getInsdSubNbr() {
		return this.insdSubNbr;
	}

	public void setInsdSubNbr(Integer insdSubNbr) {
		this.insdSubNbr = insdSubNbr;
	}

	public String getInsdSchedNbr() {
		return this.insdSchedNbr;
	}

	public void setInsdSchedNbr(String insdSchedNbr) {
		this.insdSchedNbr = insdSchedNbr;
	}

	public Integer getInsdPjsLine() {
		return this.insdPjsLine;
	}

	public void setInsdPjsLine(Integer insdPjsLine) {
		this.insdPjsLine = insdPjsLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractInsdDetId))
			return false;
		AbstractInsdDetId castOther = (AbstractInsdDetId) other;

		return ((this.getInsdDomain() == castOther.getInsdDomain()) || (this
				.getInsdDomain() != null
				&& castOther.getInsdDomain() != null && this.getInsdDomain()
				.equals(castOther.getInsdDomain())))
				&& ((this.getInsdPrjNbr() == castOther.getInsdPrjNbr()) || (this
						.getInsdPrjNbr() != null
						&& castOther.getInsdPrjNbr() != null && this
						.getInsdPrjNbr().equals(castOther.getInsdPrjNbr())))
				&& ((this.getInsdSubNbr() == castOther.getInsdSubNbr()) || (this
						.getInsdSubNbr() != null
						&& castOther.getInsdSubNbr() != null && this
						.getInsdSubNbr().equals(castOther.getInsdSubNbr())))
				&& ((this.getInsdSchedNbr() == castOther.getInsdSchedNbr()) || (this
						.getInsdSchedNbr() != null
						&& castOther.getInsdSchedNbr() != null && this
						.getInsdSchedNbr().equals(castOther.getInsdSchedNbr())))
				&& ((this.getInsdPjsLine() == castOther.getInsdPjsLine()) || (this
						.getInsdPjsLine() != null
						&& castOther.getInsdPjsLine() != null && this
						.getInsdPjsLine().equals(castOther.getInsdPjsLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getInsdDomain() == null ? 0 : this.getInsdDomain()
						.hashCode());
		result = 37
				* result
				+ (getInsdPrjNbr() == null ? 0 : this.getInsdPrjNbr()
						.hashCode());
		result = 37
				* result
				+ (getInsdSubNbr() == null ? 0 : this.getInsdSubNbr()
						.hashCode());
		result = 37
				* result
				+ (getInsdSchedNbr() == null ? 0 : this.getInsdSchedNbr()
						.hashCode());
		result = 37
				* result
				+ (getInsdPjsLine() == null ? 0 : this.getInsdPjsLine()
						.hashCode());
		return result;
	}

}