package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBdldDetId entity provides the base persistence definition of the
 * BdldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBdldDetId implements java.io.Serializable {

	// Fields

	private String bdldDomain;
	private String bdldSource;
	private Integer bdldId;
	private Integer bdldLine;

	// Constructors

	/** default constructor */
	public AbstractBdldDetId() {
	}

	/** minimal constructor */
	public AbstractBdldDetId(String bdldDomain) {
		this.bdldDomain = bdldDomain;
	}

	/** full constructor */
	public AbstractBdldDetId(String bdldDomain, String bdldSource,
			Integer bdldId, Integer bdldLine) {
		this.bdldDomain = bdldDomain;
		this.bdldSource = bdldSource;
		this.bdldId = bdldId;
		this.bdldLine = bdldLine;
	}

	// Property accessors

	public String getBdldDomain() {
		return this.bdldDomain;
	}

	public void setBdldDomain(String bdldDomain) {
		this.bdldDomain = bdldDomain;
	}

	public String getBdldSource() {
		return this.bdldSource;
	}

	public void setBdldSource(String bdldSource) {
		this.bdldSource = bdldSource;
	}

	public Integer getBdldId() {
		return this.bdldId;
	}

	public void setBdldId(Integer bdldId) {
		this.bdldId = bdldId;
	}

	public Integer getBdldLine() {
		return this.bdldLine;
	}

	public void setBdldLine(Integer bdldLine) {
		this.bdldLine = bdldLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBdldDetId))
			return false;
		AbstractBdldDetId castOther = (AbstractBdldDetId) other;

		return ((this.getBdldDomain() == castOther.getBdldDomain()) || (this
				.getBdldDomain() != null
				&& castOther.getBdldDomain() != null && this.getBdldDomain()
				.equals(castOther.getBdldDomain())))
				&& ((this.getBdldSource() == castOther.getBdldSource()) || (this
						.getBdldSource() != null
						&& castOther.getBdldSource() != null && this
						.getBdldSource().equals(castOther.getBdldSource())))
				&& ((this.getBdldId() == castOther.getBdldId()) || (this
						.getBdldId() != null
						&& castOther.getBdldId() != null && this.getBdldId()
						.equals(castOther.getBdldId())))
				&& ((this.getBdldLine() == castOther.getBdldLine()) || (this
						.getBdldLine() != null
						&& castOther.getBdldLine() != null && this
						.getBdldLine().equals(castOther.getBdldLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getBdldDomain() == null ? 0 : this.getBdldDomain()
						.hashCode());
		result = 37
				* result
				+ (getBdldSource() == null ? 0 : this.getBdldSource()
						.hashCode());
		result = 37 * result
				+ (getBdldId() == null ? 0 : this.getBdldId().hashCode());
		result = 37 * result
				+ (getBdldLine() == null ? 0 : this.getBdldLine().hashCode());
		return result;
	}

}