package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBdlMstrId entity provides the base persistence definition of the
 * BdlMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBdlMstrId implements java.io.Serializable {

	// Fields

	private String bdlDomain;
	private String bdlSource;
	private Integer bdlId;

	// Constructors

	/** default constructor */
	public AbstractBdlMstrId() {
	}

	/** minimal constructor */
	public AbstractBdlMstrId(String bdlDomain) {
		this.bdlDomain = bdlDomain;
	}

	/** full constructor */
	public AbstractBdlMstrId(String bdlDomain, String bdlSource, Integer bdlId) {
		this.bdlDomain = bdlDomain;
		this.bdlSource = bdlSource;
		this.bdlId = bdlId;
	}

	// Property accessors

	public String getBdlDomain() {
		return this.bdlDomain;
	}

	public void setBdlDomain(String bdlDomain) {
		this.bdlDomain = bdlDomain;
	}

	public String getBdlSource() {
		return this.bdlSource;
	}

	public void setBdlSource(String bdlSource) {
		this.bdlSource = bdlSource;
	}

	public Integer getBdlId() {
		return this.bdlId;
	}

	public void setBdlId(Integer bdlId) {
		this.bdlId = bdlId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBdlMstrId))
			return false;
		AbstractBdlMstrId castOther = (AbstractBdlMstrId) other;

		return ((this.getBdlDomain() == castOther.getBdlDomain()) || (this
				.getBdlDomain() != null
				&& castOther.getBdlDomain() != null && this.getBdlDomain()
				.equals(castOther.getBdlDomain())))
				&& ((this.getBdlSource() == castOther.getBdlSource()) || (this
						.getBdlSource() != null
						&& castOther.getBdlSource() != null && this
						.getBdlSource().equals(castOther.getBdlSource())))
				&& ((this.getBdlId() == castOther.getBdlId()) || (this
						.getBdlId() != null
						&& castOther.getBdlId() != null && this.getBdlId()
						.equals(castOther.getBdlId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBdlDomain() == null ? 0 : this.getBdlDomain().hashCode());
		result = 37 * result
				+ (getBdlSource() == null ? 0 : this.getBdlSource().hashCode());
		result = 37 * result
				+ (getBdlId() == null ? 0 : this.getBdlId().hashCode());
		return result;
	}

}