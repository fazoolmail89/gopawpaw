package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractErawDetId entity provides the base persistence definition of the
 * ErawDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractErawDetId implements java.io.Serializable {

	// Fields

	private Integer erawDocId;
	private Integer erawDocLine;
	private String erawDomain;

	// Constructors

	/** default constructor */
	public AbstractErawDetId() {
	}

	/** minimal constructor */
	public AbstractErawDetId(String erawDomain) {
		this.erawDomain = erawDomain;
	}

	/** full constructor */
	public AbstractErawDetId(Integer erawDocId, Integer erawDocLine,
			String erawDomain) {
		this.erawDocId = erawDocId;
		this.erawDocLine = erawDocLine;
		this.erawDomain = erawDomain;
	}

	// Property accessors

	public Integer getErawDocId() {
		return this.erawDocId;
	}

	public void setErawDocId(Integer erawDocId) {
		this.erawDocId = erawDocId;
	}

	public Integer getErawDocLine() {
		return this.erawDocLine;
	}

	public void setErawDocLine(Integer erawDocLine) {
		this.erawDocLine = erawDocLine;
	}

	public String getErawDomain() {
		return this.erawDomain;
	}

	public void setErawDomain(String erawDomain) {
		this.erawDomain = erawDomain;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractErawDetId))
			return false;
		AbstractErawDetId castOther = (AbstractErawDetId) other;

		return ((this.getErawDocId() == castOther.getErawDocId()) || (this
				.getErawDocId() != null
				&& castOther.getErawDocId() != null && this.getErawDocId()
				.equals(castOther.getErawDocId())))
				&& ((this.getErawDocLine() == castOther.getErawDocLine()) || (this
						.getErawDocLine() != null
						&& castOther.getErawDocLine() != null && this
						.getErawDocLine().equals(castOther.getErawDocLine())))
				&& ((this.getErawDomain() == castOther.getErawDomain()) || (this
						.getErawDomain() != null
						&& castOther.getErawDomain() != null && this
						.getErawDomain().equals(castOther.getErawDomain())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getErawDocId() == null ? 0 : this.getErawDocId().hashCode());
		result = 37
				* result
				+ (getErawDocLine() == null ? 0 : this.getErawDocLine()
						.hashCode());
		result = 37
				* result
				+ (getErawDomain() == null ? 0 : this.getErawDomain()
						.hashCode());
		return result;
	}

}