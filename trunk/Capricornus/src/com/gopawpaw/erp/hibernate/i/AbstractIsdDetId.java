package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIsdDetId entity provides the base persistence definition of the
 * IsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIsdDetId implements java.io.Serializable {

	// Fields

	private String isdDomain;
	private String isdStatus;
	private String isdTrType;
	private String isdType;

	// Constructors

	/** default constructor */
	public AbstractIsdDetId() {
	}

	/** minimal constructor */
	public AbstractIsdDetId(String isdDomain) {
		this.isdDomain = isdDomain;
	}

	/** full constructor */
	public AbstractIsdDetId(String isdDomain, String isdStatus,
			String isdTrType, String isdType) {
		this.isdDomain = isdDomain;
		this.isdStatus = isdStatus;
		this.isdTrType = isdTrType;
		this.isdType = isdType;
	}

	// Property accessors

	public String getIsdDomain() {
		return this.isdDomain;
	}

	public void setIsdDomain(String isdDomain) {
		this.isdDomain = isdDomain;
	}

	public String getIsdStatus() {
		return this.isdStatus;
	}

	public void setIsdStatus(String isdStatus) {
		this.isdStatus = isdStatus;
	}

	public String getIsdTrType() {
		return this.isdTrType;
	}

	public void setIsdTrType(String isdTrType) {
		this.isdTrType = isdTrType;
	}

	public String getIsdType() {
		return this.isdType;
	}

	public void setIsdType(String isdType) {
		this.isdType = isdType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIsdDetId))
			return false;
		AbstractIsdDetId castOther = (AbstractIsdDetId) other;

		return ((this.getIsdDomain() == castOther.getIsdDomain()) || (this
				.getIsdDomain() != null
				&& castOther.getIsdDomain() != null && this.getIsdDomain()
				.equals(castOther.getIsdDomain())))
				&& ((this.getIsdStatus() == castOther.getIsdStatus()) || (this
						.getIsdStatus() != null
						&& castOther.getIsdStatus() != null && this
						.getIsdStatus().equals(castOther.getIsdStatus())))
				&& ((this.getIsdTrType() == castOther.getIsdTrType()) || (this
						.getIsdTrType() != null
						&& castOther.getIsdTrType() != null && this
						.getIsdTrType().equals(castOther.getIsdTrType())))
				&& ((this.getIsdType() == castOther.getIsdType()) || (this
						.getIsdType() != null
						&& castOther.getIsdType() != null && this.getIsdType()
						.equals(castOther.getIsdType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIsdDomain() == null ? 0 : this.getIsdDomain().hashCode());
		result = 37 * result
				+ (getIsdStatus() == null ? 0 : this.getIsdStatus().hashCode());
		result = 37 * result
				+ (getIsdTrType() == null ? 0 : this.getIsdTrType().hashCode());
		result = 37 * result
				+ (getIsdType() == null ? 0 : this.getIsdType().hashCode());
		return result;
	}

}