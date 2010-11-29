package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEmapDetId entity provides the base persistence definition of the
 * EmapDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmapDetId implements java.io.Serializable {

	// Fields

	private Integer emapDocId;
	private Integer emapDocSufx;
	private Integer emapDocLine;
	private String emapDomain;

	// Constructors

	/** default constructor */
	public AbstractEmapDetId() {
	}

	/** minimal constructor */
	public AbstractEmapDetId(String emapDomain) {
		this.emapDomain = emapDomain;
	}

	/** full constructor */
	public AbstractEmapDetId(Integer emapDocId, Integer emapDocSufx,
			Integer emapDocLine, String emapDomain) {
		this.emapDocId = emapDocId;
		this.emapDocSufx = emapDocSufx;
		this.emapDocLine = emapDocLine;
		this.emapDomain = emapDomain;
	}

	// Property accessors

	public Integer getEmapDocId() {
		return this.emapDocId;
	}

	public void setEmapDocId(Integer emapDocId) {
		this.emapDocId = emapDocId;
	}

	public Integer getEmapDocSufx() {
		return this.emapDocSufx;
	}

	public void setEmapDocSufx(Integer emapDocSufx) {
		this.emapDocSufx = emapDocSufx;
	}

	public Integer getEmapDocLine() {
		return this.emapDocLine;
	}

	public void setEmapDocLine(Integer emapDocLine) {
		this.emapDocLine = emapDocLine;
	}

	public String getEmapDomain() {
		return this.emapDomain;
	}

	public void setEmapDomain(String emapDomain) {
		this.emapDomain = emapDomain;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEmapDetId))
			return false;
		AbstractEmapDetId castOther = (AbstractEmapDetId) other;

		return ((this.getEmapDocId() == castOther.getEmapDocId()) || (this
				.getEmapDocId() != null
				&& castOther.getEmapDocId() != null && this.getEmapDocId()
				.equals(castOther.getEmapDocId())))
				&& ((this.getEmapDocSufx() == castOther.getEmapDocSufx()) || (this
						.getEmapDocSufx() != null
						&& castOther.getEmapDocSufx() != null && this
						.getEmapDocSufx().equals(castOther.getEmapDocSufx())))
				&& ((this.getEmapDocLine() == castOther.getEmapDocLine()) || (this
						.getEmapDocLine() != null
						&& castOther.getEmapDocLine() != null && this
						.getEmapDocLine().equals(castOther.getEmapDocLine())))
				&& ((this.getEmapDomain() == castOther.getEmapDomain()) || (this
						.getEmapDomain() != null
						&& castOther.getEmapDomain() != null && this
						.getEmapDomain().equals(castOther.getEmapDomain())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEmapDocId() == null ? 0 : this.getEmapDocId().hashCode());
		result = 37
				* result
				+ (getEmapDocSufx() == null ? 0 : this.getEmapDocSufx()
						.hashCode());
		result = 37
				* result
				+ (getEmapDocLine() == null ? 0 : this.getEmapDocLine()
						.hashCode());
		result = 37
				* result
				+ (getEmapDomain() == null ? 0 : this.getEmapDomain()
						.hashCode());
		return result;
	}

}