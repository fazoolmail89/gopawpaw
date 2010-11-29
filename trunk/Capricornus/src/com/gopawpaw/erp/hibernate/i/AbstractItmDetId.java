package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractItmDetId entity provides the base persistence definition of the
 * ItmDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractItmDetId implements java.io.Serializable {

	// Fields

	private String itmDomain;
	private String itmNbr;
	private String itmPrefix;
	private String itmType;
	private Integer itmItmLine;
	private Integer itmLine;

	// Constructors

	/** default constructor */
	public AbstractItmDetId() {
	}

	/** minimal constructor */
	public AbstractItmDetId(String itmDomain) {
		this.itmDomain = itmDomain;
	}

	/** full constructor */
	public AbstractItmDetId(String itmDomain, String itmNbr, String itmPrefix,
			String itmType, Integer itmItmLine, Integer itmLine) {
		this.itmDomain = itmDomain;
		this.itmNbr = itmNbr;
		this.itmPrefix = itmPrefix;
		this.itmType = itmType;
		this.itmItmLine = itmItmLine;
		this.itmLine = itmLine;
	}

	// Property accessors

	public String getItmDomain() {
		return this.itmDomain;
	}

	public void setItmDomain(String itmDomain) {
		this.itmDomain = itmDomain;
	}

	public String getItmNbr() {
		return this.itmNbr;
	}

	public void setItmNbr(String itmNbr) {
		this.itmNbr = itmNbr;
	}

	public String getItmPrefix() {
		return this.itmPrefix;
	}

	public void setItmPrefix(String itmPrefix) {
		this.itmPrefix = itmPrefix;
	}

	public String getItmType() {
		return this.itmType;
	}

	public void setItmType(String itmType) {
		this.itmType = itmType;
	}

	public Integer getItmItmLine() {
		return this.itmItmLine;
	}

	public void setItmItmLine(Integer itmItmLine) {
		this.itmItmLine = itmItmLine;
	}

	public Integer getItmLine() {
		return this.itmLine;
	}

	public void setItmLine(Integer itmLine) {
		this.itmLine = itmLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractItmDetId))
			return false;
		AbstractItmDetId castOther = (AbstractItmDetId) other;

		return ((this.getItmDomain() == castOther.getItmDomain()) || (this
				.getItmDomain() != null
				&& castOther.getItmDomain() != null && this.getItmDomain()
				.equals(castOther.getItmDomain())))
				&& ((this.getItmNbr() == castOther.getItmNbr()) || (this
						.getItmNbr() != null
						&& castOther.getItmNbr() != null && this.getItmNbr()
						.equals(castOther.getItmNbr())))
				&& ((this.getItmPrefix() == castOther.getItmPrefix()) || (this
						.getItmPrefix() != null
						&& castOther.getItmPrefix() != null && this
						.getItmPrefix().equals(castOther.getItmPrefix())))
				&& ((this.getItmType() == castOther.getItmType()) || (this
						.getItmType() != null
						&& castOther.getItmType() != null && this.getItmType()
						.equals(castOther.getItmType())))
				&& ((this.getItmItmLine() == castOther.getItmItmLine()) || (this
						.getItmItmLine() != null
						&& castOther.getItmItmLine() != null && this
						.getItmItmLine().equals(castOther.getItmItmLine())))
				&& ((this.getItmLine() == castOther.getItmLine()) || (this
						.getItmLine() != null
						&& castOther.getItmLine() != null && this.getItmLine()
						.equals(castOther.getItmLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getItmDomain() == null ? 0 : this.getItmDomain().hashCode());
		result = 37 * result
				+ (getItmNbr() == null ? 0 : this.getItmNbr().hashCode());
		result = 37 * result
				+ (getItmPrefix() == null ? 0 : this.getItmPrefix().hashCode());
		result = 37 * result
				+ (getItmType() == null ? 0 : this.getItmType().hashCode());
		result = 37
				* result
				+ (getItmItmLine() == null ? 0 : this.getItmItmLine()
						.hashCode());
		result = 37 * result
				+ (getItmLine() == null ? 0 : this.getItmLine().hashCode());
		return result;
	}

}