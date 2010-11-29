package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIrawDetId entity provides the base persistence definition of the
 * IrawDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIrawDetId implements java.io.Serializable {

	// Fields

	private Integer irawDocId;
	private Integer irawDocLine;
	private String irawDomain;

	// Constructors

	/** default constructor */
	public AbstractIrawDetId() {
	}

	/** minimal constructor */
	public AbstractIrawDetId(String irawDomain) {
		this.irawDomain = irawDomain;
	}

	/** full constructor */
	public AbstractIrawDetId(Integer irawDocId, Integer irawDocLine,
			String irawDomain) {
		this.irawDocId = irawDocId;
		this.irawDocLine = irawDocLine;
		this.irawDomain = irawDomain;
	}

	// Property accessors

	public Integer getIrawDocId() {
		return this.irawDocId;
	}

	public void setIrawDocId(Integer irawDocId) {
		this.irawDocId = irawDocId;
	}

	public Integer getIrawDocLine() {
		return this.irawDocLine;
	}

	public void setIrawDocLine(Integer irawDocLine) {
		this.irawDocLine = irawDocLine;
	}

	public String getIrawDomain() {
		return this.irawDomain;
	}

	public void setIrawDomain(String irawDomain) {
		this.irawDomain = irawDomain;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIrawDetId))
			return false;
		AbstractIrawDetId castOther = (AbstractIrawDetId) other;

		return ((this.getIrawDocId() == castOther.getIrawDocId()) || (this
				.getIrawDocId() != null
				&& castOther.getIrawDocId() != null && this.getIrawDocId()
				.equals(castOther.getIrawDocId())))
				&& ((this.getIrawDocLine() == castOther.getIrawDocLine()) || (this
						.getIrawDocLine() != null
						&& castOther.getIrawDocLine() != null && this
						.getIrawDocLine().equals(castOther.getIrawDocLine())))
				&& ((this.getIrawDomain() == castOther.getIrawDomain()) || (this
						.getIrawDomain() != null
						&& castOther.getIrawDomain() != null && this
						.getIrawDomain().equals(castOther.getIrawDomain())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIrawDocId() == null ? 0 : this.getIrawDocId().hashCode());
		result = 37
				* result
				+ (getIrawDocLine() == null ? 0 : this.getIrawDocLine()
						.hashCode());
		result = 37
				* result
				+ (getIrawDomain() == null ? 0 : this.getIrawDomain()
						.hashCode());
		return result;
	}

}