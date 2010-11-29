package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIbhHistId entity provides the base persistence definition of the
 * IbhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIbhHistId implements java.io.Serializable {

	// Fields

	private String ibhDomain;
	private String ibhInvNbr;
	private String ibhNbr;
	private Integer ibhLine;
	private String ibhFeature;
	private String ibhPart;

	// Constructors

	/** default constructor */
	public AbstractIbhHistId() {
	}

	/** minimal constructor */
	public AbstractIbhHistId(String ibhDomain) {
		this.ibhDomain = ibhDomain;
	}

	/** full constructor */
	public AbstractIbhHistId(String ibhDomain, String ibhInvNbr, String ibhNbr,
			Integer ibhLine, String ibhFeature, String ibhPart) {
		this.ibhDomain = ibhDomain;
		this.ibhInvNbr = ibhInvNbr;
		this.ibhNbr = ibhNbr;
		this.ibhLine = ibhLine;
		this.ibhFeature = ibhFeature;
		this.ibhPart = ibhPart;
	}

	// Property accessors

	public String getIbhDomain() {
		return this.ibhDomain;
	}

	public void setIbhDomain(String ibhDomain) {
		this.ibhDomain = ibhDomain;
	}

	public String getIbhInvNbr() {
		return this.ibhInvNbr;
	}

	public void setIbhInvNbr(String ibhInvNbr) {
		this.ibhInvNbr = ibhInvNbr;
	}

	public String getIbhNbr() {
		return this.ibhNbr;
	}

	public void setIbhNbr(String ibhNbr) {
		this.ibhNbr = ibhNbr;
	}

	public Integer getIbhLine() {
		return this.ibhLine;
	}

	public void setIbhLine(Integer ibhLine) {
		this.ibhLine = ibhLine;
	}

	public String getIbhFeature() {
		return this.ibhFeature;
	}

	public void setIbhFeature(String ibhFeature) {
		this.ibhFeature = ibhFeature;
	}

	public String getIbhPart() {
		return this.ibhPart;
	}

	public void setIbhPart(String ibhPart) {
		this.ibhPart = ibhPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIbhHistId))
			return false;
		AbstractIbhHistId castOther = (AbstractIbhHistId) other;

		return ((this.getIbhDomain() == castOther.getIbhDomain()) || (this
				.getIbhDomain() != null
				&& castOther.getIbhDomain() != null && this.getIbhDomain()
				.equals(castOther.getIbhDomain())))
				&& ((this.getIbhInvNbr() == castOther.getIbhInvNbr()) || (this
						.getIbhInvNbr() != null
						&& castOther.getIbhInvNbr() != null && this
						.getIbhInvNbr().equals(castOther.getIbhInvNbr())))
				&& ((this.getIbhNbr() == castOther.getIbhNbr()) || (this
						.getIbhNbr() != null
						&& castOther.getIbhNbr() != null && this.getIbhNbr()
						.equals(castOther.getIbhNbr())))
				&& ((this.getIbhLine() == castOther.getIbhLine()) || (this
						.getIbhLine() != null
						&& castOther.getIbhLine() != null && this.getIbhLine()
						.equals(castOther.getIbhLine())))
				&& ((this.getIbhFeature() == castOther.getIbhFeature()) || (this
						.getIbhFeature() != null
						&& castOther.getIbhFeature() != null && this
						.getIbhFeature().equals(castOther.getIbhFeature())))
				&& ((this.getIbhPart() == castOther.getIbhPart()) || (this
						.getIbhPart() != null
						&& castOther.getIbhPart() != null && this.getIbhPart()
						.equals(castOther.getIbhPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIbhDomain() == null ? 0 : this.getIbhDomain().hashCode());
		result = 37 * result
				+ (getIbhInvNbr() == null ? 0 : this.getIbhInvNbr().hashCode());
		result = 37 * result
				+ (getIbhNbr() == null ? 0 : this.getIbhNbr().hashCode());
		result = 37 * result
				+ (getIbhLine() == null ? 0 : this.getIbhLine().hashCode());
		result = 37
				* result
				+ (getIbhFeature() == null ? 0 : this.getIbhFeature()
						.hashCode());
		result = 37 * result
				+ (getIbhPart() == null ? 0 : this.getIbhPart().hashCode());
		return result;
	}

}